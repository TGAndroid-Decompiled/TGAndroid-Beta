package org.telegram.ui;

import android.content.Context;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class rp0 extends LinearLayout {
    public final org.telegram.ui.Components.ea0 f41518a;
    public final org.telegram.ui.Components.ea0 f41519b;
    public final tp0 f41520c;

    public rp0(tp0 tp0Var, Context context) {
        super(context);
        org.telegram.ui.ActionBar.d6 d6Var;
        int i10;
        org.telegram.ui.ActionBar.d6 d6Var2;
        this.f41520c = tp0Var;
        setOrientation(1);
        zp0 zp0Var = tp0Var.f42275p0;
        setBackgroundColor(zp0Var.getThemedColor(org.telegram.ui.ActionBar.h6.f20822d6));
        org.telegram.ui.Components.y9 y9Var = new org.telegram.ui.Components.y9(getContext());
        y9Var.setImageDrawable(new org.telegram.ui.Components.dk0(R.raw.utyan_draw, AndroidUtilities.dp(120.0f), AndroidUtilities.dp(120.0f)));
        addView(y9Var, w7.x5.t(120, 120, 1, 0, 6, 0, 0));
        Context context2 = getContext();
        int i11 = org.telegram.ui.ActionBar.h6.f21207y6;
        d6Var = ((org.telegram.ui.ActionBar.m2) zp0Var).resourceProvider;
        org.telegram.ui.Components.ea0 a2 = w7.b6.a(context2, 14.0f, i11, false, d6Var);
        this.f41518a = a2;
        a2.setGravity(17);
        if (tp0Var.m0 == 0) {
            i10 = R.string.Gift2PeerColorProfileEmptyTitle;
        } else {
            i10 = R.string.Gift2PeerColorReplyEmptyTitle;
        }
        a2.setText(LocaleController.getString(i10));
        addView(a2, w7.x5.t(-1, -2, 1, 64, 8, 64, 8));
        Context context3 = getContext();
        int i12 = org.telegram.ui.ActionBar.h6.gc;
        d6Var2 = ((org.telegram.ui.ActionBar.m2) zp0Var).resourceProvider;
        org.telegram.ui.Components.ea0 a10 = w7.b6.a(context3, 14.0f, i12, false, d6Var2);
        this.f41519b = a10;
        a10.setGravity(17);
        a10.setText(AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.Gift2PeerColorEmptyButton), new sk0(this, 11)), true, AndroidUtilities.dp(2.6666667f), AndroidUtilities.dp(1.33f), 1.0f));
        addView(a10, w7.x5.t(-1, -2, 1, 32, 4, 32, 24));
    }

    public final void a() {
        zp0 zp0Var = this.f41520c.f42275p0;
        setBackgroundColor(zp0Var.getThemedColor(org.telegram.ui.ActionBar.h6.f20822d6));
        this.f41518a.setTextColor(zp0Var.getThemedColor(org.telegram.ui.ActionBar.h6.f21207y6));
        int i10 = org.telegram.ui.ActionBar.h6.gc;
        int themedColor = zp0Var.getThemedColor(i10);
        org.telegram.ui.Components.ea0 ea0Var = this.f41519b;
        ea0Var.setTextColor(themedColor);
        ea0Var.setLinkTextColor(zp0Var.getThemedColor(i10));
    }
}
