package org.telegram.ui;

import android.view.ViewTreeObserver;
public final class z20 implements ViewTreeObserver.OnPreDrawListener {
    public final int f54377a;
    public final f40 f54378b;

    public z20(f40 f40Var, int i7) {
        this.f54377a = i7;
        this.f54378b = f40Var;
    }

    @Override
    public final boolean onPreDraw() {
        switch (this.f54377a) {
            case 0:
                f40 f40Var = this.f54378b;
                f40Var.L1.getViewTreeObserver().removeOnPreDrawListener(this);
                f40Var.Z3.j(null);
                org.telegram.messenger.g0.Z3(f40Var.f47487l4);
                f40Var.f30192b.requestLayout();
                return false;
            default:
                f40 f40Var2 = this.f54378b;
                f40Var2.L1.getViewTreeObserver().removeOnPreDrawListener(this);
                f40Var2.Z3.j(null);
                org.telegram.messenger.g0.Z3(f40Var2.f47487l4);
                f40Var2.f30192b.requestLayout();
                return false;
        }
    }
}
