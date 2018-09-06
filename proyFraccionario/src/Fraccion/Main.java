package Fraccion;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		
		System.out.println("Menu");
		System.out.println("1.- Suma");
		System.out.println("2.- Resta");
		System.out.println("3.- Multiplicacion");
		System.out.println("4.- Division");
		System.out.println("5.- Maximo Comun Divisor");
		
		switch(n){
		
		case 1:
			System.out.println("Opcion 1: Suma");
			Fraccionario obj1 = new Fraccionario();
			Fraccionario obj2 = new Fraccionario();
			Fraccionario obj3 = new Fraccionario();
			obj1.ingresarDatos(2, 7);
			obj2.ingresarDatos(3, 5);
			obj3 = obj1.suma(obj2);
			System.out.println("Fraccionario 1");
			obj1.imprimirDatos();
			System.out.println("Fraccionario 2");
			obj2.imprimirDatos();
			System.out.println("Resultado");
			obj3.imprimirDatos();
		break;
		
		case 2:
			System.out.println("Opcion 2: Resta");
			Resta obj4 = new Resta();
			Resta obj5 = new Resta();
			Resta obj6 = new Resta();
			obj4.ingresarDatos(2, 7);
			obj5.ingresarDatos(3, 5);
			obj6 = obj4.resta(obj5);
			System.out.println("Fraccionario 1");
			obj4.imprimirDatos();
			System.out.println("Fraccionario 2");
			obj5.imprimirDatos();
			System.out.println("Resultado");
			obj6.imprimirDatos();
		break;
			
		case 3:
			System.out.println("Opcion 3: Multiplicacion");
			Multiplicacion obj7 = new Multiplicacion();
			Multiplicacion obj8 = new Multiplicacion();
			Multiplicacion obj9 = new Multiplicacion();
			obj7.ingresarDatos(2, 7);
			obj8.ingresarDatos(3, 5);
			obj9 = obj7.multiplicacion(obj8);
			System.out.println("Fraccionario 1");
			obj7.imprimirDatos();
			System.out.println("Fraccionario 2");
			obj8.imprimirDatos();
			System.out.println("Resultado");
			obj9.imprimirDatos();
		break;
			
		case 4:
			System.out.println("Opcion 4: Division");
			Division obj10 = new Division();
			Division obj11 = new Division();
			Division obj12 = new Division();
			obj10.ingresarDatos(2, 7);
			obj11.ingresarDatos(3, 5);
			obj12 = obj10.division(obj11);
			System.out.println("Fraccionario 1");
			obj10.imprimirDatos();
			System.out.println("Fraccionario 2");
			obj11.imprimirDatos();
			System.out.println("Resultado");
			obj12.imprimirDatos();
		break;
			
		case 5:
			System.out.println("Opcion 5: Maximo comun divisor");
			Mcd obj13 = new Mcd ();
			Mcd obj14 = new Mcd ();
			Mcd obj15 = new Mcd ();
			obj13.ingresarDatos(2, 7);
			obj14.ingresarDatos(3, 5);
			//obj15 = obj13.mcd (obj14);
			System.out.println("Fraccionario 1");
			obj13.imprimirDatos();
			System.out.println("Fraccionario 2");
			obj14.imprimirDatos();
			System.out.println("Mcd");
			obj15.imprimirDatos();
		break;
		
		}
		
		

	}

}
