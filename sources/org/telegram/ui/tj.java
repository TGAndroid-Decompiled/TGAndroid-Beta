package org.telegram.ui;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.widget.TextView;
public final class tj extends org.telegram.ui.Components.bd {
    public org.telegram.ui.Cells.y f52287e;
    public int f52288f;
    public final boolean h;
    public final bn f52289n;

    public tj(bn bnVar, Context context, boolean z10) {
        super(context);
        this.f52289n = bnVar;
        this.h = z10;
    }

    @Override
    public final void d() {
        int i7;
        try {
            int themedColor = this.f52289n.getThemedColor(org.telegram.ui.ActionBar.m6.f29537nf);
            if (this.f52287e != null) {
                Drawable background = getBackground();
                Drawable drawable = this.f52287e;
                if (background == drawable) {
                    if (themedColor != this.f52288f) {
                        org.telegram.ui.ActionBar.m6.H1(drawable, themedColor & 436207615, true);
                    }
                    if (getImageView() != null && (themedColor != this.f52288f || getImageView().getColorFilter() == null)) {
                        getImageView().setColorFilter(new PorterDuffColorFilter(themedColor, PorterDuff.Mode.MULTIPLY));
                    }
                    this.f52288f = themedColor;
                    if (getTextView() == null && getTextView().getCurrentTextColor() != themedColor) {
                        getTextView().setTextColor(themedColor);
                        return;
                    }
                }
            }
            if (this.h) {
                i7 = org.telegram.messenger.g0.L(4.0f);
            } else {
                i7 = 0;
            }
            int i10 = i7;
            org.telegram.ui.Cells.y Y = org.telegram.ui.ActionBar.m6.Y(org.telegram.messenger.g0.L(19.0f), themedColor & 436207615, i10, org.telegram.messenger.g0.L(3.0f), 0, org.telegram.messenger.g0.L(3.0f));
            this.f52287e = Y;
            setBackground(Y);
            if (getImageView() != null) {
                getImageView().setColorFilter(new PorterDuffColorFilter(themedColor, PorterDuff.Mode.MULTIPLY));
            }
            this.f52288f = themedColor;
            if (getTextView() == null) {
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override
    public final void setEditButton(boolean z10) {
        int i7;
        super.setEditButton(z10);
        if (this.h) {
            TextView textView = getTextView();
            if (z10) {
                i7 = org.telegram.messenger.g0.L(116.0f);
            } else {
                i7 = Integer.MAX_VALUE;
            }
            textView.setMaxWidth(i7);
        }
    }
}
