package ui;
import java.util.Date;
import java.util.Scanner;

import dol.estudiante;
import misc.DateU;

public class estudianteForm {
	Scanner scan;
	estudiante student;
	
	public estudianteForm(Scanner scanner) {
		scan = scanner;
	}
	
	public estudianteForm(estudiante p) {
		student = p;
	}
	
	
	public estudiante catchPerson() {
		estudiante p = new estudiante();
		System.out.println("Primer nombre: ");
		p.setFirstName(scan.next());
		
		System.out.println("Segundo nombre: ");
		p.setMiddleName(scan.next());
		
		System.out.println("Primer apellido: ");
		p.setSurName(scan.next());
		
		System.out.println("Segundo apellido: ");
		p.setSecondSurname(scan.next());
		
		System.out.println("Numero de carnet: ");
		p.setLicenseNumber(scan.nextInt());
		
		System.out.println("Género: ");
		p.setGender(scan.next());
		
		Date fecha = DateU.catchValidDate(scan, "Fecha de nacimiento (dd/MM/yyyy): ");
		p.setBirthDate(fecha);
			
		return p;
	}
	
	public void showPerson() {
		System.out.printf("Primer nombre: %s\n" , student.getFirstName());		
		
		System.out.printf("Segundo nombre: %s\n", student.getMiddleName());
		
		System.out.printf("Primer apellido: %s\n", student.getSurName());
		
		System.out.printf("Segundo apellido: %s\n", student.getSecondSurname());
		
		System.out.printf("Numero de carnet: %s\n", student.getLicenseNumber());
		
		System.out.printf("Género: %s\n", student.getGender());
		
		
		

			
	}

}
