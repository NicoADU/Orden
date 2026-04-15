public class Estudiante implements Comparable<Estudiante> {
    private String nombre;
    private float promedio;

    public Estudiante(String nombre, float promedio) {
        this.nombre = nombre;
        this.promedio = promedio;
    }

    @Override
    public String toString() {
        return "Estudiante{" +
                "nombre='" + nombre + '\'' +
                ", promedio=" + promedio +
                '}';
    }


    @Override
    public int compareTo(Estudiante estudiante) {
        return this.nombre.compareTo(estudiante.nombre);
    }
}