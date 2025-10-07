import java.util.ArrayList;
import java.util.List;

// Composite: Define o comportamento para componentes que têm filhos.
public class PecaComposta extends ComponenteCarro {

    private List<ComponenteCarro> componentes = new ArrayList<>();

    // O peso de uma peça composta pode ser zero, representando apenas um agrupador.
    public PecaComposta(String nome, double peso) {
        super(nome, peso);
    }

    public void adicionar(ComponenteCarro componente) {
        this.componentes.add(componente);
    }

    public void remover(ComponenteCarro componente) {
        this.componentes.remove(componente);
    }

    @Override
    public double calcularPesoTotal(double totalParcialAtual) {
        double totalAcumulado = totalParcialAtual;

        // Se a própria peça composta tiver um peso (ex: a estrutura do chassi), soma primeiro.
        if (this.peso > 0) {
            totalAcumulado += this.peso;
            System.out.println(
                    "Somando agora o peso de " + this.nome + " (estrutura): " + this.peso + ". Total parcial: " + totalAcumulado
            );
        }

        // Delega a chamada para cada filho, passando o total atualizado.
        for (ComponenteCarro componente : componentes) {
            totalAcumulado = componente.calcularPesoTotal(totalAcumulado);
        }

        return totalAcumulado;
    }
}