package main.java;

public class Personaje {

	private int id;
	private String nombre;
	
	public Personaje(int id, String nombre) {
		this.id = id;
		this.nombre = nombre;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String insertaPersonajeBBDD() {
		return "insert into tabla1 values(" + this.id + ",'" + this.nombre + "')";
	}
	
	public String modificaPersonajeBBDD() {
		return "update tabla1 set campo='" + this.nombre + "' where idtabla1=" + this.id;
	}
	
	public String eliminaPersonajeBBDD() {
		return "delete from tabla1 where idtabla1=" + this.id;
	}
}
