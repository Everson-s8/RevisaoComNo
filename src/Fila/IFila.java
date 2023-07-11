package Fila;

import Fila.FilaVaziaException;

public interface IFila<T> {
    public void incluir(T valor);
    public T remover() throws FilaVaziaException;
    public int getQtd();
    public boolean estaVazia();
    public void limpar();
}