package br.com.fiap.tds.negocio;

import javax.swing.JOptionPane;

public class Dentista {

	// Atributos
	
	private String nome;
	private int cro;
	private char sexo;
	private double salario;
	private String especialidade;
	
	// Métodos
	
	public void aumentarSalario(double valor) {
		this.salario = this.salario + valor;
	}
	public void aumentarSalarioporEspecialidade () {
		if (this.especialidade =="CL") {
			this.salario = this.salario + this.salario *(10 / 100);
		}
		else if (this.especialidade =="IM") {
			this.salario = this.salario + this.salario *(20 / 100);
		}
		else if (this.getEspecialidade() == "OR") {
			this.salario = this.salario + this.salario *(15 / 100);
		}
		else if (this.especialidade =="PE") {
			this.salario = this.salario + this.salario *(13 / 100);
		}
		else {
			JOptionPane.showInternalMessageDialog(null, "Entrei em nenhum");
		}
	}
	public String verificarEspecialidade() {
		if (this.especialidade == "CL") {
			return "clínico";
		}
		else if (this.especialidade == "IM") {
			return "implante";
		}
		else if (this.especialidade == "OR") {
			return "orto";
		}
		else if (this.especialidade == "PE") {
			return "perio";
		}
		else {
			return "especialidade não identificada";
		}
	}
	// Métodos get e set
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getCro() {
		return cro;
	}
	public void setCro(int cro) {
		this.cro = cro;
	}
	public char getSexo() {
		return sexo;
	}
	public void setSexo(char sexo) {
		this.sexo = sexo;
	}
	public String getEspecialidade() {
		return especialidade;
	}
	public void setEspecialidade(String especialidade) {
		this.especialidade = especialidade;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	public String toString() {
		return "Nome: " + this.nome + "\nCRO: " + this.cro + "\nSexo: " + this.sexo + "\nEspecialidade: " + this.especialidade
				+ "\nSalário: " + this.salario;
	}
	
}
