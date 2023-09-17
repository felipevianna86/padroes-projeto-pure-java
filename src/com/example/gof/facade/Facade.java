package com.example.gof.facade;

import com.example.gof.cep.CepAPI;
import com.example.gof.subsistema.BaseService;

public class Facade {
	
	public void migraCliente(String nome, String cep) {
		
		String cidade = CepAPI.getInstance().recuperarCidade(cep);
		String estado = CepAPI.getInstance().recuperarEstado(cep);
		
		BaseService.gravarCliente(nome, cep, cidade, estado);
	}

}
