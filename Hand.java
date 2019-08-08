/**********************************************************
 * Program Name       : Assignment - Blackjack Final Project
 * Author             : William Golembieski
 * Date               : May 05, 2018
 * Course/Section     : CSC264 - 801
 * Program Description: This program will implement the game of blackjack
 **********************************************************/

import java.util.*;
import java.util.ArrayList;

/**********************************************************
 * Class Name     : Hand
 * Author         : William Golembieski
 * Date           : May 05, 2018
 * Course/Section : CSC264 - 801
 * Program Description: This program will implement the game of blackjack
 *
 * Methods:
 * -------
 * Hand                   - Constructor for a new hand object that is empty
 * getName                - Get the player name for the hand
 * setPlayerName          - Set the current player's name
 * getHandSize            - Returns size of player's hand in number of objects
 * isSoft                 - Returns if hand is a soft hand (it has an ace)
 * isSplit                - Returns if hand is a split at first deal or not
 * addCard                - Adds card to the hand
 * adjustForAce           - Reduces handTotal by 10 if there is a reducable ace in the hand
 * aceInHand              - If hand total is over 21, reduce ace true value if present
 * getHandTotal           - Returns the hand total
 * getIterator            - Returns interator for hand
 * removeCardFromHand     - removes card from hand that is passed in
 * removeAllCardsFromHand - removes all the cards from the hand
 * getBet                 - return the bet for the hand
 * setBet                 - set the bet to a new value
 * addToBet               - add to the bet
 * getIsDoubled           - set if the hand has been doubled on
 * setCanBeDoubled        - set if hand has been doubled on
 * canBeDoubled           - see if hand can be doubled on
 * toString               - return the string value of the hand
 **********************************************************/

public class Hand
{
  // Class constants

  // Class variables
  private ArrayList<Card> cardsInHand;   // Array of card in hand
  private String playerName = "";        // Name of the player
  private int betOnHand;                 // Current bet on the hand
  private int handTotal;                 // Current total of the hand
  private int numCards;                  // Total number of cards in the hand
  private boolean isSplit;               // Is this hand a split
  private boolean canBeDoubled;          // Has this hand been doubled on

/**********************************************************
 * Method Name    : Hand
 * Author         : William Golembieski
 * Date           : May 05, 2018
 * Course/Section : CSC264 - 801
 * Program Description: This method will serve as a constructor for an empty card.
 *    Will use this constructor when we are creating a new card of unknown values.
 *
 * BEGIN Hand
 *   Create hand of MAX_HAND_SIZE
 *   Initialize hand values
 * END Hand
 **********************************************************/
  public Hand()
  {
	// Local constants
	final int MAX_HAND_SIZE = 20;

	// Local variables

	/**********************************************/

	System.out.println("NEW HAND");

	// Create hand of MAX_HAND_SIZE
    cardsInHand = new ArrayList<Card>(MAX_HAND_SIZE);

    // Initialize hand values
    betOnHand = 0;
    handTotal = 0;
    numCards = 0;
    isSplit = false;
    canBeDoubled = true;

  }//END Hand

/**********************************************************
 * Method Name    : getPlayerName
 * Author         : William Golembieski
 * Date           : May 05, 2018
 * Course/Section : CSC264 - 801
 * Method Description: This method will return the name of the player
 *
 * BEGIN getPlayerName
 *   Return the name of the player
 * END getPlayerName
 **********************************************************/

  public String getPlayerName()
  {
	// Local constants

	// Local variables

	/**********************************************/

	// Return the name of the player
    return playerName;

  }//END getPlayerName

/**********************************************************
 * Method Name    : getCardByIndex
 * Author         : William Golembieski
 * Date           : May 05, 2018
 * Course/Section : CSC264 - 801
 * Method Description: returns the card with index passed in
 *
 * BEGIN getCardByIndex
 *   IF( there are cards)
 *   	returns the card with index passed in
*    END IF
 * END getCardByIndex
 **********************************************************/

  public Card getCardByIndex(int indexNum)
  {
	// Local constants

	// Local variables

	/**********************************************/

	// Return the card index if there are cards
	if(cardsInHand.size() > 0);
    	return cardsInHand.get(indexNum);

  }//END getCardByIndex

/**********************************************************
 * Method Name    : setPlayerName
 * Author         : William Golembieski
 * Date           : May 05, 2018
 * Course/Section : CSC264 - 801
 * Method Description: This method will set the name of the player
 *
 * BEGIN setPlayerName
 *   Set the name of the player
 * END setPlayerName
 **********************************************************/

  public void setPlayerName(String inPlayerName)
  {
	// Local constants

	// Local variables

	/**********************************************/

	// Set the name of the player as titlecase
    playerName = Util.toTitleCase(inPlayerName);

  }//END setPlayerName

/**********************************************************
 * Method Name    : getHandSize
 * Author         : William Golembieski
 * Date           : May 05, 2018
 * Course/Section : CSC264 - 801
 * Method Description: This method will return the size of the players hand
 *
 * BEGIN setPlayerName
 *   Return size of players hand
 * END setPlayerName
 **********************************************************/

  public int getHandSize()
  {
	// Local constants

	// Local variables

	/**********************************************/

	// Set the name of the player
    return cardsInHand.size();

  }//END getHandSize

/**********************************************************
 * Method Name    : addCard
 * Author         : William Golembieski
 * Date           : May 05, 2018
 * Course/Section : CSC264 - 801
 * Method Description: This method will add a card to the hand and reduce the hand
 *    total if total is over 21 and there is an ace in the hand.
 *
 * BEGIN addCard
 *   Add card to hand
 *   Increment hand value to value of card
 *   Adjust for aces
 *   Increment card count
 * END addCard
 **********************************************************/

  public void addCard(Card cardToAdd)
  {
	// Local constants

	// Local variables

	/**********************************************/

    // Add card to hand
    cardsInHand.add(cardToAdd);
    System.out.println("Card being added to hand: " + cardToAdd.toString());
    System.out.println("Hand Size: " + cardsInHand.size());

    // Increment hand value to value of card
    handTotal += cardToAdd.getTrueValue();

    // Adjust for aces
    adjustForAce();

  }//END addCard

  /**********************************************************
   * Method Name    : isSoft
   * Author         : William Golembieski
   * Date           : May 05, 2018
   * Course/Section : CSC264 - 801
   * Method Description: This method will add a card to the hand and reduce the hand
   *    total if total is over 21 and there is an ace in the hand.
   *
   * BEGIN isSoft
   *   WHILE( There are cards in the hand or keep going)
   *        Get next card
   *        IF(card is an ace and has not been reduced yet)
   *        set isSoft to true
   *        set keepGoing to false
   *      END IF
   *   END WHILE
   *   Return isSoft
   * END isSoft
   **********************************************************/

    public boolean isSoft()
    {
		// Local constants

		// Local variables
		boolean isSoftHand = false;

		/***************************/

		if(cardsInHand.get(0).getFaceValue().equals("Ace"))
			if(cardsInHand.get(0).getTrueValue() == 10)
			{
				isSoftHand = true;
				System.out.println("\n FirstCardAce =" + isSoftHand);
			}


		if(cardsInHand.get(1).getFaceValue().equals("Ace"))
			if(cardsInHand.get(1).getTrueValue() == 10)
			{
				isSoftHand = true;
				System.out.println("\n 2ndCardAce =" + isSoftHand);
			}

		System.out.println("\n isSoftHand =" + isSoftHand);

		return isSoftHand;

  }//END isSoft

  /**********************************************************
   * Method Name    : isSplit
   * Author         : William Golembieski
   * Date           : May 05, 2018
   * Course/Section : CSC264 - 801
   * Method Description: This method will add a card to the hand and reduce the hand
   *    total if total is over 21 and there is an ace in the hand.
   *
   * BEGIN isSplit
   *      Set isSplit to false
   *      IF(cardsInHand.size() == 2)
   *      	Get Card 1
   *      	IF( card 1.getFaceValue = iter.next().getFaceValue)
   *        	set isSplit to true
   *      	END IF
   *      END IF
   *   Return if hand is a splitt
   * END isSplit
   **********************************************************/

    public boolean isSplit()
    {
  	// Local constants

  	// Local variables
  	Iterator<Card> cardIter = cardsInHand.iterator();
  	boolean isSplit = false;
  	Card firstCard;

  	/**********************************************/

      // IF(cardsInHand.size() == 2)
      if(cardsInHand.size() == 2)
      {
      	//Get Card 1
      	firstCard = cardIter.next();

      	// IF( card 1.getFaceValue = iter.next().getFaceValue)
      	if(firstCard.getFaceValue().equals(cardIter.next().getFaceValue()))
      	{
			//Set isSplit to true
			isSplit = true;

		}//END IF

      }//END IF

  	// Return if hand is a split
  	return isSplit;

  }//END isSplit

/**********************************************************
 * Method Name    : adjustForAce
 * Author         : William Golembieski
 * Date           : May 05, 2018
 * Course/Section : CSC264 - 801
 * Method Description: This method will check to see if the hand is a bust value ( > 21).
 *    If hand has a bust value, the method will call the aceInHand method. If ace is found
 *    and reducable, reduce the hand value by 10
 *
 * BEGIN adjustForAce
 *   IF( hand total > greatest value for win )
 *      IF( (call ace in hand) )
 *         Decrease hand value by ace reduce value
 *      END IF
 *   END IF
 * END adjustForAce
 **********************************************************/

  private void adjustForAce()
  {
	  // Local constants
	  final int GREATEST_VAL_FOR_WIN = 21;
	  final int ACE_REDUCE_VALUE = 10;

	  // Local variables

	  /***********************************/

	  //IF( hand total > greatest value for win )
      if( handTotal > GREATEST_VAL_FOR_WIN )
      {
		 // IF( (call ace in hand) )
         if( aceInHand() )
         {
		   // Decrease hand value by ace reduce value
           handTotal -= ACE_REDUCE_VALUE;

	     }//END IF

      }// END IF

  }//end reduceHand

/**********************************************************
 * Method Name    : aceInHand
 * Author         : William Golembieski
 * Date           : May 05, 2018
 * Course/Section : CSC264 - 801
 * Method Description: This method will see if there is an unreduced ace in the hand
 *    If there is an unreduced ace in the hand, it will reduce the ace and return true.
 *    If there is no ace to reduce, false is returned
 *
 * BEGIN aceInHand
 *   WHILE(there is a next card in the hand, and no aces have been found)
 *      Set test card to the next card in the list
 *      IF(next card in list's true value is 11, its an unreduced ace!)
 *         Reduce the ace true value to ACE_REDUCED_VALUE
 *         Set ace in hand to true and exit while loop
 *      END IF
 *   END WHILE
 *   Return if ace was in hand and reduced
 * END aceInHand
 **********************************************************/
  private boolean aceInHand()
  {
     // Local constants
     final int ACE_UNREDUCED_VALUE = 11;
     final int ACE_REDUCED_VALUE = 1;

     // Local variables
     boolean aceInHand = false;                      // Was an ace reduced in the hand
     Iterator<Card> iter = cardsInHand.iterator();   // Get new iterator object for current hand
     Card testCard = null;                           // Card object for copying

     /******************************************/

    // WHILE(there is a next card in the hand, and no aces have been found)
    while(iter.hasNext() && !aceInHand)
    {
	   // Set test card to the next card in the list
       testCard = iter.next();

       // IF(next card in list's true value is 11, its an unreduced ace!)
       if(testCard.getTrueValue() == ACE_UNREDUCED_VALUE)
       {
		 // Reduce the ace true value to ACE_REDUCED_VALUE
         testCard.setTrueValue(ACE_REDUCED_VALUE);

         // Set ace in hand to true and exit while loop
         aceInHand = true;

       }//END IF

    }//END WHILE

    // Return if ace was in hand and reduced
    return aceInHand;

  }//END aceInHand

/**********************************************************
 * Method Name    : getHandTotal
 * Author         : William Golembieski
 * Date           : May 05, 2018
 * Course/Section : CSC264 - 801
 * Method Description: This method returns the hand total
 *
 * BEGIN getHandTotal
 *   Return total of the hand
 * END getHandTotal
 **********************************************************/

  public int getHandTotal()
  {
     // Local constants

     // Local variables

     /******************************************/

	// Return total of the hand
    return handTotal;

  }//END getHandTotal

/**********************************************************
 * Method Name    : resetHandTotal
 * Author         : William Golembieski
 * Date           : May 05, 2018
 * Course/Section : CSC264 - 801
 * Method Description: This method returns the hand total
 *
 * BEGIN resetHandTotal
 *   reset hand total to 0
 * END resetHandTotal
 **********************************************************/

  public void resetHandTotal()
  {
     // Local constants

     // Local variables

     /******************************************/

	// Return total of the hand
    handTotal = 0;

  }//END resetHandTotal

/**********************************************************
 * Method Name    : getIterator
 * Author         : William Golembieski
 * Date           : May 05, 2018
 * Course/Section : CSC264 - 801
 * Method Description: This method returns iterator for hand
 *
 * BEGIN getIterator
 *   Return iterator for hand
 * END getIterator
 **********************************************************/

  public Iterator<Card> getIterator()
  {
     // Local constants

     // Local variables

     /******************************************/

	// Return iterator of the hand
    return cardsInHand.iterator();

  }//END getIterator

/**********************************************************
 * Method Name    : removeCardFromHand
 * Author         : William Golembieski
 * Date           : May 05, 2018
 * Course/Section : CSC264 - 801
 * Method Description: This method removes a card from the hand
 *
 * BEGIN getHandTotal
 *   Remove a specific card from the hand
 * END getHandTotal
 **********************************************************/

  public void removeCardFromHand(Card cardToRemove  // Card object to remove
                                                  )
  {
     // Local constants

     // Local variables

     /******************************************/

	 // Remove specific card from hand
     cardsInHand.remove(cardToRemove);

  }//END removeCardFromHand

/**********************************************************
 * Method Name    : removeAllCardsFromHand
 * Author         : William Golembieski
 * Date           : May 05, 2018
 * Course/Section : CSC264 - 801
 * Method Description: This method removes all cards from the hand
 *
 * BEGIN getHandTotal
 *   Remove all cards from hand
 * END getHandTotal
 **********************************************************/

  public void removeAllCardsFromHand()
  {
     // Local constants

     // Local variables

     /******************************************/

	 // Remove all cards from hand
     cardsInHand.clear();
     numCards = 0;

  }//END removeAllCardsFromHand

/**********************************************************
 * Method Name    : getBet
 * Author         : William Golembieski
 * Date           : May 05, 2018
 * Course/Section : CSC264 - 801
 * Method Description: This method returns the bet on the hand
 *
 * BEGIN getBet
 *   return bet on hand
 * END getBet
 **********************************************************/

  public int getBet()
  {
     // Local constants

     // Local variables

     /******************************************/

	 // return bet on hand
     return betOnHand;

  }//END getBet

/**********************************************************
 * Method Name    : setBet
 * Author         : William Golembieski
 * Date           : May 05, 2018
 * Course/Section : CSC264 - 801
 * Method Description: This method sets a new bet on the hand
 *
 * BEGIN setBet
 *   set new bet on hand
 * END setBet
 **********************************************************/

  public void setBet(int newBet)
  {
     // Local constants

     // Local variables

     /******************************************/

	 // return bet on hand
     betOnHand = newBet;

  }//END setBet

/**********************************************************
 * Method Name    : addToBet
 * Author         : William Golembieski
 * Date           : May 05, 2018
 * Course/Section : CSC264 - 801
 * Method Description: This method sets a new bet on the hand
 *
 * BEGIN addToBet
 *   set new bet on hand
 * END addToBet
 **********************************************************/

  public void addToBet(int additionalBet)
  {
     // Local constants

     // Local variables

     /******************************************/

	 // add bet to total bet for hand
     betOnHand += additionalBet;

  }//END addToBet

  /**********************************************************
   * Method Name    : setCanBeDoubled
   * Author         : William Golembieski
   * Date           : May 05, 2018
   * Course/Section : CSC264 - 801
   * Method Description: This method checks can be doubled
   *
   * BEGIN setCanBeDoubled
   *   set if this hand can be doubled
   * END setCanBeDoubled
   **********************************************************/

    public void setCanBeDoubled(boolean newDoubled)
    {
       // Local constants

       // Local variables

       /******************************************/

  	   // set if the hand has been doubled
       canBeDoubled = newDoubled;

  }//END setCanBeDoubled

  /**********************************************************
   * Method Name    : getCanBeDoubled
   * Author         : William Golembieski
   * Date           : May 05, 2018
   * Course/Section : CSC264 - 801
   * Method Description: This method sets insurance status
   *
   * BEGIN getCanBeDoubled
   *   returns if hand can be doubled
   * END getCanBeDoubled
   **********************************************************/

    public boolean getCanBeDoubled()
    {
       // Local constants

       // Local variables

       /******************************************/

  	 // returns if hand has been doubled or not
       return canBeDoubled;

  }//END getCanBeDoubled

/**********************************************************
 * Method Name    : toString
 * Author         : William Golembieski
 * Date           : May 05, 2018
 * Course/Section : CSC264 - 801
 * Method Description: This method prints the string representation of a hand
 *
 * BEGIN toString
 *   WHILE(There are cards left to iterate over)
 *      Copy next card into new card
 *      Add card position to output string
 *      Add card's toString value to output string
 *   END WHILE
 * END toString
 **********************************************************/

  public String toString()
  {
     // Local constants

     // Local variables
     Iterator<Card> iter = cardsInHand.iterator();   // Iterator object on cardsInHand ArrayList
     String outputString = "";                       // String for output
     Card tempCard = null;                           // Card object to copy values from
     int counter = 0;                                // Counter variable for what card we are on

     /******************************************/

	//WHILE(There are cards left to iterate over)
    while (iter.hasNext())
    {
	   // Copy card into temp card
       tempCard = iter.next();

       // Add card toString to output String
       outputString += "card " + counter + " : "+tempCard.toString() + "\n";

       // Increment counter
       counter++;
    }

	// return the built outputString
    return outputString;

  }//END toString

}//end Hand
