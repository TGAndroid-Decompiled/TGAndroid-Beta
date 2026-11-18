package org.telegram.ui;

import android.view.View;
public final class ve0 implements Runnable {
    public final gf0 f52760a;

    public ve0(gf0 gf0Var) {
        this.f52760a = gf0Var;
    }

    @Override
    public final void run() {
        gf0 gf0Var = this.f52760a;
        if (gf0Var.f48000b == null) {
            return;
        }
        for (int i7 = 0; i7 < gf0Var.f48000b.getChildCount(); i7++) {
            View childAt = gf0Var.f48000b.getChildAt(i7);
            if (childAt instanceof df0) {
                df0 df0Var = (df0) childAt;
                if (df0Var.J) {
                    df0Var.b(df0Var.f46892n, df0Var.f46893r);
                }
            }
        }
        org.telegram.messenger.g0.h3(this, 500L);
    }
}
