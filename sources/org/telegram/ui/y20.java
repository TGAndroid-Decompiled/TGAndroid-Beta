package org.telegram.ui;

import android.view.ViewTreeObserver;
public final class y20 implements ViewTreeObserver.OnPreDrawListener {
    public final int f54164a;
    public final e40 f54165b;

    public y20(e40 e40Var, int i7) {
        this.f54164a = i7;
        this.f54165b = e40Var;
    }

    @Override
    public final boolean onPreDraw() {
        switch (this.f54164a) {
            case 0:
                e40 e40Var = this.f54165b;
                e40Var.L1.getViewTreeObserver().removeOnPreDrawListener(this);
                e40Var.Z3.j(null);
                org.telegram.messenger.g0.Z3(e40Var.f47365l4);
                e40Var.f30226b.requestLayout();
                return false;
            default:
                e40 e40Var2 = this.f54165b;
                e40Var2.L1.getViewTreeObserver().removeOnPreDrawListener(this);
                e40Var2.Z3.j(null);
                org.telegram.messenger.g0.Z3(e40Var2.f47365l4);
                e40Var2.f30226b.requestLayout();
                return false;
        }
    }
}
