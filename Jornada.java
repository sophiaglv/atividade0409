package funcionario;

public class Jornada implements InterfaceFuncionario {
	
	int salarioHora = 9;
	int horasTrabalhadas = 220;
	
	@Override
	public long id() {
		System.out.println("0523486");
		return 0;
	}
	@Override
	public String nome() {
		System.out.println("Sophia");
		return "a";
	}
	@Override
	public String telefone() {
		System.out.println("999999999");
		return "a";
	}
	@Override
	public int matricula() {
		System.out.println(020);
		return 0;
	}
	@Override
	public String endereco() {
		System.out.println("Vila Nova, Rua dos Lobos, n°55");
		return "a";
	}
	@Override
	public void calculaSalario() {
		System.out.println(salarioHora*horasTrabalhadas);
	}
}
