package cn.power.service;

import cn.power.dao.model.Student;
import cn.power.service.impl.StudentServieImpl;

/**
 * Created by power on 2016/11/23.
 */
public class Test {
    public static void main(String[] args) {
        StudentService studentService = new StudentServieImpl();
        Student student = new Student();
        student.setAge(20);
        student.setName("ice");
        studentService.add(student);
    }
}
