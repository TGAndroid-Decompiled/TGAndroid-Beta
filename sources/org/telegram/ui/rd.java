package org.telegram.ui;

import android.content.Context;
import android.widget.FrameLayout;
public final class rd extends FrameLayout {
    public final org.telegram.ui.Components.e51 f51564a;
    public final org.telegram.ui.ActionBar.i6 f51565b;
    public final int f51566c;
    public final int d;
    public final ai.w0 f51567e;
    public final td f51568f;

    public rd(td tdVar, Context context, int i7, int i10, int i11, ai.w0 w0Var, org.telegram.ui.ActionBar.i6 i6Var) {
        super(context);
        this.f51568f = tdVar;
        this.d = i7;
        this.f51566c = i10;
        this.f51565b = i6Var;
        this.f51567e = w0Var;
        org.telegram.ui.Components.e51 e51Var = new org.telegram.ui.Components.e51(context, i10, i11, true, new a5(this, 3), new w0(this, 15), null, i6Var);
        this.f51564a = e51Var;
        setClipChildren(false);
        setClipToPadding(false);
        e51Var.setClipToPadding(false);
        e51Var.s1(org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(16.0f), false);
        e51Var.f34607g3.f42809r = false;
        e51Var.setCaptureSectionsDecoratorAllowed(true);
        e51Var.setOverScrollMode(0);
        addView(e51Var, c8.ma.c(-1.0f, -1));
        e51Var.setOnScrollListener(new bi.d6(3, this, w0Var));
        ri.q qVar = tdVar.f52261x.f53790e1;
        if (qVar != null) {
            qVar.b(e51Var);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f51564a.f34607g3.O(false);
    }
}
