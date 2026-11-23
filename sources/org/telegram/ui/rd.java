package org.telegram.ui;

import android.content.Context;
import android.widget.FrameLayout;
public final class rd extends FrameLayout {
    public final org.telegram.ui.Components.g51 f51703a;
    public final org.telegram.ui.ActionBar.i6 f51704b;
    public final int f51705c;
    public final int d;
    public final ai.u0 f51706e;
    public final td f51707f;

    public rd(td tdVar, Context context, int i7, int i10, int i11, ai.u0 u0Var, org.telegram.ui.ActionBar.i6 i6Var) {
        super(context);
        this.f51707f = tdVar;
        this.d = i7;
        this.f51705c = i10;
        this.f51704b = i6Var;
        this.f51706e = u0Var;
        org.telegram.ui.Components.g51 g51Var = new org.telegram.ui.Components.g51(context, i10, i11, true, new a5(this, 3), new w0(this, 15), null, i6Var);
        this.f51703a = g51Var;
        setClipChildren(false);
        setClipToPadding(false);
        g51Var.setClipToPadding(false);
        g51Var.s1(org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(16.0f), false);
        g51Var.f35323g3.f33631r = false;
        g51Var.setCaptureSectionsDecoratorAllowed(true);
        g51Var.setOverScrollMode(0);
        addView(g51Var, c8.na.c(-1.0f, -1));
        g51Var.setOnScrollListener(new bi.j6(3, this, u0Var));
        ri.q qVar = tdVar.f52371x.f53924e1;
        if (qVar != null) {
            qVar.b(g51Var);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f51703a.f35323g3.O(false);
    }
}
