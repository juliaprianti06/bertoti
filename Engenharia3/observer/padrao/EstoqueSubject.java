package padrao;

public interface EstoqueSubject {
    void adicionarObserver(EstoqueObserver observer);
    void removerObserver(EstoqueObserver observer);
    void notificarObservers();
}
