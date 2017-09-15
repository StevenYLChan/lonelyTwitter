package ca.ualberta.cs.lonelytwitter;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;

import ca.ualberta.cs.lonelytwitter.classes.Mood;
import ca.ualberta.cs.lonelytwitter.classes.HappyMood;
import ca.ualberta.cs.lonelytwitter.classes.SadMood;
/**
 * Created by joshua2 on 9/16/15.
 */
public abstract class Tweet extends Object implements Tweetable {
    private String text;
    protected Date date;
    private ArrayList<Mood> tweetMoods = new ArrayList<Mood>();

    public Tweet(String tweet, Date date) throws TweetTooLongException {
        this.setText(tweet);
        this.date = date;
    }

    public Tweet(String tweet) throws TweetTooLongException {
        this.setText(tweet);
        this.date = new Date();
    }

    public String getText() {
        return text;
    }

    public void setText(String text) throws TweetTooLongException {
        if (text.length() <= 140) {
            this.text = text;
        } else {
            throw new TweetTooLongException();
        }
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public abstract Boolean isImportant();

    public ArrayList<Mood> getMoods(){
        return tweetMoods;
    }

    public void setMoods(ArrayList<Mood> newMoods){
        tweetMoods = newMoods;
    }
}
