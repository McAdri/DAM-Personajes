package main.java;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;


public class Conexion {
	private static String db_ = "clase" ;
	private static String login_ = "root" ;
	private static String password_ = "12345678" ;
	private static String url_ = "jdbc:mysql://localhost/" + db_  +"?serverTimezone=UTC";
	private static Connection connection_ ;
	private static Statement st_ = null ;
	
	public Conexion() {
		// TODO Auto-generated method stub

		try {
			Class . forName ( "com.mysql.cj.jdbc.Driver" ) ;
			connection_ = DriverManager . getConnection ( url_ ,
			login_ , password_ ) ;
			if ( connection_ != null ) {
				st_ = connection_ . createStatement () ;
				System . out . println ( " Conexion a base de datos " + db_ + " correcta . " ) ;
			}
			else
			System . out . println ( " Conexion fallida . " ) ;
		} catch ( SQLException e ) { e . printStackTrace () ;}
		catch ( ClassNotFoundException e ) { e . printStackTrace () ;}
		catch ( Exception e ) { e . printStackTrace () ;}
		
		
	}
	
	public void ejecutarQuery(String query) {
		try {
			Statement st = connection_.createStatement();
			
			 st.executeUpdate(query);
			
		} catch ( SQLException e ) { e . printStackTrace () ;}
	}
	
	public ArrayList<Personaje> cargarpersonajes(){
		
		ArrayList<Personaje> personajes = new ArrayList<Personaje>();
		try {
			Statement st = connection_.createStatement();
			
			ResultSet rs = st.executeQuery("select * from tabla1");
			
			while(rs.next()) {
				Personaje personaje = new Personaje(
						rs.getInt("idtabla1"),rs.getString("campo")) ;
				
				personajes.add(personaje);
				
			}
			
			rs.close();
			
		} catch ( SQLException e ) { e . printStackTrace () ;}
		
		return personajes;
	}
}
