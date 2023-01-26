//Class: CSE 1322L
//Section: J03
//Term: Spring 2023
//Name: Asher Graham

import java.util.ArrayList;
import java.util.Scanner;
public class Quiz {

    //declare scanner and variables
    Scanner scan = new Scanner(System.in);
    ArrayList<Question> quiz = new ArrayList<>();
    private String strInput1, strInput2;
    private int intInput, intCount;

    //add question
    public void add_question() {
        System.out.println("What is the question Text?");
        strInput1 = scan.nextLine();
        System.out.println("What is the answer?");
        strInput2 = scan.nextLine();
        System.out.println("How Difficult (1-3)?");
        intInput = Integer.parseInt(scan.nextLine());
        quiz.add(new Question(strInput1, strInput2, intInput));
    }

    //remove question
    public void remove_question() {
        System.out.println("Choose the question to remove?");
        intCount = 0;
        for(Question a : quiz) {
            System.out.println(intCount + ". " + a.getQuestion());
            intCount++;
        }
        intCount = 0;
        intInput = Integer.parseInt(scan.nextLine());
        quiz.remove(intInput);
    }

    //modify question
    public void modify_question() {
        intCount = 0;
        System.out.println("Choose the question to modify?");
        for(Question a : quiz) {
            System.out.println(intCount + ". " + a.getQuestion());
            intCount++;
        }
        intCount = Integer.parseInt(scan.nextLine());
        System.out.println("What is the question Text?");
        strInput1 = scan.nextLine();
        quiz.get(intCount).setQuestion(strInput1);
        System.out.println("What is the answer?");
        strInput2 = scan.nextLine();
        quiz.get(intCount).setAnswer(strInput2);
        System.out.println("How Difficult (1-3)?");
        intInput = Integer.parseInt(scan.nextLine());
        quiz.get(intCount).setDifficulty(intInput);
    }

    //give quiz
    public void give_quiz() {
        intCount = 0;
        for (Question a : quiz) {
            System.out.println(a.getQuestion());
            strInput1 = scan.nextLine();
            if (strInput1.equals(a.getAnswer())) {
                System.out.println("Correct");
                intCount++;
            }
            else {
                System.out.println("Incorrect");
            }
        }
        System.out.println("You got " + intCount + " out of " + quiz.size());
    }


}