package bll;

import java.util.Scanner;

import dal.estudianteDal;
import ui.estudianteForm;

public class Application {
	private Scanner scan;
	public Application() {
		 scan = new Scanner(System.in);
	}
	public void displayOptions() {
		System.out.println("Gestionar estudiante");
		System.out.println("1. Agregar");
		System.out.println("2. Mostrar");
		System.out.println("3. Volver");
		
	}

	public void show() {
		short option = 0;
		
		do {
			System.out.println();
			displayOptions();
			System.out.println();
			option = scan.nextShort();
			switch (option) {
				case 1:
					save();
					break;
				case 2:
					open();
					break;
				case 3:
					System.exit(0);
					break;
				default:
					System.out.println("Error.");
					break;
			}
		}while(option!=3);
		
	}
	public void save() {
		estudianteForm pf = new estudianteForm(scan);
		estudianteDal pd = new estudianteDal();
	
		pd.setEstudiante(pf.catchPerson());
		
		System.out.println("Por favor indica la ruta para guardar el archivo: ");
		String filePath = scan.next();
		System.out.println("Por favor indica el nombre del archivo: ");
		String fileName = scan.next();
		
		pd.setFilePath(filePath);
		pd.setFileName(fileName);
		pd.save();
	}
	
	public void open() {
	
			
		System.out.println("Por favor indica la ruta del archivo a abrir");
		String filePath = scan.next();
		estudianteDal pd = new estudianteDal();
		pd.setFilePath(filePath);
		estudianteForm pf = new estudianteForm(pd.open());
		pf.showPerson();
		
	}


}
