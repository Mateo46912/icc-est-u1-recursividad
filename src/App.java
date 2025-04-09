public class App {
    public static void main(String[] args) throws Exception {
        
    //     int n = 5;
    //     int resultadoFinal = factorial(n);
    //     System.out.println("Resultado: "+ resultadoFinal);

    // }

    // public static int factorial(int n){
    //     if (n== 0 ){
    //         System.out.println("Alcanzé el caso base ");
    //         return 1;
    //     }

    //     int resultadoParcial = n * factorial(n-1);
    //     System.out.println("Calculando factorial de: "+ n + " * factorial(" + (n-1) + "-1) " );
    //     return resultadoParcial;
        

        EjerciciosRecursivos ejercicios = new EjerciciosRecursivos();
        int resultado = ejercicios.fibonacci(5);
        System.out.println("El Fibonacci de 5 es: " + resultado);

        


    }
}
