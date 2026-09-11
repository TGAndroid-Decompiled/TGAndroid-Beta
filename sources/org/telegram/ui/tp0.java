package org.telegram.ui;

import android.content.Context;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class tp0 extends LinearLayout {
    public final org.telegram.ui.Components.d90 f40809a;
    public final org.telegram.ui.Components.d90 f40810b;
    public final vp0 f40811c;

    public tp0(vp0 vp0Var, Context context) {
        super(context);
        org.telegram.ui.ActionBar.f6 f6Var;
        int i10;
        org.telegram.ui.ActionBar.f6 f6Var2;
        this.f40811c = vp0Var;
        setOrientation(1);
        bq0 bq0Var = vp0Var.f41619p0;
        setBackgroundColor(bq0Var.getThemedColor(org.telegram.ui.ActionBar.j6.f20663d6));
        org.telegram.ui.Components.x9 x9Var = new org.telegram.ui.Components.x9(getContext());
        x9Var.setImageDrawable(new org.telegram.ui.Components.xi0(R.raw.utyan_draw, AndroidUtilities.dp(120.0f), AndroidUtilities.dp(120.0f)));
        addView(x9Var, w7.x5.t(120, 120, 1, 0, 6, 0, 0));
        Context context2 = getContext();
        int i11 = org.telegram.ui.ActionBar.j6.f21042y6;
        f6Var = ((org.telegram.ui.ActionBar.n2) bq0Var).resourceProvider;
        org.telegram.ui.Components.d90 a2 = w7.b6.a(context2, 14.0f, i11, false, f6Var);
        this.f40809a = a2;
        a2.setGravity(17);
        if (vp0Var.m0 == 0) {
            i10 = R.string.Gift2PeerColorProfileEmptyTitle;
        } else {
            i10 = R.string.Gift2PeerColorReplyEmptyTitle;
        }
        a2.setText(LocaleController.getString(i10));
        addView(a2, w7.x5.t(-1, -2, 1, 64, 8, 64, 8));
        Context context3 = getContext();
        int i12 = org.telegram.ui.ActionBar.j6.gc;
        f6Var2 = ((org.telegram.ui.ActionBar.n2) bq0Var).resourceProvider;
        org.telegram.ui.Components.d90 a10 = w7.b6.a(context3, 14.0f, i12, false, f6Var2);
        this.f40810b = a10;
        a10.setGravity(17);
        a10.setText(AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.Gift2PeerColorEmptyButton), new rl0(this, 10)), true, AndroidUtilities.dp(2.6666667f), AndroidUtilities.dp(1.33f), 1.0f));
        addView(a10, w7.x5.t(-1, -2, 1, 32, 4, 32, 24));
    }

    public final void a() {
        bq0 bq0Var = this.f40811c.f41619p0;
        setBackgroundColor(bq0Var.getThemedColor(org.telegram.ui.ActionBar.j6.f20663d6));
        this.f40809a.setTextColor(bq0Var.getThemedColor(org.telegram.ui.ActionBar.j6.f21042y6));
        int i10 = org.telegram.ui.ActionBar.j6.gc;
        int themedColor = bq0Var.getThemedColor(i10);
        org.telegram.ui.Components.d90 d90Var = this.f40810b;
        d90Var.setTextColor(themedColor);
        d90Var.setLinkTextColor(bq0Var.getThemedColor(i10));
    }
}
