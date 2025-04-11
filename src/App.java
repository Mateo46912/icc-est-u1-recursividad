public class App {
    public static void main(String[] args) throws Exception {
        
        // FACTORIAL
        int n = 5;
        int resultadoFinal = factorial(n);
        System.out.println("Resultado: "+ resultadoFinal);
        System.out.println("");

        // FIBONACCI
        EjerciciosRecursivos ejercicios = new EjerciciosRecursivos();
            int resultadoFibonacci = ejercicios.fibonacci(5); 
            System.out.println("Fibonacci(6) = " + resultadoFibonacci);
            
            int resultadoSuma = ejercicios.sumaConsecutivos(5); 
            System.out.println("Suma consecutivos(5) = " + resultadoSuma);
            System.out.println("");

         // Exponente
       
        int resultadoPotencia = ejercicios.getPotencia(2, 3);
        System.out.println("Potencia de 2 con exponente 3 = " + resultadoPotencia);
        System.out.println("");

        // Suma de digitos
        int resultadoDigitos = ejercicios.getSumaDigitos(125);
         System.out.println("Suma de digitos de 125 = " + resultadoDigitos);
         System.out.println("");

         // Descendente
        System.out.print("Numeros descendentes de 10:  ");
         int resultadoDescendente = ejercicios.numerosDescendente (10);
         System.out.println("");

         //Resultado reverso
         System.out.println("");
         int resultadoReverso = ejercicios.reverso(1234, 0);
         System.out.println("Reverso de 1234 = " + resultadoReverso);
         
    }

    public static int factorial(int n){ 
        if (n== 0 ){
            System.out.println("Alcanzé el caso base ");
            return 1;
        }

        int resultadoParcial = n * factorial(n-1);
        System.out.println("Calculando factorial de: "+ n + " * factorial(" + (n-1) + "-1) " );
        return resultadoParcial;

    }
}
