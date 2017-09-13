package pebuls.kata3;

import java.util.*;

public class Board {
    private Set<Cell> cells = new HashSet<>();

    public void addCell(Cell cell) {

        cells.add(cell);
    }

    public List<Cell> getNeighbors(Cell cell) {

        List<Cell> neighbours = new ArrayList<>();

        for (int dx = -1; dx <= 1; dx++) {
            for (int dy = -1; dy <= 1; dy++) {
                Cell c = new Cell(cell.x + dx, cell.y + dy);
                if(isAlive(c) && !c.equals(cell)) {
                    neighbours.add(c);
                }
            }
        }
        return neighbours;
    }

    private boolean isAlive(Cell c) {
        return cells.contains(c);
    }

}

