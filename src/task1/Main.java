package task1;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Question q1 = new Question(
                "Яка столиця Франції?",
                Arrays.asList("Лондон", "Париж", "Берлін", "Рим"),
                1
        );

        Question q2 = new Question(
                "Скільки буде 2 + 2?",
                Arrays.asList("3", "4", "5", "22"),
                1
        );

        Question q3 = new Question(
                "Яка мова використовується для Android-розробки?",
                Arrays.asList("Swift", "C#", "Python", "Java/Kotlin"),
                3
        );

        List<Question> questions = Arrays.asList(q1, q2, q3);

        Exam exam = new Exam("Мідтерм з географії", questions);

        FinalExam finalExam = new FinalExam(
                "Фінальний іспит з програмування",
                questions,
                "Курсовий проект: Онлайн-тестова система",
                "Розробити консольну або веб-систему тестування студентів",
                "Цей проект включає використання Java та структури даних"
        );

        Trial trial = new Trial("Тест-драйв перед екзаменом", questions);

        System.out.println("=== task1.Exam ===");
        exam.Show();

        System.out.println("\n=== Final task1.Exam ===");
        finalExam.Show();

        System.out.println("\n=== task1.Trial task1.Test ===");
        trial.Show();

        System.out.println("\n=== Перевірка правильних відповідей ===");
        for (Question q : questions) {
            System.out.println("Питання: " + q.getText());
            System.out.println("Правильна відповідь: " + q.getCorrectAnswerText());
        }
    }
}
