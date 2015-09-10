package roulette;

import util.ConsoleReader;

public class RedBlack extends Bet{	
	private static final String DESCRIPTION = "Red or Black";
	public RedBlack(int odds) {
		super(odds);
	}

	

	@Override
	public String makeBet() {
		return ConsoleReader.promptOneOf("Please bet", Wheel.BLACK, Wheel.RED);
	}

	@Override
	public boolean winBet(String betChoice, Wheel wheel) {
		return wheel.getColor().equals(betChoice);
	}



	@Override
	public String getDescription() {
		return DESCRIPTION;
	}
	
	


}
