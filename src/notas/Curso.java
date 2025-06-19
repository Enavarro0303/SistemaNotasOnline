package notas;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Curso {
    private String nombre;
    private ArrayList<Alumno> alumnos;

    public static int totalCursos = 0;
    public static int totalAlumnos = 0;

    public Curso(String nombre) {
        this.nombre = nombre;
        this.alumnos = new ArrayList<>();
        totalCursos++;
    }

    public void agregarAlumno(Alumno alumno) {
        alumnos.add(alumno);
        totalAlumnos++;
    }

    public String getNombre() {
        return nombre;
    }

    public ArrayList<Alumno> getAlumnos() {
        return alumnos;
    }

    // Clase anidada NO estática: Asistencia
    public class Asistencia {
        private Map<Alumno, Boolean> asistenciaMap;

        public Asistencia() {
            asistenciaMap = new HashMap<>();
        }

        public void registrarAsistencia(Alumno alumno, boolean asistio) {
            asistenciaMap.put(alumno, asistio);
        }

        public void mostrarAsistencia() {
            for (Map.Entry<Alumno, Boolean> entry : asistenciaMap.entrySet()) {
                String estado = entry.getValue() ? "Asistió" : "Faltó";
                System.out.println(entry.getKey().getNombre() + ": " + estado);
            }
        }
    }
}