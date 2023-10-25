package org.example;

public class Factorial {
    public Factorial() {
    }
    public int factorialRecursivo(int num){
        if (num < 0){
            return 0;
        }else {
            // Caso base
            if (num == 0){
                return 1;
            }else {
                //Dominio (Problema - 1)
                return num * factorialRecursivo(num - 1);
            }
        }
    }
    //Metodo factorial mediante iteracion
    public int factorialIterativo(int num){
        int factor = 1;
        if (num < 0){
         return 0;
        }else {
         while (num != 0){
             factor = num * factor;
             num--;
         }
         return factor;
        }
    }

}
