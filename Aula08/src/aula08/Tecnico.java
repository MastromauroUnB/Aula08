package aula08;
import java.util.Scanner;

public class Tecnico extends Pessoa {
	private String funcao;
	private double salario;
	private String data_admissao;
	
	public Tecnico(String funcao, double salario, String data_admissao, String nome, long cpf, String rg, String tel_contato, String end_residencial) {
		super(nome, cpf, rg, tel_contato, end_residencial);
		this.nome = nome;
		this.cpf = cpf;
		this.rg = rg;
		this.end_residencial = end_residencial;
		this.tel_contato = tel_contato;
		this.funcao = funcao;
		this.salario = salario;
		this.data_admissao = data_admissao;
	}

	public String getFuncao() {
		return this.funcao;
	}
	public double getSalario() {
		return this.salario;
	}
	public String getDataAdmissao() {
		return this.data_admissao;
	}
	public void setFuncao(String funcao) {
		this.funcao = funcao;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	public void setDataAdmissao(String data_admissao) {
		this.data_admissao = data_admissao;
	}
	public boolean realizar_manutencao(Ficha_de_Cadastro ficha) {
		/* 
		 * Tecnico imprime contrado e confere as informacoes
		 * do cliente para realizar a manutencao
		 */
		System.out.println(ficha.imprimir());
		Scanner entrada = new Scanner(System.in);
		System.out.println("O servico foi realizado com "
				+ "sucesso? Digite 1 para sim e 0 para nao:");
		int status = entrada.nextInt();
		entrada.close();
		if(status == 1)
			return true;
		else
			return false;
	}
}
