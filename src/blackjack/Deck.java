package blackjack;

import java.util.*;

public class Deck {

	public static final int SIZE = 52;
	private static Random random;
	Card[] cards;
	
	public Deck(int mul){
		
		if(mul <= 8) {
			cards = new Card[SIZE * mul];
			for(int k = 0; k < mul; k++) 
			{
				for(int i = 0; i < 4; i++) {
					
					for(int j = 0; j < SIZE/4; j++) {
						this.cards[(i * 13 + j)+52*k] = new Card(j+1, i);
					}
				}
			}
		}
	}
	
	public Deck(){
		 this(1);
	}
	
	public String toString() {
		String deck="{ ";
		for(int i = 0; i < cards.length; i++) {
			deck += this.cards[i]+", ";
		}
		deck += "}";
		return deck;
	}
	
    public void shuffle() {
        if (random == null) random = new Random();
        int count = cards.length;
        for (int i = count; i > 1; i--) {
            swap(cards, i - 1, random.nextInt(i));
        }
    }

    private void swap(Card[] c, int i, int j) {
        Card temp = c[i];
        c[i] = c[j];
        c[j] = temp;
    }
}
