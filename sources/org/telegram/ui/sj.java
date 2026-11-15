package org.telegram.ui;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.widget.TextView;
public final class sj extends org.telegram.ui.Components.sc {
    public org.telegram.ui.Cells.y f51227e;
    public int f51228f;
    public final boolean h;
    public final an f51229n;

    public sj(an anVar, Context context, boolean z10) {
        super(context);
        this.f51229n = anVar;
        this.h = z10;
    }

    @Override
    public final void d() {
        int i7;
        try {
            int themedColor = this.f51229n.getThemedColor(org.telegram.ui.ActionBar.j6.f29039nf);
            if (this.f51227e != null) {
                Drawable background = getBackground();
                Drawable drawable = this.f51227e;
                if (background == drawable) {
                    if (themedColor != this.f51228f) {
                        org.telegram.ui.ActionBar.j6.H1(drawable, themedColor & 436207615, true);
                    }
                    if (getImageView() != null && (themedColor != this.f51228f || getImageView().getColorFilter() == null)) {
                        getImageView().setColorFilter(new PorterDuffColorFilter(themedColor, PorterDuff.Mode.MULTIPLY));
                    }
                    this.f51228f = themedColor;
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
            org.telegram.ui.Cells.y Y = org.telegram.ui.ActionBar.j6.Y(org.telegram.messenger.g0.L(19.0f), themedColor & 436207615, i10, org.telegram.messenger.g0.L(3.0f), 0, org.telegram.messenger.g0.L(3.0f));
            this.f51227e = Y;
            setBackground(Y);
            if (getImageView() != null) {
                getImageView().setColorFilter(new PorterDuffColorFilter(themedColor, PorterDuff.Mode.MULTIPLY));
            }
            this.f51228f = themedColor;
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
