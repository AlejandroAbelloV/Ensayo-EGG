/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3.Entidades;

/**
 *
 * @author 2022
 */
public class Operacion {

    java.util.Scanner leer = new java.util.Scanner(System.in);
    private int numero1;
    private int numero2;

    public Operacion(int numero1, int numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

    public Operacion() {
    }

    public void setNumero1(int numero1) {
        this.numero1 = numero1;
    }

    public void setNumero2(int numero2) {
        this.numero2 = numero2;
    }

    public int getNumero1() {
        return numero1;
    }

    public int getNumero2() {
        return numero2;
    }

    public void pedir() {

        System.out.println("Ingrese el numero 1");
        numero1 = leer.nextInt();
        System.out.println("Ingrese el numero 2");
        numero2 = leer.nextInt();
    }

    public int sumar(int numero1, int numero2) {

        int suma;

        suma = numero1 + numero2;
        System.out.println("El resultado de la suma es " + suma);
        return suma;
    }

    public int restar(int numero1, int numero2) {

        int resta;

        resta = numero1 - numero2;
        System.out.println("El resultado de la resta es " + resta);
        return resta;
    }

    public int multiplicar(int numero1, int numero2) {

        int multiplicacion = 0;

        if (numero1 != 0 && numero2 != 0) {
            multiplicacion = numero1 * numero2;
            System.out.println("El resultado del producto es " + multiplicacion);
        } else {

            System.out.println("Uno de los numeros ingresado es igual a 0, el resultado es " + multiplicacion);
        }

        return multiplicacion;
    }

    public int dividir(int numero1, int numero2) {

        int division = 0;

        if (numero1 != 0 && numero2 != 0) {
            if (numero1>numero2){
            division = numero1 / numero2;
            System.out.println("El resultado de la divición es " + division);}
            
            else if (numero1<numero2){
            division = numero2 / numero1;
            System.out.println("El resultado de la divición es " + division);}
            else
            System.out.println("Uno de los numeros ingresado es igual a 0, el resultado es " + division);
        }

        return division;
    }

}
