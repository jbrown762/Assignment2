package com.tiy.boat;

public class PTBoat
{
	private String row;
	private int column;

	// Provide a constructor
	public PTBoat(String row, int column)
	{
		this.row = row;
		this.column = column;
	}

	public boolean isHit(String row, int column)
	{
		if (this.row.equals(row) && this.column == column)
			return true;
		
		return false;
	}
}
