package com.example.simple;

import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class AA
{
    private static final Logger logger = LoggerFactory.getLogger(AA.class);
    private String name;

    public String appendNames()
    {
        StringBuilder sb = new StringBuilder();
        sb.append("Hello");
        if (StringUtils.isNotEmpty(getName()))
        {
            sb.append(" ");
            sb.append(getName());
        }
        if (logger.isDebugEnabled())
        {
            logger.debug(sb.toString());
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
