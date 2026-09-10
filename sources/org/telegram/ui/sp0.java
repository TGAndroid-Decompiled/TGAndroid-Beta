package org.telegram.ui;

import android.content.Context;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class sp0 extends LinearLayout {
    public final org.telegram.ui.Components.m90 f36738a;
    public final org.telegram.ui.Components.m90 f36739b;
    public final up0 f36740c;

    public sp0(up0 up0Var, Context context) {
        super(context);
        org.telegram.ui.ActionBar.f6 f6Var;
        int i10;
        org.telegram.ui.ActionBar.f6 f6Var2;
        this.f36740c = up0Var;
        setOrientation(1);
        bq0 bq0Var = up0Var.f37324p0;
        setBackgroundColor(bq0Var.getThemedColor(org.telegram.ui.ActionBar.j6.f17928d6));
        org.telegram.ui.Components.w9 w9Var = new org.telegram.ui.Components.w9(getContext());
        w9Var.setImageDrawable(new org.telegram.ui.Components.hj0(R.raw.utyan_draw, AndroidUtilities.dp(120.0f), AndroidUtilities.dp(120.0f)));
        addView(w9Var, w7.a6.t(120, 120, 1, 0, 6, 0, 0));
        Context context2 = getContext();
        int i11 = org.telegram.ui.ActionBar.j6.f18306y6;
        f6Var = ((org.telegram.ui.ActionBar.p2) bq0Var).resourceProvider;
        org.telegram.ui.Components.m90 a2 = w7.e6.a(context2, 14.0f, i11, false, f6Var);
        this.f36738a = a2;
        a2.setGravity(17);
        if (up0Var.m0 == 0) {
            i10 = R.string.Gift2PeerColorProfileEmptyTitle;
        } else {
            i10 = R.string.Gift2PeerColorReplyEmptyTitle;
        }
        a2.setText(LocaleController.getString(i10));
        addView(a2, w7.a6.t(-1, -2, 1, 64, 8, 64, 8));
        Context context3 = getContext();
        int i12 = org.telegram.ui.ActionBar.j6.gc;
        f6Var2 = ((org.telegram.ui.ActionBar.p2) bq0Var).resourceProvider;
        org.telegram.ui.Components.m90 a10 = w7.e6.a(context3, 14.0f, i12, false, f6Var2);
        this.f36739b = a10;
        a10.setGravity(17);
        a10.setText(AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.Gift2PeerColorEmptyButton), new ql0(this, 10)), true, AndroidUtilities.dp(2.6666667f), AndroidUtilities.dp(1.33f), 1.0f));
        addView(a10, w7.a6.t(-1, -2, 1, 32, 4, 32, 24));
    }

    public final void a() {
        bq0 bq0Var = this.f36740c.f37324p0;
        setBackgroundColor(bq0Var.getThemedColor(org.telegram.ui.ActionBar.j6.f17928d6));
        this.f36738a.setTextColor(bq0Var.getThemedColor(org.telegram.ui.ActionBar.j6.f18306y6));
        int i10 = org.telegram.ui.ActionBar.j6.gc;
        int themedColor = bq0Var.getThemedColor(i10);
        org.telegram.ui.Components.m90 m90Var = this.f36739b;
        m90Var.setTextColor(themedColor);
        m90Var.setLinkTextColor(bq0Var.getThemedColor(i10));
    }
}
