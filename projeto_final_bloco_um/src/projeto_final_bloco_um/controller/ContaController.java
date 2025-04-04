package projeto_final_bloco_um.controller;

import projeto_final_bloco_um.model.Conta;
import projeto_final_bloco_um.repository.ContaRepository;
import java.util.ArrayList;

public class ContaController implements ContaRepository{

	@Override
	public void cadastrarproduto() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void listarproduto() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void atualizarproduto() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void excluirproduto() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void descontar5(int dt) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void descontar35(int dt) {
		// TODO Auto-generated method stub
		
	}
	
	private ArrayList<Conta> listaContas = new ArrayList<Conta>();
	int numer = 0;
	
	public void registrar(Conta conta) {
		listaContas.add(conta);
		System.out.println("CONTA DE " + conta.getNome() + " foi cadastrada");
	}
	
	public int registroNumer() {
		return ++ numer;
	}
	
	public Conta buscarNaLista(int CPF) {
		for(var conta : listaContas) {
			if (conta.getCPF() == CPF) {
				return conta;
			}
		}
		return null;
	};
		
		
	public void pesquisarPorCPF(int CPF) {
		var conta = buscarNaLista(CPF);
		
		if (conta != null) {
			conta.visualizar();
		} else {
			System.out.println("A conta de CPF " + CPF + " não foi achada!");
		}
	}
	
	

	

	
	
	
	
	
	

}
