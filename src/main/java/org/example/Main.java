package org.example;

public class Main {
    public static void main(String[] args) {
        //BajarEscalera persona = new BajarEscalera();
        //persona.bajarEscaleras(2);
        Factorial factorial = new Factorial();
        System.out.println(factorial.factorialRecursivo(5));
        System.out.println(factorial.factorialIterativo(5));
    }
}