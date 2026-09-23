package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
public final class r00 extends org.telegram.ui.Cells.m4 {
    public final org.telegram.ui.Cells.u3 f36649r;

    public r00(Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context);
        int i10;
        org.telegram.ui.Cells.u3 u3Var = new org.telegram.ui.Cells.u3(context, true, true, true, 3);
        this.f36649r = u3Var;
        if (LocaleController.isRTL) {
            i10 = 3;
        } else {
            i10 = 5;
        }
        u3Var.setGravity(i10);
        u3Var.setTextColor(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.L6, d6Var));
        u3Var.setTextSize(AndroidUtilities.dpf2(15.0f));
        addView(u3Var, w7.x5.d(-1, 18.0f, (LocaleController.isRTL ? 3 : 5) | 48, 22.0f, 17.0f, 22.0f, 0.0f));
        w7.z5.b(u3Var, 0.04f, 1.2f);
    }
}
