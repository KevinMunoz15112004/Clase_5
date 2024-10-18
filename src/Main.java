import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);//input de datos
        //crea un objeto LibroCalificaciones y lo asigna a miLibroCalificaciones
        //LibroCalificaciones miLibroCalificaciones = new LibroCalificaciones("", "", 0, 0.0);

        /*//pide y recibe el nombre del curso como entrada
        System.out.println("Escriba el nombre del curso: ");
        String nombreDelCurso = sc.nextLine();
        System.out.println();//imprime una linea en blanco
        System.out.println("Escriba el periodo actual: ");
        String periodo = sc.nextLine();
        System.out.println("Escriba el año actual: ");
        int anio = sc.nextInt();
        System.out.println("Escriba el promedio actual: ");
        double promedio = sc.nextDouble();

        //llama al metodo mostrarMensaje de miLibroCalificaciones
        LibroCalificaciones miLibroCalificaciones = new LibroCalificaciones(nombreDelCurso, periodo, anio, promedio);
        miLibroCalificaciones.mostrarMensaje()

        LibroCalificaciones miLibro2 = new LibroCalificaciones();*/
        /*System.out.println("----CANCIONES----");
        Cancion cancion1=new Cancion("Despacito", "Luis Fonsi", "3:40");
        System.out.println("Ingrese el nombre de la canción: ");
        String nombre=sc.nextLine();
        System.out.println("Ingrese el artista: ");
        String artista=sc.nextLine();
        System.out.println("Ingrese la duracion: ");
        String duracion=sc.nextLine();
        Cancion cancion=new Cancion(nombre,artista,duracion);
        cancion1.imprimir();
        cancion.imprimir();

        System.out.println("----SERIES----");
        Serie serie1=new Serie("Juego de Tronos", 2017, "Jose Vargas");
        System.out.println("Ingrese el nombre de la serie: ");
        String nombreS=sc.nextLine();
        System.out.println("Ingrese el año: ");
        int anio=sc.nextInt();
        sc.nextLine();//solucion para ingresar texto despues de un int
        System.out.println("Ingrese el director: ");
        String director=sc.nextLine();
        Serie serie=new Serie(nombreS,anio,director);
        serie1.imprimir();
        serie.imprimir();

        System.out.println("-----VIDEOJUEGOS-----");
        Videojuegos juego1=new Videojuegos("Fortnite","+17","Accion");
        System.out.println("Ingrese el nombre del juego: ");
        String nombreV=sc.nextLine();
        System.out.println("Ingrese la categoria: ");
        String categoria=sc.nextLine();
        System.out.println("Ingrese el genero: ");
        String genero=sc.nextLine();
        Videojuegos juego=new Videojuegos(nombreV,categoria,genero);
        juego1.imprimit();
        juego.imprimit();*/


        System.out.println("----NUMEROS-----");
        System.out.println("Ingrese el numero 1: ");
        double n1 = sc.nextDouble();
        System.out.println("Ingrese el numero 2: ");
        double n2 = sc.nextDouble();
        Operaciones op = new Operaciones(n1, n2);


        System.out.println("Los datos son: ");
        op.imprimirDatos();
        System.out.println("------ SUMATORIA ------");
        System.out.println("La suma es: "+op.sumar());
        System.out.println("------ RESTA -------");
        System.out.println("La resta es: "+op.restar());
        System.out.println("------ MULTIPLICACION -------");
        System.out.println("La multiplicacion es: "+op.multiplicar());
        System.out.println("------ DIVISION -------");

        }
    }
