package pebuls.kata3;


import javafx.scene.control.Cell;
import org.junit.Test;

public class BoardTest {

    @Test
    public void aSingleCellShouldHaveZeroNeighbors() throws Exception {

        Board board = new Board();
        board.addCell(new Cell());

        List<Cell> neighbors = board.getNeighbors(new Cell());

        assertEquals(0, neighbors.size());
    }
}
