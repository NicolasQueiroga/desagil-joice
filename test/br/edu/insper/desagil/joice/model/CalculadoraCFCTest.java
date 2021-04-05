package br.edu.insper.desagil.joice.model;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CalculadoraCFCTest 
{
	private CalculadoraCFC cfc;
	
	@BeforeEach
	public void init()
	{
		cfc = new CalculadoraCFC();
	}
	
	@Test
	public void densidadeCobre() 
	{
		double densidade = cfc.calcula(63.55, 0.128);
		double expected = 8.89;
		assertEquals(expected, densidade, 0.05);
		
	}
	
	@Test
	public void densidadeOuro() 
	{
		double densidade = cfc.calcula(196.97, 0.144);
		double expected = 19.36;
		assertEquals(expected, densidade, 0.05);
	}
	
	@Test
	public void densidadePrata() 
	{
		double densidade = cfc.calcula(107.87, 0.144);
		double expected = 10.60;
		assertEquals(expected, densidade, 0.05);
	}

}
