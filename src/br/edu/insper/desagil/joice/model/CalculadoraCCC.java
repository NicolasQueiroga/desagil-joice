package br.edu.insper.desagil.joice.model;

public class CalculadoraCCC extends Calculadora 
{

	public CalculadoraCCC() 
	{
		super("Cubica de Corpo Centrado");
	}

	@Override
	public double calcula(double peso, double raio) 
	{
		raio = raio*Math.pow(10, -7);
	    double V = (64*Math.pow(raio, 3))/(3*Math.sqrt(3));
	    double Na = 6.02*Math.pow(10, 23);
	    double num = 2*peso;
	    double den = V*Na;
		return num/den;
	}

}
