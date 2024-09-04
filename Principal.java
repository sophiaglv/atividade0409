package funcionario;

public class Principal {

	public static void main(String[] args) {
		Jornada jornada = new Jornada();
		Horista horista = new Horista();
		PessoaJuridica pessoaJuridica = new PessoaJuridica();
		
		System.out.println("------FUNCIONÁRIO JORNADA------");
		jornada.id();
		jornada.nome();
		jornada.telefone();
		jornada.matricula();
		jornada.endereco();
		jornada.calculaSalario();
		
		System.out.println("------FUNCIONÁRO HORISTA------");
		horista.id();
		horista.nome();
		horista.telefone();
		horista.matricula();
		horista.endereco();
		horista.calculaSalario();
		
		System.out.println("------FUNCIONÁRIO PESSOA JURIDICA------");
		pessoaJuridica.id();
		pessoaJuridica.nome();
		pessoaJuridica.telefone();
		pessoaJuridica.matricula();
		pessoaJuridica.endereco();
		pessoaJuridica.calculaSalario();
	}
}
