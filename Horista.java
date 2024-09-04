package funcionario;

public class Horista implements InterfaceFuncionario {
	
	int valorHora = 10;
	int quantidadeHora = 180;
	
	@Override
	public long id() {
		System.out.println("248946");
		return 0;
	}
	@Override
	public String nome() {
		System.out.println("Isabella");
		return "a";
	}
	@Override
	public String telefone() {
		System.out.println("55555581");
		return "a";
	}
	@Override
	public int matricula() {
		System.out.println(036);
		return 0;
	}
	@Override
	public String endereco() {
		System.out.println("Vila Velha, Rua dos Cachorros, n°89");
		return "a";
	}
	@Override
	public void calculaSalario() {
		System.out.println(valorHora*quantidadeHora);
	}
}
