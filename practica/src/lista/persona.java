package lista;

public class persona {
	private String nombre;
	private String apellido;
	private int codigo;
	public persona() {
	
	}
	


	public persona(String nombre, String apellido, int codigo) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.codigo = codigo;
	}



	public String getNombre() {
		return nombre;
	}



	public void setNombre(String nombre) {
		this.nombre = nombre;
	}



	public String getApellido() {
		return apellido;
	}



	public void setApellido(String apellido) {
		this.apellido = apellido;
	}



	public int getCodigo() {
		return codigo;
	}



	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}



}
