package com.Layout.CadastroDeTarefas.Domain.Models;

import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

public class Task
{
    private Long id;
    private String name;

    @DateTimeFormat(pattern = "dd/MM/yyyy HH:mm:ss")
    private Date data;

    public Task(Long id, String name, Date data) {
        this.id = id;
        this.name = name;
        this.data = data;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }
}
