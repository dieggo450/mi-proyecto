package daw;

public class Estudiante {
    // Generamos los atributos privados
    private String nombre;
    private int idEstudiante;
    private double notaMedia = 0;
    private String curso;

    // Constructor que inicialice nombre, idEstudiante y curso

    public Estudiante(String nombre, int idEstudiante, String curso) {
        this.nombre = nombre;
        this.idEstudiante = idEstudiante;
        
        this.curso = curso;
    }

    // Creamos un metodo que devuelve true si la notaMedia es >= 5.0 y false en caso
    // contrario
    public boolean aprobado() {
        boolean nota = false;

        if (notaMedia >= 5.0) {
            nota = true;
        }
        return nota;
    }

    // Generamos los getters para todos los atributos.
    public String getNombre() {
        return nombre;
    }

    public int getIdEstudiante() {
        return idEstudiante;
    }

    public double getNotaMedia() {
        return notaMedia;
    }

    public String getCurso() {
        return curso;
    }

    // Generamos los setters para los atributos notaMedia y curso
    //Según la restricción del enunciado se controla en el set.
    public void setNotaMedia(double notaMedia) {
        if (notaMedia >= 0 && notaMedia <= 10) {
            this.notaMedia = notaMedia;

        }
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    // Creamos el metodo toString
    @Override
    public String toString() {
        return "Estudiante [nombre=" + nombre + ", idEstudiante=" + idEstudiante + ", notaMedia=" + notaMedia
                + ", curso=" + curso + "]";
    }

}
