import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        //bucle if else
        try (Scanner escaner = new Scanner(System.in)) {
            
            System.out.println("Escribe un número:");
            
            double numeroif = escaner.nextDouble();
      

            if (numeroif == 0) {
                System.out.println("El número es 0");
            } else if (numeroif < 0) {
                System.out.println("El número es negativo");
            } else {
                System.out.println("El número es positivo");
            }
        }

    //bucle for
for (int numeroFor =0; numeroFor <=3; numeroFor=numeroFor+1){
    System.out.println("Bucle For:" + numeroFor);

}
        //blucle do while
        int contador1 =10;
        do{
            System.out.println("bucle do while es "+contador1);
            contador1=contador1++;

        }while (contador1 >10);
       

        //bucle while
        int contador = 0;
        
        while (contador <3){
            System.out.println("Bucle while"+contador);
            contador++;
        }
        
        var estacion ="Verano";
        switch (estacion){
            case "Verano":
            System.out.println("es Verano");
            break;
            case "Otoño":
            System.out.println("es Otoño");
            break;
            case "Invierno":
            System.out.println("es Invierno");
            break;
            case "Privamera":
            System.out.println("es Privamera");
            break;
            default:
            System.out.println("estoy en Dafault");
           

        }
    }
}

