public class Data {
	int dia;
	int mes;
	int ano;

	String getFormatada(){
		String diaStr = Integer.toString(this.dia);
		String mesStr = Integer.toString(this.mes);
		String anoStr = Integer.toString(this.ano);
		String dataFormatada = diaStr+"/"+mesStr+"/"+anoStr;
		return dataFormatada;

	}	


}
