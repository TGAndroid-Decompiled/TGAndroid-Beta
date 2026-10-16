package org.telegram.ui;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
public final class uk extends org.telegram.ui.Components.pd {
    public final boolean e;
    public final fo f40422f;

    public uk(fo foVar, Context context, boolean z10) {
        super(context);
        this.f40422f = foVar;
        this.e = z10;
    }

    @Override
    public final void d() {
        int i10;
        if (this.e) {
            i10 = AndroidUtilities.dp(4.0f);
        } else {
            i10 = 0;
        }
        int i11 = i10;
        int i12 = org.telegram.ui.ActionBar.g6.f19941ve;
        fo foVar = this.f40422f;
        setBackground(org.telegram.ui.ActionBar.g6.X(AndroidUtilities.dp(19.0f), 436207615 & foVar.getThemedColor(i12), i11, AndroidUtilities.dp(3.0f), 0, AndroidUtilities.dp(3.0f)));
        getImageView().setColorFilter(new PorterDuffColorFilter(foVar.getThemedColor(i12), PorterDuff.Mode.MULTIPLY));
        getTextView().setTextColor(foVar.getThemedColor(i12));
    }

    @Override
    public final void setEditButton(boolean z10) {
        int i10;
        super.setEditButton(z10);
        if (this.e) {
            TextView textView = getTextView();
            if (z10) {
                i10 = AndroidUtilities.dp(116.0f);
            } else {
                i10 = Integer.MAX_VALUE;
            }
            textView.setMaxWidth(i10);
        }
    }
}
