package notas;

import java.util.ArrayList;

public class Alumno extends Persona {
    private ArrayList<Double> notas;

    public Alumno(String nombre, String dni) {
        super(nombre, dni);
        this.notas = new ArrayList<>();
    }

    // Agregar una sola nota
    public void agregarNota(double nota) {
        notas.add(nota);
    }

    // Agregar múltiples notas (sobrecarga)
    public void agregarNota(double... notasLote) {
        for (double nota : notasLote) {
            notas.add(nota);
        }
    }

    // Calcular el promedio redondeado
    public double calcularPromedio() {
        if (notas.isEmpty()) return 0;

        double suma = 0;
        for (double nota : notas) {
            suma += nota;
        }
        return Math.round(suma / notas.size());
    }

    public ArrayList<Double> getNotas() {
        return notas;
    }
}