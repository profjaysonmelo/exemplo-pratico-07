
public class Funcionario extends Parceiro {

	private String numeroCtps;
	private String serieCtps;
	
	public Funcionario(int codigo, String nome, String email, String numeroCtps, String serieCtps) {
		super.setCodigo(codigo);
		super.setNome(nome);
		super.setEmail(email);
		this.numeroCtps = numeroCtps;
		this.serieCtps = serieCtps;
	}

	public String getNumeroCtps() {
		return numeroCtps;
	}

	public void setNumeroCtps(String numeroCtps) {
		this.numeroCtps = numeroCtps;
	}

	public String getSerieCtps() {
		return serieCtps;
	}

	public void setSerieCtps(String serieCtps) {
		this.serieCtps = serieCtps;
	}

	@Override
	public String toString() {
		return "Funcionario [numeroCtps=" + numeroCtps + ", serieCtps=" + serieCtps + "]";
	}
	@Override
	public void adicionarBonus() {
		setBonusDeCompra(getBonusDeCompra() + 1); 
	}
}
