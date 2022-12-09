package TicTacToe;

public class Main {
    public static void main(String[] args) {
        player p1=new player();
        p1.setName("A");
        p1.setSymbol('o');

        player p2=new player();
        p2.setName("B");
        p2.setSymbol('x');

        Board board=new Board(3);

        Game game=new Game(new player[] {p1,p2},board);
        game.play();
    }
}
