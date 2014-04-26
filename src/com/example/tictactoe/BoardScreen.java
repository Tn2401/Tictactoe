package com.example.tictactoe;

import com.example.tictactoe.Board.BoardCell;
import android.widget.TextView;
import android.widget.Button;
import android.widget.EditText;
import sofia.graphics.Color;
import sofia.graphics.RectangleShape;
import sofia.app.ShapeScreen;

public class BoardScreen
    extends ShapeScreen
{

    private Button   clear;
    private Button   reset;
    private TextView numWon1;
    private TextView numWon2;
    private TextView playerTurn;
    private TextView won;
    private Board    board;
    private int      won1;
    private int      won2;


    public void initialize()
    {

        board = new Board(12);
        //float min = Math.min(getWidth(), getHeight());
        float width = getWidth() / 12;
        float height = getHeight() / 12;
        for (int i = 0; i < 12; i++)
        {
            float left = i * width;
            float right = left + width;
            for (int j = 0; j < 12; j++)
            {
                float top = j * height;
                float bottom = top + height;
                RectangleShape rec =
                    new RectangleShape(left, top, right, bottom);
                rec.setFillColor(Color.yellow);
                rec.setColor(Color.black);
                add(rec);
            }
        }
        if (won.getText() == "Player 1 Won")
        {

            playerTurn.setText("Player 2");
        }
        else
        {

            playerTurn.setText("Player 1");
        }

        // won.setText("");
    }


    public void clearClicked()
    {

        initialize();

    }


    public void resetClicked()
    {
        won1 = 0;
        won2 = 0;
        numWon1.setText("0");
        numWon2.setText("0");
        initialize();
    }


    public void onTouchDown(float x, float y)
    {

        //float min = Math.min(getWidth(), getHeight());
        float cellSizeX = getWidth() / 12;
        float cellSizeY = getHeight() / 12;
        int xcoord = (int)(x / cellSizeX);
        int ycoord = (int)(y / cellSizeY);
        RectangleShape tile =
            getShapes().locatedAt(x, y).withClass(RectangleShape.class).front();
        won.setText("");
        if (playerTurn.getText() == "Player 1")
        {
            if (board.get(xcoord, ycoord).equals(BoardCell.EMPTY))
            {
                tile.setFillColor(Color.blue);
                board.setCell(xcoord, ycoord, BoardCell.BLUE);
                if ((board.get(xcoord + 1, ycoord + 1) == BoardCell.BLUE)
                    && (board.get(xcoord + 2, ycoord + 2) == BoardCell.BLUE)
                    && (board.get(xcoord + 3, ycoord + 3) == BoardCell.BLUE)
                    && (board.get(xcoord + 4, ycoord + 4) == BoardCell.BLUE))
                {
                    won.setText("Player 1 Won");
                }
                else if ((board.get(xcoord, ycoord + 1) == BoardCell.BLUE)
                    && (board.get(xcoord, ycoord + 2) == BoardCell.BLUE)
                    && (board.get(xcoord, ycoord + 3) == BoardCell.BLUE)
                    && (board.get(xcoord, ycoord + 4) == BoardCell.BLUE))
                {
                    won.setText("Player 1 Won");
                }
                else if ((board.get(xcoord + 1, ycoord) == BoardCell.BLUE)
                    && (board.get(xcoord + 2, ycoord) == BoardCell.BLUE)
                    && (board.get(xcoord + 3, ycoord) == BoardCell.BLUE)
                    && (board.get(xcoord + 4, ycoord) == BoardCell.BLUE))
                {
                    won.setText("Player 1 Won");
                }
                else if ((board.get(xcoord - 1, ycoord - 1) == BoardCell.BLUE)
                    && (board.get(xcoord - 2, ycoord - 2) == BoardCell.BLUE)
                    && (board.get(xcoord - 3, ycoord - 3) == BoardCell.BLUE)
                    && (board.get(xcoord - 4, ycoord - 4) == BoardCell.BLUE))
                {
                    won.setText("Player 1 Won");
                }
                else if ((board.get(xcoord + 1, ycoord - 1) == BoardCell.BLUE)
                    && (board.get(xcoord + 2, ycoord - 2) == BoardCell.BLUE)
                    && (board.get(xcoord + 3, ycoord - 3) == BoardCell.BLUE)
                    && (board.get(xcoord + 4, ycoord - 4) == BoardCell.BLUE))
                {
                    won.setText("Player 1 Won");
                }
                else if ((board.get(xcoord - 1, ycoord) == BoardCell.BLUE)
                    && (board.get(xcoord - 2, ycoord) == BoardCell.BLUE)
                    && (board.get(xcoord - 3, ycoord) == BoardCell.BLUE)
                    && (board.get(xcoord - 4, ycoord) == BoardCell.BLUE))
                {
                    won.setText("Player 1 Won");
                }
                else if ((board.get(xcoord - 1, ycoord + 1) == BoardCell.BLUE)
                    && (board.get(xcoord - 2, ycoord + 2) == BoardCell.BLUE)
                    && (board.get(xcoord - 3, ycoord + 3) == BoardCell.BLUE)
                    && (board.get(xcoord - 4, ycoord + 4) == BoardCell.BLUE))
                {
                    won.setText("Player 1 Won");
                }
                else if ((board.get(xcoord, ycoord - 1) == BoardCell.BLUE)
                    && (board.get(xcoord, ycoord - 2) == BoardCell.BLUE)
                    && (board.get(xcoord, ycoord - 3) == BoardCell.BLUE)
                    && (board.get(xcoord, ycoord - 4) == BoardCell.BLUE))
                {
                    won.setText("Player 1 Won");
                }
                else if ((board.get(xcoord + 1, ycoord) == BoardCell.BLUE)
                    && (board.get(xcoord + 2, ycoord) == BoardCell.BLUE)
                    && (board.get(xcoord - 1, ycoord) == BoardCell.BLUE)
                    && (board.get(xcoord - 2, ycoord) == BoardCell.BLUE))
                {
                    won.setText("Player 1 Won");
                }
                else if ((board.get(xcoord, ycoord + 1) == BoardCell.BLUE)
                    && (board.get(xcoord, ycoord + 2) == BoardCell.BLUE)
                    && (board.get(xcoord, ycoord - 2) == BoardCell.BLUE)
                    && (board.get(xcoord, ycoord - 1) == BoardCell.BLUE))
                {
                    won.setText("Player 1 Won");
                }
                else if ((board.get(xcoord + 1, ycoord + 1) == BoardCell.BLUE)
                    && (board.get(xcoord + 2, ycoord + 2) == BoardCell.BLUE)
                    && (board.get(xcoord - 1, ycoord - 1) == BoardCell.BLUE)
                    && (board.get(xcoord - 2, ycoord - 2) == BoardCell.BLUE))
                {
                    won.setText("Player 1 Won");
                }
                else if ((board.get(xcoord + 1, ycoord - 1) == BoardCell.BLUE)
                    && (board.get(xcoord + 2, ycoord - 2) == BoardCell.BLUE)
                    && (board.get(xcoord - 1, ycoord + 1) == BoardCell.BLUE)
                    && (board.get(xcoord - 2, ycoord + 2) == BoardCell.BLUE))
                {
                    won.setText("Player 1 Won");
                }
                else if ((board.get(xcoord, ycoord + 1) == BoardCell.BLUE)
                    && (board.get(xcoord, ycoord + 2) == BoardCell.BLUE)
                    && (board.get(xcoord, ycoord + 3) == BoardCell.BLUE)
                    && (board.get(xcoord, ycoord - 1) == BoardCell.BLUE))
                {
                    won.setText("Player 1 Won");
                }
                else if ((board.get(xcoord, ycoord + 1) == BoardCell.BLUE)
                    && (board.get(xcoord, ycoord - 2) == BoardCell.BLUE)
                    && (board.get(xcoord, ycoord - 3) == BoardCell.BLUE)
                    && (board.get(xcoord, ycoord - 1) == BoardCell.BLUE))
                {
                    won.setText("Player 1 Won");
                }
                else if ((board.get(xcoord + 1, ycoord) == BoardCell.BLUE)
                    && (board.get(xcoord + 2, ycoord) == BoardCell.BLUE)
                    && (board.get(xcoord + 3, ycoord) == BoardCell.BLUE)
                    && (board.get(xcoord - 1, ycoord) == BoardCell.BLUE))
                {
                    won.setText("Player 1 Won");
                }
                else if ((board.get(xcoord + 1, ycoord) == BoardCell.BLUE)
                    && (board.get(xcoord - 1, ycoord) == BoardCell.BLUE)
                    && (board.get(xcoord - 2, ycoord) == BoardCell.BLUE)
                    && (board.get(xcoord - 3, ycoord) == BoardCell.BLUE))
                {
                    won.setText("Player 1 Won");
                }
                else if ((board.get(xcoord + 1, ycoord + 1) == BoardCell.BLUE)
                    && (board.get(xcoord - 2, ycoord - 2) == BoardCell.BLUE)
                    && (board.get(xcoord - 3, ycoord - 3) == BoardCell.BLUE)
                    && (board.get(xcoord - 1, ycoord - 1) == BoardCell.BLUE))
                {
                    won.setText("Player 1 Won");
                }
                else if ((board.get(xcoord + 1, ycoord + 1) == BoardCell.BLUE)
                    && (board.get(xcoord + 2, ycoord + 2) == BoardCell.BLUE)
                    && (board.get(xcoord + 3, ycoord + 3) == BoardCell.BLUE)
                    && (board.get(xcoord - 1, ycoord - 1) == BoardCell.BLUE))
                {
                    won.setText("Player 1 Won");
                }
                else if ((board.get(xcoord + 1, ycoord - 1) == BoardCell.BLUE)
                    && (board.get(xcoord - 2, ycoord + 2) == BoardCell.BLUE)
                    && (board.get(xcoord - 3, ycoord + 3) == BoardCell.BLUE)
                    && (board.get(xcoord - 1, ycoord + 1) == BoardCell.BLUE))
                {
                    won.setText("Player 1 Won");
                }
                else if ((board.get(xcoord - 1, ycoord + 1) == BoardCell.BLUE)
                    && (board.get(xcoord + 1, ycoord - 1) == BoardCell.BLUE)
                    && (board.get(xcoord + 2, ycoord - 2) == BoardCell.BLUE)
                    && (board.get(xcoord + 3, ycoord - 3) == BoardCell.BLUE))
                {
                    won.setText("Player 1 Won");
                }
                playerTurn.setText("Player 2");
                if (won.getText() == "Player 1 Won")
                {
                    won1++;
                    String w1 = Integer.toString(won1);
                    numWon1.setText(w1);
                    initialize();
                }
            }

        }

        else
        {

            if (board.get(xcoord, ycoord).equals(BoardCell.EMPTY))
            {
                tile.setFillColor(Color.red);
                board.setCell(xcoord, ycoord, BoardCell.RED);
                if ((board.get(xcoord + 1, ycoord + 1) == BoardCell.RED)
                    && (board.get(xcoord + 2, ycoord + 2) == BoardCell.RED)
                    && (board.get(xcoord + 3, ycoord + 3) == BoardCell.RED)
                    && (board.get(xcoord + 4, ycoord + 4) == BoardCell.RED))
                {
                    won.setText("Player 2 Won");
                }
                else if ((board.get(xcoord, ycoord + 1) == BoardCell.RED)
                    && (board.get(xcoord, ycoord + 2) == BoardCell.RED)
                    && (board.get(xcoord, ycoord + 3) == BoardCell.RED)
                    && (board.get(xcoord, ycoord + 4) == BoardCell.RED))
                {
                    won.setText("Player 2 Won");
                }
                else if ((board.get(xcoord + 1, ycoord) == BoardCell.RED)
                    && (board.get(xcoord + 2, ycoord) == BoardCell.RED)
                    && (board.get(xcoord + 3, ycoord) == BoardCell.RED)
                    && (board.get(xcoord + 4, ycoord) == BoardCell.RED))
                {
                    won.setText("Player 2 Won");
                }
                else if ((board.get(xcoord - 1, ycoord - 1) == BoardCell.RED)
                    && (board.get(xcoord - 2, ycoord - 2) == BoardCell.RED)
                    && (board.get(xcoord - 3, ycoord - 3) == BoardCell.RED)
                    && (board.get(xcoord - 4, ycoord - 4) == BoardCell.RED))
                {
                    won.setText("Player 2 Won");
                }
                else if ((board.get(xcoord + 1, ycoord - 1) == BoardCell.RED)
                    && (board.get(xcoord + 2, ycoord - 2) == BoardCell.RED)
                    && (board.get(xcoord + 3, ycoord - 3) == BoardCell.RED)
                    && (board.get(xcoord + 4, ycoord - 4) == BoardCell.RED))
                {
                    won.setText("Player 2 Won");
                }
                else if ((board.get(xcoord - 1, ycoord) == BoardCell.RED)
                    && (board.get(xcoord - 2, ycoord) == BoardCell.RED)
                    && (board.get(xcoord - 3, ycoord) == BoardCell.RED)
                    && (board.get(xcoord - 4, ycoord) == BoardCell.RED))
                {
                    won.setText("Player 2 Won");
                }
                else if ((board.get(xcoord - 1, ycoord + 1) == BoardCell.RED)
                    && (board.get(xcoord - 2, ycoord + 2) == BoardCell.RED)
                    && (board.get(xcoord - 3, ycoord + 3) == BoardCell.RED)
                    && (board.get(xcoord - 4, ycoord + 4) == BoardCell.RED))
                {
                    won.setText("Player 2 Won");
                }
                else if ((board.get(xcoord, ycoord - 1) == BoardCell.RED)
                    && (board.get(xcoord, ycoord - 2) == BoardCell.RED)
                    && (board.get(xcoord, ycoord - 3) == BoardCell.RED)
                    && (board.get(xcoord, ycoord - 4) == BoardCell.RED))
                {
                    won.setText("Player 2 Won");
                }
                else if ((board.get(xcoord - 1, ycoord + 1) == BoardCell.RED)
                    && (board.get(xcoord - 2, ycoord + 2) == BoardCell.RED)
                    && (board.get(xcoord - 3, ycoord + 3) == BoardCell.RED)
                    && (board.get(xcoord - 4, ycoord + 4) == BoardCell.RED))
                {
                    won.setText("Player 2 Won");
                }
                else if ((board.get(xcoord, ycoord - 1) == BoardCell.RED)
                    && (board.get(xcoord, ycoord - 2) == BoardCell.RED)
                    && (board.get(xcoord, ycoord - 3) == BoardCell.RED)
                    && (board.get(xcoord, ycoord - 4) == BoardCell.RED))
                {
                    won.setText("Player 2 Won");
                }
                else if ((board.get(xcoord + 1, ycoord) == BoardCell.RED)
                    && (board.get(xcoord + 2, ycoord) == BoardCell.RED)
                    && (board.get(xcoord - 1, ycoord) == BoardCell.RED)
                    && (board.get(xcoord - 2, ycoord) == BoardCell.RED))
                {
                    won.setText("Player 2 Won");
                }
                else if ((board.get(xcoord, ycoord + 1) == BoardCell.RED)
                    && (board.get(xcoord, ycoord + 2) == BoardCell.RED)
                    && (board.get(xcoord, ycoord - 2) == BoardCell.RED)
                    && (board.get(xcoord, ycoord - 1) == BoardCell.RED))
                {
                    won.setText("Player 2 Won");
                }
                else if ((board.get(xcoord + 1, ycoord + 1) == BoardCell.RED)
                    && (board.get(xcoord + 2, ycoord + 2) == BoardCell.RED)
                    && (board.get(xcoord - 1, ycoord - 1) == BoardCell.RED)
                    && (board.get(xcoord - 2, ycoord - 2) == BoardCell.RED))
                {
                    won.setText("Player 2 Won");
                }
                else if ((board.get(xcoord + 1, ycoord - 1) == BoardCell.RED)
                    && (board.get(xcoord + 2, ycoord - 2) == BoardCell.RED)
                    && (board.get(xcoord - 1, ycoord + 1) == BoardCell.RED)
                    && (board.get(xcoord - 2, ycoord + 2) == BoardCell.RED))
                {
                    won.setText("Player 2 Won");
                }
                else if ((board.get(xcoord + 1, ycoord) == BoardCell.RED)
                    && (board.get(xcoord + 2, ycoord) == BoardCell.RED)
                    && (board.get(xcoord - 1, ycoord) == BoardCell.RED)
                    && (board.get(xcoord - 2, ycoord) == BoardCell.RED))
                {
                    won.setText("Player 2 Won");
                }
                else if ((board.get(xcoord, ycoord + 1) == BoardCell.RED)
                    && (board.get(xcoord, ycoord + 2) == BoardCell.RED)
                    && (board.get(xcoord, ycoord - 2) == BoardCell.RED)
                    && (board.get(xcoord, ycoord - 1) == BoardCell.RED))
                {
                    won.setText("Player 2 Won");
                }
                else if ((board.get(xcoord + 1, ycoord + 1) == BoardCell.RED)
                    && (board.get(xcoord + 2, ycoord + 2) == BoardCell.RED)
                    && (board.get(xcoord - 1, ycoord - 1) == BoardCell.RED)
                    && (board.get(xcoord - 2, ycoord - 2) == BoardCell.RED))
                {
                    won.setText("Player 2 Won");
                }
                else if ((board.get(xcoord + 1, ycoord - 1) == BoardCell.RED)
                    && (board.get(xcoord + 2, ycoord - 2) == BoardCell.RED)
                    && (board.get(xcoord - 1, ycoord + 1) == BoardCell.RED)
                    && (board.get(xcoord - 2, ycoord + 2) == BoardCell.RED))
                {
                    won.setText("Player 2 Won");
                }
                else if ((board.get(xcoord, ycoord + 1) == BoardCell.RED)
                    && (board.get(xcoord, ycoord + 2) == BoardCell.RED)
                    && (board.get(xcoord, ycoord + 3) == BoardCell.RED)
                    && (board.get(xcoord, ycoord - 1) == BoardCell.RED))
                {
                    won.setText("Player 2 Won");
                }
                else if ((board.get(xcoord, ycoord + 1) == BoardCell.RED)
                    && (board.get(xcoord, ycoord - 2) == BoardCell.RED)
                    && (board.get(xcoord, ycoord - 3) == BoardCell.RED)
                    && (board.get(xcoord, ycoord - 1) == BoardCell.RED))
                {
                    won.setText("Player 2 Won");
                }
                else if ((board.get(xcoord + 1, ycoord) == BoardCell.RED)
                    && (board.get(xcoord + 2, ycoord) == BoardCell.RED)
                    && (board.get(xcoord + 3, ycoord) == BoardCell.RED)
                    && (board.get(xcoord - 1, ycoord) == BoardCell.RED))
                {
                    won.setText("Player 2 Won");
                }
                else if ((board.get(xcoord + 1, ycoord) == BoardCell.RED)
                    && (board.get(xcoord - 1, ycoord) == BoardCell.RED)
                    && (board.get(xcoord - 2, ycoord) == BoardCell.RED)
                    && (board.get(xcoord - 3, ycoord) == BoardCell.RED))
                {
                    won.setText("Player 2 Won");
                }
                else if ((board.get(xcoord + 1, ycoord + 1) == BoardCell.RED)
                    && (board.get(xcoord - 2, ycoord - 2) == BoardCell.RED)
                    && (board.get(xcoord - 3, ycoord - 3) == BoardCell.RED)
                    && (board.get(xcoord - 1, ycoord - 1) == BoardCell.RED))
                {
                    won.setText("Player 2 Won");
                }
                else if ((board.get(xcoord + 1, ycoord + 1) == BoardCell.RED)
                    && (board.get(xcoord + 2, ycoord + 2) == BoardCell.RED)
                    && (board.get(xcoord + 3, ycoord + 3) == BoardCell.RED)
                    && (board.get(xcoord - 1, ycoord - 1) == BoardCell.RED))
                {
                    won.setText("Player 2 Won");
                }
                else if ((board.get(xcoord + 1, ycoord - 1) == BoardCell.RED)
                    && (board.get(xcoord - 2, ycoord + 2) == BoardCell.RED)
                    && (board.get(xcoord - 3, ycoord + 3) == BoardCell.RED)
                    && (board.get(xcoord - 1, ycoord + 1) == BoardCell.RED))
                {
                    won.setText("Player 2 Won");
                }
                else if ((board.get(xcoord - 1, ycoord + 1) == BoardCell.RED)
                    && (board.get(xcoord + 1, ycoord - 1) == BoardCell.RED)
                    && (board.get(xcoord + 2, ycoord - 2) == BoardCell.RED)
                    && (board.get(xcoord + 3, ycoord - 3) == BoardCell.RED))
                {
                    won.setText("Player 2 Won");
                }
                playerTurn.setText("Player 1");

                if (won.getText() == "Player 2 Won")
                {
                    won2++;
                    String w2 = Integer.toString(won2);
                    numWon2.setText(w2);

                    initialize();

                }

            }

        }
    }
}
