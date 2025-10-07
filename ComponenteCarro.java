public abstract class ComponenteCarro {
    protected String nome;
    protected double peso;

    public ComponenteCarro(String nome, double peso) {
        this.nome = nome;
        this.peso = peso;
    }

    public String getNome() {
        return nome;
    }

    public double getPeso() {
        return peso;
    }

    // Método que será implementado pelas classes concretas para calcular o peso
    // e gerar a saída solicitada. Ele recebe o total acumulado até o momento
    // e retorna o novo total.
    public abstract double calcularPesoTotal(double totalParcialAtual);
}