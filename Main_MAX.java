package view;

import Pilha_Matheus.Pilha_MAX;

public class Main_MAX {

	public static void main(String[] args) {
		
		Pilha_MAX m = new Pilha_MAX();
		
		m.Push("1032");
		m.Push("105");
		m.Push("22");
		m.Push("15");
		m.Push("18");
		m.Push("4");
		m.Push("87");
		m.Push("100000");
		m.Push("10265");
		
		m.Max();
		
	}

}
