public class Calculadora{

	int variavel1;
	int variavel2;
	int soma;
	int subtrair;
	float dividir;
	int multiplicar;

	public void soma(){
	
	soma = (variavel1 + variavel2 );

	System.out.println("A soma e: " + this.soma);
}

	public void subtrair(){
	
	subtrair = (variavel1 - variavel2);

	System.out.println("A subtracao e: " + this.subtrair);
}
	
	public void dividir(){
	
	dividir = (variavel1 / variavel2);

	System.out.println("A divisao e: " + this.dividir);
}

	public void multiplicar(){
	
	multiplicar = (variavel1 * variavel2);

	System.out.println("A multiplicacao e: " + this.multiplicar);
}


	public static void main(String[] args){
	
	Calculadora um = new Calculadora();
	Calculadora dois = new Calculadora();
	Calculadora tres = new Calculadora();

	um.variavel1 = 8;
	um.variavel2 = 8;
	um.soma();
	um.subtrair();
	um.dividir();
	um.multiplicar();

	System.out.println("");

	dois.variavel1 = 18;
	dois.variavel2 = 3;
	dois.soma();
	dois.subtrair();
	dois.dividir();
	dois.multiplicar();

	System.out.println("");

	tres.variavel1 = 36;
	tres.variavel2 = 5;
	tres.soma();
	tres.subtrair();
	tres.dividir();
	tres.multiplicar();
	
		System.out.println("");	

	}	  

	
}
