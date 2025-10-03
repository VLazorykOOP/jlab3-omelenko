package task1;

import java.util.List;

public class Test {
    private String title;
    private int score;
    private int tryCount;
    private List<Question> questions;
    private int numberOfQuestions;

    public Test(String title, int tryCount, List<Question> questions) {
        this.title = title;
        this.score = 0;
        this.tryCount = tryCount;
        this.questions = questions;
        this.numberOfQuestions = questions.size();
    }

    public int getNumberOfQuestions() {
        return numberOfQuestions;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public int getScore() {
        return score;
    }

    public void setTryCount(int tryCount) {
        this.tryCount = tryCount;
    }

    public int getTryCount() {
        return tryCount;
    }

    public void setQuestions(List<Question> questions) {
        this.questions = questions;
        this.numberOfQuestions = questions.size();
    }

    public List<Question> getQuestions() {
        return questions;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void Show() {
        System.out.println("Дані про тест: " + title);
        System.out.println("Score: " + score);
        if (tryCount == Integer.MAX_VALUE) {
            System.out.println("TryCount: Необмежено");
        }
        else {
            System.out.println("TryCount: " + tryCount);
        }
        System.out.println("Questions: " + questions);
        System.out.println("Number of Questions: " + numberOfQuestions);
    }
}
