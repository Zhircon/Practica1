package com.example.practica1;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void ConvertToCelsius_isCorrect(){
        assertEquals(TempConversor.ConvertToCelcius(32),0,0.1f);
    }
    @Test
    public void ConvertToFarenheit_isCorrect(){
        assertEquals(TempConversor.ConvertToFarenheit(0),32,0.1f);
    }
}