package org.telegram.ui;

import android.view.View;
public final class ue0 implements Runnable {
    public final ef0 f50387a;

    public ue0(ef0 ef0Var) {
        this.f50387a = ef0Var;
    }

    @Override
    public final void run() {
        ef0 ef0Var = this.f50387a;
        if (ef0Var.f45407b == null) {
            return;
        }
        for (int i7 = 0; i7 < ef0Var.f45407b.getChildCount(); i7++) {
            View childAt = ef0Var.f45407b.getChildAt(i7);
            if (childAt instanceof bf0) {
                bf0 bf0Var = (bf0) childAt;
                if (bf0Var.I) {
                    bf0Var.b(bf0Var.f44029n, bf0Var.f44030r);
                }
            }
        }
        org.telegram.messenger.g0.i3(this, 500L);
    }
}
