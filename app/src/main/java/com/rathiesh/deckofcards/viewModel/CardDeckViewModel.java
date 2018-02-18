package com.rathiesh.deckofcards.viewModel;

import android.content.Context;
import android.support.v4.content.ContextCompat;

import com.rathiesh.deckofcards.R;
import com.rathiesh.deckofcards.businesslogiclayer.DeckOfCardsModel;
import com.rathiesh.deckofcards.businesslogiclayer.RankModel;
import com.rathiesh.deckofcards.businesslogiclayer.SuitModel;
import com.rathiesh.deckofcards.delegates.CardDeckInterface;
import com.rathiesh.deckofcards.delegates.CardDeckViewResponseInterface;
import com.rathiesh.deckofcards.enums.Suit;

import java.util.Vector;

/**
 * Created by rathiesh on 18/02/18.
 * Viewmodel class which supports the cardDeckActivity
 */

public class CardDeckViewModel extends CardDeckBaseViewModel implements CardDeckInterface {

    //interface to be implemented in activity
    private CardDeckViewResponseInterface cardDeckViewResponseInterface;
    private Context mContext;
    // The min and max valid card ranks // total 13
    private static final int MIN_RANK = 2;
    private static final int MAX_RANK = 14;

    /**
     * @param mContext - context of activity
     * @param cardDeckViewResponseInterface - response interface
     */
    public CardDeckViewModel(Context mContext,CardDeckViewResponseInterface cardDeckViewResponseInterface) {
        this.mContext = mContext;
        this.cardDeckViewResponseInterface = cardDeckViewResponseInterface;
    }

    /**
     * This method creates the main business logic model.
     * All the data needed for application are constructed in this method
     */
    @Override
    public void createSuitRankModel() {
        //Suit vector and model , Rank model and vectors are initialized
        Vector<SuitModel>suitModelVector = new Vector<>();
        SuitModel suitModel = new SuitModel();
        Vector<RankModel> rankModelVector = new Vector<>();

        for (int i = MIN_RANK;i<=MAX_RANK;i++){
            RankModel rankModel = new RankModel();
            rankModel.setRank(i);
            rankModel.setRankImage(ContextCompat.getDrawable(mContext, R.drawable.clover));
            rankModelVector.add(rankModel);
        }
        suitModel.setSuit(Suit.CLUBS.name());            // Clubs/Clover
        suitModel.setSuitImage(ContextCompat.getDrawable(mContext, R.drawable.clover));
        suitModel.setRankModelVector(rankModelVector);
        suitModelVector.add(suitModel);

        suitModel = new SuitModel();
        rankModelVector = new Vector<>();
        for (int i = MIN_RANK;i<=MAX_RANK;i++){
            RankModel rankModel = new RankModel();
            rankModel.setRank(i);
            rankModel.setRankImage(ContextCompat.getDrawable(mContext, R.drawable.diamond));
            rankModelVector.add(rankModel);
        }
        suitModel.setSuit(Suit.DIAMONDS.name());        // Diamond
        suitModel.setSuitImage(ContextCompat.getDrawable(mContext, R.drawable.diamond));
        suitModel.setRankModelVector(rankModelVector);
        suitModelVector.add(suitModel);

        suitModel = new SuitModel();
        rankModelVector = new Vector<>();
        for (int i = MIN_RANK;i<=MAX_RANK;i++){
            RankModel rankModel = new RankModel();
            rankModel.setRank(i);
            rankModel.setRankImage(ContextCompat.getDrawable(mContext, R.drawable.heart));
            rankModelVector.add(rankModel);
        }
        suitModel.setSuit(Suit.HEARTS.name());         //Hearts
        suitModel.setSuitImage(ContextCompat.getDrawable(mContext, R.drawable.heart));
        suitModel.setRankModelVector(rankModelVector);
        suitModelVector.add(suitModel);

        suitModel = new SuitModel();
        rankModelVector = new Vector<>();
        for (int i = MIN_RANK;i<=MAX_RANK;i++){
            RankModel rankModel = new RankModel();
            rankModel.setRank(i);
            rankModel.setRankImage(ContextCompat.getDrawable(mContext, R.drawable.spades));
            rankModelVector.add(rankModel);
        }
        suitModel.setSuit(Suit.SPADES.name());         //Spades
        suitModel.setSuitImage(ContextCompat.getDrawable(mContext, R.drawable.spades));
        suitModel.setRankModelVector(rankModelVector); // rank model vector is set in suit
        suitModelVector.add(suitModel);                // Suit model is set in suit vector
        DeckOfCardsModel deckOfCardsModel = new DeckOfCardsModel();
        deckOfCardsModel.setSuitModelVector(suitModelVector);   //Suit vector is set into deck of cards model
        setDeckOfCardsModel(deckOfCardsModel);                  // deck of cards model is set in baseview model
        cardDeckViewResponseInterface.onModelCreated();         // view response interface called
    }
}
