public class QuestionModel {
    int questionid; 
    String question ; 
    options options ; 
    char answer;
    public QuestionModel(int questionid, String question, options options, char answer) {
        this.questionid = questionid;
        this.question = question;
        this.options = options;
        this.answer = answer;
    }
    public int getQuestionid() {
        return questionid;
    }
    public void setQuestionid(int questionid) {
        this.questionid = questionid;
    }
    public String getQuestion() {
        return question;
    }
    public void setQuestion(String question) {
        this.question = question;
    }
    public options getOptions() {
        return options;
    }
    public void setOptions(options options) {
        this.options = options;
    }
    public char getAnswer() {
        return answer;
    }
    public void setAnswer(char answer) {
        this.answer = answer;
    }   

}

