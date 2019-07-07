public class Main {

    public static void main(String[] args) {
        System.out.println("甲");
        TestPaper studentA =new TestPaperA();
        studentA.TestQuestions1();
        studentA.TestQuestions2();
        studentA.TestQuestions3();
        System.out.println("乙");
        TestPaper studentB =new TestPaperB();
        studentB.TestQuestions1();
        studentB.TestQuestions2();
        studentB.TestQuestions3();
    }
}
