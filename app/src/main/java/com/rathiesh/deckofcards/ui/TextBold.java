package com.rathiesh.deckofcards.ui;

import android.content.Context;
import android.graphics.Typeface;
import android.support.v7.widget.AppCompatTextView;
import android.util.AttributeSet;
/**
 * Created by rathiesh on 16/02/18.
 */
public class TextBold extends AppCompatTextView {
    public TextBold(Context context, AttributeSet attributeSet) {
        super(context,attributeSet);
        this.setTypeface(Typeface.createFromAsset(context.getAssets(),"fonts/metropolis-extra-bold.otf"));
    }
}
