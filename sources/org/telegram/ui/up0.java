package org.telegram.ui;

import android.content.Context;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class up0 extends LinearLayout {
    public final org.telegram.ui.Components.ia0 f42545a;
    public final org.telegram.ui.Components.ia0 f42546b;
    public final wp0 f42547c;

    public up0(wp0 wp0Var, Context context) {
        super(context);
        org.telegram.ui.ActionBar.c6 c6Var;
        int i10;
        org.telegram.ui.ActionBar.c6 c6Var2;
        this.f42547c = wp0Var;
        setOrientation(1);
        cq0 cq0Var = wp0Var.f43597p0;
        setBackgroundColor(cq0Var.getThemedColor(org.telegram.ui.ActionBar.h6.f20559d6));
        org.telegram.ui.Components.y9 y9Var = new org.telegram.ui.Components.y9(getContext());
        y9Var.setImageDrawable(new org.telegram.ui.Components.fk0(R.raw.utyan_draw, AndroidUtilities.dp(120.0f), AndroidUtilities.dp(120.0f)));
        addView(y9Var, w7.w5.t(120, 120, 1, 0, 6, 0, 0));
        Context context2 = getContext();
        int i11 = org.telegram.ui.ActionBar.h6.f20945y6;
        c6Var = ((org.telegram.ui.ActionBar.m2) cq0Var).resourceProvider;
        org.telegram.ui.Components.ia0 a2 = w7.a6.a(context2, 14.0f, i11, false, c6Var);
        this.f42545a = a2;
        a2.setGravity(17);
        if (wp0Var.m0 == 0) {
            i10 = R.string.Gift2PeerColorProfileEmptyTitle;
        } else {
            i10 = R.string.Gift2PeerColorReplyEmptyTitle;
        }
        a2.setText(LocaleController.getString(i10));
        addView(a2, w7.w5.t(-1, -2, 1, 64, 8, 64, 8));
        Context context3 = getContext();
        int i12 = org.telegram.ui.ActionBar.h6.gc;
        c6Var2 = ((org.telegram.ui.ActionBar.m2) cq0Var).resourceProvider;
        org.telegram.ui.Components.ia0 a10 = w7.a6.a(context3, 14.0f, i12, false, c6Var2);
        this.f42546b = a10;
        a10.setGravity(17);
        a10.setText(AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.Gift2PeerColorEmptyButton), new uk0(this, 11)), true, AndroidUtilities.dp(2.6666667f), AndroidUtilities.dp(1.33f), 1.0f));
        addView(a10, w7.w5.t(-1, -2, 1, 32, 4, 32, 24));
    }

    public final void a() {
        cq0 cq0Var = this.f42547c.f43597p0;
        setBackgroundColor(cq0Var.getThemedColor(org.telegram.ui.ActionBar.h6.f20559d6));
        this.f42545a.setTextColor(cq0Var.getThemedColor(org.telegram.ui.ActionBar.h6.f20945y6));
        int i10 = org.telegram.ui.ActionBar.h6.gc;
        int themedColor = cq0Var.getThemedColor(i10);
        org.telegram.ui.Components.ia0 ia0Var = this.f42546b;
        ia0Var.setTextColor(themedColor);
        ia0Var.setLinkTextColor(cq0Var.getThemedColor(i10));
    }
}
