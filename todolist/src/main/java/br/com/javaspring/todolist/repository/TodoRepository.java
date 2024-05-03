package br.com.javaspring.todolist.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.javaspring.todolist.entity.Todo;

public interface TodoRepository extends JpaRepository<Todo, Long> {
    
}
