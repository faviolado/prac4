/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Implements;

/**
 *
 * @author fabio
 */
public class Node <E>{
    
    
    E info;
    Node next;
    
    Node(E elem){
        info = elem;
        next = null;
    }
}
