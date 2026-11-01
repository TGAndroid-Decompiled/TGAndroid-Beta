package org.telegram.ui;

import android.view.View;
public final class xf0 implements Runnable {
    public final ig0 f43367a;

    public xf0(ig0 ig0Var) {
        this.f43367a = ig0Var;
    }

    @Override
    public final void run() {
        ig0 ig0Var = this.f43367a;
        if (ig0Var.f38028b == null) {
            return;
        }
        for (int i10 = 0; i10 < ig0Var.f38028b.getChildCount(); i10++) {
            View childAt = ig0Var.f38028b.getChildAt(i10);
            if (childAt instanceof fg0) {
                fg0 fg0Var = (fg0) childAt;
                if (fg0Var.I) {
                    fg0Var.b(fg0Var.f37141n, fg0Var.f37142r);
                }
            }
        }
        org.telegram.messenger.i0.h3(this, 500L);
    }
}
