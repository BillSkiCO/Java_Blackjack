/**********************************************************
 * Program Name       : Assignment - Blackjack Final Project
 * Author             : William Golembieski
 * Date               : May 05, 2018
 * Course/Section     : CSC264 - 801
 * Program Description: This program will implement the game of blackjack
 **********************************************************/

import java.util.*;

/**********************************************************
 * Class Name     : Blackjack
 * Author         : William Golembieski
 * Date           : May 05, 2018
 * Course/Section : CSC264 - 801
 * Class Description: This class will represent a game of blackjack
 *
 * Methods:
 * -------
 * Blackjack              - Constructor for a new blackjack object that is empty
 * dealInitialCards       - deals first two initial cards to the players
 * playerHit              - Gives player a card
 * getPlayerHandSize      - returns size of the players hand
 * getDealerHandSize      - returns the size of the dealers hand
 * getDealerCard          - returns the dealer card at specified index
 * getPlayerCard          - returns the player card at specified index
 * dealerHit              - Gives the dealer a card
 * getPlayerBet           - returns value of players bet
 * setPlayerBet           - Set the players bet
 * getPlayerHandValue     - Gets players hand value
 * getDealerHandValue     - Gets value of dealers hand
 * clearHands             - removes all cards from both players hands
 * getNewShoe             - instantiated a new shuffled shoe
 * isTimeToShuffle        - returns if it is time to shuffle the shoe
 * getDealerIterator      - returns iterator for dealers cards
 * getPlayerIterator      - returns iterator for players cards
 * isPlayerHandBlackjack  - returns if player hand is a blackjack or not
 * isDealerHandBlackjack  - returns if dealer has a blackjack in the first 2 cards
 * isPlayerBust           - returns is the player has busted
 * isDealerBust           - returns if the dealer has busted
 * getCanBeDoubled        - returns if the player can double or not  
 * setCanBeDoubled        - sets canBeDoubled
 * dealerTurn             - Draws cards for dealer until stopping value
 * gameResult             - returns the game result as a string
 * advise                 - returns suggested move based on hands
 * toString               - return the string value of the hand
 *
 **********************************************************/

public class Blackjack
{
  // Class constants
  final int DEALER_STOPPING_VALUE = 16;   // [16] Soft 17 Stand, [17] for Soft 17 Hit

  // Class variables
  private Hand dealer;    // to hold the dealer's cards
  private Hand player;    // to hold the player's cards
  private Shoe shoe;      // a set of cards

   /**********************************************************
    * Method Name        : Blackjack
    * Author             : William Golembieski
    * Date               : May 05, 2018
    * Course/Section     : CSC264 - 801
    * Program Description: Constructor for a game of blackjack
    *
    * BEGIN Blackjack
    *    Set inital values
    * END Blackjack
    **********************************************************/

  public Blackjack()
  {
     // Local constants

 	 // Local variables

     /*****************************/

     // Set initial values
     dealer = new Hand();
     player = new Hand();
     shoe = new Shoe();


  }//END Blackjack constructor

   /**********************************************************
    * Method Name        : dealInitialCards
    * Author             : William Golembieski
    * Date               : May 05, 2018
    * Course/Section     : CSC264 - 801
    * Program Description: Sets hand totals to 0, clears hands,
	* burns top card of game, set canBeDoubled back to true,
	* deal 2 cards to each player
    *
    * BEGIN dealInitialCards
	*    Set both hand totals back to 0
	*    Clear hands
    *    Burn first card
	*    Set can be doubled to true
    *    Deal first round of cards
    *    Deal second round of cards
    * END dealInitialCards
    **********************************************************/

	public void dealInitialCards()
	{
		// Local constants

		// Local variables

		/*****************************/

		// Set both hand totals back to 0
		player.resetHandTotal();
		dealer.resetHandTotal();

		// Clear hands
		clearHands();

		// Set can be doubled to true
		player.setCanBeDoubled(true);

		// Burn first card
		shoe.getCardFromShoe();

		// Deal first round of cards
		dealer.addCard(shoe.getCardFromShoe());
		dealer.addCard(shoe.getCardFromShoe());

		// Deal second round of cards
		player.addCard(shoe.getCardFromShoe());
		player.addCard(shoe.getCardFromShoe());

	}//end dealInitialCards

   /**********************************************************
    * Method Name        : playerHit
    * Author             : William Golembieski
    * Date               : May 05, 2018
    * Course/Section     : CSC264 - 801
    * Program Description: Deals a card to the player
    *
    * BEGIN playerHit
    *    Add new card to players hand
	*    return the card that was drawn
    * END playerHit
    **********************************************************/

	public Card playerHit()
	{
		 // Local constants

		 // Local variables
		 Card drawn = shoe.getCardFromShoe();  // Card drawn from the shoe

		 /*****************************/

		 // Add new card to players hand
		 player.addCard(drawn);

		 // return the card that was added
		 return drawn;

	}//end playerHit method

   /**********************************************************
    * Method Name        : getPlayerHandSize
    * Author             : William Golembieski
    * Date               : May 05, 2018
    * Course/Section     : CSC264 - 801
    * Program Description: returns size of players hand
    *
    * BEGIN getPlayerHandSize
    *    return size of hand
    * END getPlayerHandSize
    **********************************************************/

	public int getPlayerHandSize()
	{
		 // Local constants

		 // Local variables

		 /*****************************/

		 // return size of hand
		 return player.getHandSize();

	}//end getPlayerHandSize

   /**********************************************************
    * Method Name        : getDealerHandSize
    * Author             : William Golembieski
    * Date               : May 05, 2018
    * Course/Section     : CSC264 - 801
    * Program Description: Returns the size of the dealers hand
    *
    * BEGIN getDealerHandSize
    *    return dealer size of hand
    * END getDealerHandSize
    **********************************************************/

	public int getDealerHandSize()
	{
		 // Local constants

		 // Local variables

		 /*****************************/

		 // return dealer size of hand
		 return dealer.getHandSize();

	}//end getDealerHandSize

   /**********************************************************
    * Method Name        : getDealerCard
    * Author             : William Golembieski
    * Date               : May 05, 2018
    * Course/Section     : CSC264 - 801
    * Program Description: Returns the dealer card at specified index
    *
    * BEGIN getDealerCard
    *    return dealer card by index
    * END getDealerCard
    **********************************************************/

	public Card getDealerCard(int indexNumber)
	{
		 // Local constants

		 // Local variables

		 /*****************************/

		 // return dealer card by index
		 return dealer.getCardByIndex(indexNumber);

	}//end getDealerCard

   /**********************************************************
    * Method Name        : getPlayerCard
    * Author             : William Golembieski
    * Date               : May 05, 2018
    * Course/Section     : CSC264 - 801
    * Program Description: gets player card at the specific index
    *
    * BEGIN getPlayerNextCard
    *    return player card by index
    * END getPlayerNextCard
    **********************************************************/

	public Card getPlayerCard(int indexNumber)
	{
		 // Local constants

		 // Local variables

		 /*****************************/

		 // return player card by index
		 return player.getCardByIndex(indexNumber);

	}//end getPlayerCard

   /**********************************************************
    * Method Name        : dealerHit
    * Author             : William Golembieski
    * Date               : May 05, 2018
    * Course/Section     : CSC264 - 801
    * Program Description: adds card to dealers hand
    *
    * BEGIN dealerHit
    *    Add new card to dealers hand
    * END dealerHit
    **********************************************************/

	public Card dealerHit()
	{
		 // Local constants

		 // Local variables
		 Card drawn = shoe.getCardFromShoe();  // Card drawn from the shoe

		 /*****************************/

		 // Add new card to dealers hand
		 dealer.addCard(drawn);

		 // return the card that was added
		 return drawn;

	}//end dealerHit method

   /**********************************************************
    * Method Name        : getPlayerBet
    * Author             : William Golembieski
    * Date               : May 05, 2018
    * Course/Section     : CSC264 - 801
    * Program Description: returns the players bet
    *
    * BEGIN getPlayerBet
    *    return the players bet
    * END getPlayerBet
    **********************************************************/

	public int getPlayerBet()
	{
		 // Local constants

		 // Local variables

		 /*****************************/

		 // return the players bet
		 return player.getBet();

	}//end getPlayerBet

   /**********************************************************
    * Method Name        : setPlayerBet
    * Author             : William Golembieski
    * Date               : May 05, 2018
    * Course/Section     : CSC264 - 801
    * Program Description: sets the players bet
    *
    * BEGIN setPlayerBet
    *    set players bet
    * END setPlayerBet
    **********************************************************/

	public void setPlayerBet(int newBet)
	{
		 // Local constants

		 // Local variables

		 /*****************************/

		 // set players bet
		 player.setBet(newBet);

	}//end setPlayerBet

   /**********************************************************
    * Method Name        : getPlayerHandValue
    * Author             : William Golembieski
    * Date               : May 05, 2018
    * Course/Section     : CSC264 - 801
    * Program Description: gets value of players hand
    *
    * BEGIN getPlayerHandValue
    *    Get hand total for the player
    *    Return the hand total for  the player
    * END getPlayerHandValue
    **********************************************************/

  public int getPlayerHandValue()
  {
	// Local constants

	// Local variables
	int handTotalForPlayer;

	/*****************************/

	// Get hand total for the player
    handTotalForPlayer = player.getHandTotal();

	// Return the hand total for  the player
    return handTotalForPlayer;

  }// END getPlayerHandValue

   /**********************************************************
    * Method Name        : getDealerHandValue
    * Author             : William Golembieski
    * Date               : May 05, 2018
    * Course/Section     : CSC264 - 801
    * Program Description: gets the value of the dealers hand
    *
    * BEGIN getDealerHandValue
    *    Get hand total for the dealer
    * END getDealerHandValue
    **********************************************************/

  public int getDealerHandValue()
  {
	// Local constants

	// Local variables
	int handTotalForDealer;

	/*****************************/

	// Get hand total for the dealer
    handTotalForDealer = dealer.getHandTotal();

	// Return the hand total for the dealer
    return handTotalForDealer;

  }// END getDealerHandValue

   /**********************************************************
    * Method Name        : clearHand
    * Author             : William Golembieski
    * Date               : May 05, 2018
    * Course/Section     : CSC264 - 801
    * Program Description: removes all cards from play
    *
    * BEGIN clearHand
    *    Remove all cards from the players hand
    * END clearHand
    **********************************************************/

  public void clearHands()
  {
	// Local constants

	// Local variables

	/*****************************/

	// Remove all cards from the players hand
	player.removeAllCardsFromHand();
	dealer.removeAllCardsFromHand();

  }//end clearHands

     /**********************************************************
      * Method Name        : getNewShoe
      * Author             : William Golembieski
      * Date               : May 05, 2018
      * Course/Section     : CSC264 - 801
      * Program Description: creates a new shoe and sets current shoe to new shoe
      *
      * BEGIN clearHand
      *    create new show and set current shoe to that
      * END clearHand
      **********************************************************/

    public void getNewShoe()
    {
  	// Local constants

  	// Local variables

  	/*****************************/

  	// create new show and set current shoe to that
  	shoe = new Shoe();

  }//end getNewShoe

     /**********************************************************
      * Method Name        : isTimeToShuffle
      * Author             : William Golembieski
      * Date               : May 05, 2018
      * Course/Section     : CSC264 - 801
      * Program Description: returns if it is time to shuffle the shoe
      *
      * BEGIN isTimeToShuffle
      *    return if it is time to shuffle the shoe
      * END isTimeToShuffle
      **********************************************************/

    public boolean isTimeToShuffle()
    {
  	// Local constants

  	// Local variables

  	/*****************************/

  	// return if it is time to shuffle the shoe
  	return shoe.isTimeToShuffle();

  }//end isTimeToShuffle

  	 /**********************************************************
      * Method Name        : getDealerIterator
      * Author             : William Golembieski
      * Date               : May 05, 2018
      * Course/Section     : CSC264 - 801
      * Program Description: return dealer iterator
      *
      * BEGIN getDealerIterator
      *    return dealer iterator
      * END getDealerIterator
      **********************************************************/

    public Iterator<Card> getDealerIterator()
    {
  	// Local constants

  	// Local variables

  	/*****************************/

  	// return dealer iterator
  	return dealer.getIterator();

  }//end getDealerIterator

  	 /**********************************************************
      * Method Name        : getPlayerIterator
      * Author             : William Golembieski
      * Date               : May 05, 2018
      * Course/Section     : CSC264 - 801
      * Program Description: return player iterator
      *
      * BEGIN getPlayerIterator
      *    return player iterator
      * END getPlayerIterator
      **********************************************************/

    public Iterator<Card> getPlayerIterator()
    {
  	// Local constants

  	// Local variables

  	/*****************************/

  	// return player iterator
  	return player.getIterator();

  }//end getPlayerIterator

   /**********************************************************
    * Method Name        : isPlayerHandBlackjack
    * Author             : William Golembieski
    * Date               : May 05, 2018
    * Course/Section     : CSC264 - 801
    * Program Description: Checks players hand to see if it is a blackjack
    *
    * BEGIN isPlayerHandBlackjack
    *    Set isBlackjack to false
    *	 IF(player's hand value is 21)
    *       Set is blackjack to true
    *    END IF
    *    Return isBlackjack
    * END isPlayerHandBlackjack
    **********************************************************/
  public boolean isPlayerHandBlackjack()
  {
	// Local constants

	// Local variables
    boolean isBlackjack = false;

	/*****************************/

	// IF(player's hand value is 21)
    if(player.getHandTotal() == 21 && player.getHandSize() == 2)
    {
	  // Set is blackjack to true
      isBlackjack = true;

  	}//END IF

	// Return isBlackjack
    return isBlackjack;

  }//end isPlayerHandBlackjack

   /**********************************************************
    * Method Name        : isDealerHandBlackjack
    * Author             : William Golembieski
    * Date               : May 05, 2018
    * Course/Section     : CSC264 - 801
    * Program Description: Checks hand to see if dealer hand is a blackjack
    *
    * BEGIN isDealerHandBlackjack
    *    Set isBlackjack to false
    *	 IF(player's hand value is 21)
    *       Set is blackjack to true
    *    END IF
    *    Return isBlackjack
    * END isDealerHandBlackjack
    **********************************************************/
  public boolean isDealerHandBlackjack()
  {
	// Local constants

	// Local variables
    boolean isBlackjack = false;
    Card cardOne = dealer.getCardByIndex(0);
    Card cardTwo = dealer.getCardByIndex(1);
    int dealerHandTotal = cardOne.getTrueValue() + cardOne.getTrueValue();

	/*****************************/

	// IF(player's hand value is 21)
    if(dealerHandTotal == 21)
    {
	  // Set is blackjack to true
      isBlackjack = true;

  	}//END IF

	// Return isBlackjack
    return isBlackjack;

  }//end isDealerHandBlackjack

   /**********************************************************
    * Method Name        : isPlayerBust
    * Author             : William Golembieski
    * Date               : May 05, 2018
    * Course/Section     : CSC264 - 801
    * Program Description: Checks hand to see if it is a blackjack
    *
    * BEGIN isPlayerBust
    *    Set isBust to false
    *	 IF(player's hand value is > 21)
    *       Set isBust to true
    *    END IF
    *    Return isBust
    * END isPlayerBust
    **********************************************************/
  public boolean isPlayerBust()
  {
	// Local constants

	// Local variables
    boolean isBust = false;

	/*****************************/

	// IF(player's hand value is > 21)
    if(player.getHandTotal() > 21)
	{
	  // Set isBust to true
      isBust = true;
	  
	}//END IF
	
	// Return isBust
    return isBust;

  }//END isPlayerBust

   /**********************************************************
    * Method Name        : isDealerBust
    * Author             : William Golembieski
    * Date               : May 05, 2018
    * Course/Section     : CSC264 - 801
    * Program Description: Checks hand to see if it is a blackjack
    *
    * BEGIN isDealerBust
    *    Set isBust to false
    *	 IF(dealer's hand value is > 21)
    *       Set isBust to true
    *    END IF
    *    Return isBust
    * END isDealerBust
    **********************************************************/
  public boolean isDealerBust()
  {
	// Local constants

	// Local variables
    boolean isBust = false;

	/*****************************/

	// IF(dealer's hand value is > 21)
    if(dealer.getHandTotal() > 21)
	{
	  //Set isBust to true	
      isBust = true;
	  
	}//END IF

	// Return isBust
    return isBust;

  }//END isDealerBust

   /**********************************************************
    * Method Name        : setCanBeDoubled
    * Author             : William Golembieski
    * Date               : May 05, 2018
    * Course/Section     : CSC264 - 801
    * Program Description: Set can be doubled to new value
    *
    * BEGIN setCanBeDoubled
    *    Set can be doubled to new value
    * END setCanBeDoubled
    **********************************************************/
  public void setCanBeDoubled(boolean newVal)
  {
	// Local constants

	// Local variables

	/*****************************/

	// Set can be doubled to new value
	player.setCanBeDoubled(newVal);

  }//END setCanBeDoubled

   /**********************************************************
    * Method Name        : getCanBeDoubled
    * Author             : William Golembieski
    * Date               : May 05, 2018
    * Course/Section     : CSC264 - 801
    * Program Description: get can be doubled from player
    *
    * BEGIN getCanBeDoubled
    *    get can be doubled from player
    * END getCanBeDoubled
    **********************************************************/
  public boolean getCanBeDoubled()
  {
	// Local constants

	// Local variables

	/*****************************/

	// Set can be doubled to new value
	return player.getCanBeDoubled();

  }//END getCanBeDoubled

  /**********************************************************
    * Method Name        : dealerTurn
    * Author             : William Golembieski
    * Date               : May 05, 2018
    * Course/Section     : CSC264 - 801
    * Program Description: Dealer gets cards
    *
    * BEGIN dealerTurn
    *    WHILE(Dealer hand value < Stopping value)
    *	 	Add card to dealer hand
    *    END WHILE
    *     Return dealer hand
    * END dealerTurn
    **********************************************************/

	public void dealerTurn()
	{
		// Local constants

		// Local variables
		Hand dealerHand = dealer;  //Temp hand object to hold dealer hand

		/*****************************/

		// WHILE(Dealer hand value < Stopping value)
		while(dealer.getHandTotal() <= DEALER_STOPPING_VALUE)
		{
			// Add card to dealer hand
			dealerHand.addCard(shoe.getCardFromShoe());

		}//END WHILE

	}//end dealerTurn

  /**********************************************************
    * Method Name        : gameResult
    * Author             : William Golembieski
    * Date               : May 05, 2018
    * Course/Section     : CSC264 - 801
    * Program Description: If player does not bust and dealerTurn() ends
    *    get result of the game.
    *
    * BEGIN gameResult
    *    IF( player hand value less than dealer hand value && dealer is not bust)
    *	 	Set result to player losing
    *    ELSE IF( player hand value equals dealer hand value && dealer is not bust)
    *       Set result to player pushing
    *    ELSE
    *       Set result to player winning
    *    END IF
	*    Return game result
    * END gameResult
    **********************************************************/

	public String gameResult()
	{
		// Local constants

		// Local variables
		String gameResult = "";                   // Stores win, lose, or push
		int playerTotal = player.getHandTotal();  // Get player total
		int dealerTotal = dealer.getHandTotal();  // Get dealer total

		/*****************************/

		// IF( player hand value less than dealer hand value && dealer is not bust)
		if((playerTotal < dealerTotal) && !(isDealerBust()) )
		{
			// Set result to player losing
			gameResult = "<html><h1>LOSE!</h1></html>";
		}

		// ELSE IF( player hand value equals dealer hand value && dealer is not bust)
		else if ((playerTotal == dealerTotal) && !(isDealerBust()) )
		{
	      // Set result to player pushing
		  gameResult = "<html><h1>PUSH!</h1></html>";
		}

		// ELSE (player hand value > dealer hand value or dealer bust)
		else
		{
		  // Set result to player winning
		  gameResult = "<html><h1>WIN!</h1></html>";

		}//END IF

		//Return game result
		return gameResult;

	}//END gameResult

  /**********************************************************
    * Method Name        : advise
    * Author             : William Golembieski
    * Date               : May 05, 2018
    * Course/Section     : CSC264 - 801
    * Program Description: Fills array with best probable strategy
    *    based on dealer's first card and your current hand.
    *
    * BEGIN advice
    *    Initialize advice array
    *    Get dealer iterator
    *    Skip dealer first card
    *    Get dealer index from second card
    *    IF(player is not soft)
    *       IF(player is not split)
    *          set playerIndex top layer.getHandTotal() - 4
    *       END IF
    *    END IF
    *    IF(player is soft)
    *       IF(player is not split)
    *          set playerIndex top layer.getHandTotal() + 5
    *       END IF
    *    END IF
    *    IF(player is split)
    *       IF(player is not soft)
    *          set playerIndex top layer.getHandTotal() + 25
    *       END IF
    *    END IF
    * END advice
    **********************************************************/

	public String advice()
	{
		// Local constants
		final String HIT = "Hit";
		final String STAND = "Stand";
		final String DOUBLE = "Double";
		final String SURRENDER = "Surrender";
		final String SPLIT = "Split";

		// Local variables
		String[][] adviceArray = new String[10][37];
		String outputAdvice = "";
		int playerIndex = 0;
		int dealerIndex = 0;
		Iterator<Card> dealerIterator;

		/*************************************************/

		// Get dealer iterator
		dealerIterator = dealer.getIterator();

		// Skip the first card
		dealerIterator.next();

		// Get dealer index
		dealerIndex = dealerIterator.next().getTrueValue() - 2;


		  // Fill decision array
		  for(int i = 0; i < 10; i++)
		  {
			  for(int j = 0; j < 13; j++)
			  {
				  adviceArray[i][j] = HIT;
			  }
		  }

		  adviceArray[2][8] = STAND;
		  adviceArray[3][8] = STAND;
		  adviceArray[4][8] = STAND;

		  for(int i = 0; i < 5; i++)
		  {
			  for(int j = 9; j < 13; j++)
			  {
				  adviceArray[i][j] = STAND;
			  }
		  }

		  for(int i = 0; i < 10; i++)
		  {
			  for(int j = 13; j < 18; j++)
			  {
				  adviceArray[i][j] = STAND;
			  }
		  }

		  adviceArray[1][5] = DOUBLE;
		  adviceArray[2][5] = DOUBLE;
		  adviceArray[3][5] = DOUBLE;
		  adviceArray[4][5] = DOUBLE;

		  for(int i = 0; i < 8; i++)
		  {
			  for(int j = 6; j < 8; j++)
			  {
				  adviceArray[i][j] = DOUBLE;
			  }
		  }

		  adviceArray[8][7]  = DOUBLE;
		  adviceArray[8][11] = SURRENDER;
		  adviceArray[7][12] = SURRENDER;
		  adviceArray[8][12] = SURRENDER;
		  adviceArray[9][12] = SURRENDER;

		  for(int i = 0; i < 10; i++)
		  {
			  for(int j = 18; j < 24; j++)
			  {
				  adviceArray[i][j] = HIT;
			  }
		  }

		  for(int i = 0; i < 10; i++)
		  {
			  for(int j = 24; j < 27; j++)
			  {
				  adviceArray[i][j] = STAND;
			  }
		  }

		  adviceArray[0][23] = STAND;
		  adviceArray[5][23] = STAND;
		  adviceArray[6][23] = STAND;

		  for(int i = 2; i < 5; i++)
		  {
			  for(int j = 18; j < 23; j++)
			  {
				  adviceArray[i][j] = DOUBLE;
			  }
		  }

		  adviceArray[1][23] = DOUBLE;
		  adviceArray[2][22] = DOUBLE;
		  adviceArray[2][18] = HIT;
		  adviceArray[2][19] = HIT;

		  for(int i = 0; i < 10; i++)
		  {
			  for(int j = 27; j < 37; j++)
			  {
				  adviceArray[i][j] = SPLIT;
			  }
		  }

		  adviceArray[0][29] = HIT;
		  adviceArray[1][29] = HIT;
		  adviceArray[2][29] = HIT;
		  adviceArray[3][29] = HIT;
		  adviceArray[4][29] = HIT;
		  adviceArray[5][29] = HIT;
		  adviceArray[5][30] = HIT;
		  adviceArray[0][27] = HIT;
		  adviceArray[0][28] = HIT;
		  adviceArray[0][30] = HIT;
		  adviceArray[1][27] = HIT;
		  adviceArray[1][28] = HIT;

		  for(int i = 6; i < 10; i++)
		  {
			  for(int j = 27; j < 33; j++)
			  {
				  adviceArray[i][j] = HIT;
			  }
		  }

		  adviceArray[5][34] = STAND;
		  adviceArray[8][34] = STAND;
		  adviceArray[9][34] = STAND;

		  // IF(player is not soft)
		  if(!player.isSoft())
		  {
			  // IF(player is not split)
			  if(!player.isSplit())
			  {
				  // set playerIndex top layer.getHandTotal() - 4
				  playerIndex = player.getHandTotal() - 4;

			  }//END IF

		  }//END IF

		  // IF(player is soft)
		  else if(player.isSoft())
		  {
			  // IF(player is not split)
			  if(!player.isSplit())
			  {
				  // set playerIndex top layer.getHandTotal() + 5
				  playerIndex = player.getHandTotal() + 5;

			  }//END IF

		  }//END IF

		  // ELSE if player is split
		  else if(player.isSplit())
		  {
			  // IF(player is not soft)
			  if(!player.isSoft())
			  {
				  //set playerIndex top layer.getHandTotal() + 25
				  playerIndex = player.getHandTotal() + 25;

			  }//END IF

		  }//END IF

		  // Set outputAdvice
		  outputAdvice = adviceArray[dealerIndex][playerIndex];

		  // If output advise is double and the player can't double
		  if(outputAdvice.equals(DOUBLE) && player.getHandSize() > 2)
		  {
			  // Set output advice to hit
			  outputAdvice = HIT;

		  }//END IF

		  // If output advise is SPLIT and the player can't split
		  if(outputAdvice.equals(SPLIT) && player.getHandSize() > 2)
		  {
		     // if player hand is over 16
		     if(player.getHandTotal() > 16)
		     {
				 // Set output advice to STAND
				 outputAdvice = STAND;
			 }

			 // ELSE if the player has a hand total under 16
			 else
			 {
				 // Set output advice to HIT
				 outputAdvice = HIT;

			 }//END IF

		  }//END IF

		  // Return the value stored in the 2D advice array
		  return outputAdvice;

		}//END advice

}//end Blackjack
