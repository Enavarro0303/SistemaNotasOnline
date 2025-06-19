package notas;

import java.util.ArrayList;

public class Profesor extends Persona {
    private ArrayList<Alumno> alumnos;

    public Profesor(String nombre, String dni) {
        super(nombre, dni);
        this.alumnos = new ArrayList<>();
    }

    // Registrar alumno
    public void registrarAlumno(Alumno alumno) {
        alumnos.add(alumno);
    }

    // Consultar promedio de un alumno
    public double consultarPromedio(Alumno alumno) {
        return alumno.calcularPromedio();
    }

    // Mostrar todos los alumnos registrados (opcional)
    public void mostrarAlumnos() {
        for (Alumno a : alumnos) {
            System.out.println("- " + a.getNombre() + " (DNI: " + a.getDni() + ")");
        }
    }
}