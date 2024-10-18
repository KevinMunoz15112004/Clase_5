public class Cancion {
    private String nombre;
    private String artista;
    private String duracion;

    public Cancion(String nombre, String artista, String duracion) {
        this.nombre = nombre;
        this.artista = artista;
        this.duracion = duracion;
    }

    //getters
    public String getNombre() {
        return nombre;
    }
    public String getArtista() {
        return artista;
    }
    public String getDuracion() {
        return duracion;
    }

    //setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setArtista(String artista) {
        this.artista = artista;
    }
    public void setDuracion(String duracion) {
        this.duracion = duracion;
    }

    //imprimir
    public void imprimir() {
        System.out.printf("Nombre: %s\n", getNombre() );
        System.out.printf("Artista: %s\n", getArtista() );
        System.out.printf("Duracion: %s\n", getDuracion() );
        System.out.println("---------------------------");
    }
}
