package projeto_final_bloco_um.repository;

import projeto_final_bloco_um.model.Conta;

public interface ContaRepository {
	
	public void cadastrarproduto();
	public void listarproduto();
	public void atualizarproduto(int produto);
	public void excluirproduto(int produto);
	
	
	public void descontar5(int dt);
	public void descontar35(int dt);
	

}
