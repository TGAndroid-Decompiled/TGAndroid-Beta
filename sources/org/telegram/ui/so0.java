package org.telegram.ui;

import android.content.Context;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class so0 extends LinearLayout {
    public final org.telegram.ui.Components.l80 f42738a;
    public final org.telegram.ui.Components.l80 f42739b;
    public final uo0 f42740c;

    public so0(uo0 uo0Var, Context context) {
        super(context);
        org.telegram.ui.ActionBar.b6 b6Var;
        int i9;
        org.telegram.ui.ActionBar.b6 b6Var2;
        this.f42740c = uo0Var;
        setOrientation(1);
        zo0 zo0Var = uo0Var.f43287f0;
        setBackgroundColor(zo0Var.getThemedColor(org.telegram.ui.ActionBar.f6.f23001d6));
        org.telegram.ui.Components.o9 o9Var = new org.telegram.ui.Components.o9(getContext());
        o9Var.setImageDrawable(new org.telegram.ui.Components.mi0(R.raw.utyan_draw, AndroidUtilities.dp(120.0f), "utyan_draw", AndroidUtilities.dp(120.0f)));
        addView(o9Var, g7.e6.t(120, 120, 1, 0, 6, 0, 0));
        Context context2 = getContext();
        int i10 = org.telegram.ui.ActionBar.f6.f23369y6;
        b6Var = ((org.telegram.ui.ActionBar.o2) zo0Var).resourceProvider;
        org.telegram.ui.Components.l80 a2 = g7.i6.a(context2, 14.0f, i10, false, b6Var);
        this.f42738a = a2;
        a2.setGravity(17);
        if (uo0Var.f43282c0 == 0) {
            i9 = R.string.Gift2PeerColorProfileEmptyTitle;
        } else {
            i9 = R.string.Gift2PeerColorReplyEmptyTitle;
        }
        a2.setText(LocaleController.getString(i9));
        addView(a2, g7.e6.t(-1, -2, 1, 64, 8, 64, 8));
        Context context3 = getContext();
        int i11 = org.telegram.ui.ActionBar.f6.f23061gc;
        b6Var2 = ((org.telegram.ui.ActionBar.o2) zo0Var).resourceProvider;
        org.telegram.ui.Components.l80 a3 = g7.i6.a(context3, 14.0f, i11, false, b6Var2);
        this.f42739b = a3;
        a3.setGravity(17);
        a3.setText(AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.Gift2PeerColorEmptyButton), new zk0(this, 11)), true, AndroidUtilities.dp(2.6666667f), AndroidUtilities.dp(1.33f), 1.0f));
        addView(a3, g7.e6.t(-1, -2, 1, 32, 4, 32, 24));
    }

    public final void a() {
        zo0 zo0Var = this.f42740c.f43287f0;
        setBackgroundColor(zo0Var.getThemedColor(org.telegram.ui.ActionBar.f6.f23001d6));
        this.f42738a.setTextColor(zo0Var.getThemedColor(org.telegram.ui.ActionBar.f6.f23369y6));
        int i9 = org.telegram.ui.ActionBar.f6.f23061gc;
        int themedColor = zo0Var.getThemedColor(i9);
        org.telegram.ui.Components.l80 l80Var = this.f42739b;
        l80Var.setTextColor(themedColor);
        l80Var.setLinkTextColor(zo0Var.getThemedColor(i9));
    }
}
