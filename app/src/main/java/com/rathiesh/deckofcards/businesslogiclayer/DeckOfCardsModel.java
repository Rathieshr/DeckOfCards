package com.rathiesh.deckofcards.businesslogiclayer;

import java.util.Vector;

/**
 * Created by rathiesh on 18/02/18.
 */

public class DeckOfCardsModel {
    private Vector<SuitModel> suitModelVector;

    public Vector<SuitModel> getSuitModelVector() {
        return suitModelVector;
    }

    public void setSuitModelVector(Vector<SuitModel> suitModelVector) {
        this.suitModelVector = suitModelVector;
    }
}
