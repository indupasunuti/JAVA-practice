import java.util.Scanner;
public class TicTacToe {
    private char[][] board;
    private char currentPlayer;
    private char player1Symbol;
    private char player2Symbol;

    public TicTacToe(char player1Symbol, char player2Symbol) {
        this.player1Symbol = player1Symbol;
        this.player2Symbol = player2Symbol;
        board = new char[3][3];
        currentPlayer = player1Symbol; // Player 1 starts the game
        initializeBoard();
    }

    // Initialize board with empty spaces
    private void initializeBoard() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = '-';
            }
        }
    }

    // Print the current board state
    private void printBoard() {
        System.out.println("-------------");
        for (int i = 0; i < 3; i++) {
            System.out.print("| ");
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j] + " | ");
            }
            System.out.println();
            System.out.println("-------------");
        }
    }

    // Check if the board is full
    private boolean isBoardFull() {
        boolean isFull = true;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i][j] == '-') {
                    isFull = false;
                }
            }
        }
        return isFull;
    }

    // Check if there is a winner
    private boolean checkForWin() {
        return checkRowsForWin() || checkColumnsForWin() || checkDiagonalsForWin();
    }

    // Check rows for a win
    private boolean checkRowsForWin() {
        for (int i = 0; i < 3; i++) {
            if (checkRowCol(board[i][0], board[i][1], board[i][2])) {
                return true;
            }
        }
        return false;
    }

    // Check columns for a win
    private boolean checkColumnsForWin() {
        for (int i = 0; i < 3; i++) {
            if (checkRowCol(board[0][i], board[1][i], board[2][i])) {
                return true;
            }
        }
        return false;
    }

    // Check diagonals for a win
    private boolean checkDiagonalsForWin() {
        return checkRowCol(board[0][0], board[1][1], board[2][2]) ||
               checkRowCol(board[0][2], board[1][1], board[2][0]);
    }

    // Check if all three values are the same (and not empty) indicating a win
    private boolean checkRowCol(char c1, char c2, char c3) {
        return (c1 != '-' && c1 == c2 && c2 == c3);
    }

    // Change player turns
    private void changePlayer() {
        currentPlayer = (currentPlayer == player1Symbol) ? player2Symbol : player1Symbol;
    }

    // Place a mark on the board at position (row, col) for the current player
    private void placeMark(int row, int col) {
        if (row >= 0 && row < 3 && col >= 0 && col < 3 && board[row][col] == '-') {
            board[row][col] = currentPlayer;
            if (checkForWin()) {
                System.out.println("Player " + currentPlayer + " wins!");
            }
            changePlayer();
        } else {
            System.out.println("Invalid move. Try again.");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter player 1’s symbol: ");
        char player1Symbol = scanner.next().charAt(0);
        System.out.print("Enter player 2’s symbol: ");
        char player2Symbol = scanner.next().charAt(0);
        TicTacToe game = new TicTacToe(player1Symbol, player2Symbol);
        int row, col;
        while (!game.isBoardFull() && !game.checkForWin()) {
            System.out.println("Current board:");
            game.printBoard();
            System.out.println("Player " + game.currentPlayer + ", enter your move (row [1-3] column [1-3]): ");
            // Input handling and adjustment from 1-based to 0-based index
            row = scanner.nextInt() - 1;
            col = scanner.nextInt() - 1;
            game.placeMark(row, col);
        }
        // Game over – print final board and winner (if any)
        game.printBoard();
        if (!game.checkForWin() && game.isBoardFull()) {
            System.out.println("It’s a draw!");
        }
        scanner.close();
    }
}