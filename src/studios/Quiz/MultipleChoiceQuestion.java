package studios.Quiz;

import java.util.ArrayList;
import java.util.List;

public class MultipleChoiceQuestion extends Question {

    private List<String> choices = new ArrayList<>();

    public MultipleChoiceQuestion(String question, String answer, int pointValue, List<String> choices) {
        super(question, answer, pointValue);
        this.choices = choices;
    }
}
