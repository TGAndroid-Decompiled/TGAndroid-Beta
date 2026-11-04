package org.telegram.ui;

import android.view.ViewTreeObserver;
public final class r20 implements ViewTreeObserver.OnPreDrawListener {
    public final int f49007a;
    public final x30 f49008b;

    public r20(x30 x30Var, int i3) {
        this.f49007a = i3;
        this.f49008b = x30Var;
    }

    @Override
    public final boolean onPreDraw() {
        switch (this.f49007a) {
            case 0:
                x30 x30Var = this.f49008b;
                x30Var.I1.getViewTreeObserver().removeOnPreDrawListener(this);
                x30Var.S3.j(null);
                org.telegram.messenger.g0.b4(x30Var.f51733e4);
                x30Var.f28586b.requestLayout();
                return false;
            default:
                x30 x30Var2 = this.f49008b;
                x30Var2.I1.getViewTreeObserver().removeOnPreDrawListener(this);
                x30Var2.S3.j(null);
                org.telegram.messenger.g0.b4(x30Var2.f51733e4);
                x30Var2.f28586b.requestLayout();
                return false;
        }
    }
}
