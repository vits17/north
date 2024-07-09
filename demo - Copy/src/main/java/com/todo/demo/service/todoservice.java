package com.todo.demo.service;

import com.todo.demo.entity.todo;

import java.util.List;

public interface todoservice {
     List<todo> getalltodo();

     todo savetodo(todo t);
     todo gettodobyid(Long id);
     todo updatetodo(todo t);
     void deletebyid(Long id);

}
