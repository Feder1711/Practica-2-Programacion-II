package mates;

import java.util.Random;

public class Matematicas {
    /**
     * Genera una aproximación al número Pi mediante el método de
     * Montecarlo utilizando recursividad. El parámetro `pasos` indica el número de puntos
     * generado.
     */
    public static double generarNumeroPiRecursivo(long pasos) {
        return generarNumeroPiRecursivo(pasos, 0, 0);
    }

    private static double generarNumeroPiRecursivo(long pasos, long dentroCirculo, long total) {
        if (pasos == 0) {
            return 4.0 * dentroCirculo / total;
        }

        Random rand = new Random();
        double x = rand.nextDouble(); /** Coordenada x aleatoria entre 0 y 1 */
        double y = rand.nextDouble(); /** Coordenada y aleatoria entre 0 y 1 */

        double distancia = Math.sqrt(x * x + y * y);

        if (distancia <= 1) {
            dentroCirculo++;
        }

        total++;

        return generarNumeroPiRecursivo(pasos - 1, dentroCirculo, total);
    }
}
