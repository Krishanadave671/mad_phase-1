import java.util.ArrayList;

abstract class Topic{
    String getTopicName(){
        return this.getClass().getName(); 
    }
    abstract ArrayList<QuestionModel> getquestions(); 
}
