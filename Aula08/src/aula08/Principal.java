package aula08;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Menu\n\n[1] Gerenciar Cliente\n[2] Gerenciar tecnico\n[3] Gerenciar contrato\n[4] Realizar manutencao");
		int opcao = scanner.nextInt();
		while(opcao > 4 || opcao < 1) {
			switch(opcao) {
				case 1:
					System.out.println("[1] Cadastrar cliente\n[2] Gerenciar cliente\n[3] Deletar cliente");
					continue;
				case 2:
				case 3:
				case 4:
				default:
					System.out.println("Escolha uma opção válida");
					break;
			}
		}
		scanner.close();
	}

}
