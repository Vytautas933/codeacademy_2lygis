import java.util.ArrayList;
import java.util.Scanner;

public class TicTacToe {
	
	
	
	
	public static void main(String[] args) {
		
		String player = "X";
		String[][] board= { {"1", "2", "3"}, {"4", "5", "6"}, {"7", "8", "9"}};
		System.out.println("Game starts");
		printBoard(board);
		ArrayList <Integer> moveCoordinates = new ArrayList<>();
		boolean HaveWinner = false;
		
		
		
		for(int i = 0; i <9; i++) {
		
			moveCoordinates =enterMove();
			
			 boolean isMoveValid = validateMove(board,moveCoordinates.get(0), moveCoordinates.get(1));
			 while(!isMoveValid) {
				 System.out.println("Cell " + moveCoordinates.get(0)+ " " + moveCoordinates.get(1) + " is alredy taken");
					moveCoordinates = enterMove();
				 isMoveValid = validateMove(board, moveCoordinates.get(0), moveCoordinates.get(1));
			 }
			 
			makeMove(board, moveCoordinates.get(0), moveCoordinates.get(1), player);
			//player= player == "X" ? "O": "X";
			printBoard(board);
			if(checkWinner(board) != null) {
				System.out.println("Game is over: The winner is: " + player);
				HaveWinner = true;
				break;
			}
			
			if(player == "X") {
				player = "O";
			}else {
				player = "X";
			}
			
			
			
		}
		if(!HaveWinner) {
			System.out.println("It's a TIE");
		}
		
		

	}
	
	public static void printBoard(String[][] board) {
		
		
		System.out.println("|---|---|---|");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("| " + board[i][j] + " ");
            }
            System.out.println("|");
            System.out.println("|---|---|---|");
        }
	}
	
	public static String checkWinner(String [][] board) {
		
		String winner = null;
		
		if(board[0][0] == board[0][1] && board[0][0]==board[0][2]) {
			return board[0][0];
			
		}else if(board[1][0] == board[1][1] && board[1][0]==board[1][2]) {
			return board[1][0];
			
		}else if(board[2][0] == board[2][1] && board[0][0]==board[2][2]) {
			return board[2][0];
			
		}else if(board[0][0] == board[1][0] && board[0][0]==board[2][0]) {
			return board[0][0];
			
		}else if(board[0][1] == board[1][1] && board[0][1]==board[2][1]) {
			return board[0][1];
			
		}else if(board[0][2] == board[1][2] && board[0][2]==board[2][2]) {
			return board[0][2];
			
		}else if(board[0][0] == board[1][1] && board[0][0]==board[2][2]) {
			return board[0][0];
			
		}else if(board[2][0] == board[1][1] && board[2][0]==board[0][2]) {
			return board[2][0];

	
	
}
		return null;
	}
	
	public static void makeMove(String[][]board, int x, int y, String player) {
		
	
			board[x][y] = player;
		
		
		
	}
	
	public static boolean validateMove (String [][] board, int x, int y) {
		
		
		return board[x][y] != "X" && board[x][y] != "O";
	}
	
	public static ArrayList<Integer> enterMove(){
		
		ArrayList<Integer> coordinates = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter X coordinates");
		coordinates.add(sc.nextInt());
		 sc.nextLine();
		 System.out.println("Enter Y coordinates");
		 coordinates.add(sc.nextInt());
		 sc.nextLine();
		 return coordinates;
	}
	
}
