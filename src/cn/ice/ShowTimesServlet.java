package cn.ice;

import sun.nio.cs.ext.GB18030;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by power on 2016/11/23.
 */
//@WebServlet("ShowTimesServlet")

public class ShowTimesServlet extends HttpServlet {

    public  static  int times=0;
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        ++times;
        request.setAttribute("times",times);
        request.getRequestDispatcher("/index.jsp").forward(request,response);
    }
}
