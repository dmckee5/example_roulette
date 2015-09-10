package roulette;


/**
 * Represents player's attempt to bet on outcome of the roulette wheel's spin.
 * 
 * @author Robert C. Duvall
 */
public abstract class Bet {
    private int myOdds;

    /**
     * Constructs a bet with the given name and odds.
     * @param odds odds given by the house for this kind of bet
     */
    public Bet (int odds) {
        myOdds = odds;
    }

    /**
     * @return odds given by the house for this kind of bet
     */
    public int getOdds () {
        return myOdds;
    }

    /**
     * @return name of this kind of bet
     */
    public abstract String getDescription (); 
    
    public abstract String makeBet();
    
    public abstract boolean winBet(String betChoice, Wheel wheel);
}
