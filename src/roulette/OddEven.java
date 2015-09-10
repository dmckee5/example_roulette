package roulette;

import util.ConsoleReader;

public class OddEven extends Bet {
	private static final String DESCRIPTION = "Odd or Even";
	
	public OddEven(int odds) {
		super(odds);
	}

	@Override
	public String makeBet() {
		return ConsoleReader.promptOneOf("Please bet", "even", "odd");
	}

	@Override
	public boolean winBet(String betChoice, Wheel wheel) {
		return (wheel.getNumber() % 2 == 0 && betChoice.equals("even")) ||
                (wheel.getNumber() % 2 == 1 && betChoice.equals("odd"));
	}

	@Override
	public String getDescription() {
		return DESCRIPTION;
	}
	

}
