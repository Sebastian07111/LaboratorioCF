import javax.swing.JOptionPane;

public class Entidad {
	double ladoA;
	double ladoB;
	
	public void ingresarDatos() {
		String cadena;
		
		cadena=JOptionPane.showInputDialog(null,"ingrese ladoA");
		ladoA=Double.parseDouble( cadena );
		
		cadena=JOptionPane.showInputDialog(null,"ingrese ladoB");
		ladoB=Double.parseDouble( cadena );
	}
	public void calcularArea() {
		double resultado;
		resultado = ladoA*ladoB;
		JOptionPane.showMessageDialog(null, "el resultado es: " + resultado);
	}
}
