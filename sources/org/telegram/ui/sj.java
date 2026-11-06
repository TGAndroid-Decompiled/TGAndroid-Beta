package org.telegram.ui;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.widget.TextView;
public final class sj extends org.telegram.ui.Components.xc {
    public org.telegram.ui.Cells.y f49782e;
    public int f49783f;
    public final boolean h;
    public final an f49784n;

    public sj(an anVar, Context context, boolean z9) {
        super(context);
        this.f49784n = anVar;
        this.h = z9;
    }

    @Override
    public final void d() {
        int i7;
        try {
            int themedColor = this.f49784n.getThemedColor(org.telegram.ui.ActionBar.k6.f27985kf);
            if (this.f49782e != null) {
                Drawable background = getBackground();
                Drawable drawable = this.f49782e;
                if (background == drawable) {
                    if (themedColor != this.f49783f) {
                        org.telegram.ui.ActionBar.k6.H1(drawable, themedColor & 436207615, true);
                    }
                    if (getImageView() != null && (themedColor != this.f49783f || getImageView().getColorFilter() == null)) {
                        getImageView().setColorFilter(new PorterDuffColorFilter(themedColor, PorterDuff.Mode.MULTIPLY));
                    }
                    this.f49783f = themedColor;
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
            org.telegram.ui.Cells.y Y = org.telegram.ui.ActionBar.k6.Y(org.telegram.messenger.g0.L(19.0f), themedColor & 436207615, i10, org.telegram.messenger.g0.L(3.0f), 0, org.telegram.messenger.g0.L(3.0f));
            this.f49782e = Y;
            setBackground(Y);
            if (getImageView() != null) {
                getImageView().setColorFilter(new PorterDuffColorFilter(themedColor, PorterDuff.Mode.MULTIPLY));
            }
            this.f49783f = themedColor;
            if (getTextView() == null) {
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override
    public final void setEditButton(boolean z9) {
        int i7;
        super.setEditButton(z9);
        if (this.h) {
            TextView textView = getTextView();
            if (z9) {
                i7 = org.telegram.messenger.g0.L(116.0f);
            } else {
                i7 = Integer.MAX_VALUE;
            }
            textView.setMaxWidth(i7);
        }
    }
}
