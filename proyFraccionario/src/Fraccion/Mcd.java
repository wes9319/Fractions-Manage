package Fraccion;

public class Mcd {
	//atributos de la clase
			private int numerador;
			private int denominador;
			
			//metodos de la clase
			//metodo que inicializa los atributos
			public void ingresarDatos(int numerador, int denominador){
				this.numerador = numerador;
				this.denominador =denominador;
			}
			
			//metodo get y set
			public int obtenerNumerador(){
				return numerador;
			}
			
			public int obtenerDenominador(){
				return denominador;
			}
			
			public void ingresarNumerador(int numerador){
				this.numerador = numerador;
			}
			
			public void ingresarDenominador(int denominador){
				this.denominador = denominador;
			}
			
			//imprimir datos
			public void imprimirDatos(){
				System.out.println(numerador+"/"+denominador);
			}
			
			public int mcd(Mcd frac2){
				int a,b;
				
				b=obtenerDenominador();
				a=denominador;
				
				if(b==0)
					return a;
				else
					return a%b;
				
			}
}
