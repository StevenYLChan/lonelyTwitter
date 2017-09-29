/*
 * Class Name: NormalTweet
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
 * Represents a NormalTweet
 *
 * @author Steven Chan
 * @version 1.0
 * @see Tweet
 * @see ImportantTweet
 * @since 1.0
 */

public class NormalTweet extends Tweet {

    /**
     * Constructs NormalTweet objects
     *
     * @param message message
     */

    public NormalTweet(String message) {
        super(message);
    }

    /**
     * Constructs NormalTweet objects
     *
     * @param message message
     * @param date date
     */

    public NormalTweet(String message, Date date) {
        super(message, date);
    }

    /**
     * Returns FALSE flag for importance
     *
     * @return boolean false
     */

    @Override
    public Boolean isImportant(){
        return Boolean.FALSE;
    }

}
