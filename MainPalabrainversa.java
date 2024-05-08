import java.util.Scanner;

public class MainPalabrainversa {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner sc = new Scanner(System.in);
        // Crear un objeto de tipo Palabrainversa
        Palabrainversa pi = new Palabrainversa();

        // Solicitar al usuario que ingrese una palabra
        System.out.println("Ingresa una palabra:");
        pi.setPalabra(sc.nextLine());
        // Mostrar la palabra original y su inversa
        pi.mostrarPalabraInversa(); 
        // Imprimir la información de la palabra y su inversa
        System.out.println(pi);
        
        // Cerrar el Scanner
        sc.close();
    }
}
