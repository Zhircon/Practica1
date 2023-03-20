package com.example.practica1;

public class TempConversor {
    public static double ConvertToCelcius(double farenheit){
        return (farenheit - 32 ) / 1.8;
    }
    public static double ConvertToFarenheit(double celcius){
        return (celcius * 1.8f) + 32;
    }
}
