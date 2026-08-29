package org.telegram.ui;

import android.content.Context;
import android.widget.FrameLayout;
public final class xd extends FrameLayout {
    public final org.telegram.ui.Components.u51 f44553a;
    public final org.telegram.ui.ActionBar.c6 f44554b;
    public final int f44555c;
    public final int d;
    public final bg.f f44556e;
    public final zd f44557f;

    public xd(zd zdVar, Context context, int i10, int i11, int i12, bg.f fVar, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context);
        this.f44557f = zdVar;
        this.d = i10;
        this.f44555c = i11;
        this.f44554b = c6Var;
        this.f44556e = fVar;
        org.telegram.ui.Components.u51 u51Var = new org.telegram.ui.Components.u51(context, i11, i12, true, new b5(this, 3), new c1(this, 13), null, c6Var);
        this.f44553a = u51Var;
        addView(u51Var, i7.f6.c(-1.0f, -1));
        u51Var.setOnScrollListener(new hh.l(2, this, fVar));
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f44553a.U2.N(false);
    }
}
