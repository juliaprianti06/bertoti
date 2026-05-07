package padrao;

public class EmailEstoque implements EstoqueObserver {
    @Override
    public void atualizar(String produto, int quantidade) {
        if (quantidade < 5) {
            System.out.println("EMAIL: Estoque baixo de " + produto + " — apenas " + quantidade + " unidades");
        }
    }
}