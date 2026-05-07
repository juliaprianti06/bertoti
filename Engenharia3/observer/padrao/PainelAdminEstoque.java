package padrao;

public class PainelAdminEstoque implements EstoqueObserver {
    @Override
    public void atualizar(String produto, int quantidade) {
        System.out.println("PAINEL: Atualizando dashboard — " + produto + ": " + quantidade);
    }
}
