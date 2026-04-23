package com.example;

public class ParqueExplora implements EspacioCultural {

    @Override
    public void mostrarHorario() {
        System.out.println("Horario: 8:30 AM - 5:30 PM");
    }

    @Override
    public String obtenerRequisitoEntrada() {
        return "Boleta pagada";
    }

    @Override
    public void realizarActividadPrincipal() {
        System.out.println("Actividad: Interactuar con experimentos científicos");
    }
}