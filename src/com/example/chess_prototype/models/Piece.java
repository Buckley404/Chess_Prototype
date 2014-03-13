package com.example.chess_prototype.models;

public class Piece {
	/*TODO:
	 * imageId needs to become int[]
	 * it is string just for test purposes
	 */
	private int x,y,team;
	private String imageId;
	private boolean myTurn;
	private boolean alive = true;
	private boolean moved = false;
	private int[] positions;
	
	public Piece(int startX, int startY){
		
		x = startX;
		y = startY;
		
	}
	
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	public String getImageId() {//TODO change
		return imageId;
	}
	public void setImageId(String imageId) {//TODO change
		this.imageId = imageId;
	}
	public int getTeam() {
		return team;
	}
	public void setTeam(int team) {
		this.team = team;
	}
	public boolean isAlive() {
		return alive;
	}
	public void setAlive(boolean alive) {
		this.alive = alive;
	}
	public boolean isMoved() {
		return moved;
	}
	public void setMoved(boolean moved) {
		this.moved = moved;
	}
	public boolean isMyTurn() {
		return myTurn;
	}
	public void setMyTurn(boolean myTurn) {
		this.myTurn = myTurn;
	}
	public int[] getPositions() {
		return positions;
	}
	public void setPositions(int[] positions) {
		this.positions = positions;
	}
	
}
