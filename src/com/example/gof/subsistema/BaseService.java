package com.example.gof.subsistema;

public class BaseService {
	
	private BaseService() {
		
	}
	
	public static void gravarCliente(String nome, String cep, String cidade, String estado) {
		System.out.println("Cliente salvo no subsistema");
		System.out.println(nome);
		System.out.println(cep);
		System.out.println(cidade);
		System.out.println(estado);
		
	}

}
