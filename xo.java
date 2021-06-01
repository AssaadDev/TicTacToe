package tictactoe;

import java.util.Scanner;

public class xo {

	public static void main(String[] args) {

		
		String p1,p2;
		Scanner scn = new Scanner(System.in);
		
		System.out.print("Player 1 enter your name: ");
		p1 = scn.nextLine();
		System.out.print("Player 2 enter your name: ");
		p2 = scn.nextLine();
		
		
		System.out.println("Rules are simple, pick number from 1-9 that are avilabe, \nwinner is the first who gets 2 wins, good luck!\n");
		int i,x= 0,o= 0,j,k,posX,posO,p1w=0,p2w=0;
		int games = 0;
		String[][] arr = {{"1","2","3"},{"4","5","6"},{"7","8","9"}};
		

		System.out.println(" "+" "+arr[0][0]+" "+"|"+" "+arr[0][1]+" "+"|"+" "+arr[0][2]+" "+" ");
		System.out.println(" "+"-"+"-"+"-"+"-"+"-"+"-"+"-"+"-"+"-"+"-"+"-"+" ");
		System.out.println(" "+" "+arr[1][0]+" "+"|"+" "+arr[1][1]+" "+"|"+" "+arr[1][2]+" "+" ");
		System.out.println(" "+"-"+"-"+"-"+"-"+"-"+"-"+"-"+"-"+"-"+"-"+"-"+" ");
		System.out.println(" "+" "+arr[2][0]+" "+"|"+" "+arr[2][1]+" "+"|"+" "+arr[2][2]+" "+" ");
		
		while(games<2) {
			String[][] game = {{"1","2","3"},{"4","5","6"},{"7","8","9"}};
		for(i=0;i<9;i++) {
			boolean cond=true;
			if(x==o) {
				System.out.println(p1+" chose the number ");
				posX = scn.nextInt();
				x++;
				
				while(cond){
				for(j=0;j<3;j++) {
					for(k=0;k<3;k++) {
						if(posX == Integer.parseInt(arr[j][k])) {
							if(game[j][k] != "X" && game[j][k] !="O") {
								game[j][k] = "X";
								cond=false;
							}else {
								System.out.println("SPACE NOT AVILABLE, PICK ONLY AVILABE SPACES!");
								System.out.print(p1+" chose the number ");
								posX = scn.nextInt();
							}
						}
					}
				}
				}
				cond=true;
				
				System.out.println("\n\n");
				System.out.println(" "+" "+game[0][0]+" "+"|"+" "+game[0][1]+" "+"|"+" "+game[0][2]+" "+" ");
				System.out.println(" "+"-"+"-"+"-"+"-"+"-"+"-"+"-"+"-"+"-"+"-"+"-"+" ");
				System.out.println(" "+" "+game[1][0]+" "+"|"+" "+game[1][1]+" "+"|"+" "+game[1][2]+" "+" ");
				System.out.println(" "+"-"+"-"+"-"+"-"+"-"+"-"+"-"+"-"+"-"+"-"+"-"+" ");
				System.out.println(" "+" "+game[2][0]+" "+"|"+" "+game[2][1]+" "+"|"+" "+game[2][2]+" "+" \n");
				
				if(x>2) {
					if(("X" == game[0][0] && "X" == game[0][1] && "X" == game[0][2])||("X" == game[1][0] && "X" == game[1][1] && "X" == game[1][2])||("X" == game[2][0] && "X" == game[2][1] && "X" == game[2][2])) {
						p1w++;
						System.out.println(p1+" won!\n"+p1+": "+p1w+" | "+p2+": "+p2w);
						
						break;
					}
					if(("X" == game[0][0] && "X" == game[1][0] && "X" == game[2][0])||("X" == game[0][1] && "X" == game[1][1] && "X" == game[2][1])||("X" == game[0][2] && "X" == game[1][2] && "X" == game[2][2])) {
						p1w++;
						System.out.println(p1+" won!\n"+p1+": "+p1w+" | "+p2+": "+p2w);
						break;
					}
					if(("X" == game[0][0] && "X" == game[1][1] && "X" == game[2][2])||("X" == game[2][0] && "X" == game[1][1] && "X" == game[0][2])) {
						p1w++;
						System.out.println(p1+" won!\n"+p1+": "+p1w+" | "+p2+": "+p2w);
						break;
					}
				}				
			}
			if(x>o) {
				System.out.println(p2+" chose the number ");
				posO = scn.nextInt();
				o++;
				
				while(cond){
				for(j=0;j<3;j++) {
					for(k=0;k<3;k++) {
						if(posO == Integer.parseInt(arr[j][k])) {
							if(game[j][k] != "X" && game[j][k] !="O") {
								game[j][k] = "O";
								cond=false;
							}else {
								System.out.println("SPACE NOT AVILABLE, PICK ONLY AVILABE SPACES!");
								System.out.print(p2+" chose the number ");
								posO = scn.nextInt();
							}
						}
					}
				}
				}
				cond=true;
				
				System.out.println("\n\n");
				System.out.println(" "+" "+game[0][0]+" "+"|"+" "+game[0][1]+" "+"|"+" "+game[0][2]+" "+" ");
				System.out.println(" "+"-"+"-"+"-"+"-"+"-"+"-"+"-"+"-"+"-"+"-"+"-"+" ");
				System.out.println(" "+" "+game[1][0]+" "+"|"+" "+game[1][1]+" "+"|"+" "+game[1][2]+" "+" ");
				System.out.println(" "+"-"+"-"+"-"+"-"+"-"+"-"+"-"+"-"+"-"+"-"+"-"+" ");
				System.out.println(" "+" "+game[2][0]+" "+"|"+" "+game[2][1]+" "+"|"+" "+game[2][2]+" "+" \n");
				
				if(o>2) {
					if(("O" == game[0][0] && "O" == game[0][1] && "O" == game[0][2])||("O" == game[1][0] && "O" == game[1][1] && "O" == game[1][2])||("O" == game[2][0] && "O" == game[2][1] && "O" == game[2][2])) {
						p2w++;
						System.out.println(p2+" won!\n"+p1+": "+p1w+" | "+p2+": "+p2w);
						break;
					}
					if(("O" == game[0][0] && "O" == game[1][0] && "O" == game[2][0])||("O" == game[0][1] && "O" == game[1][1] && "O" == game[2][1])||("O" == game[0][2] && "O" == game[1][2] && "O" == game[2][2])) {
						p2w++;
						System.out.println(p2+" won!\n"+p1+": "+p1w+" | "+p2+": "+p2w);
						break;
					}
					if(("O" == game[0][0] && "O" == game[1][1] && "O" == game[2][2])||("O" == game[2][0] && "O" == game[1][1] && "O" == game[0][2])) {
						p2w++;
						System.out.println(p2+" won!\n"+p1+": "+p1w+" | "+p2+": "+p2w);
						break;
					}
				}
			}
			
			
		}
		games++;
		}
		scn.close();
			if(p1w == 2) {
				System.out.println(p1+" has won the game! "+p2+" better luck next time :)");
			}
			if(p2w == 2) {
				System.out.println(p2+" has won the game! "+p1+" better luck next time :)");
			}

	}

}
