package edu.icet.demo.Service;

import edu.icet.demo.Student;

public class StudentService {
    public Student getStudent(){

        Student std = new Student();
        std.setName("Huzaifa");
        std.setAge("22");

        Student std2 = new Student("Frank","30");
        return std;
    };
}
