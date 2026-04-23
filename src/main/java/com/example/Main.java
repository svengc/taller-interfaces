package com.example;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<EspacioCultural> lugares = new ArrayList<>();

        lugares.add(new JardinBotanico());
        lugares.add(new MuseoDeAntioquia());
        lugares.add(new ParqueExplora());

        for (EspacioCultural lugar : lugares) {
            System.out.println("\n--- Lugar ---");
            lugar.mostrarHorario();
            System.out.println("Requisito: " + lugar.obtenerRequisitoEntrada());
            lugar.realizarActividadPrincipal();
        }
    }
}