package edu.icet.demo.Service;

import edu.icet.demo.Student;

public class StudentService {
    public Student getStudent(){

        Student std = new Student();
        std.setName("30");
        std.setAge("Frank");

        Student std2 = new Student("Frank","30");
        return std;
    };
}