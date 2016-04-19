package com.example.simple;

import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.text.StrBuilder;


public class AA
{
	private String name;
	
	public String appendNames()
	{
		StrBuilder sb = new StrBuilder();
		sb.append("Hello");
		if (StringUtils.isNotEmpty(getName()))
		{
			sb.append(" " + getName());
		}
		return sb.toString();
	}

	public String getName()
	{
		return name;
	}

	public void setName(final String name)
	{
		this.name = name;
	}
}
