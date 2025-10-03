import java.util.List;

public class Question {
    private String text;
    private List<String> options;
    private int correctAnswer;

    public Question(String text, List<String> options, int correctAnswer) {
        this.text = text;
        this.options = options;
        this.correctAnswer = correctAnswer;
    }

    public int getCorrectAnswer() {
        return correctAnswer;
    }

    public String getCorrectAnswerText() {
        return options.get(correctAnswer);
    }

    public List<String> getOptions() {
        return options;
    }

    public String getText() {
        return text;
    }

    public boolean isCorrect(int num) {
        return correctAnswer == num;
    }
}
