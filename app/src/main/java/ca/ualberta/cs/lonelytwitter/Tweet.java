package ca.ualberta.cs.lonelytwitter;

import java.util.ArrayList;
import java.util.Date;

import ca.ualberta.cs.lonelytwitter.classes.Mood;

public abstract class Tweet {

    private String message;
    private Date date;
    private ArrayList<Mood> tweetMoods = new ArrayList<Mood>();

    public Tweet(String message){
        this.message = message;
        this.date = new Date();
    }

    public Tweet(String message, Date date) {
        this.message = message;
        this.date = date;
    }

    public abstract Boolean isImportant();

    public void setMessage(String message) throws TweetTooLongException{
        if (message.length() > 140){
            throw new TweetTooLongException();
        } else {
            this.message = message;
        }
    }

    public String getMessage(){
        return this.message;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public ArrayList<Mood> getMoods(){
        return tweetMoods;
    }
    public void setMoods(ArrayList<Mood> newMoods){
        tweetMoods = newMoods;
    }

}