package org.telegram.ui;

import android.view.View;
public final class ue0 implements Runnable {
    public final ef0 f52653a;

    public ue0(ef0 ef0Var) {
        this.f52653a = ef0Var;
    }

    @Override
    public final void run() {
        ef0 ef0Var = this.f52653a;
        if (ef0Var.f47518b == null) {
            return;
        }
        for (int i7 = 0; i7 < ef0Var.f47518b.getChildCount(); i7++) {
            View childAt = ef0Var.f47518b.getChildAt(i7);
            if (childAt instanceof bf0) {
                bf0 bf0Var = (bf0) childAt;
                if (bf0Var.J) {
                    bf0Var.b(bf0Var.f46035n, bf0Var.f46036r);
                }
            }
        }
        org.telegram.messenger.g0.h3(this, 500L);
    }
}
