package cn.power.service;

import cn.power.dao.model.*;

import java.util.List;

/**
 * Created by power on 2016/11/23.
 */
public interface StudentService {
    void add(Student student);

    List<Test> selectAll();
}
