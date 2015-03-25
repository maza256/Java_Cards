
public class Card 
{
	
	public Card(int s, int v)
	{
		suit = s;
		value = v;
	}
	
	public int get_card_val()
	{
		return value;
	}
	
	public int get_card_suit()
	{
		return suit;
	}
	
	private int suit;
	private int value;
	
}
