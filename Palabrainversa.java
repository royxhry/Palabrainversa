public class Palabrainversa {
    // Variables para almacenar la palabra original y la palabra invertida
    private String palabra;
    private String palabraInversa;
    
    // Método para mostrar la palabra original y la palabra invertida
    public void mostrarPalabraInversa() {
        palabraInversa = obtenerPalabraInversa(); 
        System.out.println("Palabra original: " + palabra);
        System.out.println("Palabra inversa: " + palabraInversa);
    }
    
    // Método privado para obtener la palabra invertida
    private String obtenerPalabraInversa() {
        StringBuilder sb = new StringBuilder(palabra);
        return sb.reverse().toString(); 
    }

    // Método para obtener la palabra original
    public String getPalabra() {
        return palabra;
    }
    
    // Método para establecer la palabra original
    public void setPalabra(String palabra) {
        this.palabra = palabra;
    }
    
    // Método para obtener la palabra invertida
    public String getPalabraInversa() {
        return palabraInversa;
    }
    
    // Método para establecer la palabra invertida
    public void setPalabraInversa(String palabraInversa) {
        this.palabraInversa = palabraInversa;
    }
    
    // Método toString para representar la información de la palabra y su inversa
    @Override
    public String toString() {
        return "Palabrainversa [palabra=" + palabra + ", palabraInversa=" + palabraInversa + "]";
    }
}
