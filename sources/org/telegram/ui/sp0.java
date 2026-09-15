package org.telegram.ui;

import android.content.Context;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class sp0 extends LinearLayout {
    public final org.telegram.ui.Components.c90 f37423a;
    public final org.telegram.ui.Components.c90 f37424b;
    public final up0 f37425c;

    public sp0(up0 up0Var, Context context) {
        super(context);
        org.telegram.ui.ActionBar.e6 e6Var;
        int i10;
        org.telegram.ui.ActionBar.e6 e6Var2;
        this.f37425c = up0Var;
        setOrientation(1);
        aq0 aq0Var = up0Var.f38083p0;
        setBackgroundColor(aq0Var.getThemedColor(org.telegram.ui.ActionBar.i6.f18836d6));
        org.telegram.ui.Components.u9 u9Var = new org.telegram.ui.Components.u9(getContext());
        u9Var.setImageDrawable(new org.telegram.ui.Components.xi0(R.raw.utyan_draw, AndroidUtilities.dp(120.0f), AndroidUtilities.dp(120.0f)));
        addView(u9Var, w7.x5.t(120, 120, 1, 0, 6, 0, 0));
        Context context2 = getContext();
        int i11 = org.telegram.ui.ActionBar.i6.f19218y6;
        e6Var = ((org.telegram.ui.ActionBar.n2) aq0Var).resourceProvider;
        org.telegram.ui.Components.c90 a2 = w7.b6.a(context2, 14.0f, i11, false, e6Var);
        this.f37423a = a2;
        a2.setGravity(17);
        if (up0Var.m0 == 0) {
            i10 = R.string.Gift2PeerColorProfileEmptyTitle;
        } else {
            i10 = R.string.Gift2PeerColorReplyEmptyTitle;
        }
        a2.setText(LocaleController.getString(i10));
        addView(a2, w7.x5.t(-1, -2, 1, 64, 8, 64, 8));
        Context context3 = getContext();
        int i12 = org.telegram.ui.ActionBar.i6.gc;
        e6Var2 = ((org.telegram.ui.ActionBar.n2) aq0Var).resourceProvider;
        org.telegram.ui.Components.c90 a10 = w7.b6.a(context3, 14.0f, i12, false, e6Var2);
        this.f37424b = a10;
        a10.setGravity(17);
        a10.setText(AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.Gift2PeerColorEmptyButton), new pl0(this, 10)), true, AndroidUtilities.dp(2.6666667f), AndroidUtilities.dp(1.33f), 1.0f));
        addView(a10, w7.x5.t(-1, -2, 1, 32, 4, 32, 24));
    }

    public final void a() {
        aq0 aq0Var = this.f37425c.f38083p0;
        setBackgroundColor(aq0Var.getThemedColor(org.telegram.ui.ActionBar.i6.f18836d6));
        this.f37423a.setTextColor(aq0Var.getThemedColor(org.telegram.ui.ActionBar.i6.f19218y6));
        int i10 = org.telegram.ui.ActionBar.i6.gc;
        int themedColor = aq0Var.getThemedColor(i10);
        org.telegram.ui.Components.c90 c90Var = this.f37424b;
        c90Var.setTextColor(themedColor);
        c90Var.setLinkTextColor(aq0Var.getThemedColor(i10));
    }
}
