package org.telegram.ui;

import android.view.View;
public final class ue0 implements Runnable {
    public final ff0 f52544a;

    public ue0(ff0 ff0Var) {
        this.f52544a = ff0Var;
    }

    @Override
    public final void run() {
        ff0 ff0Var = this.f52544a;
        if (ff0Var.f47666b == null) {
            return;
        }
        for (int i7 = 0; i7 < ff0Var.f47666b.getChildCount(); i7++) {
            View childAt = ff0Var.f47666b.getChildAt(i7);
            if (childAt instanceof cf0) {
                cf0 cf0Var = (cf0) childAt;
                if (cf0Var.J) {
                    cf0Var.b(cf0Var.f46526n, cf0Var.f46527r);
                }
            }
        }
        org.telegram.messenger.g0.h3(this, 500L);
    }
}
