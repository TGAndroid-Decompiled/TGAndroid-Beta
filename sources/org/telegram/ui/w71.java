package org.telegram.ui;

import android.content.Context;
import android.widget.LinearLayout;

public final class w71 extends LinearLayout implements org.telegram.ui.ActionBar.x5 {

    public final org.telegram.ui.ActionBar.c6 f43637a;

    public final org.telegram.ui.Components.p80 f43638b;

    public final org.telegram.ui.Components.p80 f43639c;
    public final lh.d d;

    public final lh.d f43640e;

    public w71(Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context);
        this.f43637a = c6Var;
        setOrientation(1);
        int i10 = org.telegram.ui.ActionBar.g6.G6;
        org.telegram.ui.Components.p80 p80VarA = h7.d6.a(context, 15.0f, i10, true, c6Var);
        this.f43638b = p80VarA;
        p80VarA.setGravity(17);
        addView(p80VarA, h7.z5.t(-1, -2, 55, 32, 20, 32, 0));
        org.telegram.ui.Components.p80 p80VarA2 = h7.d6.a(context, 13.0f, i10, false, c6Var);
        this.f43639c = p80VarA2;
        p80VarA2.setGravity(17);
        addView(p80VarA2, h7.z5.r(-1, -2, 55, 32.0f, 9.33f, 32.0f, 0.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        lh.d dVarG = org.telegram.messenger.rl.g(24, context, c6Var, true);
        this.d = dVarG;
        lh.d dVarG2 = org.telegram.messenger.rl.g(24, context, c6Var, true);
        this.f43640e = dVarG2;
        linearLayout.addView(dVarG, h7.z5.p(0, 42, 1.0f, 112, 0, 0, 12, 0));
        linearLayout.addView(dVarG2, h7.z5.p(0, 42, 1.0f, 112, 0, 0, 0, 0));
        addView(linearLayout, h7.z5.t(-1, -2, 55, 24, 18, 24, 16));
    }

    @Override
    public final void d() {
        int i10 = org.telegram.ui.ActionBar.g6.G6;
        org.telegram.ui.ActionBar.c6 c6Var = this.f43637a;
        this.f43638b.setTextColor(org.telegram.ui.ActionBar.g6.v0(i10, c6Var));
        this.f43639c.setTextColor(org.telegram.ui.ActionBar.g6.v0(i10, c6Var));
    }

    public int[] getColorKeys() {
        return null;
    }
}
