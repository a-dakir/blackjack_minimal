package blackjack;

public class Card {
	int value;
	Suit suit;
	enum Suit
	{
		SPADES,
		HEARTS,
		CLUBS,
		DIAMONDS
	}
	
	public Card(int value, int suit) {
		this.value = value;
		//TODO: MANAGE suit VALUE WHEN IT DIFFERS FROM 0,1,2,3
		this.suit = (suit == 0) ? Suit.SPADES : suit == 1 ? Suit.HEARTS : suit == 2 ? Suit.CLUBS : Suit.DIAMONDS;
	}
	
	public String toString() {
		if(value<=10)
			return "[ "+value+" of "+suit+" ]";
		else {
			switch(value) {
			case 11:
				return "[ Jack of "+suit+" ]";
			case 12:
				return "[ Queen of "+suit+" ]";
			case 13:
				return "[ King of "+suit+" ]";
			default:
				//TODO: MANAGE DEFAULT CASE
				return "";
			}
		}
	}
}
