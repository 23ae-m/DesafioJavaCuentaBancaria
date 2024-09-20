import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {
        String nombre = "Pedrito Navajas";
        String tipoDeCuenta = "Corriente";
        double saldoCuenta = 1599.99;
        int opcion = 0;

        System.out.println("*************************************************");
        System.out.println("\nNombre del cliente: " + nombre);
        System.out.println("El tipo de cuenta es: " + tipoDeCuenta);
        System.out.println("El saldo de la cuenta es: " + saldoCuenta + "$");
        System.out.println("\n*************************************************");

        String menu = """
                **** Escriba el número de la opción deseada ****
                1 - Consultar Saldo
                2 - Retirar
                3 - Depositar
                9 - Salir
                """;
        Scanner teclado = new Scanner(System.in);
        while (opcion != 9){
            System.out.println(menu);
            opcion = teclado.nextInt();

            switch (opcion){
                case 1:
                    System.out.println("El saldo actualizado es: " + saldoCuenta + "$");
                    break;
                case 2:
                    System.out.println("¿Cúal es el valor que desea retirar?");
                    double ValorARetirar = teclado.nextDouble();
                    if (ValorARetirar > saldoCuenta){
                        System.out.println("El saldo es insuficiente");
                    }else{
                        saldoCuenta -= ValorARetirar;
                        System.out.println("El saldo actualizado es: " + saldoCuenta + "$");
                    } break;
                case 3:
                    System.out.println("¿Cúal es el valor que desea depositar?");
                    double valorADepositar = teclado.nextDouble();
                    saldoCuenta += valorADepositar;
                    System.out.println("El saldo actualizado es: " + saldoCuenta + "$");
                    break;
                case 9:
                    System.out.println("Saliendo del programa, gracias por utilizar nuestro servicio");
                    break;
                default:
                    System.out.println("La opción que ingresó no es válida");
            }
        }
    }
}
