
public class Player {

	boolean run;
	boolean threes;
	Card[] hand;
	
	public Player()
	{
		hand = new Card[7];
	}
	
	//Function that accepts a card into the hand
	public void getCard(int Card_position, Card card)
	{
		hand[Card_position] = new Card(card.get_card_suit(), card.get_card_val());
	}
	
	public void swapCard()
	{
		
	}
	
	public void printHand()
	{
		for(int i = 0; i < 7; i++)
		{
			System.out.print(hand[i].get_card_suit() + ", " + hand[i].get_card_val() + "\t");
			System.out.println();
		}
	}
}
