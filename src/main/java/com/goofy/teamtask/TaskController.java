package com.goofy.teamtask;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TaskController {


    @Autowired
    private TaskProperties taskProperties;

    //RequestMapping + Request.Method.Get == GetMapping
    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String sayHi() {
        return taskProperties.getTask();
    }
}
