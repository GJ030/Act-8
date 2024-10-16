import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

    Perro a = new Perro();
    Scanner t = new Scanner(System.in);
    String nomPerro,razaPerro,nombreDueno,genero,tamano;
    int edadPerro,numeroTelefono;

    System.out.print("Ingrese el nombre del perro:");
    nomPerro= t.nextLine();
    a.setNombre(nomPerro);
    System.out.print("Ingrese la raza del perro:");
    razaPerro= t.nextLine();
    a.setRaza(razaPerro);
    System.out.print("Ingrese la edad del perro en años:");
    edadPerro= t.nextInt();
    a.setEdad(edadPerro);
    System.out.print("Ingrese el numero de telefono del dueño sin el 55:");
    numeroTelefono= t.nextInt();
    a.setNumeroTelefono(numeroTelefono);
    System.out.print("Ingrese el nombre del dueño:");
    nombreDueno= t.nextLine();
    a.setNombreDueno(nombreDueno);
    System.out.print("Ingrese el genero del perro M/F:");
    genero= t.nextLine();
    a.setGenero(genero);
    System.out.print("Ingrese el tamaño del perro Ch/M/G:");
    tamano= t.nextLine();
    a.setTamano(tamano);

    System.out.println(a.getNombre());
    System.out.println(a.getRaza());
    System.out.println(a.getEdad());
    System.out.println(a.getNumeroTelefono());
    System.out.println(a.getNombreDueno());
    System.out.println(a.getGenero());
    System.out.println(a.getTamano());
    System.out.println(a.Ladrar());
    }


}