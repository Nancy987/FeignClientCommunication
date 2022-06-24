package com.Prograd.Application1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/app1")
@RestController
public class StudentController {

    @Autowired
    private RestClientService restClientService;

    @GetMapping("student/send")
    public Student save(){
        Student student = new Student();
        student.setFirstName("Nancy");
        student.setLastName("Mangla");
        return restClientService.save(student);
    }

    @GetMapping("student/add")
    public String addition(){
        int num1 = 40;
        int num2 = 60;
        int sum = num1+num2;
        String str = "Addition of "+num1+" and "+num2+" = "+sum;

        return restClientService.addition(str);
    }

    @GetMapping("student/table")
    public String table(){
        int num = 8;
        String str = "";
        for(int i=1;i<=10;i++){
            str += num + "*" + i + "=" + num*i;
        }
        return restClientService.table(str);
    }
}
