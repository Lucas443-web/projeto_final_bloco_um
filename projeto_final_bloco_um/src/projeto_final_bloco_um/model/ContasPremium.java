package projeto_final_bloco_um.model;

public class ContasPremium extends Conta{
	
	private int desconto;
	private int semfrete;

	public ContasPremium(String nome, int cPF, int senha, int desconto, int semfrete) {
		super(nome, cPF, senha);
		this.desconto = desconto;
		this.semfrete = semfrete;
		
	}

	public int getDesconto() {
		return desconto;
	}

	public void setDesconto(int desconto) {
		this.desconto = desconto;
	}

	public int getSemfrete() {
		return semfrete;
	}

	public void setSemfrete(int semfrete) {
		this.semfrete = semfrete;
	}
	
	public void descontar5() {
		System.out.println("Desconto de 50%");
	}
	
	
	public void descontar35() {
		System.out.println("Desconto de 35%");
	}
	

}
