package com.example.laurenmateo.criminalintent;
import java.util.UUID;
import java.util.Date;

/**
 * Created by laurenmateo on 3/15/18.
 */

public class Crime {
    private UUID mId;
    private String mTitle;
    private Date mDate;
    private boolean mSolved;
    public Crime()
    {
        mId = UUID.randomUUID();
        mDate = new Date();

    }
    public UUID getID()
    {
        return mId;
    }
    public String getTitle()
    {
        return mTitle;
    }
    public void setTitle(String title)
    {
        mTitle=title;
    }
    public Date getDate()
    {
        return mDate;
    }
    public void setDate(Date date)
    {
        mDate=date;
    }
    public boolean isSolved()
    {
        return mSolved;
    }
    public void setSolved(boolean solved)
    {
        mSolved=solved;
    }

}
