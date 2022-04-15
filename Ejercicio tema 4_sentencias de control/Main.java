public class Main {
    public static void main(String[] args) {
    // Usando un if, crear una condición que compare si la variable numeroIf es positivo, negativo, o 0
        int numeroif = 0;

        if (numeroif==0) {
            System.out.println("Es igual a 0");
        } else if(numeroif<=0) { 
            System.out.println("El número "+ numeroif +" es negativo");
        } else if (numeroif>=0) {
            System.out.println("El número "+ numeroif +" es positivo");
        }


    // Crea un bucle While, este bucle tendrá que tener como condición que la variable numeroWhile sea inferior a 3, el bloque de código que tendrá el bucle deberá:
    // Incrementar el valor de la variable en uno cada vez que se ejecute.
    // Mostrarlo por pantalla cada vez que se ejecute.
        int numeroWhile = 0;
        while (numeroWhile < 3){
        System.out.println(numeroWhile);
        numeroWhile++;
        }
        
    // Para el bucle Do While, deberás crear la misma estructura que en el While, pero solo se debe ejecutar una vez.
        int numeroDoWhile = 0;
        do{
            System.out.println(numeroDoWhile);
            numeroDoWhile++;
        } while (numeroDoWhile < 3);
}
}