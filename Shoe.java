/**********************************************************
 * Program Name       : Assignment - Blackjack Final Project
 * Author             : William Golembieski
 * Date               : May 05, 2018
 * Course/Section     : CSC264 - 801
 * Program Description: This program will implement the game of blackjack
 **********************************************************/

import java.util.Stack;
import java.util.Collections;

/**********************************************************
 * Class Name         : Shoe
 * Author             : William Golembieski
 * Date               : May 05, 2018
 * Course/Section     : CSC264 - 801
 * Class Description  : This class will represent a shoe in blackjack
 *
 * Methods:
 * ---------
 * Shoe            - Serves as the constructor for the Shoe object
 * getCardFromShoe - Remove and return the next card from the shoe
 * isTimeToShuffle - Returns if it is time to shuffle the deck
 * shuffleShoe     - Creates a new shuffled shoe
 **********************************************************/

public class Shoe
{
	// Class constants
	final double WHEN_TO_SHUFFLE = 0.75;         // Percentage to set indicator card at
	final int NUMBER_OF_DECKS    = 4;            // Number of decks to play with

	// Class variables
    private Stack<Card> shoeStack = new Stack<Card>();   // Stack of cards that contains decks
    private int numCardsLeft;                            // Num of cards left in the shoe
    private int indicatorCard;                           // Indicator card for reshuffeling

	/**********************************************************
	 * Method Name        : Shoe
	 * Author             : William Golembieski
	 * Date               : May 05, 2018
	 * Course/Section     : CSC264 - 801
	 * Program Description: This method will serve as the constructor
	 *    of a shoe object.
	 *
	 * BEGIN Shoe
	 *    FOR( number of decks )
	 *       Create new deck
	 *       Add new deck to end of shoe
	 *    END FOR
	 *    Shuffle deck
	 *    Set number of cards remaining
	 *    Set indicator card
	 * END Shoe
	 **********************************************************/

    public Shoe()
    {
	   // Local constants

	   // Local variables

	   /************** Start Shoe Method ******************/

       //FOR( number of decks )
       for(int i = 0; i < NUMBER_OF_DECKS; i++)
       {
	      // Create new deck
		  Deck newDeck = new Deck();

		  // Add new deck to end of shoe
		  shoeStack.addAll(newDeck);

	   }//END FOR

	   // Shuffle Deck
	   Collections.shuffle(shoeStack);

	   // Set number of cards remaining
	   numCardsLeft = shoeStack.size();

	   // Set indicator card to the percentage WHEN_TO_SHUFFLE
	   indicatorCard = (int)(numCardsLeft * WHEN_TO_SHUFFLE);

    }//END Shoe method

   /**********************************************************
    * Method Name        : getCardFromShoe
    * Author             : William Golembieski
    * Date               : May 05, 2018
    * Course/Section     : CSC264 - 801
    * Program Description: This program will implement the game of blackjack
    *
    * BEGIN getCardFromShoe
    *    Create empty card
    *    Pop the first card off the deck and store in result
    *    Decrement card counter
    *    Return the card that was drawn
    * END getCardFromShoe
    **********************************************************/

   public Card getCardFromShoe()
   {
      // Local constants

	  // Local variables

	  /*********** Start getCardFromShoe Method ************/

      // Create empty card
      Card drawnCard = new Card();

      // Pop the first card off the deck and store in result
      drawnCard = shoeStack.pop();

      // Decrement card counter
      numCardsLeft--;

      // Return the card that was drawn
      return drawnCard;

   }//END getCardFromShoe

   /**********************************************************
    * Method Name        : isTimeToShuffle
    * Author             : William Golembieski
    * Date               : May 05, 2018
    * Course/Section     : CSC264 - 801
    * Program Description: Returns if it is time to shuffle the deck, based on
    *    indicator card position.
    *
    * BEGIN getCardFromShoe
    *    Return if we have hit the indicator card
    * END getCardFromShoe
    **********************************************************/

   public boolean isTimeToShuffle()
   {
      // Local constants

	  // Local variables

	  /*********** Start isTimeToShuffle Method ************/

	  // Return if we have hit the indicator card
	  return ( shoeStack.size() <= indicatorCard );

   }//END isTimeToShuffle

}//end deck