package com.example.calculadora_dam;

public class Calculadora {
    public static String calcular(String cadena) {
        int mas;
        int menos;
        int por;
        try {
            if (cadena.contains("+")) {

                mas = cadena.indexOf("+");
                String num1 = cadena.substring(0, (mas));
                String num2 = cadena.substring((mas) + 1);
                return String.valueOf(Integer.parseInt(calcular(num1)) + Integer.parseInt(calcular(num2)));

            } else if (cadena.contains("-")) {

                menos = cadena.indexOf("-");
                String num1 = cadena.substring(0, (menos));
                String num2 = cadena.substring((menos) + 1);
                return String.valueOf(Integer.parseInt(calcular(num1)) - Integer.parseInt(calcular(num2)));

            } else if (cadena.contains("*")) {

                por = cadena.lastIndexOf("*");
                String num1 = cadena.substring(0, (por));
                String num2 = cadena.substring((por) + 1);
                return String.valueOf(Integer.parseInt(calcular(num1)) * Integer.parseInt(calcular(num2)));

            }
        } catch (Exception e) {
            return String.valueOf(-1);
        }
        return cadena;
    }
}
