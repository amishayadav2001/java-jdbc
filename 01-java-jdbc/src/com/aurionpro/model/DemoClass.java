package com.aurionpro.model;

import java.sql.*;

public class DemoClass {
    public static void main(String[] args) throws Exception {
        String url = "jdbc:mysql://localhost:3306/student_college_db";
        String uname = "root";
        String pass = "";
        String Query = "select first_name from student_college_db.student where id=3";

        Class.forName("com.mysql.cj.jdbc.Driver"); 
        Connection con = DriverManager.getConnection(url, uname, pass);
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery(Query);

        rs.next();
        String name = rs.getString("first_name"); 

        System.out.println(name);

        rs.close();
        st.close();
        con.close();
    }
}
