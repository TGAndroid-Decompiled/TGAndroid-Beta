package org.telegram.ui;

import android.content.Context;
import android.widget.LinearLayout;
public final class x81 extends LinearLayout implements org.telegram.ui.ActionBar.y5 {
    public final org.telegram.ui.ActionBar.d6 f42833a;
    public final org.telegram.ui.Components.q90 f42834b;
    public final org.telegram.ui.Components.q90 f42835c;
    public final ci.d d;
    public final ci.d f42836e;

    public x81(Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context);
        this.f42833a = d6Var;
        setOrientation(1);
        int i10 = org.telegram.ui.ActionBar.i6.G6;
        org.telegram.ui.Components.q90 a2 = w7.d6.a(context, 15.0f, i10, true, d6Var);
        this.f42834b = a2;
        a2.setGravity(17);
        addView(a2, w7.z5.t(-1, -2, 55, 32, 20, 32, 0));
        org.telegram.ui.Components.q90 a10 = w7.d6.a(context, 13.0f, i10, false, d6Var);
        this.f42835c = a10;
        a10.setGravity(17);
        addView(a10, w7.z5.r(-1, -2, 55, 32.0f, 9.33f, 32.0f, 0.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        ci.d f7 = org.telegram.messenger.bi.f(24, context, d6Var, true);
        this.d = f7;
        ci.d f10 = org.telegram.messenger.bi.f(24, context, d6Var, true);
        this.f42836e = f10;
        linearLayout.addView(f7, w7.z5.p(0, 42, 1.0f, 112, 0, 0, 12, 0));
        linearLayout.addView(f10, w7.z5.p(0, 42, 1.0f, 112, 0, 0, 0, 0));
        addView(linearLayout, w7.z5.t(-1, -2, 55, 24, 18, 24, 16));
    }

    @Override
    public final void e() {
        int i10 = org.telegram.ui.ActionBar.i6.G6;
        org.telegram.ui.ActionBar.d6 d6Var = this.f42833a;
        this.f42834b.setTextColor(org.telegram.ui.ActionBar.i6.v0(i10, d6Var));
        this.f42835c.setTextColor(org.telegram.ui.ActionBar.i6.v0(i10, d6Var));
    }

    public int[] getColorKeys() {
        return null;
    }
}
