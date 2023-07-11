package Fila;

public class Fila<T> implements IFila<T> {

    private int tamanho;
    private No<T> primeiro;

    private No<T> ultimo;
    @Override
    public void incluir(T valor) {
        No<T> dado = new No<>(valor);
        if (primeiro == null){
            primeiro = dado;
            ultimo = dado;
        }
        ultimo.proximo = dado;
        ultimo = dado;
        tamanho++;
    }
    @Override
    public T remover() throws FilaVaziaException {
        if (estaVazia()){
            throw new FilaVaziaException("a fila está vazia");
        }
        T removido = primeiro.dado;
        primeiro = primeiro.proximo;
        tamanho--;
        return removido;
    }

    @Override
    public int getQtd() {
        return tamanho;
    }

    @Override
    public boolean estaVazia() {
        if (tamanho == 0){
            return true;
        }
        return false;
    }

    @Override
    public void limpar() {
        primeiro = null;
        tamanho = 0;
    }
    public T visualizarProximo() throws FilaVaziaException {
        return primeiro.proximo.dado;
    }

}
