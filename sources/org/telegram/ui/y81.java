package org.telegram.ui;

import android.content.Context;
import android.widget.LinearLayout;
public final class y81 extends LinearLayout implements org.telegram.ui.ActionBar.x5 {
    public final org.telegram.ui.ActionBar.d6 f40072a;
    public final org.telegram.ui.Components.n90 f40073b;
    public final org.telegram.ui.Components.n90 f40074c;
    public final ci.d d;
    public final ci.d e;

    public y81(Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context);
        this.f40072a = d6Var;
        setOrientation(1);
        int i10 = org.telegram.ui.ActionBar.h6.G6;
        org.telegram.ui.Components.n90 a2 = w7.c6.a(context, 15.0f, i10, true, d6Var);
        this.f40073b = a2;
        a2.setGravity(17);
        addView(a2, w7.y5.t(-1, -2, 55, 32, 20, 32, 0));
        org.telegram.ui.Components.n90 a10 = w7.c6.a(context, 13.0f, i10, false, d6Var);
        this.f40074c = a10;
        a10.setGravity(17);
        addView(a10, w7.y5.r(-1, -2, 55, 32.0f, 9.33f, 32.0f, 0.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        ci.d g10 = org.telegram.messenger.ok.g(24, context, d6Var, true);
        this.d = g10;
        ci.d g11 = org.telegram.messenger.ok.g(24, context, d6Var, true);
        this.e = g11;
        linearLayout.addView(g10, w7.y5.p(0, 42, 1.0f, 112, 0, 0, 12, 0));
        linearLayout.addView(g11, w7.y5.p(0, 42, 1.0f, 112, 0, 0, 0, 0));
        addView(linearLayout, w7.y5.t(-1, -2, 55, 24, 18, 24, 16));
    }

    @Override
    public final void e() {
        int i10 = org.telegram.ui.ActionBar.h6.G6;
        org.telegram.ui.ActionBar.d6 d6Var = this.f40072a;
        this.f40073b.setTextColor(org.telegram.ui.ActionBar.h6.v0(i10, d6Var));
        this.f40074c.setTextColor(org.telegram.ui.ActionBar.h6.v0(i10, d6Var));
    }

    public int[] getColorKeys() {
        return null;
    }
}
