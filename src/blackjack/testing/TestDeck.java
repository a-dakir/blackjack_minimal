package blackjack.testing;

import blackjack.*;

public class TestDeck {
	
	public static void main(final String[] args) {
		
		Deck deck1 = new Deck(8);
		System.out.println(deck1);
		deck1.shuffle();
		System.out.println(deck1);
		//Ruleset r = new Ruleset();
	}
}
