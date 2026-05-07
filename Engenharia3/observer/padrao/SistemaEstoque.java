package padrao;

public class SistemaEstoque implements EstoqueObserver {
    @Override
    public void atualizar(String produto, int quantidade) {
        System.out.println("LOG: Produto " + produto + " atualizado para " + quantidade + " unidades");
    }
}