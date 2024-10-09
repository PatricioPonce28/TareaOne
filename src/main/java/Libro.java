public class Libro {

    String title = "";
    String autor = "";
    int pagina_Count = 0;

    public static void main(String[] args){
        Libro libro1 = new Libro();

        libro1.autor = "George Owell";
        libro1.title = "1984";
        libro1.pagina_Count = 352;

        Libro libro2 = new Libro();

        libro2.autor = "Miguel de Cervantes";
        libro2.title = "Don Quijote de la Mancha";
        libro2.pagina_Count = 920;

        libro1.infoLibro();
        libro2.infoLibro();
    }
    public void infoLibro() {
        System.out.println("El libro  '" + title + "' " + "del autor " + autor + "con " + pagina_Count + " páginas se encuentra disponible" );
    }
}
