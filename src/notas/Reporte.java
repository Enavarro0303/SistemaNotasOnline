package notas;

import java.util.List;

public class Reporte {

    // Promedio general de la clase
    public static double promedioGeneral(List<Alumno> alumnos) {
        if (alumnos.isEmpty()) return 0;

        double suma = 0;
        for (Alumno alumno : alumnos) {
            suma += alumno.calcularPromedio();
        }
        return Math.round(suma / alumnos.size());
    }

    // Contar cantidad de alumnos con promedio >= 11
    public static int contarAprobados(List<Alumno> alumnos) {
        int contador = 0;
        for (Alumno alumno : alumnos) {
            if (alumno.calcularPromedio() >= 11) {
                contador++;
            }
        }
        return contador;
    }
}