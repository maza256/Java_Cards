import java.util.Collections;
import java.util.List;


public class Deck
{
	private static String[] Suit = {"CLUB", "SPADE", "DIAMOND", "HEART"};
	private static String[] Value = {"ACE", "TWO", "THREE", "FOUR", "FIVE", "SIX", "SEVEN", "EIGHT", "NINE", "TEN", "JACK", "QUEEN", "KING"};
	
	private static Card[] deck;
	
	private static int pointer = 0;
	
	public Deck()
	{
		deck = new Card[52];// = new Card[52];
		int count = 0;
		for(int i = 0; i < 4; i++)
		{
			for(int k = 0; k < 13; k++)
			{
				deck[count++] = new Card(i, k);
			}
		}
	}
	
	public Card Deal()
	{
		return deck[pointer++];
	}
	
	public void Cut(int position)
	{
		position = 12;
		Card[] temp = new Card[52];
		int count = position;
		int temp_position = 0;
		while(count != 52)
		{
			temp[temp_position++] = new Card(deck[count].get_card_suit(), deck[count].get_card_val());
			count++;
		}
		count = 0;
		while(count != position)
		{
			temp[temp_position++] = new Card(deck[count].get_card_suit(), deck[count].get_card_val());
			count++;
		}
		count = 0;
		while(count != 52)
		{
			deck[count] = temp[count];
			count++;
		}
	}
		
	public void Shuffle()
	{
		Card temp;
		for(int k = 0; k < 52; k++)
		{
			for(int i = 0; i < 52; i++)
			{
				int random = (int) (Math.random()*51);
				temp = deck[random];
				deck[random] = deck[i];
				deck[i] = temp;
			}
		}
	}
	
	public void print_cards()
	{
		int count = 0;
		while(count != 52)
		{
			System.out.println(count + ":" + Suit[deck[count].get_card_suit()] + " " + Value[deck[count].get_card_val()]);
			count++;
		}
	}

}
