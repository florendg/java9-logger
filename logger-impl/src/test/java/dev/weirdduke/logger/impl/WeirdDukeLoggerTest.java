package dev.weirdduke.logger.impl;

import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.assertTrue;


class WeirdDukeLoggerTest {

    private Logger logger = Mockito.mock(Logger.class);

    private WeirddukeLogger sut = new WeirddukeLogger(logger);

    @Test
    void isLoggable() {
        Mockito.when(logger.isInfoEnabled()).thenReturn(true);
        assertTrue(sut.isLoggable(System.Logger.Level.INFO));

    }

}