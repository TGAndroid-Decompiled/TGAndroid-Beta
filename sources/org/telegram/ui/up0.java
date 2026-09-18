package org.telegram.ui;

import android.content.Context;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class up0 extends LinearLayout {
    public final org.telegram.ui.Components.l90 f38080a;
    public final org.telegram.ui.Components.l90 f38081b;
    public final wp0 f38082c;

    public up0(wp0 wp0Var, Context context) {
        super(context);
        org.telegram.ui.ActionBar.e6 e6Var;
        int i10;
        org.telegram.ui.ActionBar.e6 e6Var2;
        this.f38082c = wp0Var;
        setOrientation(1);
        cq0 cq0Var = wp0Var.f39221p0;
        setBackgroundColor(cq0Var.getThemedColor(org.telegram.ui.ActionBar.j6.f19062d6));
        org.telegram.ui.Components.w9 w9Var = new org.telegram.ui.Components.w9(getContext());
        w9Var.setImageDrawable(new org.telegram.ui.Components.ij0(R.raw.utyan_draw, AndroidUtilities.dp(120.0f), AndroidUtilities.dp(120.0f)));
        addView(w9Var, w7.y5.t(120, 120, 1, 0, 6, 0, 0));
        Context context2 = getContext();
        int i11 = org.telegram.ui.ActionBar.j6.f19445y6;
        e6Var = ((org.telegram.ui.ActionBar.n2) cq0Var).resourceProvider;
        org.telegram.ui.Components.l90 a2 = w7.c6.a(context2, 14.0f, i11, false, e6Var);
        this.f38080a = a2;
        a2.setGravity(17);
        if (wp0Var.m0 == 0) {
            i10 = R.string.Gift2PeerColorProfileEmptyTitle;
        } else {
            i10 = R.string.Gift2PeerColorReplyEmptyTitle;
        }
        a2.setText(LocaleController.getString(i10));
        addView(a2, w7.y5.t(-1, -2, 1, 64, 8, 64, 8));
        Context context3 = getContext();
        int i12 = org.telegram.ui.ActionBar.j6.gc;
        e6Var2 = ((org.telegram.ui.ActionBar.n2) cq0Var).resourceProvider;
        org.telegram.ui.Components.l90 a10 = w7.c6.a(context3, 14.0f, i12, false, e6Var2);
        this.f38081b = a10;
        a10.setGravity(17);
        a10.setText(AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.Gift2PeerColorEmptyButton), new sl0(this, 10)), true, AndroidUtilities.dp(2.6666667f), AndroidUtilities.dp(1.33f), 1.0f));
        addView(a10, w7.y5.t(-1, -2, 1, 32, 4, 32, 24));
    }

    public final void a() {
        cq0 cq0Var = this.f38082c.f39221p0;
        setBackgroundColor(cq0Var.getThemedColor(org.telegram.ui.ActionBar.j6.f19062d6));
        this.f38080a.setTextColor(cq0Var.getThemedColor(org.telegram.ui.ActionBar.j6.f19445y6));
        int i10 = org.telegram.ui.ActionBar.j6.gc;
        int themedColor = cq0Var.getThemedColor(i10);
        org.telegram.ui.Components.l90 l90Var = this.f38081b;
        l90Var.setTextColor(themedColor);
        l90Var.setLinkTextColor(cq0Var.getThemedColor(i10));
    }
}
