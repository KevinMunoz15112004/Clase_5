import static java.lang.Math.sqrt;

public class Operaciones {
    private double n1;
    private double n2;

    public Operaciones(){
    }

    public Operaciones(double n1, double n2) {
        this.n1 = n1;
        this.n2 = n2;
    }

    private double getN1() {
        return n1;
    }

    private double getN2() {
        return n2;
    }

    public void setN2(double n1) {
        this.n1 = n1;
    }

    public void setN1(double n2) {
        this.n2 = n2;
    }

    //metodos personalizados
    public void imprimirDatos(){
        System.out.println("N1: " + getN1());
        System.out.println("N2: " + getN2());
    }

    public double sumar(){
        return n1 + n2;
    }

    public double restar(){
        return n1 - n2;
    }

    public double multiplicar(){
        return n1 * n2;
    }

    public double dividir() {
        if (n2 == 0) {
            System.out.println("No se puede dividir para 0");
            return 0;
        }
    }

    public void raiz(){
        System.out.println(sqrt(n1));
        System.out.println(sqrt(n2));
    }



}
