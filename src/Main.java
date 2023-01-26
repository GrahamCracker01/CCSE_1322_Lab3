//Class: CSE 1322L
//Section: J03
//Term: Spring 2023
//Name: Asher Graham

import java.util.Scanner;
class Main {
    public static void main(String[] args){

        //declare scanner and variables
        Scanner scan = new Scanner(System.in);
        boolean boolQuit = false;
        Quiz quiz = new Quiz();

        //test
        do {
            System.out.println("What would you like to do?\n" +
                    "1. Add a question to the quiz\n" +
                    "2. Remove a question from the quiz\n" +
                    "3. Modify a question in the quiz\n" +
                    "4. Take the quiz\n" +
                    "5. Quit");
            switch (Integer.parseInt(scan.nextLine())) {
                case 1:
                    quiz.add_question();
                    break;
                case 2:
                    quiz.remove_question();
                    break;
                case 3:
                    quiz.modify_question();
                    break;
                case 4:
                    quiz.give_quiz();
                    break;
                case 5:
                    boolQuit = true;
                    break;
                default:
                    System.out.println("Error: please type a valid number");
                    break;
            }
        } while (!boolQuit);


    }
}