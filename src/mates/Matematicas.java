package mates;

import java.util.Random;

public class Matematicas {
    /**
     * Genera una aproximación al número Pi mediante el método de
     * Montecarlo. El parámetro `pasos` indica el número de puntos
     * generado.
     */
    public static double generarNumeroPiIterativo(long pasos) {
        Random rand = new Random();
        long dentroCirculo = 0;

        for (long i = 0; i < pasos; i++) {
            double x = rand.nextDouble(); /** Coordenada x aleatoria entre 0 y 1
                                            */
            double y = rand.nextDouble(); /** Coordenada y aleatoria entre 0 y 1
                                            */
            /** Calculamos la distancia al origen (0,0) 
            */
            double distancia = Math.sqrt(x * x + y * y);

            /** Si la distancia es menor o igual a 1, el punto está dentro del círculo
            */
            if (distancia <= 1) {
                dentroCirculo++;
            }
        }

        /* Aproximación al número pi
        */
       return 4.0 * dentroCirculo / pasos;
    }
}
