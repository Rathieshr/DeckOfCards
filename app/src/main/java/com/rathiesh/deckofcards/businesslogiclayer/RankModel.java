package com.rathiesh.deckofcards.businesslogiclayer;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;

/**
 * Created by rathiesh on 18/02/18.
 */

public class RankModel {
    private int rank;
    private Drawable rankImage;

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    public Drawable getRankImage() {
        return rankImage;
    }

    public void setRankImage(Drawable rankImage) {
        this.rankImage = rankImage;
    }
}
