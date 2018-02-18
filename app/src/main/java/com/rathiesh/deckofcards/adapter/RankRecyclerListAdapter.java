package com.rathiesh.deckofcards.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.rathiesh.deckofcards.R;
import com.rathiesh.deckofcards.businesslogiclayer.DeckOfCardsModel;
import com.rathiesh.deckofcards.businesslogiclayer.RankModel;
import com.rathiesh.deckofcards.businesslogiclayer.SuitModel;
import com.rathiesh.deckofcards.delegates.SuitRecycleListAdapterInterface;

import java.util.Vector;

/**
 * Created by rathiesh on 18/02/18.
 * Rank recyclerlistadapter is used for setting up adapter in recyclerview in activity
 * It is used to display rank from lowest to highest order. 2 - A[2,3,4,5,6,7,8,9,10,J,Q,K,A]
 */

public class RankRecyclerListAdapter extends RecyclerView.Adapter<RankRecyclerListAdapter.AdapterViewHolder> {
    private View itemview;    //View to inflate
    private Context mContext;
    private Vector<RankModel> rankModelVector= new Vector<>();  // rank vector declaration

    /**
     * @param mContext - instance of activity
     * @param rankModelVector - rank vector of the corresponding suit. passed on click.
     */
    public RankRecyclerListAdapter(Context mContext,Vector<RankModel> rankModelVector) {
        this.mContext = mContext;
        this.rankModelVector = rankModelVector;
    }

    @Override
    public AdapterViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        itemview = LayoutInflater.from(parent.getContext()).inflate(R.layout.adapter_card_layout, parent, false); //Inflator
        return new AdapterViewHolder(itemview);  // the view
    }

    /**
     * @param holder - view holder
     * @param position - position if the list item
     *                 all Data is set here
     */
    @Override
    public void onBindViewHolder(AdapterViewHolder holder, final int position) {
        String rank;
        if(rankModelVector.get(position).getRank() == 11) {
            rank = "Jack";
        }else if(rankModelVector.get(position).getRank() == 12) {
            rank = "Queen";
        }else if(rankModelVector.get(position).getRank() == 13) {
            rank = "King";
        }else if(rankModelVector.get(position).getRank() == 14) {
            rank = "Ace";
        } else {
            rank = String.valueOf(rankModelVector.get(position).getRank());
        }
        holder.rank.setText(rank);
        holder.top_suit_icon.setImageDrawable(rankModelVector.get(position).getRankImage());
        holder.bottom_suit_icon.setImageDrawable(rankModelVector.get(position).getRankImage());
    }

    /**
     * @return - List item count
     */
    @Override
    public int getItemCount() {
        return rankModelVector.size();
    }

    /**
     * View holder class
     */
    public class AdapterViewHolder extends RecyclerView.ViewHolder {
        private TextView rank;
        private ImageView top_suit_icon;
        private ImageView bottom_suit_icon;
        private LinearLayout content_linear_layout;

        public AdapterViewHolder(View itemView) {
            super(itemView);
            rank = itemView.findViewById(R.id.rank);
            top_suit_icon = itemView.findViewById(R.id.top_suit_icon);
            bottom_suit_icon = itemView.findViewById(R.id.bottom_suit_icon);
            content_linear_layout = itemView.findViewById(R.id.content_linear_layout);
        }
    }

}
