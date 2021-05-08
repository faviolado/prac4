/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Implements;

import Implements.MyLinkedListFERG;
import Implements.CardType;
import static Implements.CardType.CREATURE;
import static Implements.CardType.MANA;
import Implements.Character;

/**
 *
 * @author fabio
 */
public class Card {

    //atributos
    String name;
    String description;
    CardType type; //0 = maná, 1 = criatura **ENUM
    Integer attack;
    Integer defense;
    MyLinkedListFERG manas;

    //constructor
    public Card(String name, String description, CardType card, Integer attack, Integer defense, MyLinkedListFERG mana) {
        this.name = name;
        this.description = description;
        this.type = card;
        this.attack = attack;
        this.defense = defense;
        this.manas = mana;
    }

    

    //getter y setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public CardType getCard() {
        return type;
    }

    public void setCard(CardType card) {
        this.type = card;
    }

    public Integer getAttack() {
        return attack;
    }

    public void setAttack(Integer attack) {
        this.attack = attack;
    }

    public Integer getDefense() {
        return defense;
    }

    public void setDefense(Integer defense) {
        this.defense = defense;
    }

    public MyLinkedListFERG getMana() {
        return manas;
    }

    public void setMana(MyLinkedListFERG mana) {
        this.manas = mana;
    }

    @Override
    public String toString() {
        return "Card{" + "name=" + name + ", description=" + description + ", type=" + type + ", attack=" + attack + ", defense=" + defense + ", manas=" + manas + '}';
    }

    
    
    public int cost(Card card) {

        if (card.type == CREATURE) {

            return card.manas.size();

        } else if (card.type == MANA) {

            throw new IllegalArgumentException(" La carta es de tipo mana ");

        }
        return 0;

    }

    public void totalCost(Card card) {
        int contMountain = 0;
        int contForest = 0;
        int contSwamp = 0;
        int contPlains = 0;
        int contIsland = 0;
        int rainbow = 0;

        if (card.type == CREATURE) {
            for (int i = 0; i < card.manas.size(); i++) {
                if ("mountain".equals(card.manas.get(i)) || "Mountain".equals(card.manas.get(i))) {
                    contMountain++;
                }
                if ("swamp".equals(card.manas.get(i)) || "Swamp".equals(card.manas.get(i))) {
                    contSwamp++;
                }
                if ("forest".equals(card.manas.get(i)) || "Forest".equals(card.manas.get(i))) {
                    contForest++;
                }
                if ("plains".equals(card.manas.get(i)) || "Plains".equals(card.manas.get(i))) {
                    contPlains++;
                }
                if ("island".equals(card.manas.get(i)) || "Island".equals(card.manas.get(i))) {
                    contIsland++;
                }
                if ("rainbow".equals(card.manas.get(i)) || "Rainbow".equals(card.manas.get(i))) {
                    contMountain++;
                    contSwamp++;
                    contForest++;
                    contPlains++;
                    contIsland++;
                }
            }
            System.out.println("Necesitas las siguientes cartas de mana:");
            System.out.println("Mountain: " + contMountain);
            System.out.println("Swamp: " + contSwamp);
            System.out.println("Forest: " + contForest);
            System.out.println("Plains: " + contPlains);
            System.out.println("Island: " + contIsland);

        } else if (card.type == MANA) {

            throw new IllegalArgumentException(" La carta es de tipo mana ");

        }

    }

}
