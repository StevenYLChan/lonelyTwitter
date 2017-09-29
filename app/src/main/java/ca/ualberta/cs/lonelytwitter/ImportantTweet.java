/*
 * Class Name: ImportantTweet
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
 * Represents a ImportantTweet
 *
 * @author Steven Chan
 * @version 1.0
 * @see Tweet
 * @see NormalTweet
 * @see Tweetable
 * @since 1.0
 */

public class ImportantTweet extends Tweet implements Tweetable {

    /**
     * Constructs ImportTweet objects
     *
     * @param message message
     */

    public ImportantTweet(String message){
        super(message);
    }

    /**
     * Constructs ImportTweet objects
     * @param message message
     * @param date date
     */

    public ImportantTweet(String message, Date date) {
        super(message, date);
    }

    /**
     * Returns TRUE flag for importance
     * @return boolean true
     */

    @Override
    public Boolean isImportant(){
        return Boolean.TRUE;
    }
}
