/*
 * Interface Name: Tweetable
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
 * Represents a interface for tweets
 *
 * @author Steven Chan
 * @version 1.0
 * @see ImportantTweet
 * @since 1.0
 */

public interface Tweetable {
    String getMessage();
    Date getDate();
}
