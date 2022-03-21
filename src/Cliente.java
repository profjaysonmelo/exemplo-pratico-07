
public class Cliente extends Parceiro {

	private String celular;
	private String rg;
	private String cpf;
	
	public Cliente(int codigo, String nome, String email, String celular, String cpf) {
		super.setCodigo(codigo);
		super.setNome(nome);
		super.setEmail(email);
		this.celular = celular;
		this.cpf = cpf;
	}

	public String getCelular() {
		return celular;
	}

	public void setCelular(String celular) {
		this.celular = celular;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public String imprimir() {
		return "Nome: " + getNome() + "\nEmail: " + getEmail()
			+ "\nCelular: " + celular + "\nCPF: " + cpf;
	}
}
