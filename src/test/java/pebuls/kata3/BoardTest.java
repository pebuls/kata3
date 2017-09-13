package pebuls.kata3;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class BoardTest {

    @Test
    public void aSingleCellShouldHaveZeroNeighbors() throws Exception {

        Board board = new Board();
        board.addCell(new Cell(0,0));

        List<Cell> neighbors = board.getNeighbors(new Cell(0,0));

        assertEquals(0, neighbors.size());
    }


    @Test
    public void twoCellsNextToEachOtherShouldBeNeighbors() throws Exception {

        Board board = new Board();
        board.addCell(new Cell(0, 0));
        board.addCell(new Cell(0, 1));

        List<Cell> neighborsOfFirstCell = board.getNeighbors(new Cell(0, 0));
        List<Cell> neighborsOfSecondCell = board.getNeighbors(new Cell(0, 1));

        assertArrayEquals(new Cell[] { new Cell(0, 1) }, neighborsOfFirstCell.toArray());
        assertArrayEquals(new Cell[] { new Cell(0, 0) }, neighborsOfSecondCell.toArray());
    }

    @Test
    public void aTwoSingleCellsFarFromEachOtherShouldHaveZeroNeighbors() throws Exception {

        Board board = new Board();
        board.addCell(new Cell(0, 0));
        board.addCell(new Cell(0, 100));

        List<Cell> neighbors = board.getNeighbors(new Cell(0, 0));

        assertEquals(0, neighbors.size());
    }

    @Test
    public void middleCellOf3x3BlockShouldHaveEightNeighbors() throws Exception {

        Board board = new Board();
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board.addCell(new Cell(i, j));
            }
        }

        List<Cell> neighbors = board.getNeighbors(new Cell(1, 1));

        assertEquals(8, neighbors.size());
    }
}
