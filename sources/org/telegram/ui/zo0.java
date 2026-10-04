package org.telegram.ui;

import android.view.View;
public final class zo0 extends org.telegram.ui.Components.x81 {
    public final wp0 f43857a;

    public zo0(wp0 wp0Var) {
        this.f43857a = wp0Var;
    }

    @Override
    public final View d(int i10) {
        wp0 wp0Var = this.f43857a;
        if (i10 == 1) {
            return wp0Var.h;
        }
        if (i10 == 0) {
            return wp0Var.f42581n;
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
