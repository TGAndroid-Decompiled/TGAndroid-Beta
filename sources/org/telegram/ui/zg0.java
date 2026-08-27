package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;

public final class zg0 implements Runnable {

    public final kh0 f45180a;

    public zg0(kh0 kh0Var) {
        this.f45180a = kh0Var;
    }

    @Override
    public final void run() {
        kh0 kh0Var = this.f45180a;
        if (kh0Var.f39738b == null) {
            return;
        }
        for (int i10 = 0; i10 < kh0Var.f39738b.getChildCount(); i10++) {
            View childAt = kh0Var.f39738b.getChildAt(i10);
            if (childAt instanceof hh0) {
                hh0 hh0Var = (hh0) childAt;
                if (hh0Var.E) {
                    hh0Var.b(hh0Var.f38830n, hh0Var.f38831r);
                }
            }
        }
        AndroidUtilities.runOnUIThread(this, 500L);
    }
}
