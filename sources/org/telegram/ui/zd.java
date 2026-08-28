package org.telegram.ui;

import android.content.Context;
import android.widget.FrameLayout;
public final class zd extends FrameLayout {
    public final org.telegram.ui.Components.i51 f45112a;
    public final org.telegram.ui.ActionBar.b6 f45113b;
    public final int f45114c;
    public final int d;
    public final bg.c2 f45115e;
    public final be f45116f;

    public zd(be beVar, Context context, int i9, int i10, int i11, bg.c2 c2Var, org.telegram.ui.ActionBar.b6 b6Var) {
        super(context);
        this.f45116f = beVar;
        this.d = i9;
        this.f45114c = i10;
        this.f45113b = b6Var;
        this.f45115e = c2Var;
        org.telegram.ui.Components.i51 i51Var = new org.telegram.ui.Components.i51(context, i10, i11, true, new a5(this, 3), new b1(this, 13), null, b6Var);
        this.f45112a = i51Var;
        addView(i51Var, g7.e6.c(-1.0f, -1));
        i51Var.setOnScrollListener(new eh.n(2, this, c2Var));
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f45112a.U2.N(false);
    }
}
