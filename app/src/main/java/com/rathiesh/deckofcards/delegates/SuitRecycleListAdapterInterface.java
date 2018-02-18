package com.rathiesh.deckofcards.delegates;

import com.rathiesh.deckofcards.businesslogiclayer.RankModel;

import java.util.Vector;

/**
 * Created by rathiesh on 18/02/18.
 */

public interface SuitRecycleListAdapterInterface {
    void onSuitItemClick(Vector<RankModel> rankModelVector);
}
