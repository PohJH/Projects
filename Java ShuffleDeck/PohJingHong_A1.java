/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pohjinghong_a1;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author Poh Jing Hong
 */
public class PohJingHong_A1 {

    public enum SuitEnum {
        SPADE, 
        HEART,
        DIAMOND,
        CLUB;
    }
    
    public enum RankEnum {
         TWO,
         THREE,
         FOUR,
         FIVE,
         SIX,
         SEVEN,
         EIGHT,
         NINE,
         TEN,
         JACK,
         QUEEN, 
         KING, 
         ACE;
    }
    
     final RankEnum rank;
     final SuitEnum suit;
     
     public PohJingHong_A1 (final RankEnum rank, final SuitEnum suit) {
        this.rank = rank;
        this.suit = suit;
  
     }
     
     public String getSuitAsString() {
         
        switch ( suit ) {
           case SPADE :  return "S";
           case HEART:   return "H";
           case DIAMOND: return "D";
           case CLUB :   return "C";
           default:      return "";
        }
     }
        
        public String getRankAsString(){
            switch(rank){
                case ACE: return "A";
                case TWO: return "2";
                case THREE: return "3";
                case FOUR: return "4";
                case FIVE: return "5";
                case SIX: return  "6";
                case SEVEN: return "7";
                case EIGHT: return "8";
                case NINE: return "9";
                case TEN: return "10";
                case JACK: return "J";
                case QUEEN: return "Q";
                case KING: return "K";
                default:    return "";
            }
        }
    
     
    @Override
     public String toString () {
       return String.format ("%s%s ", getRankAsString(), getSuitAsString());
     }
 
     
    public static ArrayList< PohJingHong_A1>cardList(){
        
     ArrayList< PohJingHong_A1>result=new ArrayList<>();
     for(SuitEnum suit:SuitEnum.values()){
      for(RankEnum rank:RankEnum.values()){
         result.add(new PohJingHong_A1(rank,suit));
         
     }
    }
        return result;
       }
   
   
    public static void main(String[] args) {
       
      ArrayList<PohJingHong_A1> deck = cardList();
        
      System.out.println("Printing from ArrayList\n");
      for(int shuffle=0;shuffle<5;shuffle++){
     for(int count=0;count<=51;count++){
        System.out.print(deck.get(count));
        
        if(count==51){
         System.out.println(" ");
         System.out.println("______________________________________________________");
         System.out.println("\nRearrange deck\n");
         shuffle(deck);
        
        }
        if(count!=0&&(count+1)%13==0){
         System.out.println();   
      
     }
    }
}
    }
    public static void shuffle(ArrayList<PohJingHong_A1> a){
        int n=a.size();
        Random random=new Random();
        random.nextInt();
        for(int i=0;i<n;i++){
            int change=i+random.nextInt(n-i);
            swap(a,i,change);
        }
    }
    private static void swap(ArrayList<PohJingHong_A1> a,int i,int change){
        PohJingHong_A1 swap=a.get(i);
        a.set(i, a.get(change));
        a.set(change, swap);
    }
    
}                
              
               

    