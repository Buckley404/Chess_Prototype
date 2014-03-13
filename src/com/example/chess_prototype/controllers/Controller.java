package com.example.chess_prototype.controllers;

import java.util.ArrayList;

import com.example.chess_prototype.models.Piece;

public class Controller {

	public ArrayList<Piece> pieces = new ArrayList<Piece>();
	public String[] img = {"White_Rook", "White_Bishop", "White_Knight", 
			"White_Queen", "White_King", "White_Pawn","Black_Rook", "Black_Bishop",
			"Black_Knight", "Black_Queen", "Black_King", "Black_Pawn"};//change to r.id.pics

	public Controller(){

	}

	public void populateBoard(){
		/*
		 * The following function populates the board with
		 * generic 'pieces', they are given only team and x,y positions
		 * the i for loop is for populating both 'sides' pieces
		 * the y loop is for y co-ordinates
		 * the x loop is for x co-ordinates
		 */

		Piece piece;
		int y = 1;
		int x = 1;
		int team = 0;

		for(int i = 0 ; i < 2 ; i++){

			for(y = 1 ; y <= 2 ; y++){

				for(x = 1 ; x <= 8 ; x++){
					piece = new Piece(x,y);
					piece.setTeam(team);
					pieces.add(piece);
				}

			}

			x = 1;//reset co-ordinates for far side of board
			y = 7;
			team = 1;//second iteration, so we are populating the black pieces
		}


	}

	public void initialisePieces(){

		int j = 0;
		/*
		 * The following code  iterates through the objects list and
		 * assigns them with the correct image from the image bank
		 */
		for(int i = 0 ; i < 32 ; i++){
			pieces.get(i).setImageId(img[j]);

			if(i < 5) j++;
			if(i >= 5 && i < 9) j--;
			if(i >= 9 && i < 17) j = 5;
			if(i == 17) j = 7;
			if(i > 17 && i < 22) j++;
			if(i >= 22 && i < 26) j--;
			if(i >= 26) j = 11;

		}

	}

}

