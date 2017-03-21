package bhaskaraasavessas;

import java.util.Scanner;

public class BhaskaraAsAvessas {
    
    public static void main(String[] args) {
        Scanner lg = new Scanner(System.in);
        
        // Entradas
        System.out.print("x1: ");
        double x1 = lg.nextDouble();
        System.out.print("x2: ");
        double x2 = lg.nextDouble();
        System.out.print("c: ");
        double c = lg.nextDouble();
        
        // Processamento
        double s = x1 + x2;
        double p = x1 * x2;
        double a = c / p;
        double b = - (a * s);
        
        // Saida
        System.out.println(a + " x² + " + b + " x + " + c + " = 0");
        
    }
    
}
