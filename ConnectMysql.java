/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Admin
 */
import java.sql.Connection;
import javax.swing.JOptionPane;
import java.sql.DriverManager;

import java.sql.SQLException;
public class ConnectMysql {
    public static Connection MysqlConnection(){
        try{
            String username = "root";
            String password = "ashok01";
            String sqlconn = "jdbc:mysql://localhost:3306/airline_project";
            Class.forName("com.mysql.cj.jdbc.Driver");//Class.forName("com.mysql.cj.jdbc.Driver");//

            Connection conn = DriverManager.getConnection(sqlconn,username,password);
            return conn;
        }
        catch(ClassNotFoundException | SQLException e){
            JOptionPane.showMessageDialog(null,e);
        }
        return null;
    }
    public static void main(String args[]){
        JOptionPane.showMessageDialog(null,"Connection Success");
    }
}
