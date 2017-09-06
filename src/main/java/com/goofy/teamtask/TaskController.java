package com.goofy.teamtask;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TaskController {


    @Autowired
    private TaskRepository taskRepository;

    //RequestMapping + Request.Method.Get == GetMapping
    /*
    * create a task
    *
    * */
    @PostMapping(value = "/tasks")
    public Task createTask(@RequestParam("taskName") String taskName, @RequestParam("taskDescription") String taskDescription) {
        Task task = new Task();
        task.setTaskName(taskName);
        task.setTaskDescription(taskDescription);
        return taskRepository.save(task);
    }

    //get all task
    @GetMapping(value = "/tasks")
    public List<Task> getTaskById(){

        return taskRepository.findAll();
    }
}
