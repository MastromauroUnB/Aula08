package aula08;
import aula08.Pessoa;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Menu\n\n[1] Gerenciar Cliente\n[2] Gerenciar tecnico\n[3] Gerenciar contrato\n[4] Realizar manutencao");
		int opcao = scanner.nextInt();
		int opcao_cliente, opcao_tecnico, opcao_contrato;
		while(opcao > 4 || opcao < 1) {
			switch(opcao) {
				case 1:
					System.out.println("[1] Cadastrar cliente\n[2] Gerenciar cliente\n[3] Deletar cliente");
					opcao_cliente = scanner.nextInt();
					switch(opcao_cliente) {
						case 1:
							String nome = scanner.next();
							long cpf = scanner.nextLong();
							String rg = scanner.next();
							String tel_contato = scanner.next();
							String end_residencial = scanner.next();
							Pessoa pessoa = new Pessoa(nome, cpf, rg, tel_contato, end_residencial);
							System.out.println(pessoa.imprimir_informacoes_basicas());
							continue;
						case 2:
							continue;
						case 3:
							continue;
						default:
							break;
					}
					continue;
				case 2:
					continue;
				case 3:
					continue;
				case 4:
					continue;
				default:
					System.out.println("Escolha uma opção válida");
					break;
			}
		}
		scanner.close();
	}

}
