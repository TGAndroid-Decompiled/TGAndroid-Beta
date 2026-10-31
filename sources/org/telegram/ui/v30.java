package org.telegram.ui;

import android.view.ViewTreeObserver;
public final class v30 implements ViewTreeObserver.OnPreDrawListener {
    public final int f42586a;
    public final b50 f42587b;

    public v30(b50 b50Var, int i10) {
        this.f42586a = i10;
        this.f42587b = b50Var;
    }

    @Override
    public final boolean onPreDraw() {
        switch (this.f42586a) {
            case 0:
                b50 b50Var = this.f42587b;
                b50Var.H1.getViewTreeObserver().removeOnPreDrawListener(this);
                b50Var.R3.j(null);
                org.telegram.messenger.i0.a4(b50Var.f36008d4);
                b50Var.f21586b.requestLayout();
                return false;
            default:
                b50 b50Var2 = this.f42587b;
                b50Var2.H1.getViewTreeObserver().removeOnPreDrawListener(this);
                b50Var2.R3.j(null);
                org.telegram.messenger.i0.a4(b50Var2.f36008d4);
                b50Var2.f21586b.requestLayout();
                return false;
        }
    }
}
