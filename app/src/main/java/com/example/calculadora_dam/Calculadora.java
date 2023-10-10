package com.example.calculadora_dam;

public class Calculadora {
    public static String calcular(String cadena) {
        int mas;
        String num1;
        String num2;
        int menos;
        try {
            if (cadena.contains("+")) {
                mas = cadena.indexOf("+");
                num1 = cadena.substring(0, (mas));
                num2 = cadena.substring((mas) + 1, cadena.length());
                cadena = Integer.toString(Integer.parseInt(num1) + Integer.parseInt(num2));
            } else if (cadena.contains("-")) {
                menos = cadena.indexOf("-");
                num1 = cadena.substring(0, (menos));
                num2 = cadena.substring((menos) + 1, cadena.length());
                cadena = Integer.toString(Integer.parseInt(num1) - Integer.parseInt(num2));
            }
        } catch (Exception e) {
            cadena = "-1";
        }
        return cadena;
    }
}
