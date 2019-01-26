package com.example.android.miwok;

public class Word {
    private String mDefaultTranslation;
    private String mMiwokTranslation;
    private int mImageResourceId;


    //private int mImageResourceId =  NO_IMAGE_PROVIDED;
    //private static final int NO_IMAGE_PROVIDED = -1;

    /**
     * Create a new Word object
     *
     * @param defaultTranslation is the word in the language that the user is already familiar with
     *                           (such as English)
     * @param miwokTranslation is the word in the Miwok language
     */

    public Word (String defaultTranslation, String miwokTranslation) {
            mDefaultTranslation = defaultTranslation;
            mMiwokTranslation = miwokTranslation;
    }

    /**
     * Create a new Word object.
     *
     * @param defaultTranslation is the word in a language that the user is already familiar with
     *                           (such as English)
     * @param miwokTranslation is the word in the Miwok language
     * @param imageResourceId is the drawable resource ID for the image associated with the word
     *
     */

    public Word(String defaultTranslation, String miwokTranslation, int imageResourceId) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mImageResourceId = imageResourceId;
    }

    public int getImageResourceId() {
        return mImageResourceId;
    }

    public String getMiwokTranslation() {
        return mMiwokTranslation;
    }

    public String getDefaultTranslation() {
        return mDefaultTranslation;
    }

    /*public boolean hasImage() {
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }*/
}
