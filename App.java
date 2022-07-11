import java.util.ArrayList;
import java.util.Scanner;

class App implements Response{
  static int correct ; 
  static int wrong ; 
    public static void main(String[] args) {
     
      Scanner sc = new Scanner(System.in); 
       ArrayList <Topic> topics = new ArrayList<>(); 
       topics.add(new Maths()); 
       for(int i = 0 ; i < topics.size(); i++){
        System.out.println("Welcome to " + topics.get(i).getTopicName() + " Quiz!!" + "\n");
        ArrayList<QuestionModel> questions = topics.get(i).getquestions(); 
        for(int j = 0 ; j < questions.size(); j++){
            System.out.println(questions.get(j).getQuestion());
            System.out.println(" a) " + questions.get(j).getOptions().a);
            System.out.println(" b) " + questions.get(j).getOptions().b);
            System.out.println(" c) " + questions.get(j).getOptions().c);
            System.out.println(" d) " + questions.get(j).getOptions().d);
            char  answer = sc.next().charAt(0); 
            if(answer == questions.get(i).getAnswer()){
                
                System.out.println("Correct Answer");
            }else{
              System.out.println("oops ! Incorrect Answer");
           
            }
        }
        System.out.println("Results of " + topics.get(i).getTopicName() + "Quiz are :");
        System.out.println("Correct answers are " + correct );
        System.out.println("Wrong answers are  " + wrong );
       }
      }

    @Override
    public void onCorrect() {
        System.out.println("Congragulations ! your answer is correct !");
        correct ++; 
    }

    @Override
    public void onWrong() {
       System.out.println("your anwer is wrong !");
       wrong ++ ; 
    }
      
}