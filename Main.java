public class Main {
    public static void main(String[] args) {
        // --- Criando as Peças Simples (Folhas) ---
        // Carroceria
        ComponenteCarro paraLama = new PecaSimples("Para-lamas", 10.5);
        ComponenteCarro porta = new PecaSimples("Portas", 45.0);
        ComponenteCarro paineis = new PecaSimples("Painéis", 80.2);
        ComponenteCarro portaMalas = new PecaSimples("Porta-malas", 35.8);
        ComponenteCarro capo = new PecaSimples("Capô", 25.5);

        // Trem de Força
        ComponenteCarro motor = new PecaSimples("Motor", 250.0);
        ComponenteCarro transmissao = new PecaSimples("Transmissão", 120.0);
        ComponenteCarro diferencial = new PecaSimples("Diferencial", 60.0);
        ComponenteCarro rodas = new PecaSimples("Rodas", 100.0); // Peso das 4 rodas

        // Suspensão
        ComponenteCarro suspensao = new PecaSimples("Suspensão", 150.0);


        // --- Criando as Peças Compostas (Composites) ---
        // Nível 2
        PecaComposta carroceria = new PecaComposta("Carroceria", 150.0); // Peso da estrutura
        PecaComposta tremDeForca = new PecaComposta("Trem de Força", 0); // Apenas um agrupador

        // Nível 1
        PecaComposta chassi = new PecaComposta("Chassi", 300.0); // Peso da estrutura base

        // Nível 0 - O Carro Completo
        PecaComposta carro = new PecaComposta("Carro Completo", 0);


        // --- Montando a Hierarquia ---
        // Adicionando peças à Carroceria
        carroceria.adicionar(paraLama);
        carroceria.adicionar(porta);
        carroceria.adicionar(paineis);
        carroceria.adicionar(portaMalas);
        carroceria.adicionar(capo);

        // Adicionando peças ao Trem de Força
        tremDeForca.adicionar(motor);
        tremDeForca.adicionar(transmissao);
        tremDeForca.adicionar(diferencial);
        tremDeForca.adicionar(rodas);

        // Adicionando partes ao Chassi
        chassi.adicionar(tremDeForca);
        chassi.adicionar(suspensao);

        // Adicionando as partes principais ao Carro
        carro.adicionar(carroceria);
        carro.adicionar(chassi);


        // --- Calculando o Peso Total ---
        System.out.println("Iniciando o cálculo do peso total do carro...");
        System.out.println("----------------------------------------------");

        double pesoFinal = carro.calcularPesoTotal(0.0);

        System.out.println("----------------------------------------------");
        System.out.printf("Cálculo finalizado. O peso total do carro é: %.2f kg\n", pesoFinal);
    }
}