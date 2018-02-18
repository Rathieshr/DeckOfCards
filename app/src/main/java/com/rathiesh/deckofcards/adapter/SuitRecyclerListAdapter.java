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
import com.rathiesh.deckofcards.businesslogiclayer.SuitModel;
import com.rathiesh.deckofcards.delegates.SuitRecycleListAdapterInterface;

import java.util.Vector;

/**
 * Created by rathiesh on 18/02/18.
 */

public class SuitRecyclerListAdapter extends RecyclerView.Adapter<SuitRecyclerListAdapter.AdapterViewHolder> {
    private View itemview;
    private Context mContext;
    Vector<SuitModel>suitModelVector = new Vector<>();
    private SuitRecycleListAdapterInterface suitRecycleListAdapterInterface;
    private DeckOfCardsModel deckOfCardsModel = new DeckOfCardsModel();


    /**
     * @param mContext- instance of activity
     * @param deckOfCardsModel - model ehich contain data
     * @param suitRecycleListAdapterInterface - interface to call click list item.
     */
    public SuitRecyclerListAdapter(Context mContext, DeckOfCardsModel deckOfCardsModel,SuitRecycleListAdapterInterface suitRecycleListAdapterInterface) {
        this.mContext = mContext;
        this.deckOfCardsModel = deckOfCardsModel;
        this.suitRecycleListAdapterInterface = suitRecycleListAdapterInterface;
    }

    @Override
    public AdapterViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        itemview = LayoutInflater.from(parent.getContext()).inflate(R.layout.adapter_suit_card_layout, parent, false); //inflator
        return new AdapterViewHolder(itemview); // the view
    }

    /**
     * @param holder - view holder
     * @param position - position if the list item
     *                 all Data is set here
     */
    @Override
    public void onBindViewHolder(AdapterViewHolder holder, final int position) {

        suitModelVector = deckOfCardsModel.getSuitModelVector();
        holder.suit.setText(suitModelVector.get(position).getSuit());
        holder.suit_icon.setImageDrawable(suitModelVector.get(position).getSuitImage());
        holder.content_linear_layout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                suitRecycleListAdapterInterface.onSuitItemClick(suitModelVector.get(position).getRankModelVector());
            }
        });

    }

    /**
     * @return - List item count
     */
    @Override
    public int getItemCount() {
        return deckOfCardsModel.getSuitModelVector().size();
    }

    /**
     * ViewHolder class
     */
    public class AdapterViewHolder extends RecyclerView.ViewHolder {
        private TextView suit;
        private ImageView suit_icon;
        private LinearLayout content_linear_layout;

        public AdapterViewHolder(View itemView) {
            super(itemView);
            suit = itemView.findViewById(R.id.suit);
            suit_icon = itemView.findViewById(R.id.suit_icon);
            content_linear_layout = itemView.findViewById(R.id.content_linear_layout);
        }
    }

}
