import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
     Scanner scan = new Scanner(System.in);
     System.out.println("DIgite um valor em real");
     double valorreal = scan.nextDouble();
     System.out.println("Qual a cotação atual do dolar?");
     double cotadol = scan.nextDouble();
         Converter(valorreal,cotadol);
    }
    public static void Converter( double valorreal,double cotadol ){
        double conversao = valorreal * cotadol;
        System.out.println("A conversão é :" + conversao);
    }
}