public class Main {
    public static void main(String[] args){
// Crear clase persona
        class Persona {
// Crear variables las privadas edad, nombre y telefono de la clase Persona.
                private int edad;
                private String nombre;
                private String telefono;
// Crear gets y sets de cada propiedad.
                public void setEdad (int edad) {
                    this.edad = edad;
                }
                public int getEdad () {
                    return this.edad;
                }
                public void setNombre (String nombre) {
                    this.nombre = nombre;
                }
                public String getNombre () {
                    return this.nombre;
                }
                public void setTelefono (String telefono) {
                    this.telefono = telefono;
                }
                public String getTelefono () {
                    return this.telefono;
                }
        }
// Crear un objeto persona en el main.
    Persona persona = new Persona();
// Utiliza los gets y sets para darle valores a las propiedades edad, nombre y telefono, por último muéstralas por consola.
        persona.setEdad (25);
        persona.setNombre ("Mariquena");
        persona.setTelefono ("5467896543");

        System.out.println (persona.getNombre ());
        System.out.println (persona.getEdad ());
        System.out.println (persona.getTelefono ());
    }
}