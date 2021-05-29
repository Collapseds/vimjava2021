import java.awt.*;
import java.util.*;
import javax.swing.*;

public class QuizCardPlayer {
  private JTextArea display;
  private JTextArea answer;
  private ArrayList<QuizCard> cardList;
  private QuizCard currentCard;
  private int currentCardIndex;
  private JFrame frame;
  private JButton nextButton;
  private boolean isShowAnswer;

  public static void main(String[] args){
    QuizCardPlayer reader = new QuizCardPlayer();
    reader.go();
  } 

  public void go() {
    frame = new JFrame("Quiz Card Player");
    JPanel mainPanel = new JPanel();
    Font bigFont = new Font("sanserif", Font.BOLD, 24);

    display = new JTextArea();
    display.setFont(bigFont);

    display.setLineWrap(true);
    display.setEditable(false);

    JScrollPane qScroller = new JScrollPane(display);
    qScroller.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
    qScroller.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
    nextButton = new JButton("Show question");

  }
}
