package com.example.simple;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.Assert.assertNotNull;

@RunWith(PowerMockRunner.class)
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

    @Test
    @PrepareForTest(LoggerFactory.class)
    public void appendNamesLogFalse() throws Exception
    {
        PowerMockito.spy(LoggerFactory.class);
        Logger logger = Mockito.spy(Logger.class);
        Mockito.when(LoggerFactory.getLogger(AA.class)).thenReturn(logger);
        Mockito.when(logger.isDebugEnabled()).thenReturn(false);
        final AA aa = new AA();
        aa.setName("111111");
        assertNotNull(aa.appendNames());

    }

    @Test
    @PrepareForTest(LoggerFactory.class)
    public void appendNamesLogTrue() throws Exception
    {
        PowerMockito.spy(LoggerFactory.class);
        Logger logger = Mockito.spy(Logger.class);
        Mockito.when(LoggerFactory.getLogger(AA.class)).thenReturn(logger);
        Mockito.when(logger.isDebugEnabled()).thenReturn(true);
        final AA aa = new AA();
        aa.setName("22222");
        assertNotNull(aa.appendNames());

    }

}
