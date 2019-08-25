package studios.Quiz;

public class Question {
    private String questionSentence;
    private String answer;
    private int pointValue;

    public Question(String question, String answer, int pointValue) {
        this.questionSentence = question;
        this.answer = answer;
        this.pointValue = pointValue;
    }

    public void askQuestion(){
        System.out.println(questionSentence);
    }

}
