public class Videojuegos {
    private String nombreV;
    private String categoria;
    private String genero;

    public Videojuegos(String nombre, String categoria, String genero) {
        this.nombreV = nombre;
        this.categoria = categoria;
        this.genero = genero;
    }

    public String getNombre() {
        return nombreV;
    }
    public String getCategoria() {
        return categoria;
    }
    public String getGenero() {
        return genero;
    }

    public void setNombre(String nombre) {
        this.nombreV = nombre;
    }
    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
    public void setGenero(String genero) {
        this.genero = genero;
    }

    //imprimir
    public void imprimit(){
        System.out.printf("Nombre: %s\n", nombreV);
        System.out.printf("Categoria: %s\n", categoria);
        System.out.printf("Genero: %s\n", genero);
        System.out.println("---------------------------");
    }
}
