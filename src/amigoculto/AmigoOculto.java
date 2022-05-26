package amigoculto;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class AmigoOculto {

	public static void main(String[] args) {
		String alcunha, iniciar;
		int quantidadePessoas;
		
		Scanner nomePessoa = new Scanner(System.in);
		Scanner teclado = new Scanner(System.in);
		
		List<String> nomes = new ArrayList<String>();
		
		Random posicao = new Random();
		//////////////////////////////////////////////////////////////////
		
		System.out.println("Quantas pessoas irão participar do amigo oculto?");
		quantidadePessoas = teclado.nextInt();
		
		for(int i = 0; i<quantidadePessoas; i++ ) {
			
			System.out.println("digite o nome");
			alcunha = nomePessoa.next();
			nomes.add(alcunha);
		}
		
		System.out.println("deseja iniciar o sorteio?");
		iniciar = nomePessoa.next();
		
		if(iniciar.equals("sim")) {
			System.out.println(nomes.get(posicao.nextInt(nomes.size())));
		}else {
			teclado.close();
		}
	}

}
