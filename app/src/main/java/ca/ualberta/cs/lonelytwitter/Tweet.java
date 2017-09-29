/*
 * Class Name: Tweet
 *
 * Version: Version 1.0
 *
 * Date: September 28, 2017
 *
 * Copyright (c) Steven Chan, CMPUT301, University of Alberta. All Rights Reserved. You may use, distribute, or modify this code under terms and conditions of the Code of Students Behavior at University of Alberta
 */

package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Represents a Tweet
 *
 * @author Steven Chan
 * @version 1.0
 * @see NormalTweet
 * @see ImportantTweet
 * @since 1.0
 */

public abstract class Tweet {

    private String message;
    private Date date;

    /**
     * Constructs Tweet objects
     *
     * @param message tweet message
     */

    public Tweet(String message) {
        this.message = message;
        this.date = new Date();
    }

    /**
     * Constructs Tweet objects
     *
     * @param message tweet message
     * @param date tweet date
     */

    public Tweet(String message, Date date) {
        this.message = message;
        this.date = date;
    }

    /**
     * Checks if tweet is important
     *
     * @return boolean
     */

    public abstract Boolean isImportant();

    /**
     * Sets tweet messages
     *
     * @param message tweet message
     *
     * @throws TweetTooLongException
     */

    public void setMessage(String message) throws TweetTooLongException {
        if (message.length() > 140) {
            throw new TweetTooLongException();
        } else {
            this.message = message;
        }
    }

    /**
     * Gets tweet messages
     *
     * @return message
     */

    public String getMessage() {
        return this.message;
    }

    /**
     * Gets date
     *
     * @return date
     */

    public Date getDate() {
        return date;
    }

    /**
     * Sets date
     *
     * @param date date
     */

    public void setDate(Date date) {
        this.date = date;
    }

    /**
     * String override to include date
     *
     * @return string with date appended to the front of message
     */

    @Override
    public String toString() {
        return date.toString() + " | " + message;
    }
}
