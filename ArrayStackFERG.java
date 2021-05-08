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
public class ArrayStackFERG <E> implements StackInterface <E> {
    
    private int maxElem= 5;
    private E stack[];
    private int top;
    
    public ArrayStackFERG(){
        //constructor de la pila
        stack = (E[]) new Object[maxElem];
        
        top = -1;
    }
    
    @Override
    public Boolean isEmpty() { //comprueba si esta vacia
        return top == -1;
    }
    
    @Override
    public void push(E elem) {//añade un elemento en la parte superior
        //en la medida principal
        if(top<stack.length-1){
            
            stack[top+1]=elem;   
            top++;
        //al redimensionarla
        } else if(top == stack.length-1){
           
            resize(2*(stack.length-1));
            for (int i= top; i>=top;i--){
                stack[i+1]=stack[i];
            } 
            stack[top+1]=elem;
            top++;
            
        } 
        
    }

    @Override
    public E pop() {//borra y devuelve el último elemento
         //borra el ultimo elemento de la lista
        E aux;
        if(top>=0){
            aux = stack[top];
            stack[top] = null;
            top--;
            
        }else {
            //si la lista la esta vacia no se puede borrar mas elementos
            throw new IllegalStateException("La pila esta vacia");
        }
        return aux;
    }

    @Override
    public Integer size() {//numero de elementos de la lista
        return top;
    }

    @Override
    public E top() {//devuelve el valor del ultimo elemento
        if(this.isEmpty()==false){
        return stack[top];
        } else{//salta una excepcion si la pila esta vacia
            throw new IllegalStateException("La pila ya esta vacia");
        }
    }

    
    
    protected void resize(int capacity){
        //metodo para doblar la capacidad de la lista
        E[] temp = (E[]) new Object [capacity];
        for (int i = 0 ; i<=top; i++)
            temp[i]=stack[i];
        stack = temp;
        
    }
    
}
