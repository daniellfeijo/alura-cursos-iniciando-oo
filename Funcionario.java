//Classe Funcionário
//Uma Classe é uma receita de bolo
//O objeto instanciado é o bolo feito a partir da classe
class Funcionario{
	//atributos da classe
	String nome;
	String departamento;
	double salario;
	String dataEntrada;
	String rg;
	
	//metodo recebeAumento sem retorno "void"
	//recebe como parametro o percetual de aumento	
	void recebeAumento (double percentual){
		this.salario += this.salario*percentual;

	}
	//metodo calculaGanhoAnual com retorno double
	double calculaGanhoAnual(){
		double ganhoAnual = this.salario*12;
		return ganhoAnual;		
	}
}
