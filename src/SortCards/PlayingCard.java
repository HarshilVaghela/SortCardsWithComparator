/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SortCards;

/**
 *
 * @author harsh
 */
public class PlayingCard
{
    private String suit;
    private String face;

    /**
     * Constructor for objects of class PlayingCard
     */
    public PlayingCard(String s, String f)
    {
        suit = s;
        face = f;
    }

    public String toString()
    {
        return face +" of "+ suit;
    }

    public String getSuit(){
        return suit;
    }

    public String getFace(){
        return face;
    }

    public void setSuit(String s){
        suit=s;
    }

    public void setFace(String f){
        face=f;
    }
}
