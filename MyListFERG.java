/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

/**
 *
 * @author fabio
 * @param <E>
 */
public interface MyListFERG<E> {
    
    //1
    //1.1
    int size();
    //1.2 y 3.8
    boolean isEmpty();
    //1.3
    E get(int index);
    //1.4
    E set(int index, E element);
    //1.5 y 3.3
    void add(int index, E element);
    //1.6 y 3.6
    E remove (int index);    
    //prac3 ampliada
    //3.1
    void addFirst(E element);
    //3.2
    void addLast(E element);
    //3.4
    void removeFirst();
    //3.5
    void removeLast();
    //3.7
    void cleanList();
    //3.9 y 3.10
    int searchElem(E element);
    //3.11
    boolean existElem(E element);
    
    
    
    
    
}
