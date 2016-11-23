package cn.power.controller;

import cn.power.dao.model.Student;
import cn.power.service.StudentService;
import cn.power.service.impl.StudentServieImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by power on 2016/11/23.
 */
@WebServlet("/ice")
public class TestServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

//        StudentService studentService = new StudentServieImpl();
//        Student student = new Student();
//        student.setAge(20);
//        student.setName("ice");
//        studentService.add(student);
        Student A = new Student();
        A.setName("A");

        Student B = new Student();
        B.setName("B");

        Student C = new Student();
        C.setName("C");
        List<Student> list = new ArrayList<Student>();

        list.add(A);
        list.add(B);
        list.add(C);

        request.setAttribute("students",list);

//        List<String> list = new ArrayList<>();
//
//        list.add("11");
//        list.add("1asdf1");
//        list.add("asd1");

        request.setAttribute("students",list);


        request.getRequestDispatcher("pages/index.jsp").forward(request,response) ;
    }
}
