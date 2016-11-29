package cn.power.dao;

import cn.power.dao.Connection.MyConnection;
import cn.power.dao.model.Student;
import cn.power.dao.model.Test;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

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

    public List<Test> selectAll() {
        Statement stmt = null;

        String sql = "select id, name from test";
        try {
            stmt = conn.createStatement();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        ResultSet resultSet = null;
        try {
            resultSet = stmt.executeQuery(sql);
        } catch (SQLException e) {
            e.printStackTrace();
        }

        List<Test> list =new ArrayList<Test>();

        try {
            while(resultSet.next()){
                Integer id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                Test test = new Test();
                test.setId(id);
                test.setName(name);
                list.add(test);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return list;
    }
}
