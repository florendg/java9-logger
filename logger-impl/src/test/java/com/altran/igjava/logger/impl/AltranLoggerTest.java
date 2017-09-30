package com.altran.igjava.logger.impl;

import org.apache.logging.log4j.Logger;
import org.junit.Test;

import org.mockito.Mockito;

import static org.junit.Assert.*;

public class AltranLoggerTest {

   private Logger logger = Mockito.mock(Logger.class);

   private AltranLogger sut = new AltranLogger(logger);

   @Test
   public void isLoggable() {

      Mockito.when(logger.isInfoEnabled()).thenReturn(true);
      assertTrue(sut.isLoggable(System.Logger.Level.INFO));

   }

}