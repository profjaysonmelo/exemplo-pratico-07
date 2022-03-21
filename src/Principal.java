/*
 * 3) Um sistema de farmácia possui um cadastro de parceiros  que podem ser de três tipos: 
 * Funcionários (código, nome, telefone, e-mail, número CTPS, série CTPS ), 
 * Clientes (código, nome, telefone, e-mail, celular, RG, CPF ), 
 * Fornecedores (código, nome, telefone, e-mail, razão social, IE, CNPJ );
 */
public class Principal {

	public static void main(String[] args) {
		
		Funcionario func = new Funcionario(1, "FULANO", "fulano@sc.senai.br", "123-0", "5B");
		func.setBonusDeCompra(0);
		func.adicionarBonus();
		System.out.println(func.imprimir());
		System.out.println("Método toString: " + func);
		System.out.println("Ou: " + func.toString());
		System.out.println("Total de Bonus: " + func.getBonusDeCompra());
		
		Cliente cli = new Cliente(2, "CICLANO", "ciclano@sc.senai.br", "48-99666966", "123456789-12");
		cli.adicionarBonus();
		System.out.println(cli.imprimir());
		System.out.println("Total de Bonus: " + cli.getBonusDeCompra());
		
		Fornecedor fornecedor = new Fornecedor(3, "BELTRANO", "beltrano@sc.senai.br", "BELTANO LTDA", "123456789/001-0");
		fornecedor.adicionarBonus();
		System.out.println(fornecedor.imprimir());
		System.out.println("Total de Bonus: " + fornecedor.getBonusDeCompra());
		
	}
}
