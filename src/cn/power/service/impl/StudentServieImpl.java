package cn.power.service.impl;

import cn.power.dao.StudentDAO;
import cn.power.dao.model.Student;
import cn.power.dao.model.Test;
import cn.power.service.StudentService;

import java.util.List;

/**
 * Created by power on 2016/11/23.
 */
public class StudentServieImpl  implements StudentService{

    @Override
    public void add(Student student) {
        StudentDAO studentDAO = new StudentDAO();

        studentDAO.addDate(student);
    }

    @Override
    public List<Test> selectAll() {
        StudentDAO studentDAO = new StudentDAO();

        return studentDAO.selectAll();
    }
}
