package org.telegram.ui;

import android.view.View;
public final class ve0 implements Runnable {
    public final ff0 f52807a;

    public ve0(ff0 ff0Var) {
        this.f52807a = ff0Var;
    }

    @Override
    public final void run() {
        ff0 ff0Var = this.f52807a;
        if (ff0Var.f47691b == null) {
            return;
        }
        for (int i7 = 0; i7 < ff0Var.f47691b.getChildCount(); i7++) {
            View childAt = ff0Var.f47691b.getChildAt(i7);
            if (childAt instanceof cf0) {
                cf0 cf0Var = (cf0) childAt;
                if (cf0Var.J) {
                    cf0Var.b(cf0Var.f46556n, cf0Var.f46557r);
                }
            }
        }
        org.telegram.messenger.g0.h3(this, 500L);
    }
}
