package cn.power.dao.Connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Created by power on 2016/11/23.
 */
public class MyConnection {
    public static String DBDRIVER = "org.gjt.mm.mysql.Driver";
    public static String DBURL = "jdbc:mysql://121.42.152.75:3306/power";
    public static String DBUSER = "root";
    public static String DBPASS = "bsqql123";

    public MyConnection() {
    }

    public Connection getConnection() {
        try {
            Class.forName(DBDRIVER);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        Connection conn = null;

        try {
            conn = DriverManager.getConnection(DBURL, DBUSER, DBPASS);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return conn;
    }
}
