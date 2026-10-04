package org.telegram.ui;

import android.content.Context;
import android.widget.LinearLayout;
public final class z81 extends LinearLayout implements org.telegram.ui.ActionBar.y5 {
    public final org.telegram.ui.ActionBar.d6 f43722a;
    public final org.telegram.ui.Components.q90 f43723b;
    public final org.telegram.ui.Components.q90 f43724c;
    public final ci.d d;
    public final ci.d f43725e;

    public z81(Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context);
        this.f43722a = d6Var;
        setOrientation(1);
        int i10 = org.telegram.ui.ActionBar.i6.G6;
        org.telegram.ui.Components.q90 a2 = w7.d6.a(context, 15.0f, i10, true, d6Var);
        this.f43723b = a2;
        a2.setGravity(17);
        addView(a2, w7.z5.t(-1, -2, 55, 32, 20, 32, 0));
        org.telegram.ui.Components.q90 a10 = w7.d6.a(context, 13.0f, i10, false, d6Var);
        this.f43724c = a10;
        a10.setGravity(17);
        addView(a10, w7.z5.r(-1, -2, 55, 32.0f, 9.33f, 32.0f, 0.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        ci.d g10 = org.telegram.messenger.ok.g(24, context, d6Var, true);
        this.d = g10;
        ci.d g11 = org.telegram.messenger.ok.g(24, context, d6Var, true);
        this.f43725e = g11;
        linearLayout.addView(g10, w7.z5.p(0, 42, 1.0f, 112, 0, 0, 12, 0));
        linearLayout.addView(g11, w7.z5.p(0, 42, 1.0f, 112, 0, 0, 0, 0));
        addView(linearLayout, w7.z5.t(-1, -2, 55, 24, 18, 24, 16));
    }

    @Override
    public final void e() {
        int i10 = org.telegram.ui.ActionBar.i6.G6;
        org.telegram.ui.ActionBar.d6 d6Var = this.f43722a;
        this.f43723b.setTextColor(org.telegram.ui.ActionBar.i6.v0(i10, d6Var));
        this.f43724c.setTextColor(org.telegram.ui.ActionBar.i6.v0(i10, d6Var));
    }

    public int[] getColorKeys() {
        return null;
    }
}
