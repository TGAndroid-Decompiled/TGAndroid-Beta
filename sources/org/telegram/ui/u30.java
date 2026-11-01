package org.telegram.ui;

import android.view.ViewTreeObserver;
public final class u30 implements ViewTreeObserver.OnPreDrawListener {
    public final int f41783a;
    public final a50 f41784b;

    public u30(a50 a50Var, int i10) {
        this.f41783a = i10;
        this.f41784b = a50Var;
    }

    @Override
    public final boolean onPreDraw() {
        switch (this.f41783a) {
            case 0:
                a50 a50Var = this.f41784b;
                a50Var.H1.getViewTreeObserver().removeOnPreDrawListener(this);
                a50Var.R3.j(null);
                org.telegram.messenger.i0.a4(a50Var.f35592d4);
                a50Var.f21587b.requestLayout();
                return false;
            default:
                a50 a50Var2 = this.f41784b;
                a50Var2.H1.getViewTreeObserver().removeOnPreDrawListener(this);
                a50Var2.R3.j(null);
                org.telegram.messenger.i0.a4(a50Var2.f35592d4);
                a50Var2.f21587b.requestLayout();
                return false;
        }
    }
}
