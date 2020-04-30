package main.java;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class Start {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection conexion1 = null;
		Connection conexion2 = null;
		Connection conexion3 = null;
		
		String user = "root";
		String password = "12345678";
		try {
 
			
 
			// se envía la cadena y los datos de usuario y password por separado
			Properties datos = new Properties();
			datos.put("user", user);
			datos.put("password", password);
			String url2 = "jdbc:mysql://localhost:3306/tiendaonline?serverTimezone=UTC";
			conexion2 = DriverManager.getConnection(url2, datos);
			if (conexion2 != null) {
				System.out.println("Conexión: Conexión a bbdd satisfacoria");
			}
 
			// se envía la cadena, el usuario y el password por separado
			String url3 = "jdbc:mysql://localhost:3306/tiendaonline?serverTimezone=UTC";
			conexion3 = DriverManager.getConnection(url3, user, password);
			if (conexion3 != null) {
				System.out.println("Conexión: Conexión a bbdd satisfacoria");
			}
		} catch (SQLException e) {
			System.out.println(
					"Error en la conexión, verifique, su usuario y password o el nombre de la base a la que intenta conectarse");
			e.printStackTrace();
		}
	}

}
