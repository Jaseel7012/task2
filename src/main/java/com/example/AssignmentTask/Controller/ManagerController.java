package com.example.AssignmentTask.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/manager")
public class ManagerController {
    @GetMapping("/get")
    public String get(){
        return "manager controller";
    }

    @PostMapping("/add")
    public String add(){
        return "manager Create";
    }
}
