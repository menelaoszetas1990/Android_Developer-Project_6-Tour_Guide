package com.example.menelaos.tourguidexanthi;

//{@link Attraction} represents an attraction that the user wants to see
//It contains resource IDs for the name of the attraction, description of the attraction and image file for the attraction
public class Attraction {

    // attraction name id
    private int mAttractionName;

    // attraction description id
    private int mAttractionDescription;

    // attraction cost id
    private int mAttractionCost;

    // Constant value that represents no cost was provided for this attraction
    private static final int NO_COST_PROVIDED = 0;

    // attraction image id
    private int mImageResourceId;

    /**
     * Create a new Attraction object.
     *
     * @param attractionName        is the string resource ID for the title of the attraction
     * @param attractionDescription is the string resource Id for the description of the attraction
     * @param imageResourceId       is the drawable resource ID for the image associated with the word
     */
    public Attraction(int attractionName, int attractionDescription, int imageResourceId) {
        mAttractionName = attractionName;
        mAttractionDescription = attractionDescription;
        mImageResourceId = imageResourceId;
    }

    /**
     * Create a new Attraction object.
     *
     * @param attractionName        is the string resource ID for the title of the attraction
     * @param attractionDescription is the string resource Id for the description of the attraction
     * @param imageResourceId       is the drawable resource ID for the image associated with the word
     * @param attractionCost        is the string for the cost of the attraction
     */
    public Attraction(int attractionName, int attractionDescription, int imageResourceId, int attractionCost) {
        mAttractionName = attractionName;
        mAttractionDescription = attractionDescription;
        mImageResourceId = imageResourceId;
        mAttractionCost = attractionCost;
    }

    // Get the name of the attraction.
    public int getAttractionName() {
        return mAttractionName;
    }

    // Get the description of the attraction.
    public int getAttractionDescription() {
        return mAttractionDescription;
    }

    // Return the image resource ID of the attraction.
    public int getImageResourceId() {
        return mImageResourceId;
    }

    // Return the image resource ID of the attraction.
    public int getCostId() {
        return mAttractionCost;
    }

    // Returns whether or not there is a cost for this attraction;
    public boolean hasCost() {
        return mAttractionCost != NO_COST_PROVIDED;
    }

}