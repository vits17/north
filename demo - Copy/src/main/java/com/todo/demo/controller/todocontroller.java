package com.todo.demo.controller;

import com.todo.demo.entity.todo;
import com.todo.demo.service.todoservice;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class todocontroller {
    private todoservice tds;

    public todocontroller(todoservice tds) {
        super();
        this.tds = tds;

    }
       @RequestMapping("/ht")
       public String wel() {
           return "ht";
       }


    @RequestMapping("/firstpage")

    public String welcome() {
        return "firstpage";
    }

    @GetMapping("/todos")
    public String listtodo(Model m) {
        m.addAttribute("todos", tds.getalltodo());
        return "todos";
    }

    @GetMapping("/todos/new")
    public String createtodoform(Model mo) {
        //create todo object to hold todo form data
        todo t = new todo();

        mo.addAttribute("todo", t);
        return "creat_todo";
    }

    @PostMapping("/todos")
    public String saveTodo(@ModelAttribute("todo") todo to) {
        tds.savetodo(to);
        return "redirect:/todos";
    }

    @GetMapping("/todos/edit/{id}")
    public String edittodoform(@PathVariable Long id, Model m) {
        m.addAttribute("todo", tds.gettodobyid(id));
        return "edit_todo";
    }

    @PostMapping("/todos/{id}")

    public String updatetodo(@PathVariable Long id, @ModelAttribute("todo") todo t, Model m
    ) {
        //todo from db by id
        todo old = tds.gettodobyid(id);
        old.setId(id);
        old.setShopname(t.getShopname());
        old.setCity(t.getCity());
        old.setState(t.getState());
        tds.updatetodo(old);
        return "redirect:/todos";
    }
    //handler method to handle delete student request
    @GetMapping("/todos/{id}")
    public String deletetodo(@PathVariable Long id)
    {
          tds.deletebyid(id);
        return "redirect:/todos";
    }
}
