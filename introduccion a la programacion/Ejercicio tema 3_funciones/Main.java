  // Primera parte

public class Main {
    public static int suma (int a, int b, int c){
    return a + b + c;

}

public static void main(String[] args) {
    int resultado;
    resultado = suma( 10, 30, 140);
    System.out.println(resultado);

 // Segunda parte

    Coche miCoche = new Coche();
    miCoche.QuitarPuerta();
    miCoche.QuitarPuerta();
    miCoche.AgregarPuerta();
    miCoche.AgregarMuchaPuerta();
    System.out.println(miCoche.puerta);

}

} class Coche { 
    public int puerta= 0;

    public void AgregarPuerta() {
        this.puerta++;
    } 
    public void QuitarPuerta() {
     this.puerta--;
    }
    public void AgregarMuchaPuerta() {
        this.puerta++;
        this.puerta++;
        this.puerta++;
    }

}