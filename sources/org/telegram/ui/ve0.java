package org.telegram.ui;

import android.view.View;
public final class ve0 implements Runnable {
    public final ff0 f50719a;

    public ve0(ff0 ff0Var) {
        this.f50719a = ff0Var;
    }

    @Override
    public final void run() {
        ff0 ff0Var = this.f50719a;
        if (ff0Var.f45731b == null) {
            return;
        }
        for (int i7 = 0; i7 < ff0Var.f45731b.getChildCount(); i7++) {
            View childAt = ff0Var.f45731b.getChildAt(i7);
            if (childAt instanceof cf0) {
                cf0 cf0Var = (cf0) childAt;
                if (cf0Var.I) {
                    cf0Var.b(cf0Var.f44344n, cf0Var.f44345r);
                }
            }
        }
        org.telegram.messenger.g0.i3(this, 500L);
    }
}
