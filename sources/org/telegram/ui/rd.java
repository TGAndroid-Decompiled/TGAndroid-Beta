package org.telegram.ui;

import android.content.Context;
import android.widget.FrameLayout;
public final class rd extends FrameLayout {
    public final org.telegram.ui.Components.h51 f51588a;
    public final org.telegram.ui.ActionBar.h6 f51589b;
    public final int f51590c;
    public final int d;
    public final ai.t0 f51591e;
    public final td f51592f;

    public rd(td tdVar, Context context, int i7, int i10, int i11, ai.t0 t0Var, org.telegram.ui.ActionBar.h6 h6Var) {
        super(context);
        this.f51592f = tdVar;
        this.d = i7;
        this.f51590c = i10;
        this.f51589b = h6Var;
        this.f51591e = t0Var;
        org.telegram.ui.Components.h51 h51Var = new org.telegram.ui.Components.h51(context, i10, i11, true, new a5(this, 3), new w0(this, 15), null, h6Var);
        this.f51588a = h51Var;
        setClipChildren(false);
        setClipToPadding(false);
        h51Var.setClipToPadding(false);
        h51Var.s1(org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(16.0f), false);
        h51Var.f35742g3.f34026r = false;
        h51Var.setCaptureSectionsDecoratorAllowed(true);
        h51Var.setOverScrollMode(0);
        addView(h51Var, c8.na.c(-1.0f, -1));
        h51Var.setOnScrollListener(new bi.j6(3, this, t0Var));
        ri.q qVar = tdVar.f52261x.f53757e1;
        if (qVar != null) {
            qVar.b(h51Var);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f51588a.f35742g3.O(false);
    }
}
