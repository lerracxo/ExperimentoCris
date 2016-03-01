package com.cris.app;

import javax.swing.JOptionPane;

public class Ejercicio1 {
	
	public static void main(String args[]){
		//Declaracion de constantes
		final String peticionNumero = "Por favor ingresa el primer Número";
		final String peticionNumero2 = "Por favor ingresa el segundo Número";
		final String mensajeRepeticion = "Ingresa nuevamente las cantidades";
		
		//Declaracion de variables
		int valor1,valor2;
		int numeroMayor,numeroMenor;
		String entrada1, entrada2;
		
	
		do{
			entrada1 = JOptionPane.showInputDialog(peticionNumero);
			entrada2 = JOptionPane.showInputDialog(peticionNumero2);
			
			valor1 = Integer.parseInt(entrada1);
			valor2 = Integer.parseInt(entrada2);
			
			if(valor1 == valor2){
				JOptionPane.showMessageDialog(null, mensajeRepeticion);
			}else{
				break;
			}
			
		}while(valor1 == valor2);
			

		if (valor1 > valor2) {
			numeroMayor = valor1;
			numeroMenor = valor2;
			
		} else {
			numeroMayor = valor2;
			numeroMenor = valor1;
		}
//		IF sintáctico
//		numeroMayor = valor1 > valor2 ? valor1 : valor2;
//		numeroMenor = valor1 < valor2 ? valor2 : valor1;
//		
		
		JOptionPane.showMessageDialog(null, "El nùmero mayor es: "+numeroMayor+" El nùmero menor es: "+numeroMenor);
		 
		
	} 
	
}
