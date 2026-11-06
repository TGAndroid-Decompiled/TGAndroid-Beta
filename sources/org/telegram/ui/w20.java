package org.telegram.ui;

import android.view.ViewTreeObserver;
public final class w20 implements ViewTreeObserver.OnPreDrawListener {
    public final int f50892a;
    public final c40 f50893b;

    public w20(c40 c40Var, int i7) {
        this.f50892a = i7;
        this.f50893b = c40Var;
    }

    @Override
    public final boolean onPreDraw() {
        switch (this.f50892a) {
            case 0:
                c40 c40Var = this.f50893b;
                c40Var.H1.getViewTreeObserver().removeOnPreDrawListener(this);
                c40Var.R3.j(null);
                org.telegram.messenger.g0.b4(c40Var.f44558d4);
                c40Var.f28616b.requestLayout();
                return false;
            default:
                c40 c40Var2 = this.f50893b;
                c40Var2.H1.getViewTreeObserver().removeOnPreDrawListener(this);
                c40Var2.R3.j(null);
                org.telegram.messenger.g0.b4(c40Var2.f44558d4);
                c40Var2.f28616b.requestLayout();
                return false;
        }
    }
}
