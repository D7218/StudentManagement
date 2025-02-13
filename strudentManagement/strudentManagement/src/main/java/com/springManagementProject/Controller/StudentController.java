package com.springManagementProject.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/studentManagement")
public class StudentController {

    @GetMapping("/student")
    public String studentInfo(){
        return "this is college information";
    }

    @GetMapping("/studentAdd")
    public String studentAddress(){
        return "this is Student address information";
    }

}
