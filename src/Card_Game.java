import java.util.Scanner;


public class Card_Game {
	public static void main(String[] args)
	{
		
		Scanner input_scanner = new Scanner(System.in);
		int player_num = 0;
		do
		{
			System.out.println("How many players will be playing?");
			if(input_scanner.hasNextInt())
			{				
				player_num=input_scanner.nextInt();
				if(player_num < 5 && player_num > 0)
					break;
				else
					System.out.println("This game can only be played by 1-4 people");
			}
			else
			{
				input_scanner.next();
				System.out.println("This is not an integer" + player_num);	
			}
		}while(true);
		
		//If only one player, computer will be the second player
		if(player_num == 1)
			player_num++;
		
		Player[] players = new Player[player_num];
		
		for(int i = 0; i < player_num; i++)
		{
			players[i] = new Player();
		}
		
		Deck deck = new Deck();
		deck.Cut((int)Math.random()*51);
		deck.Shuffle();
		
		//Deal hands
		for(int k = 0;k < 7; k ++)
		{
			for(int i = 0; i < player_num; i++)
			{
				players[i].getCard(k, deck.Deal());
			}
		}
		
		boolean gameWon = false;
		int player_turn = 0;
		while(!gameWon)
		{
			//Game Logic to be implemented
		}
		
		
		for(int i = 0; i < player_num; i++)
		{
			players[i].printHand();
		}
		
		input_scanner.close();
	}
}