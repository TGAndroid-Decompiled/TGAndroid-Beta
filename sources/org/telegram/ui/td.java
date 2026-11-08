package org.telegram.ui;

import android.content.Context;
import android.widget.FrameLayout;
public final class td extends FrameLayout {
    public final org.telegram.ui.Components.q41 f50027a;
    public final org.telegram.ui.ActionBar.f6 f50028b;
    public final int f50029c;
    public final int d;
    public final bg.m0 f50030e;
    public final vd f50031f;

    public td(vd vdVar, Context context, int i7, int i10, int i11, bg.m0 m0Var, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.f50031f = vdVar;
        this.d = i7;
        this.f50029c = i10;
        this.f50028b = f6Var;
        this.f50030e = m0Var;
        org.telegram.ui.Components.q41 q41Var = new org.telegram.ui.Components.q41(context, i10, i11, true, new a5(this, 3), new w0(this, 15), null, f6Var);
        this.f50027a = q41Var;
        setClipChildren(false);
        setClipToPadding(false);
        q41Var.setClipToPadding(false);
        q41Var.s1(org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(16.0f), false);
        q41Var.f37190f3.f35528r = false;
        q41Var.setCaptureSectionsDecoratorAllowed(true);
        q41Var.setOverScrollMode(0);
        addView(q41Var, c8.ha.c(-1.0f, -1));
        q41Var.setOnScrollListener(new ai.o0(2, this, m0Var));
        oi.q qVar = vdVar.f50652x.f52536d1;
        if (qVar != null) {
            qVar.b(q41Var);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f50027a.f37190f3.O(false);
    }
}
