import java.util.*;

public class Card {
		private String rank;
		private String suit;
		
		public Card(String r, String s){
			if(r == null || s == null)
				throw new IllegalArgumentException();
			rank = r;
			suit = s;
		}
		public boolean equals(Object obj){
			if(!(obj instanceof Card)) return false;
			Card c = (Card) obj;
			return this.rank.equals(c.rank) && this.suit.equals(c.suit);
		}
		
		public int hashCode(){
			return rank.hashCode();
		}
		
		public static void main(String[] args){
			
			System.out.println(new Card("T", "6"));
			
	}
}
