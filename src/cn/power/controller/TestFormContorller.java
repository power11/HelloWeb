package cn.power.controller;

import javax.jws.WebService;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.InputStream;

/**
 * Created on 2016/11/23 21:47
 *
 * @author harry
 * @version 1.0
 */
@WebServlet("/test")
public class TestFormContorller extends HttpServlet {


    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


        String idPara = request.getParameter("id");
        if (idPara != null) {
            Integer id = Integer.parseInt(idPara);
            request.setAttribute("id", id);
        }

        request.getRequestDispatcher("/pages/form/index.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doGet(req, resp);
    }
}
