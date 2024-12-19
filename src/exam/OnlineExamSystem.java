package exam;

public class OnlineExamSystem {
    public static void main(String[] args) {
        QuestionBank questionBank = new QuestionBank();

        // Create threads for students
        Thread student1 = new Thread(new StudentTask("Alice", questionBank));
        Thread student2 = new Thread(new StudentTask("Bob", questionBank));
        Thread student3 = new Thread(new StudentTask("Charlie", questionBank));

        // Start threads
        student1.start();
        student2.start();
        student3.start();
    }
}
