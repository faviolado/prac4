/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prac4;

import Implements.ArrayStackFERG;
import Implements.Card;
import Implements.CardType;
import Implements.LinkedStackFERG;
import static Implements.CardType.CREATURE;
import static Implements.CardType.MANA;
import Implements.MyLinkedListFERG;
import Implements.Character;


/**
 *
 * @author fabio
 */
public class EDPractica4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        ArrayStackFERG stack1 = new ArrayStackFERG();
        LinkedStackFERG stack2 = new LinkedStackFERG();

        MyLinkedListFERG mana1 = new MyLinkedListFERG();
        MyLinkedListFERG mana2 = new MyLinkedListFERG();
        MyLinkedListFERG mana3 = new MyLinkedListFERG();
        MyLinkedListFERG mana4 = new MyLinkedListFERG();

        mana1.add(0, "forest");
        mana1.add(1, "island");
        mana1.add(2, "mountain");

        mana2.add(0, "forest");
        mana2.add(1, "swamp");
        mana2.add(2, "swamp");

        mana3.add(0, "plains");
        mana3.add(1, "forest");
        mana3.add(2, "swamp");

        mana4.add(0, "island");
        mana4.add(1, "plains");
        mana4.add(2, "island");

        
        
        
        
        //cartas tipo criaturas
        Card card1 = new Card("la zowi", "muy wapa", CREATURE, 20, 4, mana1);
        Card card2 = new Card("julieta venegas", "muy triste", CREATURE, 10, 17, mana2);
        Card card3 = new Card("Guayna", "perrea muy duro", CREATURE, 18, 15, mana2);
        Card card4 = new Card("Novio", "no existe", CREATURE, 20, 20, mana4);

        //cartas tipo mana (solo existen: forest, island, swamp, mountain y plains)
        Card card5 = new Card("forest", "carata de mana tipo bosque", MANA, 0, 0, null);
        Card card6 = new Card("island", "carta de mana tipo isla", MANA , 0, 0, null);
        Card card7 = new Card("mountain", "carta de mana tipo montaña", MANA, 0, 0, null);
        Card card8 = new Card("swamp", "mana tipo bosque", MANA, 0, 0, null);

        int c = card1.cost(card1);
        System.out.println(c);
        card1.totalCost(card1);

        //cartas iniciales
        MyLinkedListFERG begginerCards = new MyLinkedListFERG();
        begginerCards.add(0, card1);
        begginerCards.add(1, card2);
        begginerCards.add(2, card3);
        begginerCards.add(3, card5);
        begginerCards.add(4, card6);
        begginerCards.add(5, card7);
        
        //personaje 1
        Character c1 = new Character("Mona",18);
        /*for(int i=0; i< 6; i++){
        System.out.println(begginerCards.get(i));
        }*/
        c1.setCardList(begginerCards);
        LinkedStackFERG manaFountain = c1.manaFountain(begginerCards);
        manaFountain.toString();
        
    }
    
}
