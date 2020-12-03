package br.edu.ifpr;
/**
 * Aluno: Isaac Nicholas Fonseca de Oliveira
 * Data: 02/12/2020
 * Hora: 22:05
 * Atividade de empilhamento.
 * TADS-2019
 */
import java.util.EmptyStackException;

public class Pilha {

    public static final int CAPACITY = 1000;
    private int capacity;
    private Object elements[];
    private int top = -1;

    public Pilha(int capacity) {
        if (capacity > 0) {
            this.capacity = capacity;
            elements = new Object[capacity];
        } else {
            this.capacity = CAPACITY;
            elements = new Object[CAPACITY];
        }
    }

    public Pilha() {
        this(CAPACITY);
    }
    public boolean isEmpty(){
        return (top<0);
    }

    public boolean isFull(){
        return (top==capacity-1);
    }

    public int tamanhoDaCapacidade(){
        return (top+1);
    }
    public void valorArmazenado(Object o) throws StackOverflowError {

        if (isFull()){
            throw new StackOverflowError ("Stack Overflow!");
        }
        else {
            top++;
            elements[top]= o;
        }
    }

    public Object valorRemovido () throws EmptyStackException {
        Object elem;
        if (isEmpty()) {
            throw new EmptyStackException();
        } else {
            elem = elements[top];
            elements[top] = null;
            top--;
            return (elem);

        }
    }

    public Object valorTopo () throws EmptyStackException {
        if (isEmpty()){
            throw new EmptyStackException();
        }
        else {
            return (elements[top]);
        }
    }


}