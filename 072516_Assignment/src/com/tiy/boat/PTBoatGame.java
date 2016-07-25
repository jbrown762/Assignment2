package com.tiy.boat;

public class PTBoatGame
{
	private PTBoat[] ptBoats;
	private int numberOfBoats = 0;
	private int guesses = 0;

	public PTBoatGame()
	{
		ptBoats = new PTBoat[6];
	}

	public void addBoat(String row, int column)
	{
		ptBoats[numberOfBoats] = new PTBoat(row, column);
		numberOfBoats++;
		
		// Add a new boat to the ptBoats array

		// You will need to use the numberOfBoats
		// value to tell you what element of the
		// array to initialize

		// remember to increment the numberOfBoats
		// before you leave
	}

	public boolean guess(String row, int column)
	{
		// Check to see if the guess hit any of the ships.
		// Return true only if a ship was hit
		guesses++;

		for (int i = 0; i < ptBoats.length; i++)
		{
			if (ptBoats[i].isHit(row, column))
			{
				System.out.println("Guess #" + guesses + " at (row " + row + ", column " + column + ") hit a PTBoat.");
				return true;
			}
		}

		System.out.println("Guess #" + guesses + " missed.");
		return false;
	}

	public static void main(String[] args)
	{
		// Create a PTBoatGame instance
		PTBoatGame game = new PTBoatGame();

		// Add 6 PTBoats
		game.addBoat("A", 4);
		game.addBoat("B", 1);
		game.addBoat("E", 5);
		game.addBoat("C", 4);
		game.addBoat("A", 7);
		game.addBoat("D", 12);

		game.guess("B", 1);
		game.guess("A", 4);
		game.guess("D", 1);
		game.guess("E", 2);
		game.guess("G", 9);
		game.guess("D", 12);


		// Take six guesses and output the +following string for each
		// If the guess hit a pt boat...
		// Guess number # at row <row>, column <column> hit a PTBoat

		// If the guess missed all boats
		// Guess number # missed

	}
}
