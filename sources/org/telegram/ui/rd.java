package org.telegram.ui;

import android.content.Context;
import android.widget.FrameLayout;
public final class rd extends FrameLayout {
    public final org.telegram.ui.Components.u41 f50928a;
    public final org.telegram.ui.ActionBar.e6 f50929b;
    public final int f50930c;
    public final int d;
    public final ai.v0 f50931e;
    public final td f50932f;

    public rd(td tdVar, Context context, int i7, int i10, int i11, ai.v0 v0Var, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        this.f50932f = tdVar;
        this.d = i7;
        this.f50930c = i10;
        this.f50929b = e6Var;
        this.f50931e = v0Var;
        org.telegram.ui.Components.u41 u41Var = new org.telegram.ui.Components.u41(context, i10, i11, true, new a5(this, 3), new w0(this, 15), null, e6Var);
        this.f50928a = u41Var;
        setClipChildren(false);
        setClipToPadding(false);
        u41Var.setClipToPadding(false);
        u41Var.s1(org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(16.0f), false);
        u41Var.f39895g3.f38201r = false;
        u41Var.setCaptureSectionsDecoratorAllowed(true);
        u41Var.setOverScrollMode(0);
        addView(u41Var, c8.ja.c(-1.0f, -1));
        u41Var.setOnScrollListener(new bi.w3(3, this, v0Var));
        ri.q qVar = tdVar.f51563x.f53182e1;
        if (qVar != null) {
            qVar.b(u41Var);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f50928a.f39895g3.O(false);
    }
}
