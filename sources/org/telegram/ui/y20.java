package org.telegram.ui;

import android.view.ViewTreeObserver;
public final class y20 implements ViewTreeObserver.OnPreDrawListener {
    public final int f51826a;
    public final e40 f51827b;

    public y20(e40 e40Var, int i7) {
        this.f51826a = i7;
        this.f51827b = e40Var;
    }

    @Override
    public final boolean onPreDraw() {
        switch (this.f51826a) {
            case 0:
                e40 e40Var = this.f51827b;
                e40Var.H1.getViewTreeObserver().removeOnPreDrawListener(this);
                e40Var.R3.j(null);
                org.telegram.messenger.g0.b4(e40Var.f45201d4);
                e40Var.f28624b.requestLayout();
                return false;
            default:
                e40 e40Var2 = this.f51827b;
                e40Var2.H1.getViewTreeObserver().removeOnPreDrawListener(this);
                e40Var2.R3.j(null);
                org.telegram.messenger.g0.b4(e40Var2.f45201d4);
                e40Var2.f28624b.requestLayout();
                return false;
        }
    }
}
