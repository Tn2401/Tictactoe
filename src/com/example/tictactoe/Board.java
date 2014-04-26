package com.example.tictactoe;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class Board
{
    private int           size;
    private BoardCell[][] board;


    /**
 *
 */
    public Board(int s)
    {
        size = s;

        board = new BoardCell[s][s];
        for (int i = 0; i < s; i++)
        {
            for (int j = 0; j < s; j++)
            {
                setCell(i, j, BoardCell.EMPTY);
            }

        }
    }


    public enum BoardCell
    {
        PLAYER1,
        PLAYER2,
        INVALID,
        RED,
        BLUE,
        EMPTY;

    }


    /**
 *
 */
    public void setCell(int x, int y, BoardCell cell)
    {

        board[x][y] = cell;
    }


    /**
 *
 */
    public int size()
    {
        return size;
    }


    /**
 *
 */
    public BoardCell get(int x, int y)
    {
        if ((x > size - 1) || (x < 0) || (y > size - 1) || (y < 0))
        {
            return BoardCell.INVALID;
        }
        else
        {
            return board[x][y];
        }

    }
}
