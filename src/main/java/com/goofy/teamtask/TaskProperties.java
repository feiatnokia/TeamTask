package com.goofy.teamtask;

import org.springframework.stereotype.Component;

@Component
public class TaskProperties {

    private String taskName;
    private String taskDescription;

    public String getTask(){
        return "Task A";
    }
}
