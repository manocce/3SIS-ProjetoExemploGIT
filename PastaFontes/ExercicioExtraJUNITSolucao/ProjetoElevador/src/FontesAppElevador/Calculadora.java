package FontesAppElevador;

//Classe de entidade - Calculadora aritmética de apoio para estimar a carga do elevador
public class Calculadora {

	//Atributo de resultado de cálculo
	double resultadoo;
	
	//Getters & Setters
	public void setResultado(double valor) {
		this.resultadoo = valor;
	}
	
	public double getResultado() {
		return this.resultadoo;
	}
	
	//Método de soma de dois fatores
	public double somar(double valor1, double valor2) {
		this.resultadoo = valor1 + valor2;
		return this.resultadoo;
	}
	
	//Método de subtração de dois fatores
	public double subtrair(double valor1, double valor2) {
		this.resultadoo = valor1 - valor2;
		return this.resultadoo;
	}

}
