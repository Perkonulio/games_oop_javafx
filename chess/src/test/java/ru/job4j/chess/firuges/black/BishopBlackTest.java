package ru.job4j.chess.firuges.black;

import junit.framework.TestCase;
import org.junit.Test;
import ru.job4j.chess.ImpossibleMoveException;
import ru.job4j.chess.firuges.Cell;
import ru.job4j.chess.firuges.Figure;

import java.util.Arrays;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;


public class BishopBlackTest {

    @Test
    public void testPosition() {
        BishopBlack bishop = new BishopBlack(Cell.C8);
        assertThat(bishop.position(), is(Cell.C8));
    }

    @Test
    public void testCopy() {
        BishopBlack bishop =  new BishopBlack(Cell.A1);
        Figure bishop1 = bishop.copy(Cell.A4);
        assertThat(bishop1.position(), is(new BishopBlack(Cell.A4).position()));
    }

    @Test
    public void testWay() throws ImpossibleMoveException {
        BishopBlack bishopBlack = new BishopBlack(Cell.E3);
        Cell[] maybeWay = bishopBlack.way(Cell.B6);
        assertThat(maybeWay, is(new Cell[] {Cell.D4, Cell.C5, Cell.B6}));
    }

    @Test
    public void testWay2() throws ImpossibleMoveException{
        BishopBlack bishopBlack = new BishopBlack(Cell.C1);
        Cell[] maybeWay = bishopBlack.way(Cell.G5);
        assertThat(maybeWay, is(new Cell[] {Cell.D2, Cell.E3, Cell.F4, Cell.G5}));
    }
}