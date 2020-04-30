package main.java;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Start2 {
	private static final String CONTROLADOR = "com.mysql.jdbc.Driver";
    private static final String URL = "jdbc:mysql://localhost:3306/tiendaonline?serverTimezone=UTC";
    private static final String USUARIO = "root";
    private static final String CLAVE = "12345678";
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

	        Connection conexion = null;
	        
	        try {
	            Class.forName(CONTROLADOR);
	            conexion = DriverManager.getConnection(URL, USUARIO, CLAVE);
	            System.out.println("Conexión OK");

	        } catch (ClassNotFoundException e) {
	            System.out.println("Error al cargar el controlador");
	            e.printStackTrace();

	        } catch (SQLException e) {
	            System.out.println("Error en la conexión");
	            e.printStackTrace();
	        }
	        
	}

}
