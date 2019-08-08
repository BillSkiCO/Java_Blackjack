/**********************************************************
 * Program Name       : Assignment - Blackjack Final Project
 * Author             : William Golembieski
 * Date               : May 05, 2018
 * Course/Section     : CSC264 - 801
 * Program Description: This program will implement the game of blackjack
 **********************************************************/

import javax.swing.*;
import java.util.*;

/**********************************************************
 * Class Name     : Card
 * Author         : William Golembieski
 * Date           : May 05, 2018
 * Course/Section : CSC264 - 801
 * Program Description: This program will implement the game of blackjack
 *
 * Methods:
 * -------
 * Card           - Constructor for a new card object that is empty
 * Card           - Constructor for a new card object with input values
 * getFaceValue   - Returns the face value of the card
 * getTrueValue   - Returns the true value of the card
 * setTrueValue   - Sets the true value of the card
 * getSuit        - Returns the suit of the card
 * getCardPicture - Returns the picture of the card
 * toString       - Returns the string representation of the card
 **********************************************************/

public class Card {

   // Class constants

   // Class variables
   private String faceValue;   // Face value of the card (because ace can be 10 or 1)
   private int trueValue;      // True value of card
   private String suit;        // Suit of the card
   private ImageIcon picture;  // Picture of the card

/**********************************************************
 * Method Name    : Card
 * Author         : William Golembieski
 * Date           : May 05, 2018
 * Course/Section : CSC264 - 801
 * Program Description: This method will serve as a constructor for an empty card.
 *    Will use this constructor when we are creating a new card of unknown values.
 *
 * BEGIN Card
 *   Set face value to null
 *   Set true value to 0
 *   Set suit to null
 *   Set picture to null
 * END Card
 **********************************************************/

  public Card()
  {
	// Local constants

	// Local variables

	/************ Start Card Method *****************/

	// Set face value to null
	faceValue = null;

	// Set true value to 0
	trueValue = 0;

	// Set suit to null
	suit = null;

	// Set picture to null
	picture = null;

  }//END Card method

/**********************************************************
 * Method Name    : Card
 * Author         : William Golembieski
 * Date           : May 05, 2018
 * Course/Section : CSC264 - 801
 * Program Description: This method will serve as a constructor for a card with values
 *
 * BEGIN Card
 *   Set face value
 *   Set true value
 *   Set suit
 *   Set picture
 * END Card
 **********************************************************/
  public Card(String inFaceValue, int inTrueValue, String inSuit, ImageIcon inPicture)
  {
	// Local constants

	// Local variables

	/************ Start Card Method *****************/

	// Set face value
	faceValue = inFaceValue;

	// Set true value
	trueValue = inTrueValue;

	// Set suit
	suit = inSuit;

	// Set picture
	picture = inPicture;

  }//END Card

/**********************************************************
 * Method Name    : getFaceValue
 * Author         : William Golembieski
 * Date           : May 05, 2018
 * Course/Section : CSC264 - 801
 * Program Description: This method will return the face value of
 *    the card.
 *
 * BEGIN getFaceValue
 *   Return face value
 * END getFaceValue
 **********************************************************/

  public String getFaceValue()
  {
	// Local constants

	// Local variables

	/************ Start getFaceValue Method ***************/

	// Return face value
    return faceValue;

  }//END getFaceValue

/**********************************************************
 * Method Name    : getTrueValue
 * Author         : William Golembieski
 * Date           : May 05, 2018
 * Course/Section : CSC264 - 801
 * Program Description: This method will return the true value of
 *    the card.
 *
 * BEGIN getTrueValue
 *   Return true value
 * END getTrueValue
 **********************************************************/

  public int getTrueValue()
  {
	// Local constants

	// Local variables

	/************ Start getTrueValue Method ***************/

     // Return true value
     return trueValue;

  }// END getTrueValue

/**********************************************************
 * Method Name    : setTrueValue
 * Author         : William Golembieski
 * Date           : May 05, 2018
 * Course/Section : CSC264 - 801
 * Program Description: This method will allow for setting of
 *    the actual value of the card. Used for modifying an ace
 *    between 10 and 1 values.
 *
 * BEGIN setTrueValue
 *   Set true value of card
 * END setTrueValue
 **********************************************************/

  public void setTrueValue(int newValue)
  {
	// Local constants

	// Local variables

	/************ Start setTrueValue Method ***************/

	// Set true value of card
    trueValue = newValue;

  }//END setTrueValue

/**********************************************************
 * Method Name    : getSuit
 * Author         : William Golembieski
 * Date           : May 05, 2018
 * Course/Section : CSC264 - 801
 * Program Description: This method will return the suit of
 *    the card.
 *
 * BEGIN getSuit
 *   Return suit of card
 * END getSuit
 **********************************************************/

  public String getSuit()
  {
	// Local constants

	// Local variables

	/************** Start getSuit Method *****************/

	// Return suit of card
    return suit;

  }//END getSuit

/**********************************************************
 * Method Name    : getCardPicture
 * Author         : William Golembieski
 * Date           : May 05, 2018
 * Course/Section : CSC264 - 801
 * Program Description: This method will return the card picture

 * BEGIN getCardPicture
 *   Return card picture
 * END getCardPicture
 **********************************************************/

  public ImageIcon getCardPicture()
  {
	// Local constants

	// Local variables

	/************** Start getCardPicture Method *****************/

     // Return card picture
     return picture;

  }//END getCardPicture

/**********************************************************
 * Method Name    : toString
 * Author         : William Golembieski
 * Date           : May 05, 2018
 * Course/Section : CSC264 - 801
 * Program Description: This method will return the string
 *    representation of the card
 *
 * BEGIN toString
 *   Add face value to output string
 *   Add suit to output string
 *   Add trueValue to output string
 *   Return output string
 * END toString
 **********************************************************/
  public String toString()
  {
	// Local constants

	// Local variables
	String outputString = "";

	/************** Start getCardPicture Method *****************/

	// Add face value to output string
	outputString += "FaceValue: " + faceValue + " | ";

	// Add suit to output string
	outputString += "Suit : " + suit + " | ";

	// Add trueValue to output string
	outputString += " TrueValue :" + trueValue;

	// Return output string
    return outputString;

  }//END toString

}//END Card class
