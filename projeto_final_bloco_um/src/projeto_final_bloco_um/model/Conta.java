package projeto_final_bloco_um.model;

import java.util.Scanner;

public abstract class Conta {
	
	Scanner scanner = new Scanner(System.in);
	private String nome;
	private int CPF;
	private int senha;
	public Conta(String nome, int cPF, int senha) {
		this.nome = nome;
		CPF = cPF;
		this.senha = senha;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getCPF() {
		return CPF;
	}
	public void setCPF(int cPF) {
		CPF = cPF;
	}
	public int getSenha() {
		return senha;
	}
	public void setSenha(int senha) {
		this.senha = senha;
	}

	public void visualizar() {
		
		System.out.println("Dados da conta:");
		System.out.println(this.nome);
		System.out.println("CPF " + CPF);
		System.out.println("Senha " + senha);
		
	}
	
	public void trocarsenha() {
		System.out.println("Digite uma nova senha: ");
		senha = scanner.nextInt();
		System.out.println("Senha trocada com sucesso");
	}
	
	public void mudarnome() {
		System.out.println("Mude o seu nome no perfil: ");
		nome = scanner.next();
	}
	
	
	
	
	

}
