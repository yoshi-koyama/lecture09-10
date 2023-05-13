package com.example.lecture09task.form;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;

@Getter

public class CreateForm {

    @NotBlank
    private String name;

    @NotNull
    private Integer age;

}
