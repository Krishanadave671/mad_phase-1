import java.util.ArrayList;

public class Maths extends Topic {

    
    @Override
    ArrayList<QuestionModel> getquestions() {
        ArrayList <QuestionModel> questions = new ArrayList<>(); 
        questions.add(new QuestionModel(1, "what is name ? ",
        new options("Hello", "Yash ", "Krishana ", "Soham"), 'a')); 
        questions.add(new QuestionModel(2, "what is your age ? ",
        new options("Hello", "Yash ", "Krishana ", "Soham"), 'b')); 
        questions.add(new QuestionModel(3, "where do you live ? ",
        new options("Hello", "Yash ", "Krishana ", "Soham"), 'c')); 
        questions.add(new QuestionModel(4, "How are you ? ",
        new options("Hello", "Yash ", "Krishana ", "Soham"), 'd')); 
        questions.add(new QuestionModel(5, "what is you percentage? ",
        new options("Hello", "Yash ", "Krishana ", "Soham"), 'a')); 
        questions.add(new QuestionModel(6, "what you want to be  ? ",
        new options("Hello", "Yash ", "Krishana ", "Soham"),'b')); 

       return questions ; 
    }
}
