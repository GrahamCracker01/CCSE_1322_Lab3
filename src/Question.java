//Class: CSE 1322L
//Section: J03
//Term: Spring 2023
//Name: Asher Graham

public class Question {

    //declare variables
    private String strQuestion, strAnswer;
    private int intDifficulty;

    //constructor
    public Question (String strQuestion, String strAnswer, int intDifficulty) {
        this.strQuestion = strQuestion;
        this.strAnswer = strAnswer;
        this.intDifficulty = intDifficulty;
    }

    //setters
    public void setQuestion(String strQuestion) {
        this.strQuestion = strQuestion;
    }
    public void setAnswer(String strAnswer) {
        this.strAnswer = strAnswer;
    }
    public void setDifficulty(int intDifficulty) {
        this.intDifficulty = intDifficulty;
    }

    //getters
    public String getQuestion() {
        return this.strQuestion;
    }
    public String getAnswer() {
        return this.strAnswer;
    }
    public int getDifficulty() {
        return this.intDifficulty;
    }

    //toString override
    @Override
    public String toString() {
        return (this.strQuestion);
    }
}
