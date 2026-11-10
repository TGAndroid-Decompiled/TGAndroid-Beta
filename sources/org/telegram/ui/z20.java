package org.telegram.ui;

import android.view.ViewTreeObserver;
public final class z20 implements ViewTreeObserver.OnPreDrawListener {
    public final int f52187a;
    public final f40 f52188b;

    public z20(f40 f40Var, int i7) {
        this.f52187a = i7;
        this.f52188b = f40Var;
    }

    @Override
    public final boolean onPreDraw() {
        switch (this.f52187a) {
            case 0:
                f40 f40Var = this.f52188b;
                f40Var.K1.getViewTreeObserver().removeOnPreDrawListener(this);
                f40Var.U3.j(null);
                org.telegram.messenger.g0.b4(f40Var.f45529g4);
                f40Var.f28672b.requestLayout();
                return false;
            default:
                f40 f40Var2 = this.f52188b;
                f40Var2.K1.getViewTreeObserver().removeOnPreDrawListener(this);
                f40Var2.U3.j(null);
                org.telegram.messenger.g0.b4(f40Var2.f45529g4);
                f40Var2.f28672b.requestLayout();
                return false;
        }
    }
}
