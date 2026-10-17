package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class yg0 implements Runnable {
    public final kh0 f43406a;

    public yg0(kh0 kh0Var) {
        this.f43406a = kh0Var;
    }

    @Override
    public final void run() {
        kh0 kh0Var = this.f43406a;
        if (kh0Var.f38528b == null) {
            return;
        }
        for (int i10 = 0; i10 < kh0Var.f38528b.getChildCount(); i10++) {
            View childAt = kh0Var.f38528b.getChildAt(i10);
            if (childAt instanceof hh0) {
                hh0 hh0Var = (hh0) childAt;
                if (hh0Var.I) {
                    hh0Var.b(hh0Var.f37556n, hh0Var.f37557r);
                }
            }
        }
        AndroidUtilities.runOnUIThread(this, 500L);
    }
}
