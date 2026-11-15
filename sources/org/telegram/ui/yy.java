package org.telegram.ui;

import android.content.Context;
public final class yy extends org.telegram.ui.Cells.n4 {
    public final org.telegram.ui.Cells.w3 f53783r;

    public yy(Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        int i7;
        org.telegram.ui.Cells.w3 w3Var = new org.telegram.ui.Cells.w3(context, true, true, true, 3);
        this.f53783r = w3Var;
        if (org.telegram.messenger.hd.f24101a0) {
            i7 = 3;
        } else {
            i7 = 5;
        }
        w3Var.setGravity(i7);
        org.telegram.ui.ActionBar.q6.Y(w3Var, org.telegram.ui.ActionBar.j6.L6, e6Var);
        w3Var.setTextSize(org.telegram.messenger.g0.N(15.0f));
        addView(w3Var, c8.ja.d(-1, 18.0f, (org.telegram.messenger.hd.f24101a0 ? 3 : 5) | 48, 22.0f, 17.0f, 22.0f, 0.0f));
        c8.na.b(w3Var, 0.04f, 1.2f);
    }
}
