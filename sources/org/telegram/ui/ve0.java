package org.telegram.ui;

import android.view.View;
public final class ve0 implements Runnable {
    public final ff0 f52803a;

    public ve0(ff0 ff0Var) {
        this.f52803a = ff0Var;
    }

    @Override
    public final void run() {
        ff0 ff0Var = this.f52803a;
        if (ff0Var.f47687b == null) {
            return;
        }
        for (int i7 = 0; i7 < ff0Var.f47687b.getChildCount(); i7++) {
            View childAt = ff0Var.f47687b.getChildAt(i7);
            if (childAt instanceof cf0) {
                cf0 cf0Var = (cf0) childAt;
                if (cf0Var.J) {
                    cf0Var.b(cf0Var.f46553n, cf0Var.f46554r);
                }
            }
        }
        org.telegram.messenger.g0.h3(this, 500L);
    }
}
