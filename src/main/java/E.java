package main.java;

import java.util.ArrayList;

public class E{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Conexion conexion = new Conexion();
		
		ArrayList<Personaje> personajes2 = new ArrayList<Personaje>();
		personajes2.add(new Personaje(1, "Oliver Atom"));
		personajes2.add(new Personaje(2, "Benji Price"));
		
		for(int i=0;i< personajes2.size();i++) {
			conexion.ejecutarQuery(personajes2.get(i).insertaPersonajeBBDD());
		}
		
		ArrayList<Personaje> personajes = conexion.cargarpersonajes();
		
		for(int i=0;i< personajes.size();i++) {
			System.out.println("Soy " + personajes.get(i).getId() + " y me llamo " + personajes.get(i).getNombre());
		}
		
		/*
		personajes.add(new Personaje(5, "Oliver Atom"));
		personajes.add(new Personaje(6, "Benji Price"));
		
		
		for(int i=0;i< personajes.size();i++) {
			conexion.ejecutarQuery(personajes.get(i).insertaPersonajeBBDD());
		}
		
		
		personajes.get(0).setNombre("Mark Lenders");
		personajes.get(1).setNombre("Paca la Culona");
		
		for(int i=0;i < personajes.size();i++) {
			conexion.ejecutarQuery(personajes.get(i).modificaPersonajeBBDD());
		}
		
		for(int i=1;i < personajes.size();i++) {
			conexion.ejecutarQuery(personajes.get(i).eliminaPersonajeBBDD());
		}
		*/
		/*
		String query = "insert into tabla1 values (" + oliverAtom.getId() + ",'" + oliverAtom.getNombre() + "')";
		query = "insert into tabla1 values (" + benjiPrice.getId() + ",'" + benjiPrice.getNombre() + "')";
		
		oliverAtom.setNombre("Oliver");
		
		query = "update tabla1 set campo ='" + oliverAtom.getNombre() + "' where idtabla1=" + oliverAtom.getId();
		
		query = "delete from tabla1 where idtabla1=" + oliverAtom.getId();
		
		System.out.println(query);
		
		conexion.ejecutarQuery(query);
		*/
		
		
		
		/*
		conexion.ejecutarQuery("insert into tabla1 values (3,'Popeye')");
		conexion.ejecutarQuery("insert into tabla1 values (4,'Son Goku')");
		*/
	}

}
