package com.example.calculadora_dam;
public class Calculadora {
    public static String calcular(String cadena) {
        int mas;
        int menos;
        int por;
        /**
         * Un try catch para que coja la excepción cuando se introduzca un valor incorrecto
         */
        try {
            /**Si tiene un caracter + en la cadena, sumará los valores*/
            if (cadena.contains("+")) {

                /**Se divide la por el caracter +
                 * Se coge el trozo desde el principio de la cadena hasta la posición del +
                 * Y desde la posicion del + añadiendo un caracter para que solo coja el numero
                 * La función calculate es recursiva por lo que se hará el método hasta que finalice lo que quieres calcular
                 */
                mas = cadena.indexOf("+");
                String num1 = cadena.substring(0, (mas));
                String num2 = cadena.substring((mas) + 1);
                return String.valueOf(Integer.parseInt(calcular(num1)) + Integer.parseInt(calcular(num2)));

            /**Si tiene un caracter - en la cadena, restará los valores*/
            } else if (cadena.contains("-")) {

                /**Se divide la por el caracter -
                 * Se coge el trozo desde el principio de la cadena hasta la posición del -
                 * Y desde la posicion del - añadiendo un caracter para que solo coja el numero
                 * La función calculate es recursiva por lo que se hará el método hasta que finalice lo que quieres calcular
                 */
                menos = cadena.indexOf("-");
                String num1 = cadena.substring(0, (menos));
                String num2 = cadena.substring((menos) + 1);
                return String.valueOf(Integer.parseInt(calcular(num1)) - Integer.parseInt(calcular(num2)));

            /**Si tiene un caracter * en la cadena, multiplicará los valores*/
            } else if (cadena.contains("*")) {

                /**Se divide la por el caracter *
                 * Se coge el trozo desde el principio de la cadena hasta la posición del *
                 * Y desde la posicion del * añadiendo un caracter para que solo coja el numero
                 * La función calculate es recursiva por lo que se hará el método hasta que finalice lo que quieres calcular
                 */
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
