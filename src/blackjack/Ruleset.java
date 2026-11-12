package blackjack;

public class Ruleset {
	Soft17 rsoft17;
	Payout payout;
	HoleCardRules rholecard;
	DoubleDownRules rdouble;
	boolean doubleaftersplit;
	SurrenderType rsurrender;
	ResplittingRules rresplit;
	boolean fivecardcharlie;
	
	public Ruleset(Soft17 soft17, Payout payout, HoleCardRules holecard, DoubleDownRules doubledown, boolean doubleasplit, SurrenderType surrendtype, ResplittingRules resplit, boolean fivecard) {
	//payout = 2;
	}
	
	
	
	
	enum Soft17
	{
		HIT,
		STAND
	}
	enum Payout
	{
		ThreeToTwo,
		SixToFive
	}
	enum HoleCardRules
	{
		HoleCard,
		NoHoleCard
	}
	enum DoubleDownRules
	{
		OnlyOn1011,
		AnyTwo
	}
	enum SurrenderType
	{
		LateSurrender,
		EarlySurrender
	}
	enum ResplittingRules
	{
		ResplitAces,
		NoResplit
	}
	
}
