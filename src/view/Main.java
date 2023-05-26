package view;

import br.mari.arvoreint.Arvore;

public class Main {

	public static void main(String[] args) {
	
			int[] vetor = {33,15,41,38,47,34,49,43};
			Arvore ar = new Arvore();
			for (int i : vetor) {
				ar.insert(i);
			}
			try {
				ar.prefixSearch();
				System.out.println(" ");
				ar.infixSearch();
				System.out.println(" ");
				ar.postfixSearch();
				System.out.println(" ");
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
	}

}
