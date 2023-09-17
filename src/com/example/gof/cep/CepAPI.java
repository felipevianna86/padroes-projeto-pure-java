package com.example.gof.cep;

public class CepAPI {
	
private static CepAPI instance = new CepAPI();
	
	private CepAPI() {	
		
	}
	
	public static CepAPI getInstance() {
		return instance;
	}
	
	public String recuperarCidade(String cep) {
		return "Curitiba";
	}
	
	public String recuperarEstado(String cep) {
		return "Paraná";
	}
}
