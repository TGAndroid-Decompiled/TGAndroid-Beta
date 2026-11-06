package org.telegram.ui;

import android.content.Context;
import android.widget.FrameLayout;
public final class td extends FrameLayout {
    public final org.telegram.ui.Components.p41 f50036a;
    public final org.telegram.ui.ActionBar.f6 f50037b;
    public final int f50038c;
    public final int d;
    public final bg.m0 f50039e;
    public final vd f50040f;

    public td(vd vdVar, Context context, int i7, int i10, int i11, bg.m0 m0Var, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.f50040f = vdVar;
        this.d = i7;
        this.f50038c = i10;
        this.f50037b = f6Var;
        this.f50039e = m0Var;
        org.telegram.ui.Components.p41 p41Var = new org.telegram.ui.Components.p41(context, i10, i11, true, new a5(this, 3), new w0(this, 15), null, f6Var);
        this.f50036a = p41Var;
        setClipChildren(false);
        setClipToPadding(false);
        p41Var.setClipToPadding(false);
        p41Var.s1(org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(16.0f), false);
        p41Var.f36781f3.f35132r = false;
        p41Var.setCaptureSectionsDecoratorAllowed(true);
        p41Var.setOverScrollMode(0);
        addView(p41Var, c8.ha.c(-1.0f, -1));
        p41Var.setOnScrollListener(new ai.o0(2, this, m0Var));
        oi.q qVar = vdVar.f50709x.f52534d1;
        if (qVar != null) {
            qVar.b(p41Var);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f50036a.f36781f3.O(false);
    }
}
