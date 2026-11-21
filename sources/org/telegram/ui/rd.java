package org.telegram.ui;

import android.content.Context;
import android.widget.FrameLayout;
public final class rd extends FrameLayout {
    public final org.telegram.ui.Components.h51 f51553a;
    public final org.telegram.ui.ActionBar.h6 f51554b;
    public final int f51555c;
    public final int d;
    public final ai.y0 f51556e;
    public final td f51557f;

    public rd(td tdVar, Context context, int i7, int i10, int i11, ai.y0 y0Var, org.telegram.ui.ActionBar.h6 h6Var) {
        super(context);
        this.f51557f = tdVar;
        this.d = i7;
        this.f51555c = i10;
        this.f51554b = h6Var;
        this.f51556e = y0Var;
        org.telegram.ui.Components.h51 h51Var = new org.telegram.ui.Components.h51(context, i10, i11, true, new a5(this, 3), new w0(this, 15), null, h6Var);
        this.f51553a = h51Var;
        setClipChildren(false);
        setClipToPadding(false);
        h51Var.setClipToPadding(false);
        h51Var.s1(org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(16.0f), false);
        h51Var.f35796g3.f34068r = false;
        h51Var.setCaptureSectionsDecoratorAllowed(true);
        h51Var.setOverScrollMode(0);
        addView(h51Var, c8.ma.c(-1.0f, -1));
        h51Var.setOnScrollListener(new bi.h6(3, this, y0Var));
        ri.q qVar = tdVar.f52311x.f53833e1;
        if (qVar != null) {
            qVar.b(h51Var);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f51553a.f35796g3.O(false);
    }
}
