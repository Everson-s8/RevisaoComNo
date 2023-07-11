package Pilha;

public class Pilha<T> implements IPilha<T> {

    private int tamanho;
    private No<T> top;
    @Override
    public void empilhar(T valor) {
        No<T> dado = new No<T>(valor);
        if (top == null){
            top = dado;
        }else {
            dado.proximo = top;
            top = dado;
        }
        tamanho++;
    }

    @Override
    public T desempilhar() throws PilhaVaziaException {
        T removido = top.dado;
        top = top.proximo;
        tamanho--;
        return removido;
    }

    @Override
    public T getTopo() throws PilhaVaziaException {
        return top.dado;
    }

    @Override
    public int getQtd() {
        return tamanho;
    }

    @Override
    public boolean estahVazia() {
        if(tamanho == 0){
            return true;
        }
        return false;
    }
    
}
