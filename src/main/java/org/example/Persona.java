public class Persona {
    String nombre;
    int edad;
    String genero;

    public static void main(String[] args) {
        Persona persona1 = new Persona();
        persona1.nombre = "Juan";
        persona1.genero = "Masculino";
        persona1.edad = 23;

        Persona persona2 = new Persona();

        persona2.nombre = "Patricio";
        persona2.genero = "Masculino";
        persona2.edad = 22;

        persona1.presentarse();
        persona2.presentarse();
    }

    public void presentarse() {
        System.out.println("Hola, mi nombre es: " + nombre + ", tengo " + edad + " años, y soy de sexo " + genero);
    }
}
