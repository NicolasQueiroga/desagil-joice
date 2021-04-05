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
		double expected = 8.57;
		assertEquals(expected, out, 0.05);
		
	}
	
	@Test
	public void densidadeTungstenio() 
	{
		Calculadora CCC = new CalculadoraCCC("Tungstênio");
		double out = CCC.calcula(183.84, 0.137);
		double expected = 19.28;
		assertEquals(expected, out, 0.05);
	}
	
	@Test
	public void densidadeLitio() 
	{
		Calculadora CCC = new CalculadoraCCC("Lítio");
		double out = CCC.calcula(6.94, 0.152);
		double expected = 0.53;
		assertEquals(expected, out, 0.05);
	}

}
