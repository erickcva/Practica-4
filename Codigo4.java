package com.generation;

import java.util.Scanner;

public class Codigo4 {
	public static void main(String[] args) {//Se agrego para correr el programa
		
		Scanner s = new Scanner(System.in);//Se le agrego el System.in
	    System.out.println("Turno del jugador 1 (introduzca piedra, papel o tijeras): ");
	    String j1 = s.nextLine();
	    //Se corro el otro Scanner
	    System.out.print("Turno del jugador 2 (introduzca piedra, papel o tijeras): \n");
	    String j2 = s.nextLine();
	    
	    String g = "";//Cambie el entero por un string por si se le quiere cambiar el nombre al jugador
	    switch(j1) {
	    case "piedra":
	        if (j2.equals("tijeras")) g = "1";//se puso en todos .equals para comprar si el valor string era igual al ingresado
	        	else if(j2.equals("papel")) g = "2";
	        	break;//Se agregaron break en todos los switch
	        
	    case "papel":
	        if (j2.equals("piedra")) g = "1";
	        	else if(j2.equals("tijeras")) g = "2";
	        	break;

	    case "tijeras":
	        if (j2.equals("papel")) g = "1";
	        	else if(j2.equals("piedra")) g = "2";
	        	break;
	      default:
	    	  break;
	    }	
	    if (g == "1" || g== "2") System.out.println("Gana el jugador " + g);//Si la condicion de que existe el string con dato 1 o dato 2 imprime al ganador 
	    else System.out.println("Empate");//De lo contrario es un empate ya que no se asigno un nuevo string a ninguno

    }
}