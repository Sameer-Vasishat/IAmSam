package com.practice.src;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Board {

	Queue<Player> players;
	int[][] board;
	Dice dice;
	HashMap<Integer,Jump> jumps;
	
	public Board() {
		System.out.println("Generating board");
		this.players=new LinkedList();
		this.board=new int[10][10];
		this.dice=new Dice(1,6,1);
		this.jumps=new HashMap();
		jumps.put(30,new Jump(30,2));
		jumps.put(12,new Jump(12,25));
		jumps.put(24,new Jump(24,19));
		jumps.put(35,new Jump(35,11));
		jumps.put(3,new Jump(3,45));
		jumps.put(22,new Jump(22,76));
		jumps.put(45,new Jump(45,70));
		jumps.put(8,new Jump(8,88));
		
	}
	public void diceRolls() {
		
		int movement=dice.rollDice(dice);
		Player player=this.players.poll();
		System.out.println("Player "+player.getName()+" rolled "+movement);
		player.setCurrPos(player.getCurrPos()+movement);
		
		CheckForSnakeLadders(player);
		System.out.println("Player "+player.getName()+" final place "+player.getCurrPos());
		if(CheckForWinner(player)) players.remove();
		else
		players.offer(player);
	}
	private Boolean CheckForWinner(Player player) {
		if(player.getCurrPos()>=100) {
			System.out.println("Found Winner "+ player.getName() );
		}
		return player.getCurrPos()>=100;
	}
	private void CheckForSnakeLadders(Player player) {
		if(jumps.containsKey(player.getCurrPos())) {
			Jump currJump=jumps.get(player.getCurrPos());
			if(currJump.getEnd()<currJump.getStart()) {
				System.out.println("Found Snake from "+ currJump.getStart()+"to "+currJump.getEnd());
			}
			else
				System.out.println("Found Ladder from "+ currJump.getStart()+"to "+currJump.getEnd());
			player.setCurrPos(currJump.getEnd());
		}
		
	}
	public void loadPlayers(List<Player> playerList){
		for(Player player:playerList) {
			this.players.offer(player);
		}
		
	}
}
