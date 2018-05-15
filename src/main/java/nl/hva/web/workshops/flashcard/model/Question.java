package nl.hva.web.workshops.flashcard.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * A question of a flash card
 * 
 * @author marciofk
 */
public class Question implements Serializable {
    
    private int id;
    private String title;
    private String question;
    private List<Answersome> answersomes;
    
    public Question() {}
    
    public Question(int id, String title, String question) {
        setId(id);
        setTitle(title);
        setQuestion(question);
        setAnswersomes(new ArrayList<>());
    }

    public int getId() {
        return id;
    }

    public final void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public final void setTitle(String title) {
        this.title = title;
    }

    public String getQuestion() {
        return question;
    }

    public final void setQuestion(String question) {
        this.question = question;
    }

    public List<Answersome> getAnswersomes() {
        return answersomes;
    }

    public final void setAnswersomes(List<Answersome> answersomes) {
        this.answersomes = answersomes;
    }
    
    public void addAnswer(Answersome a) {
        getAnswersomes().add(a);
    }
    
}
