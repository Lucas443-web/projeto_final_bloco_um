package projeto_final_bloco_um.repository;

import projeto_final_bloco_um.model.Conta;

public interface ContaRepository {
	
	public void buscarcpf(int CPF);
	public void login(Conta conta);
	public void update(Conta conta);
	public void apagarconta(int CPF);
	
	
	public void descontar5(int dt);
	public void descontar35(int dt);
	

}
