package br.edu.insper.desagil.joice.model;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class CalculadoraCCCTest 
{
	
	@Test
	public void densidadeNiobio() 
	{
		Calculadora CCC = new CalculadoraCCC("Nióbio");
		double out = CCC.calcula(92.91, 0.143);
		double expected = 8.570176381874958;
		assertEquals(expected, out, 0.00001);
		
	}
	
	@Test
	public void densidadeTungstenio() 
	{
		Calculadora CCC = new CalculadoraCCC("Tungstênio");
		double out = CCC.calcula(183.84, 0.137);
		double expected = 19.28473708545127;
		assertEquals(expected, out, 0.00001);
	}
	
	@Test
	public void densidadeLitio() 
	{
		Calculadora CCC = new CalculadoraCCC("Lítio");
		double out = CCC.calcula(6.94, 0.152);
		double expected = 0.5330453008680993;
		assertEquals(expected, out, 0.00001);
	}

}
