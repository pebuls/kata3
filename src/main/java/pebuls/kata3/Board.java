package pebuls.kata3;

import java.util.*;

public class Board {
    private Set<Cell> cells = new HashSet<>();

    public void addCell(Cell cell) {

        cells.add(cell);
    }

    public List<Cell> getNeighbors(Cell cell) {

        List<Cell> neighbours = new ArrayList<>();

        for(Cell c : cells) {
            if(!c.equals(cell))  {
                neighbours.add(c);
            }
        }
        return neighbours;

    }

}

