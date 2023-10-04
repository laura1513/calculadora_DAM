package com.example.calculadora_dam;

public class Calculadora {
    public static String calcular(String cadena) {
        int mas;
        String num1;
        String num2;
        if (cadena.contains("+")) {
            mas = cadena.indexOf("+");
            num1 = cadena.substring(0, (mas));
            num2 = cadena.substring((mas)+1, cadena.length());
            cadena = Integer.toString(Integer.parseInt(num1)+Integer.parseInt(num2));
        }
        return cadena;
    }
}
