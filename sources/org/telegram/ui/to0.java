package org.telegram.ui;

import android.content.Context;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

public final class to0 extends LinearLayout {

    public final org.telegram.ui.Components.p80 f42985a;

    public final org.telegram.ui.Components.p80 f42986b;

    public final vo0 f42987c;

    public to0(vo0 vo0Var, Context context) {
        super(context);
        this.f42987c = vo0Var;
        setOrientation(1);
        ap0 ap0Var = vo0Var.f43505f0;
        setBackgroundColor(ap0Var.getThemedColor(org.telegram.ui.ActionBar.g6.f23053d6));
        org.telegram.ui.Components.n9 n9Var = new org.telegram.ui.Components.n9(getContext());
        n9Var.setImageDrawable(new org.telegram.ui.Components.oi0(R.raw.utyan_draw, AndroidUtilities.dp(120.0f), "utyan_draw", AndroidUtilities.dp(120.0f)));
        addView(n9Var, h7.z5.t(120, 120, 1, 0, 6, 0, 0));
        org.telegram.ui.Components.p80 p80VarA = h7.d6.a(getContext(), 14.0f, org.telegram.ui.ActionBar.g6.f23423y6, false, ((org.telegram.ui.ActionBar.n2) ap0Var).resourceProvider);
        this.f42985a = p80VarA;
        p80VarA.setGravity(17);
        p80VarA.setText(LocaleController.getString(vo0Var.f43500c0 == 0 ? R.string.Gift2PeerColorProfileEmptyTitle : R.string.Gift2PeerColorReplyEmptyTitle));
        addView(p80VarA, h7.z5.t(-1, -2, 1, 64, 8, 64, 8));
        org.telegram.ui.Components.p80 p80VarA2 = h7.d6.a(getContext(), 14.0f, org.telegram.ui.ActionBar.g6.gc, false, ((org.telegram.ui.ActionBar.n2) ap0Var).resourceProvider);
        this.f42986b = p80VarA2;
        p80VarA2.setGravity(17);
        p80VarA2.setText(AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.Gift2PeerColorEmptyButton), new zk0(this, 11)), true, AndroidUtilities.dp(2.6666667f), AndroidUtilities.dp(1.33f), 1.0f));
        addView(p80VarA2, h7.z5.t(-1, -2, 1, 32, 4, 32, 24));
    }

    public final void a() {
        ap0 ap0Var = this.f42987c.f43505f0;
        setBackgroundColor(ap0Var.getThemedColor(org.telegram.ui.ActionBar.g6.f23053d6));
        this.f42985a.setTextColor(ap0Var.getThemedColor(org.telegram.ui.ActionBar.g6.f23423y6));
        int i10 = org.telegram.ui.ActionBar.g6.gc;
        int themedColor = ap0Var.getThemedColor(i10);
        org.telegram.ui.Components.p80 p80Var = this.f42986b;
        p80Var.setTextColor(themedColor);
        p80Var.setLinkTextColor(ap0Var.getThemedColor(i10));
    }
}
