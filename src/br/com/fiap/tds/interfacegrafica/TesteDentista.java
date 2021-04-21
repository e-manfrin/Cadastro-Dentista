package br.com.fiap.tds.interfacegrafica;

import javax.swing.JOptionPane;

import br.com.fiap.tds.negocio.Dentista;

public class TesteDentista {

	public static void main(String[] args) {
		Dentista dentista01 = new Dentista();
		Dentista dentista02 = new Dentista();
		
		// Entrada de dados obj1
		dentista01.setNome(JOptionPane.showInputDialog("Digite o seu nome"));
		dentista01.setCro(Integer.parseInt(JOptionPane.showInputDialog("Digite o seu CRO")));
		String sexoprovisorio = JOptionPane.showInputDialog("Digite seu sexo");
		dentista01.setSexo(sexoprovisorio.charAt(0));
		dentista01.setSalario(Double.parseDouble(JOptionPane.showInputDialog("Digite o seu salário")));
		dentista01.setEspecialidade(JOptionPane.showInputDialog("Digite a sua especialidade:\nCL- clinico \n"
				+ "IM- implante \nOR- orto \nPE- perio"));
		
		// Entrada de dados obj2
		dentista02.setNome(JOptionPane.showInputDialog("Digite outro nome"));
		dentista02.setCro(Integer.parseInt(JOptionPane.showInputDialog("Digite o seu CRO")));
		String sexoprovisorio1 = JOptionPane.showInputDialog("Digite o seu sexo");
		dentista02.setSexo(sexoprovisorio1.charAt(0));
		dentista02.setSalario(Double.parseDouble(JOptionPane.showInputDialog("Digite o seu salário")));
		dentista02.setEspecialidade(JOptionPane.showInputDialog("Digite a sua especialidade: \nCL- clínico \n"
				+ "IM- implante \nOR- orto \nPE- perio"));
		
		// Saída de dados obj1
		// Antes do aumento
		JOptionPane.showMessageDialog(null, dentista01.toString());
	
		dentista01.aumentarSalario(1000);
		// Depois do aumento
		JOptionPane.showMessageDialog(null, dentista01.toString());
		
		// Saída de dados obj2
		//Antes do aumento
		JOptionPane.showMessageDialog(null, dentista02.toString());
		
		dentista02.aumentarSalarioporEspecialidade();
		//Depois do aumento
		JOptionPane.showMessageDialog(null, dentista02.toString());
		
		
	}
}
