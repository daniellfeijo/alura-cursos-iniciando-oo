class TestaFuncionario{

	public static void main(String[] args){
		/*		
		Funcionario f1 = new Funcionario();

		f1.nome = "Daniel";
		f1.salario = 100.0;
		f1.departamento= "Financeiro";
		f1.recebeAumento(10);
		f1.rg = "1234";
		f1.dataEntrada="01/01/2014";
		
		System.out.println("salario atual: " +f1.salario);
		System.out.println("ganho anual: " +f1.calculaGanhoAnual());
		
		f1.mostra();
		*/
		
		/* Exercicio 04
		Funcionario f1 = new Funcionario();        
		f1.nome = "Danilo";
		f1.salario = 100;

		Funcionario f2 = new Funcionario();        
		f2.nome = "Danilo";
		f2.salario = 100;
		*/
		//sempre vai dar diferente pois estamos
		//comparando referencias
		
		Funcionario f1 = new Funcionario ();

		f1.nome = "Hugo";
		f1.salario = 100;
		
		Funcionario f2 = f1;		

		if (f1 == f2) {
		    System.out.println("iguais");
		} else {
		    System.out.println("diferentes");        
		}	

	}

}
