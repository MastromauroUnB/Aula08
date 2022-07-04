package aula08;
//import aula08.Ficha_de_Cadastro;
//import aula08.Plano;
public class Pessoa {
	protected String nome;
	protected long cpf;
	protected String rg;
	protected String tel_contato;
	protected String end_residencial;

	/* 
	 * Foi criado um construtor para a adição de uma nova pessoa ao código.
	 */
	public Pessoa(String nome, long cpf, String rg, String tel_contato, String end_residencial) {
		this.nome = nome;
		this.cpf = cpf;
		this.rg = rg;
		this.tel_contato = tel_contato;
		this.end_residencial = end_residencial;
	}
	
	/*public void adicionar() {
		// todo
	}*/

	/* 
	 * Escrever editar as informacoes de 
	 * uma pessoa. Talvez seja necessario
	 * criar varios metodos editar, um
	 * para cada campo que se deseja
	 * editar ou a logica de escolha
	 * do campo a ser editado deve estar
	 * no codigo
	 */
	/*public boolean editar() {
		// todo
		return false;
	}*/
	
	/*
	 * O método editar pode ser substituído pelo uso de getters e setters. 
	 * A edição de fato pode ser realizada a partir de um método na classe principal
	 */
	public String getNome() {
		return this.nome;
	}
	public long getCpf() {
		return this.cpf;
	}
	public String getrg() {
		return this.rg;
	}
	public String getTelContato() {
		return this.tel_contato;
	}
	public String getEndResidencial() {
		return this.end_residencial;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	public void setCpf(long cpf) {
		this.cpf = cpf;
	}
	public void setRg(String rg) {
		this.rg = rg;
	}
	public void setTelContato(String tel_contato) {
		this.tel_contato = tel_contato;
	}
	public void setEndResidencial(String end_residencial) {
		this.end_residencial = end_residencial;
	}
	/* 
	 * Escrever deletar uma pessoa.
	 * Uma pessoa so pode ser deletada
	 * se nao nao possuir um contrato
	 */
	/*public Plano checar_plano(Pessoa pessoa) {
		
		if( == pessoa) {
			return ;
		}
		else {
			return null;
		}
	}*/
	/*public boolean deletar() {
		Plano plano = checar_plano(pessoa);
		return false;
	}*/
	
	public String imprimir_informacoes_basicas() {
		String saida = "Nome: ";
		saida = saida + nome + "\n";
		saida = saida + "Telefone: ";
		saida = saida + tel_contato + "\n";
		saida = saida + "Endereco";
		saida = saida + end_residencial + "\n";
		return saida;
	}
}
