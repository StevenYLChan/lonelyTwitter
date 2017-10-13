package ca.ualberta.cs.lonelytwitter;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * Created by StevenC on 2017-10-13.
 */

public class TweetList {
    private ArrayList<Tweet> tweets = new ArrayList<Tweet>();

    public void add(Tweet tweet){
        if(this.hasTweet(tweet)){
            throw new IllegalArgumentException();
        }

        tweets.add(tweet);
    }

    public Tweet getTweet(int index){
        return tweets.get(index);
    }

    //Sort code obtained from:
    // https://stackoverflow.com/questions/5927109/sort-objects-in-arraylist-by-date
    public ArrayList<Tweet> getTweets(){
        Collections.sort(tweets, new Comparator<Tweet>() {
            public int compare(Tweet o1, Tweet o2) {
                if (o1.getDate() == null || o2.getDate() == null)
                    return 0;
                return o1.getDate().compareTo(o2.getDate());
            }
        });

        return tweets;
    }

    public boolean hasTweet(Tweet tweet){
        return tweets.contains(tweet);
    }

    public int getCount(){
        return tweets.size();
    }



}
