package org.telegram.ui;

import android.view.View;
public final class vo0 extends org.telegram.ui.Components.p81 {
    public final sp0 f38876a;

    public vo0(sp0 sp0Var) {
        this.f38876a = sp0Var;
    }

    @Override
    public final View d(int i10) {
        sp0 sp0Var = this.f38876a;
        if (i10 == 1) {
            return sp0Var.h;
        }
        if (i10 == 0) {
            return sp0Var.f37950n;
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
