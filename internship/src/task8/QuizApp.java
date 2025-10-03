package com.task8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class QuizApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // List of Questions
        List<Question> questions = new ArrayList<>();
        questions.add(new Question("1. What are Java loops?",
                Arrays.asList("A. Iteration statements", "B. Decision statements", "C. Exception handlers", "D. None"),
                'A'));

        questions.add(new Question("2. What is enhanced for-loop?",
                Arrays.asList("A. Loop with multiple init", "B. For-each loop", "C. While loop", "D. None"),
                'B'));

        questions.add(new Question("3. How do you handle multiple user inputs?",
                Arrays.asList("A. Using Scanner", "B. Using BufferedReader", "C. Using Command-line args", "D. All of the above"),
                'D'));

        questions.add(new Question("4. How is a switch-case different from if-else?",
                Arrays.asList("A. Faster than if-else", "B. Works on int, char, String", "C. Better readability", "D. All of the above"),
                'D'));

        questions.add(new Question("5. What are Collections in Java?",
                Arrays.asList("A. Data structures framework", "B. Memory blocks", "C. Package for arrays", "D. None"),
                'A'));

        questions.add(new Question("6. What is ArrayList?",
                Arrays.asList("A. Dynamic array", "B. Fixed array", "C. HashMap", "D. None"),
                'A'));

        questions.add(new Question("7. How to iterate using Iterators?",
                Arrays.asList("A. hasNext() & next()", "B. while() only", "C. for() only", "D. None"),
                'A'));

        questions.add(new Question("8. What is a Map?",
                Arrays.asList("A. Key-Value pair collection", "B. Only keys", "C. Only values", "D. None"),
                'A'));

        questions.add(new Question("9. How to sort a list?",
                Arrays.asList("A. Collections.sort()", "B. Arrays.sort()", "C. Both A & B", "D. None"),
                'C'));

        questions.add(new Question("10. How to shuffle elements?",
                Arrays.asList("A. Collections.shuffle()", "B. Random class", "C. Sort in reverse", "D. None"),
                'A'));

        // Quiz Logic
        int score = 0;
        for (Question q : questions) {
            System.out.println("\n" + q.question);
            for (String option : q.options) {
                System.out.println(option);
            }
            System.out.print("Your Answer (A/B/C/D): ");
            char ans = sc.next().charAt(0);

            if (q.checkAnswer(ans)) {
                System.out.println("✅ Correct!");
                score++;
            } else {
                System.out.println("❌ Wrong! Correct Answer: " + q.correctAnswer);
            }
        }

        // Final Score
        System.out.println("\n----- Quiz Completed -----");
        System.out.println("Your Score: " + score + "/" + questions.size());

        sc.close();
    }
}