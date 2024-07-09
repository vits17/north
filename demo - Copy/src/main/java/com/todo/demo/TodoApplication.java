package com.todo.demo;

import com.todo.demo.entity.todo;
import com.todo.demo.repository.todorepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TodoApplication implements CommandLineRunner {

	public static void main(String[] args)
	{

		SpringApplication.run(TodoApplication.class, args);
	}
	@Autowired
	public todorepo  tr;
    public void run(String... args)throws Exception
	{
		/*todo t1=new todo("tunday kebab","up","lko");
		tr.save(t1);
		todo t2=new todo("nihari raheem ","up","lko");
		tr.save(t2);*/

	}

}
