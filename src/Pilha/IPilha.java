package Pilha;

public interface IPilha<T> {
    public void empilhar(T valor);

    public T desempilhar() throws PilhaVaziaException;

    public T getTopo() throws PilhaVaziaException;

    public int getQtd();

    public boolean estahVazia();
}