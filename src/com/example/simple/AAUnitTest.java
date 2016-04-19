package com.example.simple;

import org.junit.Test;

import static org.junit.Assert.*;


public class AAUnitTest
{
	@Test
	public void appendNames() throws Exception
	{

		final AA aa = new AA();
		aa.setName("Marlboro");
		assertNotNull(aa.appendNames());

	}

	@Test
	public void appendNamesNull() throws Exception
	{

		final AA aa = new AA();
		aa.setName(null);
		assertNotNull(aa.appendNames());

	}

	@Test
	public void appendNamesBlank() throws Exception
	{

		final AA aa = new AA();
		aa.setName("");
		assertNotNull(aa.appendNames());

	}

}
