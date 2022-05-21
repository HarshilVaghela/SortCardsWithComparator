/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SortCards;

import java.util.Comparator;

/**
 *
 * @author harsh
 */
public class SortBySuit implements Comparator<PlayingCard> {

    @Override
    public int compare(PlayingCard o1, PlayingCard o2) {
        if (o1.getSuit().equals(o2.getSuit())) {
            if (o1.getFace().equals("10") && !o2.getFace().equals("Ace") && !o2.getFace().equals("Jack") && !o2.getFace().equals("Queen") && !o2.getFace().equals("King")) {
                return 1;
            } else if (o2.getFace().equals("10") && !o1.getFace().equals("Ace") && !o1.getFace().equals("Jack") && !o1.getFace().equals("Queen") && !o1.getFace().equals("King")) {
                return -1;
            } else if (o1.getFace().equals("Ace")) {
                return 1;
            } else if (o2.getFace().equals("Ace")) {
                return -1;
            } else if (o1.getFace().equals("King") && !o2.getFace().equals("Ace")) {
                return 1;
            } else if (o2.getFace().equals("King") && !o1.getFace().equals("Ace")) {
                return -1;
            } else {
                return o1.getFace().compareTo(o2.getFace());
            }

        }
        if (o1.getSuit().equals("Clubs")) {
            return -1;
        }
        if (o2.getSuit().equals("Clubs")) {
            return 1;
        }
        if (o1.getSuit().equals("Hearts") && o2.getSuit().equals("Spades")) {
            return -1;
        }
        if (o2.getSuit().equals("Hearts") && o1.getSuit().equals("Spades")) {
            return 1;
        }
        if (o1.getSuit().equals("Diamonds")) {
            return 1;
        }
        if (o2.getSuit().equals("Diamonds")) {
            return -1;
        } else {
            return 0; //To change body of generated methods, choose Tools | Templates.
        }
    }

}
