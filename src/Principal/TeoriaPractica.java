package Principal;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class TeoriaPractica {
	
	public static void main(String[] args){
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Introduce tu edad.");
		
		int edad= entrada.nextInt();
		
		if(edad>=18){
			System.out.println("Eres mayor de edad.");
		}else{
			System.out.println("Eres menor de edad.");
		}
		
		if(edad==0){
			System.out.println("Eres un recien nacido.");
		}else if(edad<0){
			System.out.println("Ingrese su edad correcta.");
		}else if(edad>120){
			System.out.println("Necesitamos verificar su edad.");
		}
		
		String condicion="s";
		System.out.println(condicion.equalsIgnoreCase("s"));
		
	}
	

}
