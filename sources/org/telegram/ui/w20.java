package org.telegram.ui;

import android.view.ViewTreeObserver;
public final class w20 implements ViewTreeObserver.OnPreDrawListener {
    public final int f52366a;
    public final c40 f52367b;

    public w20(c40 c40Var, int i7) {
        this.f52366a = i7;
        this.f52367b = c40Var;
    }

    @Override
    public final boolean onPreDraw() {
        switch (this.f52366a) {
            case 0:
                c40 c40Var = this.f52367b;
                c40Var.L1.getViewTreeObserver().removeOnPreDrawListener(this);
                c40Var.Z3.j(null);
                org.telegram.messenger.g0.a4(c40Var.f45940l4);
                c40Var.f29682b.requestLayout();
                return false;
            default:
                c40 c40Var2 = this.f52367b;
                c40Var2.L1.getViewTreeObserver().removeOnPreDrawListener(this);
                c40Var2.Z3.j(null);
                org.telegram.messenger.g0.a4(c40Var2.f45940l4);
                c40Var2.f29682b.requestLayout();
                return false;
        }
    }
}
