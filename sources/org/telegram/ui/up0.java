package org.telegram.ui;

import android.content.Context;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class up0 extends LinearLayout {
    public final org.telegram.ui.Components.c90 f38107a;
    public final org.telegram.ui.Components.c90 f38108b;
    public final wp0 f38109c;

    public up0(wp0 wp0Var, Context context) {
        super(context);
        org.telegram.ui.ActionBar.f6 f6Var;
        int i10;
        org.telegram.ui.ActionBar.f6 f6Var2;
        this.f38109c = wp0Var;
        setOrientation(1);
        cq0 cq0Var = wp0Var.f39147p0;
        setBackgroundColor(cq0Var.getThemedColor(org.telegram.ui.ActionBar.j6.f18862d6));
        org.telegram.ui.Components.u9 u9Var = new org.telegram.ui.Components.u9(getContext());
        u9Var.setImageDrawable(new org.telegram.ui.Components.yi0(R.raw.utyan_draw, AndroidUtilities.dp(120.0f), AndroidUtilities.dp(120.0f)));
        addView(u9Var, w7.x5.t(120, 120, 1, 0, 6, 0, 0));
        Context context2 = getContext();
        int i11 = org.telegram.ui.ActionBar.j6.f19244y6;
        f6Var = ((org.telegram.ui.ActionBar.o2) cq0Var).resourceProvider;
        org.telegram.ui.Components.c90 a2 = w7.b6.a(context2, 14.0f, i11, false, f6Var);
        this.f38107a = a2;
        a2.setGravity(17);
        if (wp0Var.m0 == 0) {
            i10 = R.string.Gift2PeerColorProfileEmptyTitle;
        } else {
            i10 = R.string.Gift2PeerColorReplyEmptyTitle;
        }
        a2.setText(LocaleController.getString(i10));
        addView(a2, w7.x5.t(-1, -2, 1, 64, 8, 64, 8));
        Context context3 = getContext();
        int i12 = org.telegram.ui.ActionBar.j6.gc;
        f6Var2 = ((org.telegram.ui.ActionBar.o2) cq0Var).resourceProvider;
        org.telegram.ui.Components.c90 a10 = w7.b6.a(context3, 14.0f, i12, false, f6Var2);
        this.f38108b = a10;
        a10.setGravity(17);
        a10.setText(AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.Gift2PeerColorEmptyButton), new sl0(this, 10)), true, AndroidUtilities.dp(2.6666667f), AndroidUtilities.dp(1.33f), 1.0f));
        addView(a10, w7.x5.t(-1, -2, 1, 32, 4, 32, 24));
    }

    public final void a() {
        cq0 cq0Var = this.f38109c.f39147p0;
        setBackgroundColor(cq0Var.getThemedColor(org.telegram.ui.ActionBar.j6.f18862d6));
        this.f38107a.setTextColor(cq0Var.getThemedColor(org.telegram.ui.ActionBar.j6.f19244y6));
        int i10 = org.telegram.ui.ActionBar.j6.gc;
        int themedColor = cq0Var.getThemedColor(i10);
        org.telegram.ui.Components.c90 c90Var = this.f38108b;
        c90Var.setTextColor(themedColor);
        c90Var.setLinkTextColor(cq0Var.getThemedColor(i10));
    }
}
