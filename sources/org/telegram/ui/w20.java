package org.telegram.ui;

import android.view.ViewTreeObserver;
public final class w20 implements ViewTreeObserver.OnPreDrawListener {
    public final int f52369a;
    public final c40 f52370b;

    public w20(c40 c40Var, int i7) {
        this.f52369a = i7;
        this.f52370b = c40Var;
    }

    @Override
    public final boolean onPreDraw() {
        switch (this.f52369a) {
            case 0:
                c40 c40Var = this.f52370b;
                c40Var.L1.getViewTreeObserver().removeOnPreDrawListener(this);
                c40Var.Z3.j(null);
                org.telegram.messenger.g0.a4(c40Var.f45929l4);
                c40Var.f29682b.requestLayout();
                return false;
            default:
                c40 c40Var2 = this.f52370b;
                c40Var2.L1.getViewTreeObserver().removeOnPreDrawListener(this);
                c40Var2.Z3.j(null);
                org.telegram.messenger.g0.a4(c40Var2.f45929l4);
                c40Var2.f29682b.requestLayout();
                return false;
        }
    }
}
