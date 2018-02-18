package com.rathiesh.deckofcards.viewModel;

import com.rathiesh.deckofcards.businesslogiclayer.DeckOfCardsModel;
import com.rathiesh.deckofcards.businesslogiclayer.RankModel;
import com.rathiesh.deckofcards.businesslogiclayer.SuitModel;

/**
 * Created by rathiesh on 18/02/18.
 */

public class CardDeckBaseViewModel {
    private DeckOfCardsModel deckOfCardsModel;
    private SuitModel suitModel;
    private RankModel rankModel;

    public DeckOfCardsModel getDeckOfCardsModel() {
        return deckOfCardsModel;
    }

    public void setDeckOfCardsModel(DeckOfCardsModel deckOfCardsModel) {
        this.deckOfCardsModel = deckOfCardsModel;
    }

    public SuitModel getSuitModel() {
        return suitModel;
    }

    public void setSuitModel(SuitModel suitModel) {
        this.suitModel = suitModel;
    }

    public RankModel getRankModel() {
        return rankModel;
    }

    public void setRankModel(RankModel rankModel) {
        this.rankModel = rankModel;
    }
}
