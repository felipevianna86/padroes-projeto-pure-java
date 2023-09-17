package com.example.gof.singleton;

/**
 * Singleton apressado
 * @author felipe
 *
 */
public class SingletonEager {
	
	private static SingletonEager instance = new SingletonEager();
	
	private SingletonEager() {	
		
	}
	
	public static SingletonEager getInstance() {
		return instance;
	}

}
