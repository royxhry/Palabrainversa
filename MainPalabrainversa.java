import java.util.Scanner;

public class MainPalabrainversa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Palabrainversa pi = new Palabrainversa();

        System.out.println("Ingresa una palabra");
        pi.setPalabra(sc.nextLine());
        pi.mostrarPalabraInversa(); 
        System.out.println(pi);
        sc.close();

    }
}