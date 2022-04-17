public class Main {
    public static void main(String[] args) {
         
   
 // Crea una clase Persona con las siguientes variables:
// La edad
// El nombre
// El teléfono
        class Persona {
            int edad;
            String nombre;
            String telefono;
        
            public void setEdad(int edad) {
            this.edad = edad;
            }
            public int getEdad() {
                return  this.edad;
            }
            public void setNombre(String nombre) {
                this.nombre = nombre;
            }
            public String getNombre() {
                return this.nombre;
            }
            public void setTelefono (String telefono) {
                this.telefono = telefono;
            }
            public String getTelefono() {
                return this.telefono;
            }
        }
        // Una vez creada la clase, crea una nueva clase Cliente que herede de Persona, esta nueva clase tendrá la variable credito solo para esa clase.

        class Cliente extends Persona {
           int credito;

            public void setCredito (int credito) {
                this.credito = credito;
            }
            public int getCredito() {
                return this.credito;
            }
        }

    // Crea ahora un objeto de la clase Cliente que debe tener como propiedades la edad, el telefono, el nombre y el credito, tienes que darles valor y mostrarlas por pantalla.
    Cliente cliente = new Cliente();
    cliente.setEdad (25);
    cliente.setNombre ("Mariquena");
    cliente.setTelefono ("37659384"); 
    cliente.setCredito(25000);
    System.out.println("Cliente: " + cliente.getNombre() + " " + cliente.getEdad() + " " + cliente.getTelefono() +
    " " + " " + cliente.getCredito());

    // Una vez hecho esto, haz lo mismo con la clase Trabajador que herede de Persona, y con una variable salario que solo tenga la clase Trabajador.

        class Trabajador extends Persona{
            int salario;

        public void setSalario(int salario){
            this.salario = salario;
        }
        public int getSalario(){
            return this.salario;
        }
    }
    Trabajador trabajador = new Trabajador();
    trabajador.setSalario(40000);
    trabajador.setNombre("Paula");
    trabajador.setEdad (25);
    trabajador.setTelefono("3029470293");
    System.out.println("Trabajador: " + trabajador.getNombre() + " " + trabajador.getEdad() + " " + trabajador.getTelefono() +
    " " + " " + trabajador.getSalario());
   
    }
}