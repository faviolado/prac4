/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

/**
 *
 * @author fabio
 */
public interface StackInterface <E> {
    
    
    public void push (E elem);
    
    
    public E pop();
    
    
    public Integer size();
    
    
    public E top();
    
    
    public Boolean isEmpty();
}
