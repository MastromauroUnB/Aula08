package aula08;

public class Plano {
	private String nome;
	private double valor;
	private String caracteristicas;
	
	/* 
	 * Escrever codigo para criar um novo 
	 * plano. Esse metodo seria melhor
	 * modelado como um construtor
	 */
	public Plano(String nome, double valor, String caracteristicas) {
		this.nome = nome;
		this.valor = valor;
		this.caracteristicas = caracteristicas;
	}
	/*public void adicionar() {
		// todo
	}*/
	
	/* 
	 * Escrever editar um plano. Talvez
	 * seja necessario criar varios metodos
	 * editar, um para cada campo que se
	 * deseja editar ou a logica de escolha
	 * do campo a ser editado deve estar
	 * no codigo
	 */
	public boolean editar() {
		//todo
		return false;
	}

	/* 
	 * Escrever deletar um plano.
	 * Um plano so pode ser deletado
	 * se nao estiver selecionado
	 * por nenhum cliente.
	 */
	public String getNome() {
		return this.nome;
	}
	public double getValor() {
		return this.valor;
	}
	public String getCaracteristicas() {
		return this.caracteristicas;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	public void setCaracteristicas(String caracteristicas) {
		this.caracteristicas = caracteristicas;
	}
	
	
	public boolean deletar(Plano plano) {
		//todo
		return false;
	}
	
	public String imprimir_informacoes_basicas() {
		String saida = "Nome: ";
		saida = saida + nome + "\n";
		saida = saida + "Descricao: ";
		saida = saida + caracteristicas + "\n";
		return saida;
	}
}
