/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SortCards;
import java.util.Random;
import java.util.ArrayList;
import java.util.Collections;
/**
 *
 * @author harsh
 */
public class DeckOfCards
{
    public static void main(String[] args)
    {
        ArrayList<PlayingCard> deck = new ArrayList<>();
        generateCards(deck,"Hearts");
        generateCards(deck,"Diamonds");
        generateCards(deck, "Spades");
        generateCards(deck,"Clubs");
        System.out.println(deck);
        // pick a card randomly
        Random pick = new Random();
        Collections.shuffle(deck);
        System.out.println(deck);
        Collections.shuffle(deck);
        System.out.println(deck);
        Collections.sort(deck, new SortBySuit());
        //Collections.sort(deck, new SortByFace());
        System.out.println(deck);
        System.out.println(deck.get(pick.nextInt(52)));
    }

    public static void generateCards(ArrayList<PlayingCard> x,String s){
        PlayingCard c;
        for (int i = 2; i<11; i++){
            String face = ""+i;
            c = new PlayingCard(s,face);
            x.add(c);
        }
        c = new PlayingCard(s,"Ace");
        x.add(c);
        c = new PlayingCard(s,"Jack");
        x.add(c);
        c = new PlayingCard(s,"Queen");
        x.add(c);
        c = new PlayingCard(s,"King");
        x.add(c);
    }
}
