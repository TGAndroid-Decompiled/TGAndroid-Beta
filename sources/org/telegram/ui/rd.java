package org.telegram.ui;

import android.content.Context;
import android.widget.FrameLayout;
public final class rd extends FrameLayout {
    public final org.telegram.ui.Components.l41 f49199a;
    public final org.telegram.ui.ActionBar.e6 f49200b;
    public final int f49201c;
    public final int d;
    public final cg.l0 f49202e;
    public final td f49203f;

    public rd(td tdVar, Context context, int i3, int i10, int i11, cg.l0 l0Var, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        this.f49203f = tdVar;
        this.d = i3;
        this.f49201c = i10;
        this.f49200b = e6Var;
        this.f49202e = l0Var;
        org.telegram.ui.Components.l41 l41Var = new org.telegram.ui.Components.l41(context, i10, i11, true, new c5(this, 3), new x0(this, 15), null, e6Var);
        this.f49199a = l41Var;
        setClipChildren(false);
        setClipToPadding(false);
        l41Var.setClipToPadding(false);
        l41Var.s1(org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(16.0f), false);
        l41Var.f35594g3.f33698r = false;
        l41Var.setCaptureSectionsDecoratorAllowed(true);
        l41Var.setOverScrollMode(0);
        addView(l41Var, b8.mf.c(-1.0f, -1));
        l41Var.setOnScrollListener(new ai.i4(3, this, l0Var));
        pi.q qVar = tdVar.f49784x.f51918e1;
        if (qVar != null) {
            qVar.b(l41Var);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f49199a.f35594g3.O(false);
    }
}
