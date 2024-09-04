package funcionario;

public class PessoaJuridica implements InterfaceFuncionario {
	
	int valorBruto = 1900;
	int imposto = 500;
	
	@Override
	public long id() {
		System.out.println("154465485");
		return 0;
	}
	@Override
	public String nome() {
		System.out.println("André");
		return "a";
	}
	@Override
	public String telefone() {
		System.out.println("56894589");
		return "a";
	}
	@Override
	public int matricula() {
		System.out.println(010);
		return 0;
	}
	@Override
	public String endereco() {
		System.out.println("Vila Quebrada, Rua Desgastada, n°71");
		return "a";
	}
	@Override
	public void calculaSalario() {
		System.out.println(valorBruto-imposto);
	}
}
