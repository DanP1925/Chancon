/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

/**
 *
 * @author Daniel
 */

import java.sql.*;

public class DBUtil {
    
    private String url = "jdbc:mysql://localhost:3306/bd1";
    private String driver = "com.mysql.jdbc.Driver";
    private String dbUname = "root";
    private String dbPass = "1234";
    
    public void test() throws ClassNotFoundException, SQLException{
        
        Class.forName(driver);
        Connection connection = DriverManager.getConnection(url, dbUname, dbPass);
        
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery("SELECT * FROM pregunta");
        
        connection.close();
    }
    
    public Usuario getUsuario(int id) throws ClassNotFoundException, SQLException{
        
        Usuario targetUsuario = new Usuario();
        
        Class.forName(driver);
        Connection connection = DriverManager.getConnection(url, dbUname, dbPass);
        
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery("SELECT * FROM bd1.usuario WHERE usuario.idUsuario = " + id + ";");
        
        while (resultSet.next()) {
            targetUsuario.setIdUsuario(resultSet.getInt("idUsuario"));
            targetUsuario.setClaveUsuario(resultSet.getString("claveUsuario"));
            targetUsuario.setNombreUsuario(resultSet.getString("nombreUsuario"));
        }

        connection.close();
        
        return targetUsuario;
    }
}