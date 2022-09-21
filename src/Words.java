import java.util.Locale;

public class Words {
    private int rows = 0;
    private int chars = 0;
    private int words = 0;
    private boolean stopped = false;

    public void calculate(String input) {
        if (input.trim().length() == 0) {
            return;
        }
        if (input.toLowerCase().contains("stop")) {
            String withoutStop = input.toLowerCase().replace("stop", "");
            count(withoutStop);
            setStopped(true);
        }
        else {
            count(input);
        }
    }
    public void count (String input) {
        rows++;
        String[] split = input.split("");

        for (String s : split) {
            if (s.length() > 0) {
                words++;
                chars += s.length();
            }
        }
    }
    public void print() {
        System.out.println("Du skriver: " + words + "ord," + chars + "chars och " + rows + "rows!");
    }

    public int getWords() {
        return words;
    }
    public void setWords (int words) {
        this.words = words;
    }
    public boolean isStopped() {
        return stopped;
    }
    public void setStopped (boolean stopped) {

    }

    public int getRows() {
        return rows;
    }
    public void setRows (int rows) {
    }
    private int numberOfRows;
    private int numberOfCharacters;

    public Words() {

    }
    public void PrintCountLines() {

    }
    public int getnumberOfRows() {
        return numberOfRows;
    }
    public void saveWords() {
        numberOfRows = numberOfRows + 1;
    }
    public void saveCharacters() {
        numberOfCharacters = numberOfCharacters + 1;
    }
    public int getNumberOfCharacters() {
        return numberOfCharacters;
    }
}
