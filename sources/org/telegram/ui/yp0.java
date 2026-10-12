package org.telegram.ui;

import android.content.Context;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class yp0 extends LinearLayout {
    public final org.telegram.ui.Components.da0 f42205a;
    public final org.telegram.ui.Components.da0 f42206b;
    public final aq0 f42207c;

    public yp0(aq0 aq0Var, Context context) {
        super(context);
        org.telegram.ui.ActionBar.c6 c6Var;
        int i10;
        org.telegram.ui.ActionBar.c6 c6Var2;
        this.f42207c = aq0Var;
        setOrientation(1);
        gq0 gq0Var = aq0Var.f34322p0;
        setBackgroundColor(gq0Var.getThemedColor(org.telegram.ui.ActionBar.g6.f19901d6));
        org.telegram.ui.Components.z9 z9Var = new org.telegram.ui.Components.z9(getContext());
        z9Var.setImageDrawable(new org.telegram.ui.Components.yj0(R.raw.utyan_draw, AndroidUtilities.dp(120.0f), AndroidUtilities.dp(120.0f)));
        addView(z9Var, w7.a6.t(120, 120, 1, 0, 6, 0, 0));
        Context context2 = getContext();
        int i11 = org.telegram.ui.ActionBar.g6.f20288y6;
        c6Var = ((org.telegram.ui.ActionBar.m2) gq0Var).resourceProvider;
        org.telegram.ui.Components.da0 a2 = w7.e6.a(context2, 14.0f, i11, false, c6Var);
        this.f42205a = a2;
        a2.setGravity(17);
        if (aq0Var.m0 == 0) {
            i10 = R.string.Gift2PeerColorProfileEmptyTitle;
        } else {
            i10 = R.string.Gift2PeerColorReplyEmptyTitle;
        }
        a2.setText(LocaleController.getString(i10));
        addView(a2, w7.a6.t(-1, -2, 1, 64, 8, 64, 8));
        Context context3 = getContext();
        int i12 = org.telegram.ui.ActionBar.g6.f19960gc;
        c6Var2 = ((org.telegram.ui.ActionBar.m2) gq0Var).resourceProvider;
        org.telegram.ui.Components.da0 a10 = w7.e6.a(context3, 14.0f, i12, false, c6Var2);
        this.f42206b = a10;
        a10.setGravity(17);
        a10.setText(AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.Gift2PeerColorEmptyButton), new yk0(this, 11)), true, AndroidUtilities.dp(2.6666667f), AndroidUtilities.dp(1.33f), 1.0f));
        addView(a10, w7.a6.t(-1, -2, 1, 32, 4, 32, 24));
    }

    public final void a() {
        gq0 gq0Var = this.f42207c.f34322p0;
        setBackgroundColor(gq0Var.getThemedColor(org.telegram.ui.ActionBar.g6.f19901d6));
        this.f42205a.setTextColor(gq0Var.getThemedColor(org.telegram.ui.ActionBar.g6.f20288y6));
        int i10 = org.telegram.ui.ActionBar.g6.f19960gc;
        int themedColor = gq0Var.getThemedColor(i10);
        org.telegram.ui.Components.da0 da0Var = this.f42206b;
        da0Var.setTextColor(themedColor);
        da0Var.setLinkTextColor(gq0Var.getThemedColor(i10));
    }
}
