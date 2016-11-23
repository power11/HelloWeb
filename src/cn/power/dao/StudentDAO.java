package cn.power.dao;

import cn.power.dao.Connection.MyConnection;
import cn.power.dao.model.Student;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Created by power on 2016/11/23.
 * 目的：
 */
public class StudentDAO {

    private Connection conn = null;

    public StudentDAO() {
        conn = new MyConnection().getConnection();
    }

    public void addDate(Student student) {
        Statement stmt = null;
        Integer age = student.getAge();
        String Sname = student.getName();

        String sql = "insert into student(name,age)" + "values('" + Sname + "'," + age + ")";

        try {
            stmt = conn.createStatement();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        try {
            stmt.executeUpdate(sql);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        try {
            stmt.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


}
