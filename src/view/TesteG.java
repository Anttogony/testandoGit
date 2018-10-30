package view;

import javax.swing.JOptionPane;

public class TesteG {
	
	private int numero;
	
	TesteG(int x) {
		numero = x;
	}
	
	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	public void imprime(int n) {
		if (n == 6) JOptionPane.showMessageDialog(null, "é 6");
	}

	public static void main(String[] args) {
		
		TesteG t = new TesteG(6);
		
		t.imprime(t.getNumero());

	}

}
