package edu.icet.demo.Controller;

import edu.icet.demo.Student;
import edu.icet.demo.Service.StudentService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
    @GetMapping("/student")
    public Student getStudent() {
        StudentService service = new StudentService();
        Student student = service.getStudent();
        System.out.println(student);
        return student;
    }


    @GetMapping("/teacher")
    public String getTeacher() {
        StudentService service = new StudentService();
        Student student = service.getStudent();
        System.out.println(student);
        return "ICET";
    }
}
