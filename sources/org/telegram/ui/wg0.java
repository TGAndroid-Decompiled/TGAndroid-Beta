package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class wg0 implements Runnable {
    public final ih0 f42882a;

    public wg0(ih0 ih0Var) {
        this.f42882a = ih0Var;
    }

    @Override
    public final void run() {
        ih0 ih0Var = this.f42882a;
        if (ih0Var.f37983b == null) {
            return;
        }
        for (int i10 = 0; i10 < ih0Var.f37983b.getChildCount(); i10++) {
            View childAt = ih0Var.f37983b.getChildAt(i10);
            if (childAt instanceof fh0) {
                fh0 fh0Var = (fh0) childAt;
                if (fh0Var.I) {
                    fh0Var.b(fh0Var.f37014n, fh0Var.f37015r);
                }
            }
        }
        AndroidUtilities.runOnUIThread(this, 500L);
    }
}
