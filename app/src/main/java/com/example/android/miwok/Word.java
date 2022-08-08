package com.example.android.miwok;

public class Word {
    private String mDefaultTransition;

    private String mMiwokTransition;

    private int mImageResourceId = NO_IMAGE_PROVIDED;

    private static final int NO_IMAGE_PROVIDED = -1;

    private int mAudioResourceId;

    public Word(String defaultTransision, String miwokTranslation, int audioResourceId){
        mDefaultTransition = defaultTransision;
        mMiwokTransition = miwokTranslation;
        mAudioResourceId = audioResourceId;
    }

    public Word(String defaultTransision, String miwokTranslation, int imageResourceId, int audioResourceId){
        mDefaultTransition = defaultTransision;
        mMiwokTransition = miwokTranslation;
        mImageResourceId = imageResourceId;
        mAudioResourceId = audioResourceId;
    }

    public String getDefaultTransition(){
        return mDefaultTransition;
    }

    public String getMiwokTransition(){
        return mMiwokTransition;
    }

    public int getImageResourceId(){
        return mImageResourceId;
    }

    public boolean hasImage(){
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }

    public int getAudioResourceId(){return mAudioResourceId;}
}
