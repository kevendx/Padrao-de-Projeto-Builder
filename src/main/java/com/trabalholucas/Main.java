package com.trabalholucas;

public class Main {
    public static void main(String[] args) {
        Computador computador = new Computador.ComputadorBuilder()
                .setProcessador("Intel i7")
                .setMemoriaRAM(16)
                .setArmazenamento(512)
                .setSistemaOperacional("Windows 11")
                .build();

        System.out.println(computador);
    }
}
