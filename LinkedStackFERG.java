/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Implements;

import Interface.StackInterface;

/**
 *
 * @author fabio
 * @param <E>
 */
public class LinkedStackFERG<E> implements StackInterface<E> {

    private Node head;
    int numElem;

    public LinkedStackFERG() {
        head = null;
        numElem = 0;
    }

    @Override
    public void push(E elem) {
        if (numElem == 0) {//para crear un nodo en una pila vacía

            Node newNode = new Node(elem);
            head = newNode;
            numElem++;
        } else if (numElem > 0) {

            //para añadir un elemento a la pila
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            Node newNode = new Node(elem);
            temp.next = newNode;
            numElem++;

        }
    }

    @Override
    public E pop() {
        E aux;
        if (numElem > 0) {
            //elimina y devuelve el ultimo elemento de la pila
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            aux = (E) temp.next;
            temp.next = null;
            numElem--;
        } else {
            //salta una excepcion si la lista esta vacia
            throw new IllegalArgumentException("La pila esta vacia");

        }
        return aux;
    }

    @Override
    public Integer size() {

        if (numElem > 0) {

            return numElem;

        } else if (this.isEmpty() == true) {

            System.out.println("La pila esta vacia");

        }
        return numElem = 0;
    }

    @Override
    public E top() {
        if (numElem > 0) {//se ejecuta si la pila contiene elementos
            //un lugar apropiado segun el tamaño de la lista
            Node temp = head;
            int cont = 0;
            while (numElem - 1 != cont) {
                cont++;
                temp = temp.next;
            }
            return (E) temp.info;

        } else if (numElem == 0) {//se ejecuta si la lista esta vacia

            throw new IllegalArgumentException("La pila está vacía");

        }

        return null;
    }

    @Override
    public Boolean isEmpty() {
        return head == null;
    }

}
