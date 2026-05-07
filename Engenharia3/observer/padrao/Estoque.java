package padrao;

import java.util.ArrayList;
import java.util.List;

public class Estoque implements EstoqueSubject {
    private List<EstoqueObserver> observers = new ArrayList<>();
    private String produto;
    private int quantidade;

    public void setQuantidade(String produto, int quantidade) {
        this.produto = produto;
        this.quantidade = quantidade;
        notificarObservers();
    }

    @Override
    public void adicionarObserver(EstoqueObserver observer) {
        observers.add(observer);
    }

    @Override
    public void removerObserver(EstoqueObserver observer) {
        observers.remove(observer);
    }

    @Override
    public void notificarObservers() {
        for (EstoqueObserver observer : observers) {
            observer.atualizar(produto, quantidade);
        }
    }
}