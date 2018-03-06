package gardner.dakota.kodoro;

import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    protected int[][] board = new int[6][7];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void cellClick(android.view.View c) {
        ImageView cell = (ImageView) c;
        String tag = (String) cell.getTag();
        String[] coordinates = tag.split("\\.");

        int row = Integer.parseInt(coordinates[0]);
        int col = Integer.parseInt(coordinates[1]);

        int value = this.board[row][col];

        value += 1;
        if(value == 7) {
            value = 0;
        }

        this.board[row][col] = value;

        if(value == 0) {
            cell.setImageResource(R.drawable.blank);
        }
        else if(value == 1) {
            cell.setImageResource(R.drawable.one);
        }
        else if(value == 2) {
            cell.setImageResource(R.drawable.two);
        }
        else if(value == 3) {
            cell.setImageResource(R.drawable.three);
        }
        else if(value == 4) {
            cell.setImageResource(R.drawable.four);
        }
        else if(value == 5) {
            cell.setImageResource(R.drawable.five);
        }
        else {
            cell.setImageResource(R.drawable.six);
        }
    }
}
