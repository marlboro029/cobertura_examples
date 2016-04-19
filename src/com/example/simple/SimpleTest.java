/**
 * Cobertura - http://cobertura.sourceforge.net/
 * <p>
 * Copyright (C) 2003 jcoverage ltd.
 * Copyright (C) 2005 Mark Doliner <thekingant@users.sourceforge.net>
 * <p>
 * Cobertura is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published
 * by the Free Software Foundation; either version 2 of the License,
 * or (at your option) any later version.
 * <p>
 * Cobertura is distributed in the hope that it will be useful, but
 * WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * General Public License for more details.
 * <p>
 * You should have received a copy of the GNU General Public License
 * along with Cobertura; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA 02111-1307
 * USA
 */

package com.example.simple;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;

@RunWith(PowerMockRunner.class)
public class SimpleTest
{
    @Test
    public void testSquare()
    {
        final Simple simple = new Simple();
        Assert.assertEquals(1, simple.square(1));
        Assert.assertEquals(1, simple.square(-1));
    }

    @Test
    @PrepareForTest(LoggerFactory.class)
    public void testSquareLogTrue()
    {
        PowerMockito.spy(LoggerFactory.class);
        Logger logger = Mockito.spy(Logger.class);
        Mockito.when(LoggerFactory.getLogger(Simple.class)).thenReturn(logger);
        Mockito.when(logger.isDebugEnabled()).thenReturn(true);
        final Simple simple = new Simple();
        Assert.assertEquals(1, simple.square(1));
        Assert.assertEquals(1, simple.square(-1));
    }

    @Test
    @PrepareForTest(LoggerFactory.class)
    public void testSquareLogFalse()
    {
        PowerMockito.spy(LoggerFactory.class);
        Logger logger = Mockito.spy(Logger.class);
        Mockito.when(LoggerFactory.getLogger(Simple.class)).thenReturn(logger);
        Mockito.when(logger.isDebugEnabled()).thenReturn(false);
        final Simple simple = new Simple();
        Assert.assertEquals(1, simple.square(1));
        Assert.assertEquals(1, simple.square(-1));
    }

    @Test
    public void testF()
    {
        final Simple simple = new Simple();
        Assert.assertEquals(1, simple.f(-1));
        Assert.assertEquals(12, simple.f(6));
        Assert.assertEquals(7, simple.f(4));
        Assert.assertEquals(3, simple.f(0));
        Assert.assertEquals(8, simple.f(5));
    }
    @Test
    @PrepareForTest(LoggerFactory.class)
    public void testFLogTrue()
    {
        PowerMockito.spy(LoggerFactory.class);
        Logger logger = Mockito.spy(Logger.class);
        Mockito.when(LoggerFactory.getLogger(Simple.class)).thenReturn(logger);
        Mockito.when(logger.isDebugEnabled()).thenReturn(true);
        final Simple simple = new Simple();
        Assert.assertEquals(1, simple.f(-1));
        Assert.assertEquals(12, simple.f(6));
        Assert.assertEquals(7, simple.f(4));
        Assert.assertEquals(3, simple.f(0));
        Assert.assertEquals(8, simple.f(5));
    }
    @Test
    @PrepareForTest(LoggerFactory.class)
    public void testFLogFalse()
    {
        PowerMockito.spy(LoggerFactory.class);
        Logger logger = Mockito.spy(Logger.class);
        Mockito.when(LoggerFactory.getLogger(Simple.class)).thenReturn(logger);
        Mockito.when(logger.isDebugEnabled()).thenReturn(false);
        final Simple simple = new Simple();
        Assert.assertEquals(1, simple.f(-1));
        Assert.assertEquals(12, simple.f(6));
        Assert.assertEquals(7, simple.f(4));
        Assert.assertEquals(3, simple.f(0));
        Assert.assertEquals(8, simple.f(5));
    }

    @Test
    public void testSum()
    {
        final Simple simple = new Simple();
        List<Integer> c = new ArrayList<>();
        c.add(3);
        c.add(5);
        c.add(8);
        Assert.assertEquals(16, simple.sum(c));
    }

    @Test
    @PrepareForTest(LoggerFactory.class)
    public void testSumLogTrue()
    {
        PowerMockito.spy(LoggerFactory.class);
        Logger logger = Mockito.spy(Logger.class);
        Mockito.when(LoggerFactory.getLogger(Simple.class)).thenReturn(logger);
        Mockito.when(logger.isDebugEnabled()).thenReturn(true);
        final Simple simple = new Simple();
        List<Integer> c = new ArrayList<>();
        c.add(3);
        c.add(5);
        c.add(8);
        Assert.assertEquals(16, simple.sum(c));
    }
    
    @Test
    @PrepareForTest(LoggerFactory.class)
    public void testSumLogFalse()
    {
        PowerMockito.spy(LoggerFactory.class);
        Logger logger = Mockito.spy(Logger.class);
        Mockito.when(LoggerFactory.getLogger(Simple.class)).thenReturn(logger);
        Mockito.when(logger.isDebugEnabled()).thenReturn(false);
        final Simple simple = new Simple();
        List<Integer> c = new ArrayList<>();
        c.add(3);
        c.add(5);
        c.add(8);
        Assert.assertEquals(16, simple.sum(c));
    }
}