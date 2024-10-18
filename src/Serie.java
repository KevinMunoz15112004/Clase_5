public class Serie {
    private String nombreS;
    private int anio;
    private String director;

    public Serie(String nombreS, int anio, String director) {
        this.nombreS = nombreS;
        this.anio = anio;
        this.director = director;
    }

    public String getNombre() {
        return nombreS;
    }

    public int getAnio() {
        return anio;
    }
    public String getDirector() {
        return director;
    }

    public void setNombre(String nombre) {
        this.nombreS = nombre;
    }
    public void setAnio(int anio) {
        this.anio = anio;
    }
    public void setDirector(String director) {
        this.director = director;
    }

    //imprimir
    public void imprimir(){
        System.out.printf("Nombre: %s\n", getNombre());
        System.out.printf("Anio: %d\n", getAnio());
        System.out.printf("Director: %s\n", getDirector());
        System.out.println("---------------------------");
    }
}
