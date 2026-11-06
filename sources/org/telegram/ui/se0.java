package org.telegram.ui;

import android.view.View;
public final class se0 implements Runnable {
    public final cf0 f49755a;

    public se0(cf0 cf0Var) {
        this.f49755a = cf0Var;
    }

    @Override
    public final void run() {
        cf0 cf0Var = this.f49755a;
        if (cf0Var.f44794b == null) {
            return;
        }
        for (int i7 = 0; i7 < cf0Var.f44794b.getChildCount(); i7++) {
            View childAt = cf0Var.f44794b.getChildAt(i7);
            if (childAt instanceof ze0) {
                ze0 ze0Var = (ze0) childAt;
                if (ze0Var.I) {
                    ze0Var.b(ze0Var.f52569n, ze0Var.f52570r);
                }
            }
        }
        org.telegram.messenger.g0.i3(this, 500L);
    }
}
