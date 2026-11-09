package org.telegram.ui;

import android.content.Context;
import android.widget.FrameLayout;
public final class td extends FrameLayout {
    public final org.telegram.ui.Components.r41 f50162a;
    public final org.telegram.ui.ActionBar.g6 f50163b;
    public final int f50164c;
    public final int d;
    public final bg.m0 f50165e;
    public final vd f50166f;

    public td(vd vdVar, Context context, int i7, int i10, int i11, bg.m0 m0Var, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context);
        this.f50166f = vdVar;
        this.d = i7;
        this.f50164c = i10;
        this.f50163b = g6Var;
        this.f50165e = m0Var;
        org.telegram.ui.Components.r41 r41Var = new org.telegram.ui.Components.r41(context, i10, i11, true, new a5(this, 3), new w0(this, 15), null, g6Var);
        this.f50162a = r41Var;
        setClipChildren(false);
        setClipToPadding(false);
        r41Var.setClipToPadding(false);
        r41Var.s1(org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(16.0f), false);
        r41Var.f37556f3.f35945r = false;
        r41Var.setCaptureSectionsDecoratorAllowed(true);
        r41Var.setOverScrollMode(0);
        addView(r41Var, c8.ha.c(-1.0f, -1));
        r41Var.setOnScrollListener(new ai.o0(2, this, m0Var));
        oi.q qVar = vdVar.f50663x.f52507d1;
        if (qVar != null) {
            qVar.b(r41Var);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f50162a.f37556f3.O(false);
    }
}
