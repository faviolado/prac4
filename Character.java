/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Implements;
import Implements.Card;
import Implements.CardType;
import static Implements.CardType.CREATURE;
import static Implements.CardType.MANA;
import Implements.ArrayStackFERG;
import Implements.LinkedStackFERG;
import Implements.MyLinkedListFERG;

/**
 *
 * @author fabio
 */
public class Character {
    
    private String name;
    private Integer age;
    
    MyLinkedListFERG  CardList = new MyLinkedListFERG();
    LinkedStackFERG  CardStack = new LinkedStackFERG();
    
    //constructor
    public Character(String name, Integer age) {
        this.name = name;
        this.age = age;
    }
    
    //getters y setters

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public MyLinkedListFERG getCardList() {
        return CardList;
    }

    public void setCardList(MyLinkedListFERG CardList) {
        this.CardList = CardList;
    }

    public LinkedStackFERG getCardStack() {
        return CardStack;
    }

    public void setCardStack(LinkedStackFERG CardStack) {
        this.CardStack = CardStack;
    }

    @Override
    public String toString() {
        return "Character{" + "name=" + name + ", age=" + age + ", CardList=" + CardList + ", CardStack=" + CardStack + '}';
    }
    
    
    
    
    
    
    public LinkedStackFERG <Card> manaFountain  (MyLinkedListFERG <Card> cardList) {
        int cont=0;
        
        for(int i = 0 ; i<cardList.size() ; i++){
            if(cardList.get(i).type == CREATURE){
                for(int j=0 ; j < cardList.get(i).manas.size() ; j++){
                    if(cardList.get(i).manas.get(j)==cardList.get(j).name){
                        cont++;
                        if(cont==cardList.get(i).manas.size()){
                            CardStack.push(cardList.get(i));
                        }
                    }
                }
            }
        }
            
        return cardStack;
    }
    
    public Boolean sumonExpressCreature( Card card, LinkedStackFERG pila ){
        
        
        return null;
        
    }
    
    public LinkedStackFERG sumonCreature( Card card , LinkedStackFERG pila){
        
        
        return null;
        
    }
    
    
}
