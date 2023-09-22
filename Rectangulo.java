/*
 * Eduardo Hiroki Yamada Ortiz
 * 22 de septiembre 2023
 * Clase que representa de manera básica a un rectángulo
 */
public class Rectangulo {
	//declaro mis atributos
	//accesibilidad tipo nombre de la variable
	
	private double base;
	private double altura;
	
	//declaramos los constructores

	public Rectangulo() {
		
	}

	public Rectangulo(double unaBase, double unaAltura) {
		base = unaBase;
		altura = unaAltura;
		
	}
	
	public double getBase() {
		return base;
	}
	
	public double getAltura() {
		return altura;
	}
	
	public void setBase(double unaBase) {
		base = unaBase;
	}
	
	public void setAltura(double unaAltura) {
		altura = unaAltura;
	}
	
	public boolean equals(Rectangulo otro) {
		boolean respuesta;
		if (base == otro.base && altura == otro.altura) {
			respuesta = true;
		}else
			respuesta = false;
		return respuesta;
	}
	
	public int compareTo(Rectangulo otro) {
		int valor;
		if(base == otro.base && altura == otro.altura) 
			valor = 0;
		else
			if (base > otro.base && altura > otro.altura)
				valor = 1;
			else
				valor = -1;
		return valor;
	}
	
	public String toString() {
		String cadena;
		cadena = "Rectangulo con base " + base + " y altura " + altura;
		return cadena;
	}
	
	//funcionalidad de la case
	
	public double area() {
		double respuesta;
		
		respuesta = base * altura;
		return respuesta;
	}
	
	public double perimetro() {
		return 2*base + 2*altura;
	}
}
