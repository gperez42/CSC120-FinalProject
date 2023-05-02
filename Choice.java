import java.util.ArrayList;
import java.util.Scanner;

public class Choice {
    private String text;
    private int points;

    public Choice(String text, int points) {
        this.text = text;
        this.points = points;
    }

    public String getText() {
        return text;
    }

    public int getPoints() {
        return points;
    }
}