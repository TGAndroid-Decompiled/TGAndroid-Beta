package org.telegram.ui;

import android.content.Context;
public final class zz extends org.telegram.ui.Cells.p4 {
    public final org.telegram.ui.Cells.y3 f44261r;

    public zz(Context context, org.telegram.ui.ActionBar.p6 p6Var) {
        super(context);
        int i10;
        org.telegram.ui.Cells.y3 y3Var = new org.telegram.ui.Cells.y3(context, true, true, true, 3);
        this.f44261r = y3Var;
        if (org.telegram.messenger.cd.X) {
            i10 = 3;
        } else {
            i10 = 5;
        }
        y3Var.setGravity(i10);
        org.telegram.ui.ActionBar.a7.Z(y3Var, org.telegram.ui.ActionBar.t6.L6, p6Var);
        y3Var.setTextSize(org.telegram.messenger.i0.N(15.0f));
        addView(y3Var, w7.b6.d(-1, 18.0f, (org.telegram.messenger.cd.X ? 3 : 5) | 48, 22.0f, 17.0f, 22.0f, 0.0f));
        w7.e6.b(y3Var, 0.04f, 1.2f);
    }
}
