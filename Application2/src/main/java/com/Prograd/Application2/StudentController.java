package com.Prograd.Application2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/app2")
@RestController
public class StudentController {

    @PostMapping("student/save")
    public Student save(){
        Student student = new Student();
        student.setFirstName("Mayank");
        student.setLastName("Gupta");
        return student;
    }

    @PostMapping("student/saveAdd")
    public String addition(){
        int num1 = 30;
        int num2 = 200;
        int sum = num1+num2;
        String str = "Adition of "+num1+" and "+num2+" = "+sum;

        return str;
    }

    @PostMapping("student/savetable")
    public String table(){
        int num = 22;
        String str = "";
        for(int i=1;i<=10;i++){
            str += num + "*" + i + "=" + num*i;
        }
        return str;
    }
}
