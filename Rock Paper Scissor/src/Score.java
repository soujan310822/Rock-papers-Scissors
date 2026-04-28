import javax.swing.*;
import java.awt.*;

public class Score {
    JFrame frame;
    JLabel player;
    JLabel Computer;
    JLabel result;
    JLabel regards;
    int playerScore = 0;
    int computerScore = 0;

    //constuctor
    public Score(int playerScore,int computerScore) {
        this.playerScore=playerScore;
        this.computerScore=computerScore;
        frame = new JFrame();
        player = new JLabel("Player:  "+playerScore, SwingConstants.CENTER);
        Computer = new JLabel("Computer:  "+computerScore, SwingConstants.CENTER);
        player.setFont(new Font("Arial", Font.BOLD, 18));
        Computer.setFont(new Font("Arial", Font.BOLD, 18));
        player.setForeground(Color.WHITE);
        Computer.setForeground(Color.WHITE);
        frame.add(player);
        frame.add(Computer);
        frame.setSize(350, 200);
        frame.setTitle("SCORE CARD");
        frame.setLayout(new GridLayout(4, 1));

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setBackground(Color.BLACK);
        frame.setLocationRelativeTo(null);
        frame.setAlwaysOnTop(true);
        frame.toFront();
        frame.requestFocus();
        this.result();
        regards=new JLabel("HOPE YOU ENJOYED THE GAME ❤️",SwingConstants.CENTER);
        regards.setForeground(new Color(123,50,250));
        frame.add(regards);
        frame.setVisible(true);
        frame.setResizable(false);

    }

    // method to add result label into frame
    public void result() {
        result = new JLabel("", SwingConstants.CENTER);
        if (playerScore > computerScore) {
            result.setText("YOU WIN🎉!!");
            result.setForeground(Color.GREEN);
        }
        else if (playerScore < computerScore) {
                result.setText("YOU LOSE😢!!");
                result.setForeground(Color.RED);
        }
        else{
            result.setText("ITS A TIE 🤝!!");
            result.setForeground(Color.cyan);
        }
        frame.add(result);
    }
}
