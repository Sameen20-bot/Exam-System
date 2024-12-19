package exam;

import java.util.ArrayList;
import java.util.List;

public class QuestionBank {
    private final List<String> questions = new ArrayList<>();

    public QuestionBank() {
        // Initialize question bank
        questions.add("What is the capital of France?");
        questions.add("Solve: 5 + 3 * 2.");
        questions.add("Who wrote 'Hamlet'?");
        questions.add("What is the chemical symbol for water?");
        questions.add("Name the largest planet in our solar system.");
    }

    public synchronized String getQuestion() {
        if (questions.isEmpty()) {
            return "No more questions available!";
        }
        return questions.remove(0); // Remove and return the first question
    }
}
