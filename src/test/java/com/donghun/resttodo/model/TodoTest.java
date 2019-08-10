package com.donghun.resttodo.model;

import org.junit.Test;

import java.time.LocalDateTime;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class TodoTest {

    @Test
    public void TodoCreated() {
        Todo todo = Todo.builder()
                .name("할일1")
                .desc("내용1")
                .createdAt(LocalDateTime.now())
                .status(Status.Redady)
                .build();

        assertThat(todo).isNotNull();
        assertThat(todo.getName()).isEqualTo("할일1");
        assertThat(todo.getDesc()).isEqualTo("내용1");
    }

}