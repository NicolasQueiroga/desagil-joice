package br.edu.insper.desagil.joice.model;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CalculadoraCCCTest 
{
	private CalculadoraCCC ccc;
	
	@BeforeEach
	public void init()
	{
		ccc = new CalculadoraCCC();
	}
	
	@Test
	public void densidadeNiobio() 
	{
		double densidade = ccc.calcula(92.91, 0.143);
		double expected = 8.57;
		assertEquals(expected, densidade, 0.05);
		
	}
	
	@Test
	public void densidadeTungstenio() 
	{
		double densidade = ccc.calcula(183.84, 0.137);
		double expected = 19.28;
		assertEquals(expected, densidade, 0.05);
	}
	
	@Test
	public void densidadeLitio() 
	{
		double densidade = ccc.calcula(6.94, 0.152);
		double expected = 0.53;
		assertEquals(expected, densidade, 0.05);
	}

}
