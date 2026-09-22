package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
public final class u00 extends org.telegram.ui.Cells.n4 {
    public final org.telegram.ui.Cells.v3 f37921r;

    public u00(Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        int i10;
        org.telegram.ui.Cells.v3 v3Var = new org.telegram.ui.Cells.v3(context, true, true, true, 3);
        this.f37921r = v3Var;
        if (LocaleController.isRTL) {
            i10 = 3;
        } else {
            i10 = 5;
        }
        v3Var.setGravity(i10);
        v3Var.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.L6, f6Var));
        v3Var.setTextSize(AndroidUtilities.dpf2(15.0f));
        addView(v3Var, w7.y5.d(-1, 18.0f, (LocaleController.isRTL ? 3 : 5) | 48, 22.0f, 17.0f, 22.0f, 0.0f));
        w7.a6.b(v3Var, 0.04f, 1.2f);
    }
}
