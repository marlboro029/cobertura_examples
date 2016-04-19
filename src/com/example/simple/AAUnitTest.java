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

}
