package org.telegram.ui;

import android.view.View;
public final class zf0 implements Runnable {
    public final kg0 f44146a;

    public zf0(kg0 kg0Var) {
        this.f44146a = kg0Var;
    }

    @Override
    public final void run() {
        kg0 kg0Var = this.f44146a;
        if (kg0Var.f38796b == null) {
            return;
        }
        for (int i10 = 0; i10 < kg0Var.f38796b.getChildCount(); i10++) {
            View childAt = kg0Var.f38796b.getChildAt(i10);
            if (childAt instanceof hg0) {
                hg0 hg0Var = (hg0) childAt;
                if (hg0Var.I) {
                    hg0Var.b(hg0Var.f37958n, hg0Var.f37959r);
                }
            }
        }
        org.telegram.messenger.i0.h3(this, 500L);
    }
}
