// Clase Libro
public class Libro {
    // Atributos
    private String titulo;
    private String autor;
    private int numEjemplares;
    private int numPrestados;

    // Constructor por defecto
    public Libro() {
        this.titulo = "";
        this.autor = "";
        this.numEjemplares = 0;
        this.numPrestados = 0;
    }

    // Constructor con parámetros
    public Libro(String titulo, String autor, int numEjemplares, int numPrestados) {
        this.titulo = titulo;
        this.autor = autor;
        this.numEjemplares = numEjemplares;
        this.numPrestados = numPrestados;
    }

    // Método prestar
    public boolean prestar() {
        if (numPrestados < numEjemplares) {
            numPrestados++;
            return true;
        } else {
            return false;
        }
    }

    // Método devolver
    public boolean devolver() {
        if (numPrestados > 0) {
            numPrestados--;
            return true;
        } else {
            return false;
        }
    }

    public String toString() {
        return "Título: " + titulo +
               ", Autor: " + autor +
               ", Ejemplares: " + numEjemplares +
               ", Prestados: " + numPrestados;
    }

    // Getters y Setters
    public String getTitulo() { return titulo; }
    public void setTitulo(String titulo) { this.titulo = titulo; }

    public String getAutor() { return autor; }
    public void setAutor(String autor) { this.autor = autor; }

    public int getNumEjemplares() { return numEjemplares; }
    public void setNumEjemplares(int numEjemplares) { this.numEjemplares = numEjemplares; }

    public int getNumPrestados() { return numPrestados; }
    public void setNumPrestados(int numPrestados) { this.numPrestados = numPrestados; }
}
