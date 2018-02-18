package com.rathiesh.deckofcards.businesslogiclayer;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;

import java.util.Vector;

/**
 * Created by rathiesh on 18/02/18.
 */

public class SuitModel {
    private String suit;
    private Drawable suitImage;
    private Vector<RankModel> rankModelVector;

    public String getSuit() {
        return suit;
    }

    public void setSuit(String suit) {
        this.suit = suit;
    }

    public Drawable getSuitImage() {
        return suitImage;
    }

    public void setSuitImage(Drawable suitImage) {
        this.suitImage = suitImage;
    }

    public Vector<RankModel> getRankModelVector() {
        return rankModelVector;
    }

    public void setRankModelVector(Vector<RankModel> rankModelVector) {
        this.rankModelVector = rankModelVector;
    }
}
