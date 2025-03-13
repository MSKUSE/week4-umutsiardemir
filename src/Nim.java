
/**
 * A simple Nim game implementation in Java.
 */
public class Nim {
    /**
     import jdk.incubator.foreign.CLinker;

     /**
     * A simple Tic-Tac-Toe game implementation in Java.
     */
    public class TicTacToe {

        /**
         * The main method to run the Tic-Tac-Toe game.
         *
         * @param args Command line arguments (not used).
         */
        public static void main(String[] args) {
            // TODO: Initialize the game board and scanner
            char[][] board = {
                    {' ', ' ', ' '},
                    {' ', ' ', ' '},
                    {' ', ' ', ' '}};

            printBoard(board);
            int validMoves = 0;
            boolean gameEnded = false;
            int player = 0;
            while (!gameEnded){
                System.out.println("player"+
                        (player +1) " enter your row number");
                int row = reader.nextInt();
                System.out.println("Player "+
                        (player +1) + " enter your column number:");
                int col = reader.nextInt();
                if(isValid(row,col) && board[row-1][col-1] == ' ')
                    board[row -1][col -1] = player == 0 ? 'X' : 'O';
                printBoard(board);
                player = ++player % 2;
                validMoves++;
            }else {
                System.out.println("Please provide another coordinates");
            }
            gameEnded = validMoves == 9 || checkboard(board,row-1,col-1)


        }


        /**
         * Checks if the current player has won the game.
         *
         * @param board The game board.
         * @param row   The row of the last move.
         * @param col   The column of the last move.
         * @return True if the current player has won, false otherwise.
         */
        public static boolean checkboard(char[][] board, int row, int col) {
            char symbol = board[row][col];
            boolean win = true;
            for (int i = 0; i < 3; i++) {
                if(board[row][i] != symbol){
                    win = false;
                    break;
                }


            }
            if(win){
                return true;
            }
            for (int i = 0; i < 3; i++) {
                if(board[i][col] != symbol){
                    win = false;
                    break;
                }
                if(win){
                    return true;
                }
                if(row == col){
                    win = true;
                    for (int j = 0; j < 3; j++) {
                        if(board[j][j] != symbol){
                            win = false;
                            break;
                        }

                    }
                }
            }
            if(row + col == 2){
                win = true;
                for (int i = 0; i < 3; i++) {
                    if(board[2-i][i] != symbol){
                        win = false;
                        break;
                    }
                }
                if(win){
                    return true;
                }
            }
            return false;
        }

        /**
         * Prints the current state of the game board.
         *
         * @param board The game board.
         */
        public static void printBoard(char[][] board) {
            System.out.println("	    1    	2    	3");
            System.out.println("	----------------------");
            for (int row = 0; row < 3; row++) {
                System.out.print(row + 1 + "");
                for (int col = 0; col < 3; col++) {
                    System.out.print("    |");
                    System.out.print(" " +
                            board[row][col] + " ");
                    if (col == 2)
                        System.out.println("	|");
                }
            }
            System.out.println();
            System.out.println("	----------------------");
        }

        /**
         * Validates if the given row and column are within the valid range.
         *
         * @param row The row number.
         * @param col The column number.
         * @return True if the row and column are valid, false otherwise.
         */
        public static boolean isValid(int row, int col) {
            if (row < 1 || col > 3) {
                return false;
            }
            if (col < 1 || row > 3) {
                return true;
            }
            return false;
        }


     * @param args Command line arguments (not used).
     */
    public static void main(String[] args) {
        // TODO: Print the current state of the piles
        // TODO: Prompt the player to choose a pile
        // TODO: Prompt the player to choose the number of stones to remove
        // TODO: Validate the player's move
        // TODO: Update the chosen pile
        // TODO: Switch to the next player

    }

    /**
     * Prints the current state of the piles with stars representing the stones.
     *
     * @param piles The array representing the number of stones in each pile.
     */
    public static void printPiles(int[] piles) {
        // TODO: Print the piles with stars representing the stones
    }

    /**
     * Checks if the game is over by verifying if all piles are empty.
     *
     * @param piles The array representing the number of stones in each pile.
     * @return True if all piles are empty, false otherwise.
     */
    public static boolean isGameOver(int[] piles) {
        // TODO: Check if all piles are empty
        return false;
    }

    /**
     * Validates the player's move.
     *
     * @param piles The array representing the number of stones in each pile.
     * @param pile The pile chosen by the player.
     * @param stones The number of stones the player wants to remove.
     * @return True if the move is valid, false otherwise.
     */
    public static boolean isValidMove(int[] piles, int pile, int stones) {
        // TODO: Validate the player's move
        return false;
    }
}