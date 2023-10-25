package org.example;

public class BajarEscalera {

    public BajarEscalera() {
    }
    public void bajarEscaleras(int numEscalones){
        // Verificar que no haya valores negativos
        if (numEscalones < 0){
            System.out.println("No existen los escalones negativos");
            return;
        }
        if (numEscalones == 0){
            // Caso Base, Respuesta Explicita
            System.out.println("Bajaste las escaleras");
        }else {
            // Dominio, Division del problema original (n - 1)
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Bajando escalon " + numEscalones);
            //Haciendo uso de la recursividad.
            bajarEscaleras(numEscalones - 1);

            //Cuando un metodo se llama a si mismo es la recursividad.
        }
    }


}
