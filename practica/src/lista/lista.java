package lista;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;

public class lista extends persona{
	


	public void menu() {
		lista mos = new lista();
		ag nn= new ag();
		Scanner b = new Scanner(System.in);
		
		boolean salir = false ;
		int pu;
		while (!salir) {
			System.out.println("1 : ingresar datos");
			System.out.println("2 : mostrar ");
			System.out.println("3 : buscar ");
			System.out.println("4 : eliminar");
			System.out.println("5 : salir");
			pu= b.nextInt();
			switch (pu){
			case 1 :
				mos.miLista();
				break;
			case 2 :
				mos.mostrar();
				break;
			case 3 :
				mos.editar(getCodigo());
				break;
			case 4 :
				mos.elimina(getCodigo());
				break;
			case 5 :
				salir = true;
				break;
			
			}
			
			
		}
	}

	private ArrayList<persona> list = new ArrayList<persona>();
	
	
	public void miLista() {
		Scanner e = new Scanner(System.in);
		 
		System.out.println("Dijite su nombre");
		setNombre(e.nextLine());
		System.out.println("Disteje su Apellido");
		setApellido(e.nextLine());
		System.out.println("ingresar codigo");
		setCodigo(e.nextInt());
		
        persona nueva = new persona (getNombre(),getApellido(),getCodigo());
	
	
		list.add(nueva);
		
		
		
		
	
		
	}
	public void mostrar() {
		for (int i =0; i< list.size(); i++) {
			System.out.println("nombre : "+list.get(i).getNombre()+" Apellido : "+list.get(i).getApellido()+"   codigo  : " + list.get(i).getCodigo());
			System.out.println("                                    " +"                                      "+ "                         ");
		}
	
	}
public void editar(int codigo) {
	Scanner t = new Scanner(System.in);
	Scanner x = new Scanner(System.in);
	System.out.println("codigo para eliminar ");
	codigo= x.nextInt();
	
	for (int i =0; i<list.size(); i++) {
		if ( codigo == list.get(i).getCodigo() ) {
			System.out.println("nombre : "+list.get(i).getNombre()+ " Apellido :"+list.get(i).getApellido()); 
			
			
		}
	}
	
	 
	/*int po;
	
	System.out.println("Disteje su nombre");
	codigo = t.nextInt();
	po= list.indexOf(codigo);
	if ( po != -1) {
		System.out.println("su dato a sido encontrado : "+ po+list.get(po));
		
		
	}else {
		System.out.println("Error de busqueda");
	}*/
		
	}

public void elimina(int codigo) {
	Scanner x = new Scanner(System.in);
	System.out.println("codigo para eliminar ");
	codigo= x.nextInt();
	
	for (int i =0; i<list.size(); i++) {
		if ( codigo == list.get(i).getCodigo() ) {
			list.remove(i);
			
		}
	}
	
}
	


}
