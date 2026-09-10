package org.telegram.ui;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
public final class rk extends org.telegram.ui.Components.md {
    public final boolean e;
    public final eo f36381f;

    public rk(eo eoVar, Context context, boolean z10) {
        super(context);
        this.f36381f = eoVar;
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
        int i11 = org.telegram.ui.ActionBar.j6.f18261ve;
        eo eoVar = this.f36381f;
        setBackground(org.telegram.ui.ActionBar.j6.W(AndroidUtilities.dp(19.0f), 436207615 & eoVar.getThemedColor(i11), i10, AndroidUtilities.dp(3.0f), 0, AndroidUtilities.dp(3.0f)));
        getImageView().setColorFilter(new PorterDuffColorFilter(eoVar.getThemedColor(i11), PorterDuff.Mode.MULTIPLY));
        getTextView().setTextColor(eoVar.getThemedColor(i11));
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
