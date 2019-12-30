package com.example.android.learnmiwok;
import java.lang.String;

public class Word {
    private int mImageResourceId = NO_IMAGE;
    private String mDefaultTranslation;
    private String mMiwokTranslaton;
    private static final int NO_IMAGE = -1;

    public Word(String defaultTranslation, String miwokTranslation){
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslaton = miwokTranslation;
    }

    public Word(int ImageResourceId, String defaultTranslation, String miwokTranslation){
        mImageResourceId = ImageResourceId;
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslaton = miwokTranslation;
    }

    public int getImageResourceId(){ return mImageResourceId; }

    public String getMiwokTranslation(){
        return mMiwokTranslaton;
    }

    public String getDefaulttranslation(){
        return mDefaultTranslation;
    }

    public boolean hasImage(){
        return mImageResourceId != NO_IMAGE;
    }

}
