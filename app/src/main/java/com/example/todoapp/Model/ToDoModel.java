package com.example.todoapp.Model;

public class ToDoModel {

    private String task;
    private int id , status;
    private String din;

    public String getTask() {
        return task;
    }

    public void setTask(String task) {
        this.task = task;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public void setDin(String din){this.din=din;}

    public String getDin(){return din;}
}
