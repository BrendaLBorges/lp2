public class Aluno {

	String nome;
	int idade;
	String numeroMatricula;	

	public void imprimirDadosCadastrais(){
		System.out.println("Nome :" + this.nome);
		System.out.println("Idade :" + this.idade);
		System.out.println("Numero Matricula :" + this.numeroMatricula);
	}
	
	public static void main(String[] args){


	Aluno estudante = new Aluno();
	Aluno estudante1 = new Aluno();
	Aluno estudante2 = new Aluno();
	Aluno estudante3 = new Aluno();
	
		
	estudante.nome = "Miguel";
	estudante.idade = 16;
	estudante.numeroMatricula = "201218110074"; 
	estudante.imprimirDadosCadastrais();


	estudante1.nome = "Luís Filipe";
	estudante1.idade = 18;
	estudante1.numeroMatricula = "20121801055";
	estudante1.imprimirDadosCadastrais(); 

	estudante2.nome = "Fernanda";
	estudante2.idade = 19;
	estudante2.numeroMatricula = "201218110049";
	estudante2.imprimirDadosCadastrais();

	estudante3.nome = "Elena";
	estudante3.idade = 18;
	estudante3.numeroMatricula = "201218110110";
	estudante3.imprimirDadosCadastrais();  

}	
	

}
