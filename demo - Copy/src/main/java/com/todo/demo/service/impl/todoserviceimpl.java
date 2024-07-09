package com.todo.demo.service.impl;

import com.todo.demo.entity.todo;
import com.todo.demo.repository.todorepo;
import com.todo.demo.service.todoservice;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class todoserviceimpl implements todoservice {
    private todorepo tdrepo;
    public todoserviceimpl(todorepo tdrepo)
    {
        super();
        this.tdrepo=tdrepo;
    }
    @Override
    public List<todo> getalltodo() {
        return tdrepo.findAll();
    }
    @Override
    public todo savetodo(todo x)
    {
        return tdrepo.save(x);
    }
    @Override
    public todo gettodobyid(Long id)
    {
        return tdrepo.findById(id).get();
    }
    @Override
    public todo updatetodo(todo t)
    {
        return tdrepo.save(t);
    }
    @Override
    public void deletebyid(Long id)
    {
        tdrepo.deleteById(id);
    }
}
