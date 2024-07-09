package com.todo.demo.repository;

import com.todo.demo.entity.todo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface todorepo extends JpaRepository<todo,Long > {
}
