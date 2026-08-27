package org.telegram.ui;

import android.content.Context;
import android.widget.FrameLayout;

public final class zd extends FrameLayout {

    public final org.telegram.ui.Components.k51 f45140a;

    public final org.telegram.ui.ActionBar.c6 f45141b;

    public final int f45142c;
    public final int d;

    public final cg.w1 f45143e;

    public final be f45144f;

    public zd(be beVar, Context context, int i10, int i11, int i12, cg.w1 w1Var, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context);
        this.f45144f = beVar;
        this.d = i10;
        this.f45142c = i11;
        this.f45141b = c6Var;
        this.f45143e = w1Var;
        org.telegram.ui.Components.k51 k51Var = new org.telegram.ui.Components.k51(context, i11, i12, true, new b5(this, 3), new c1(this, 13), null, c6Var);
        this.f45140a = k51Var;
        addView(k51Var, h7.z5.c(-1.0f, -1));
        k51Var.setOnScrollListener(new fh.l(2, this, w1Var));
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f45140a.U2.N(false);
    }
}
