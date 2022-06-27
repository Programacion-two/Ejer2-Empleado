package logica;
import java.util.Scanner;
public class Empleado {
	Scanner sc = new Scanner(System.in);
	private String cedula;
	private String nombre;
	private int antiguedad;
	private double sueldo;


	//constructor por defecto
	public Empleado() {
		System.out.println("ingrese cedula");
		cedula=sc.nextLine();
		System.out.println("ingrese nombre");
		nombre=sc.nextLine();
		System.out.println("ingrese antiguedad");
		antiguedad=sc.nextInt();
		System.out.println("ingrese sueldo");
		sueldo=sc.nextDouble();

		
	}

	//constructor especifico
	public Empleado(String c, String n, int a, double s) {
		cedula=c;
		nombre=n;
		antiguedad=a;
		sueldo=s;
		
	}

	//metodos get
	public String getCedula() {
		return cedula;
	}
	public String getNombre() {
		return nombre;
	}
	public int getAntiguedad() {
		return antiguedad;
	}
	public double getSueldo() {
		return sueldo;
	}




	//metodos set
	public void setCedula(String c) {
		cedula=c;
	}
	public void setVelMax(String n) {
		nombre=n;
	}
	public void setAntiguedad(int a) {
		antiguedad=a;
	}
	public void setPrecio(double s) {
		sueldo=s;
	}
	
	
	
	
	//metodo toString
	@Override
	public String toString() {
		return("cedula: " + cedula + " nombre: " + nombre + " antiguedad: " + antiguedad + " sueldo: " + sueldo);
	} 
}
