/**********************************************************
 * Program Name       : Assignment - Blackjack Final Project
 * Author             : William Golembieski
 * Date               : May 05, 2018
 * Course/Section     : CSC264 - 801
 * Program Description: This program will implement the game of blackjack
 **********************************************************/

import java.util.ArrayList;
import javax.swing.ImageIcon;

/**********************************************************
 * Class Name         : Deck
 * Author             : William Golembieski
 * Date               : May 05, 2018
 * Course/Section     : CSC264 - 801
 * Class Description  : This class will represent a sorted deck in blackjack
 *
 * Methods:
 * ---------
 * Deck - Serves as the constructor for the Deck object
 **********************************************************/

public class Deck extends ArrayList
{
	// Class constants

	// Class variables

   /**********************************************************
    * Method Name        : Deck
    * Author             : William Golembieski
    * Date               : May 05, 2018
    * Course/Section     : CSC264 - 801
    * Program Description: This method will serve as the constructor
    *    of a Deck object.
    *
    * BEGIN Deck
    *    Create all spade cards
    *    Create all hearts cards
    *    Create all diamonds cards
    *    Create all clubs cards
    *    Add all spade cards
    *    Add all hearts cards
    *    Add all diamonds cards
    *    Add all clubs cards
    * END Deck
    **********************************************************/

   public Deck()
   {
	    // Local Constants

	    // Local variables

	    /*************************************************/

        // Create all spades
        ImageIcon card1 = new ImageIcon("2s.jpg");
        Card twos = new Card("Two", 2, "spade", card1);

		ImageIcon card2 = new ImageIcon("3s.jpg");
		Card threes = new Card("Three", 3,"spade", card2);

		ImageIcon card3 = new ImageIcon("4s.jpg");
		Card fours = new Card("Four", 4, "spade", card3);

		ImageIcon card4 = new ImageIcon("5s.jpg");
		Card fives = new Card("Five", 5, "spade", card4);

		ImageIcon card5 = new ImageIcon("6s.jpg");
		Card sixs = new Card("Six", 6, "spade", card5);

		ImageIcon card6 = new ImageIcon("7s.jpg");
		Card sevens = new Card("Seven", 7, "spade" , card6);

		ImageIcon card7 = new ImageIcon("8s.jpg");
		Card eights = new Card("Eight", 8, "spade", card7);

		ImageIcon card8 = new ImageIcon("9s.jpg");
		Card nines = new Card("Nine", 9,"spade", card8);

		ImageIcon card9 = new ImageIcon("10s.jpg");
		Card tens = new Card("Ten", 10,"spade", card9);

		ImageIcon card10 = new ImageIcon("jacks.jpg");
		Card jacks = new Card("Jack", 10, "spade", card10);

		ImageIcon card11 = new ImageIcon("queens.jpg");
		Card queens = new Card("Queen", 10,"spade", card11);

		ImageIcon card12 = new ImageIcon("kings.jpg");
		Card kings = new Card("King", 10, "spade", card12);

		ImageIcon card13 = new ImageIcon("aces.jpg");
		Card aces = new Card("Ace", 11, "spade", card13);

	    // Create all hearts
		ImageIcon card14 = new ImageIcon("2h.jpg");
		Card twoh = new Card("Two", 2,"heart", card14);

		ImageIcon card15 = new ImageIcon("3h.jpg");
		Card threeh = new Card("Three", 3, "heart",card15);

		ImageIcon card16 = new ImageIcon("4h.jpg");
		Card fourh = new Card("Four", 4, "heart", card16);

		ImageIcon card17 = new ImageIcon("5h.jpg");
		Card fiveh = new Card("Five", 5,"heart", card17);

		ImageIcon card18 = new ImageIcon("6h.jpg");
		Card sixh = new Card("Six", 6,"heart", card18);

		ImageIcon card19 = new ImageIcon("7h.jpg");
		Card sevenh = new Card("Seven", 7,"heart", card19);

		ImageIcon card20 = new ImageIcon("8h.jpg");
		Card eighth = new Card("Eight", 8,"heart", card20);

		ImageIcon card21 = new ImageIcon("9h.jpg");
		Card nineh = new Card("Nine", 9, "heart", card21);

		ImageIcon card22 = new ImageIcon("10h.jpg");
		Card tenh = new Card("Ten", 10,"heart", card22);

		ImageIcon card23 = new ImageIcon("jackh.jpg");
		Card jackh = new Card("Jack", 10, "heart", card23);

		ImageIcon card24 = new ImageIcon("queenh.jpg");
		Card queenh = new Card("Queen", 10,"heart", card24);

		ImageIcon card25 = new ImageIcon("kingh.jpg");
		Card kingh = new Card("King", 10,"heart", card25);

		ImageIcon card26 = new ImageIcon("aceh.jpg");
		Card aceh = new Card("Ace", 11, "heart", card26);

	    // Create all diamonds
		ImageIcon card27 = new ImageIcon("2d.jpg");
		Card twod = new Card("Two", 2,"diamond", card27);

		ImageIcon card28 = new ImageIcon("3d.jpg");
		Card threed = new Card("Three", 3,"diamond", card28);

		ImageIcon card29 = new ImageIcon("4d.jpg");
		Card fourd = new Card("Four", 4,"diamond", card29);

		ImageIcon card30 = new ImageIcon("5d.jpg");
		Card fived = new Card("Five", 5,"diamond", card30);

		ImageIcon card31 = new ImageIcon("6d.jpg");
		Card sixd = new Card("Six", 6, "diamond", card31);

		ImageIcon card32 = new ImageIcon("7d.jpg");
		Card sevend = new Card("Seven", 7,"diamond", card32);

		ImageIcon card33 = new ImageIcon("8d.jpg");
		Card eightd = new Card("Eight", 8, "diamond", card33);

		ImageIcon card34 = new ImageIcon("9d.jpg");
		Card nined = new Card("Nine", 9, "diamond", card34);

		ImageIcon card35 = new ImageIcon("10d.jpg");
		Card tend = new Card("Ten", 10, "diamond", card35);

		ImageIcon card36 = new ImageIcon("jackd.jpg");
		Card jackd = new Card("Jack", 10, "diamond", card36);

		ImageIcon card37 = new ImageIcon("queend.jpg");
		Card queend = new Card("Queen", 10, "diamond", card37);

		ImageIcon card38 = new ImageIcon("kingd.jpg");
		Card kingd = new Card("King", 10,"diamond", card38);

		ImageIcon card39 = new ImageIcon("aced.jpg");
		Card aced = new Card("Ace", 11,"diamond", card39);

	    // Create all clubs
		ImageIcon card40 = new ImageIcon("2c.jpg");
		Card twoc = new Card("Two", 2,"club", card40);

		ImageIcon card41 = new ImageIcon("3c.jpg");
		Card threec = new Card("Three", 3,"club", card41);

		ImageIcon card42 = new ImageIcon("4c.jpg");
		Card fourc = new Card("Four", 4,"club", card42);

		ImageIcon card43= new ImageIcon("5c.jpg");
		Card fivec = new Card("Five", 5,"club", card43);

		ImageIcon card44 = new ImageIcon("6c.jpg");
		Card sixc = new Card("Six", 6,"club", card44);

		ImageIcon card45 = new ImageIcon("7c.jpg");
		Card sevenc = new Card("Seven", 7,"club", card45);

		ImageIcon card46 = new ImageIcon("8c.jpg");
		Card eightc = new Card("Eight", 8,"club", card46);

		ImageIcon card47 = new ImageIcon("9c.jpg");
		Card ninec = new Card("Nine", 9,"club", card47);

		ImageIcon card48 = new ImageIcon("10c.jpg");
		Card tenc = new Card("Ten", 10,"club", card48);

		ImageIcon card49 = new ImageIcon("jackc.jpg");
		Card jackc = new Card("Jack", 10,"club", card49);

		ImageIcon card50 = new ImageIcon("queenc.jpg");
		Card queenc = new Card("Queen", 10,"club", card50);

		ImageIcon card51 = new ImageIcon("kingc.jpg");
		Card kingc = new Card("King", 10,"club", card51);

		ImageIcon card52 = new ImageIcon("acec.jpg");
		Card acec = new Card("Ace", 11,"club", card52);

        // Add spades to deck
		add(twos);
		add(threes);
		add(fours);
		add(fives);
		add(sixs);
		add(sevens);
		add(eights);
		add(nines);
		add(tens);
		add(jacks);
		add(queens);
		add(kings);
		add(aces);

        // Add hearts to deck
		add(twoh);
		add(threeh);
		add(fourh);
		add(fiveh);
		add(sixh);
		add(sevenh);
		add(eighth);
		add(nineh);
		add(tenh);
		add(jackh);
		add(queenh);
		add(kingh);
		add(aceh);

        // Add diamonds to deck
		add(twod);
		add(threed);
		add(fourd);
		add(fived);
		add(sixd);
		add(sevend);
		add(eightd);
		add(nined);
		add(tend);
		add(jackd);
		add(queend);
		add(kingd);
		add(aced);

        // Add clubs to deck
		add(twoc);
		add(threec);
		add(fourc);
		add(fivec);
		add(sixc);
		add(sevenc);
		add(eightc);
		add(ninec);
		add(tenc);
		add(jackc);
		add(queenc);
		add(kingc);
		add(acec);

  }//END Deck method

}//END Deck class