package notas;

import java.util.*;

public class AppNotas {
    public static void main(String[] args) {
        Random rand = new Random();

        // Crear 3 cursos
        Curso curso1 = new Curso("Matemática");
        Curso curso2 = new Curso("Comunicación");
        Curso curso3 = new Curso("Programación");

        // Crear 5 alumnos
        Alumno a1 = new Alumno("Luis", "12345678");
        Alumno a2 = new Alumno("Ana", "23456789");
        Alumno a3 = new Alumno("Carlos", "34567890");
        Alumno a4 = new Alumno("Rosa", "45678901");
        Alumno a5 = new Alumno("Javier", "56789012");

        // Agregar alumnos a cursos
        curso1.agregarAlumno(a1);
        curso1.agregarAlumno(a2);
        curso1.agregarAlumno(a3);

        curso2.agregarAlumno(a3);
        curso2.agregarAlumno(a4);
        curso2.agregarAlumno(a5);

        curso3.agregarAlumno(a1);
        curso3.agregarAlumno(a2);
        curso3.agregarAlumno(a5);

        // Asignar notas aleatorias a cada alumno (entre 0 y 20)
        for (Alumno alumno : Arrays.asList(a1, a2, a3, a4, a5)) {
            alumno.agregarNota(rand.nextInt(21));
            alumno.agregarNota(rand.nextInt(21));
            alumno.agregarNota(rand.nextInt(21));
        }

        // Mostrar estadísticas de un curso
        System.out.println("===== Reporte de Curso: Matemática =====");
        for (Alumno alumno : curso1.getAlumnos()) {
            System.out.println(alumno.getNombre() + " - Promedio: " + alumno.calcularPromedio());
        }

        double promedioCurso = Reporte.promedioGeneral(curso1.getAlumnos());
        int aprobados = Reporte.contarAprobados(curso1.getAlumnos());

        System.out.println("Promedio general del curso: " + promedioCurso);
        System.out.println("Cantidad de aprobados: " + aprobados);

        // Registrar asistencias en curso 1
        Curso.Asistencia asistenciaMatematica = curso1.new Asistencia();
        asistenciaMatematica.registrarAsistencia(a1, true);
        asistenciaMatematica.registrarAsistencia(a2, false);
        asistenciaMatematica.registrarAsistencia(a3, true);

        System.out.println("\nAsistencias en Matemática:");
        asistenciaMatematica.mostrarAsistencia();

        // Mostrar totales
        System.out.println("\nTotal de cursos creados: " + Curso.totalCursos);
        System.out.println("Total de alumnos registrados: " + Curso.totalAlumnos);
    }
}