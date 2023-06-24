import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totalQues = 5;
        int score = 0;

        String[] questions = {
                "1+1=?",
                "2+2=?",
                "3+3=?",
                "4+4=?",
                "5+5=?",
        };

        String[] options = {
                "a) 1\nb) 2\nс) 3\nd) 4",
                "a) 1\nb) 2\nc) 3\nd) 4",
                "a) 2\nb) 4\nc) 6\nd) 8",
                "a) 2\nb) 4\nc) 6\nd) 8",
                "a) 4\nb) 6\nc) 8\nd) 10"
        };

        String[] correctAnswers = {"b", "d", "c", "d", "d"};

        for (int i = 0; i < totalQues; i++) {
            System.out.println("Питання " + (i + 1) + ":");
            System.out.println(questions[i]);
            System.out.println(options[i]);

            String userAnswer = scanner.nextLine().toLowerCase();

            if (userAnswer.equals("q")) {
                System.out.println("Опитування закінчилася!");
                return;
            }


            if (userAnswer.equals(correctAnswers[i])) {
                score++;
            }

            System.out.println();
        }
        System.out.println("Опитування закінчилася!");
        System.out.println("Ваша оцінка: " + score + " з " + totalQues);
        double percentage = (double) score / totalQues * 100;
        System.out.println("Відсоток: " + percentage + "%");
    }
}