package com.donghun.resttodo.model;

import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@Builder
@EqualsAndHashCode(of = "id")
@AllArgsConstructor
public class Todo {

    private Integer id;
    private String name;
    private String desc;
    private Status status = Status.Redady;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

}
