package com.trabalholucas;

public class Computador {
    private final String processador;
    private final int memoriaRAM; // em GB
    private final int armazenamento; // em GB
    private final String sistemaOperacional;

    private Computador(ComputadorBuilder builder) {
        this.processador = builder.processador;
        this.memoriaRAM = builder.memoriaRAM;
        this.armazenamento = builder.armazenamento;
        this.sistemaOperacional = builder.sistemaOperacional;
    }

    @Override
    public String toString() {
        return "Computador {" +
                "Processador='" + processador + '\'' +
                ", Memória RAM=" + memoriaRAM + " GB" +
                ", Armazenamento=" + armazenamento + " GB" +
                ", Sistema Operacional='" + sistemaOperacional + '\'' +
                '}';
    }

    public static class ComputadorBuilder {
        private String processador;
        private int memoriaRAM;
        private int armazenamento;
        private String sistemaOperacional;

        public ComputadorBuilder setProcessador(String processador) {
            this.processador = processador;
            return this;
        }

        public ComputadorBuilder setMemoriaRAM(int memoriaRAM) {
            this.memoriaRAM = memoriaRAM;
            return this;
        }

        public ComputadorBuilder setArmazenamento(int armazenamento) {
            this.armazenamento = armazenamento;
            return this;
        }

        public ComputadorBuilder setSistemaOperacional(String sistemaOperacional) {
            this.sistemaOperacional = sistemaOperacional;
            return this;
        }

        public Computador build() {
            return new Computador(this);
        }
    }
}
