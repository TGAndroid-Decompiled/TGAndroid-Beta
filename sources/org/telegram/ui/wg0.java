package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class wg0 implements Runnable {
    public final ih0 f42881a;

    public wg0(ih0 ih0Var) {
        this.f42881a = ih0Var;
    }

    @Override
    public final void run() {
        ih0 ih0Var = this.f42881a;
        if (ih0Var.f37982b == null) {
            return;
        }
        for (int i10 = 0; i10 < ih0Var.f37982b.getChildCount(); i10++) {
            View childAt = ih0Var.f37982b.getChildAt(i10);
            if (childAt instanceof fh0) {
                fh0 fh0Var = (fh0) childAt;
                if (fh0Var.I) {
                    fh0Var.b(fh0Var.f37013n, fh0Var.f37014r);
                }
            }
        }
        AndroidUtilities.runOnUIThread(this, 500L);
    }
}
