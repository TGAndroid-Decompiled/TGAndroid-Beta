package org.telegram.ui;

import android.content.Context;
import android.widget.FrameLayout;
public final class td extends FrameLayout {
    public final org.telegram.ui.Components.k41 f50008a;
    public final org.telegram.ui.ActionBar.f6 f50009b;
    public final int f50010c;
    public final int d;
    public final bg.m0 f50011e;
    public final vd f50012f;

    public td(vd vdVar, Context context, int i7, int i10, int i11, bg.m0 m0Var, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.f50012f = vdVar;
        this.d = i7;
        this.f50010c = i10;
        this.f50009b = f6Var;
        this.f50011e = m0Var;
        org.telegram.ui.Components.k41 k41Var = new org.telegram.ui.Components.k41(context, i10, i11, true, new a5(this, 3), new w0(this, 15), null, f6Var);
        this.f50008a = k41Var;
        setClipChildren(false);
        setClipToPadding(false);
        k41Var.setClipToPadding(false);
        k41Var.s1(org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(16.0f), false);
        k41Var.f35167f3.f33473r = false;
        k41Var.setCaptureSectionsDecoratorAllowed(true);
        k41Var.setOverScrollMode(0);
        addView(k41Var, c8.ha.c(-1.0f, -1));
        k41Var.setOnScrollListener(new ai.o0(2, this, m0Var));
        oi.q qVar = vdVar.f50699x.f52527d1;
        if (qVar != null) {
            qVar.b(k41Var);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f50008a.f35167f3.O(false);
    }
}
