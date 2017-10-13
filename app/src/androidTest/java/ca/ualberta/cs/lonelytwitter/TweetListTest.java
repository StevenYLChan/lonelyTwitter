package ca.ualberta.cs.lonelytwitter;

import android.test.ActivityInstrumentationTestCase2;

import java.util.ArrayList;

/**
 * Created by StevenC on 2017-10-13.
 */

public class TweetListTest extends ActivityInstrumentationTestCase2 {
    public TweetListTest(){
        super(LonelyTwitterActivity.class);
    }

    public void testAddTweet(){
        TweetList tweets = new TweetList();
        Tweet tweet = new NormalTweet("tweet test 1");

        tweets.add(tweet);
        assertTrue(tweets.hasTweet(tweet));
    }

    public void testGetTweet(){
        TweetList tweets = new TweetList();
        Tweet tweet = new NormalTweet("tweet test 2");

        tweets.add(tweet);
        Tweet returnedTweet = tweets.getTweet(0);

        assertEquals(returnedTweet.getMessage(), tweet.getMessage());
        assertEquals(returnedTweet.getDate(), tweet.getDate());
    }

    public void testGetTweets(){
        TweetList tweets = new TweetList();
        Tweet tweet1 = new NormalTweet("tweetTest1");
        Tweet tweet2 = new NormalTweet("tweetTest2");
        Tweet tweet3 = new NormalTweet("tweetTest3");
        tweets.add(tweet1);
        tweets.add(tweet2);
        tweets.add(tweet3);

        ArrayList<Tweet> sortedTweets = tweets.getTweets();

        assertEquals(sortedTweets.get(0), tweet1);
        assertEquals(sortedTweets.get(1), tweet2);
        assertEquals(sortedTweets.get(2), tweet3);
    }

    public void testHasTweet(){
        TweetList tweets = new TweetList();

        Tweet tweet = new NormalTweet("tweet test 3");

        assertFalse(tweets.hasTweet(tweet));

        tweets.add(tweet);

        assertTrue(tweets.hasTweet(tweet));
    }

    public void testGetCount(){
        TweetList tweets = new TweetList();
        Tweet tweet1 = new NormalTweet("tweetTest1");
        Tweet tweet2 = new NormalTweet("tweetTest2");
        Tweet tweet3 = new NormalTweet("tweetTest3");

        tweets.add(tweet1);
        tweets.add(tweet2);
        tweets.add(tweet3);

        assertEquals(tweets.getCount(), 3);
    }

}