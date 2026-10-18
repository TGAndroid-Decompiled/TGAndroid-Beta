package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class yg0 implements Runnable {
    public final kh0 f43430a;

    public yg0(kh0 kh0Var) {
        this.f43430a = kh0Var;
    }

    @Override
    public final void run() {
        kh0 kh0Var = this.f43430a;
        if (kh0Var.f38537b == null) {
            return;
        }
        for (int i10 = 0; i10 < kh0Var.f38537b.getChildCount(); i10++) {
            View childAt = kh0Var.f38537b.getChildAt(i10);
            if (childAt instanceof hh0) {
                hh0 hh0Var = (hh0) childAt;
                if (hh0Var.I) {
                    hh0Var.b(hh0Var.f37574n, hh0Var.f37575r);
                }
            }
        }
        AndroidUtilities.runOnUIThread(this, 500L);
    }
}
