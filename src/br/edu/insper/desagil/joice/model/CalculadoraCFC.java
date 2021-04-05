package br.edu.insper.desagil.joice.model;

public class CalculadoraCFC extends Calculadora 
{

	public CalculadoraCFC() 
	{
		super("Cúbica de Face Centrada");
	}

	@Override
	public double calcula(double peso, double raio) 
	{
		raio = raio*Math.pow(10, -7);
	    double V = (16*Math.pow(raio, 3))*(Math.sqrt(2));
	    double Na = 6.02*Math.pow(10, 23);
	    double num = 4*peso;
	    double den = V*Na;
		return num/den;
	}

}
