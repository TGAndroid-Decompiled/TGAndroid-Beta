package org.telegram.ui;

import android.view.View;
public final class wo0 extends org.telegram.ui.Components.n81 {
    public final tp0 f39721a;

    public wo0(tp0 tp0Var) {
        this.f39721a = tp0Var;
    }

    @Override
    public final View d(int i10) {
        tp0 tp0Var = this.f39721a;
        if (i10 == 1) {
            return tp0Var.h;
        }
        if (i10 == 0) {
            return tp0Var.f38162n;
        }
        return null;
    }

    @Override
    public final int e() {
        return 2;
    }

    @Override
    public final int h(int i10) {
        return i10;
    }

    @Override
    public final void b(View view, int i10, int i11) {
    }
}
