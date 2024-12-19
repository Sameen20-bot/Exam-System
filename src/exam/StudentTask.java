package exam;

public class StudentTask implements Runnable {
    private final String studentName;
    private final QuestionBank questionBank;

    public StudentTask(String studentName, QuestionBank questionBank) {
        this.studentName = studentName;
        this.questionBank = questionBank;
    }

    @Override
    public void run() {
        try {
            System.out.println(studentName + " is attempting the exam...");
            for (int i = 0; i < 3; i++) { // Each student answers 3 questions
                String question = questionBank.getQuestion();
                System.out.println(studentName + " got question: " + question);
                Thread.sleep(1000); // Simulate time taken to answer
            }
            System.out.println(studentName + " has completed the exam!");
        } catch (InterruptedException e) {
            System.out.println("Thread interrupted for " + studentName + ": " + e.getMessage());
        }
    }
}

