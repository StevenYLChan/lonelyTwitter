package ca.ualberta.cs.lonelytwitter.classes;

import java.util.Date;

/**
 * Created by StevenC on 2017-09-14.
 */

public abstract class Mood {

    private Date date;

    public Mood(){
        date = new Date(System.currentTimeMillis());
    }

    public Mood(Date newDate){
        date = newDate;
    }

    public Date getDate(){
        return date;
    }

    public void setDate(Date newDate){
        date = newDate;
    }

    public abstract String moodDependentFormat();
}

