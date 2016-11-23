package cn.power.service.impl;

import cn.power.dao.StudentDAO;
import cn.power.dao.model.Student;
import cn.power.service.StudentService;

/**
 * Created by power on 2016/11/23.
 */
public class StudentServieImpl  implements StudentService{

    @Override
    public void add(Student student) {
        StudentDAO studentDAO = new StudentDAO();

        studentDAO.addDate(student);
    }
}
