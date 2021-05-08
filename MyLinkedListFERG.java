/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Implements;

import Interface.MyListFERG;


/**
 *
 * @author fabio
 * @param <E>
 */
public class MyLinkedListFERG<E> implements MyListFERG<E> {

    private Node head;//nodo principal, cabecera, del que dependen el resto de nodos

    public void list() {
        head = null; //metodo lista para implementar la lista
    }

    @Override
    //devuelve el tamaño de la lista
    public int size() {
        if (head != null) {
            Node temp = head;
            int cont = 0;
            while (temp != null) {
                cont++;
                temp = temp.next;
            }
            return cont;
        } else if (this.isEmpty() == true) {
            System.out.println("La lista esta vacia");
        }
        return 0;

    }

    @Override
    //muestra si una lista esta vacia o no
    public boolean isEmpty() {
        if (head == null) {
            return true;
        } else {
            return false;
        }

    }

    @Override
    //devuelve la informacion del nodo indicado por el indice
    public E get(int index) {

        if (this.size() > 0 && this.size() >= index + 1) {//se ejecuta si la lista contiene elementos y el indice indica
            //un lugar apropiado segun el tamaño de la lista
            Node temp = head;
            int cont = 0;
            while (index != cont) {
                cont++;
                temp = temp.next;
            }
            return (E) temp.info;

        } else if (this.size() == 0) {//se ejecuta si la lista esta vacia

            throw new IllegalArgumentException("La lista está vacía");

        } else if (index + 1 > this.size() || index < 0) {//se ejecuta si el indice es superior a al tamaño de la lista

            throw new IllegalArgumentException("Indice no permitido");

        }

        return null;
    }

    @Override
    //sustituye el elemento en el indice indicado y devuelve el anterior
    public E set(int index, E elem) {

        if (this.size() > 0 && this.size() >= index + 1) {//se ejecuta si la lista contiene elementos y el indice indica
            //un lugar apropiado segun el tamaño de la lista
            Node temp = head;
            E elemAnc;
            int cont = 0;
            while (index != cont) {
                cont++;
                temp = temp.next;
            }
            elemAnc = (E) temp.info;
            temp.info = elem;
            return (E) elemAnc;

        } else if (this.size() == 0) {//se ejecuta si la lista esta vacia

            throw new IllegalArgumentException("La lista está vacía");

        } else if (index + 1 > this.size() || index < 0) {//se ejecuta si el indice es superior a al tamaño de la lista

            throw new IllegalArgumentException("Indice no permitido");

        }

        return null;

    }

    @Override
    //metodo para añadir elementos a la lista
    public void add(int index, E elem) {

        if (this.isEmpty() == false && index == this.size()) {//para añadir al final de la lista cuando no está vacía

            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            Node newNode = new Node(elem);
            temp.next = newNode;

        } else if (this.isEmpty() == false && index < this.size() && index > 0) {//para añadir entre medias de la lista cuando no está vacía

            Node temp = head;
            for (int i = 0; i < index - 1; i++) {
                temp = temp.next;
            }
            Node aft = temp.next;
            Node vtx = new Node(elem);
            vtx.next = aft;
            temp.next = vtx;

        } else if (this.isEmpty() == false && index == 0) {//para añadir al principio de la lista cuando no está vacía

            Node temp = new Node(elem);
            temp.next = head;
            head = temp;

        } else if (this.isEmpty() == true && index == 0) {//para crear un nodo en una lista vacía

            Node newNode = new Node(elem);
            head = newNode;

        } else if ((this.isEmpty() == true && (index > 0 || index < 0)) || (this.isEmpty() == false && (index > this.size() - 1 || index < 0))) {
            //el indice introducido no está dentro del espacio de la lista
            throw new IllegalArgumentException("Indice no permitido");

        }

    }

    @Override
    //metodo para eliminar elementos segun el indice dado
    public E remove(int index) {

        if (this.isEmpty() == false && index == this.size()) {//elimina el ultimo nodo

            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            Node aux = temp.next;
            temp.next = null;

            return (E) aux.info;

        } else if (this.isEmpty() == false && index < this.size() && index > 0) {//elimina el nodo seleccionado entre el ultimo y el primero

            Node temp = head;
            for (int i = 0; i < index - 1; i++) {
                temp = temp.next;
            }
            Node del = temp.next;
            Node aft = del.next;
            temp.next = aft;
            Node aux = del;
            del = null;
            return (E) aux.info;

        } else if (this.isEmpty() == false && index == 0) {//elimina el primer nodo

            Node temp = head;
            head = head.next;
            Node aux = temp;
            temp = null;
            return (E) aux.info;

        } else if ((this.isEmpty() == true && (index > 0 || index < 0)) || (this.isEmpty() == false && (index > this.size() - 1 || index < 0))) {

            throw new IllegalArgumentException("Indice no permitido");

        }
        return null;
    }

    @Override
    //añade un nodo al principio
    public void addFirst(E elem) {

        Node temp = new Node(elem);
        temp.next = head;
        head = temp;

    }

    @Override
    //añade un nodo al final
    public void addLast(E elem) {

        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        Node newNode = new Node(elem);
        temp.next = newNode;

    }

    @Override
    //elimina el primer nodo
    public void removeFirst() {

        if (this.isEmpty() == false) {
            Node temp = head;
            head = head.next;
            temp = null;
        } else {

            throw new IllegalArgumentException("La lista esta vacia");

        }

    }

    @Override
    //elimina el ultimo nodo
    public void removeLast() {

        if (this.isEmpty() == false) {

            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = null;
        } else {

            throw new IllegalArgumentException("La lista esta vacia");

        }

    }

    @Override
    //Elimina todos los elementos de la lista y la convierte en una lista vacía
    public void cleanList() {

        if (this.isEmpty() == false) {

            head = null;
            System.out.println("la lista esta vacia");

        } else if (this.isEmpty() == true) {

            System.out.println("la lista esta vacia");

        }

    }

    @Override
    //busca un elemento en la lista y devuelve su posición
    public int searchElem(E elem) {

        int cont = 0;
        Node temp = head;
        while (temp.info != elem && temp.next != null) {
            temp = temp.next;
            cont++;
        }
        if (temp.info == elem) {
            System.out.print("El elemento " + elem + " sí existe en la lista: ");
            return cont;
        } else {
            System.out.print("El elemento " + elem + " no existe en la lista: ");
            cont = -1;
            return cont;
        }

    }

    @Override
    //devuelve true si el elemento buscado existe en la lista y, en su defecto, devuelve false
    public boolean existElem(E elem) {

        int index = searchElem(elem);
        if (index != -1) {
            return true;
        } else {
            return false;
        }
    }

}
