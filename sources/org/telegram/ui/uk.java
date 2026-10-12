package org.telegram.ui;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
public final class uk extends org.telegram.ui.Components.rd {
    public final boolean f42528e;
    public final eo f42529f;

    public uk(eo eoVar, Context context, boolean z10) {
        super(context);
        this.f42529f = eoVar;
        this.f42528e = z10;
    }

    @Override
    public final void d() {
        int i10;
        if (this.f42528e) {
            i10 = AndroidUtilities.dp(4.0f);
        } else {
            i10 = 0;
        }
        int i11 = i10;
        int i12 = org.telegram.ui.ActionBar.h6.f20899ve;
        eo eoVar = this.f42529f;
        setBackground(org.telegram.ui.ActionBar.h6.X(AndroidUtilities.dp(19.0f), 436207615 & eoVar.getThemedColor(i12), i11, AndroidUtilities.dp(3.0f), 0, AndroidUtilities.dp(3.0f)));
        getImageView().setColorFilter(new PorterDuffColorFilter(eoVar.getThemedColor(i12), PorterDuff.Mode.MULTIPLY));
        getTextView().setTextColor(eoVar.getThemedColor(i12));
    }

    @Override
    public final void setEditButton(boolean z10) {
        int i10;
        super.setEditButton(z10);
        if (this.f42528e) {
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
