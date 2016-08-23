package com.epam.hujj.tamasknizner.springhomework.domain;

public class Player extends Person {

	private PlayerRole playerRole;
	
	public Player(final String name, final PlayerRole playerRole) {
		super(name, Role.PLAYER);
		this.playerRole = playerRole;
	}
	
	public PlayerRole getPlayerRole() {
		return playerRole;
	}

	public void setPlayerRole(PlayerRole playerRole) {
		this.playerRole = playerRole;
	}
	
	

	@Override
	public String toString() {
		return "Player [name=" + name + " playerRole=" + playerRole + "]";
	}

	@Override
	public String doMyJob() {
		// TODO Auto-generated method stub
		return null;
	}

}
