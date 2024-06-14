package com.practice.src;

import java.util.ArrayList;
import java.util.List;

public class BoardTest {

	public static void main(String[] args) {
		Board board=new Board();
		Player player1=new Player(1,"Sameer", 0);
		Player player2=new Player(2,"null", 0);
		List<Player> list=new ArrayList();
		list.add(player1);
		list.add(player2);
		board.loadPlayers(list);
		while(!board.players.isEmpty()) {
			board.diceRolls();	
		}
		
	}
}
