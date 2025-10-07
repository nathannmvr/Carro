// Leaf: Representa os objetos folha na composição.
public class PecaSimples extends ComponenteCarro {

    public PecaSimples(String nome, double peso) {
        super(nome, peso);
    }

    @Override
    public double calcularPesoTotal(double totalParcialAtual) {
        double novoTotal = totalParcialAtual + this.peso;
        System.out.println(
                "Somando agora o peso de " + this.nome + ": " + this.peso + ". Total parcial: " + novoTotal
        );
        return novoTotal;
    }
}