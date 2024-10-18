public class LibroCalificaciones {
    //nombre del curso para este LibroCalificaciones
    private String nombreDelCurso;
    private String periodo;
    private int anio;
    private double promedio;

    public LibroCalificaciones(String nombreDelCurso, String periodo, int anio, double promedio) {
        this.nombreDelCurso = nombreDelCurso;
        this.periodo = periodo;
        this.anio = anio;
        this.promedio = promedio;
    }

    public LibroCalificaciones() {

    }

    //metodo para establecer el nombre del curso (setter)
    public void establecerNombreDelCurso(String nombreDelCurso) {
        this.nombreDelCurso = nombreDelCurso;
    }
    public void establecerPeriodo(String periodo) {
        this.periodo = periodo;
    }
    public void establecerAnio(int anio) {
        this.anio = anio;
    }
    public void establecerPromedio(double promedio) {
        this.promedio = promedio;
    }

    //metodo para obtener el nombre del curso (getter)
    public String obtenerNombreDelCurso() {
        return nombreDelCurso;
    }
    public String obtenerPeriodo() {
        return periodo;
    }
    public int obtenerAnio() {
        return anio;
    }
    public double obtenerPromedio() {
        return promedio;
    }

    public void metodo1(){

    }
    public void metodo2(){

    }
    //mostrar mensaje de bienvenida
    public void mostrarMensaje(){
        System.out.printf("Bienvenido al libro de calificaciones para \n%s\n", obtenerNombreDelCurso());
        System.out.printf("Periodo: %s\n", obtenerPeriodo());
        System.out.printf("Anio: %d\n", obtenerAnio());
        System.out.printf("Promedio: %.2f\n", obtenerPromedio());
    } //fin del metodo mostrarMensaje
}//fin de la clase LibroCalificaciones

