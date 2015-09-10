package roulette;

import util.ConsoleReader;

public class Three extends Bet {
	private static final String DESCRIPTION = "Three in a Row";

	public Three(int odds) {
		super(odds);
	}

	@Override
	public String makeBet() {
		// TODO Auto-generated method stub
		return "" + ConsoleReader.promptRange("Enter first of three consecutive numbers",
                1, Wheel.NUM_SPOTS - 3);
	}

	@Override
	public boolean winBet(String betChoice, Wheel wheel) {
		 int start = Integer.parseInt(betChoice);
         return (start <= wheel.getNumber() && wheel.getNumber() < start + 3);
	}

	@Override
	public String getDescription() {
		return DESCRIPTION;
	}
	

}
