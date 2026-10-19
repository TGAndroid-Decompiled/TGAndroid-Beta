package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class vg0 implements Runnable {
    public final hh0 f42247a;

    public vg0(hh0 hh0Var) {
        this.f42247a = hh0Var;
    }

    @Override
    public final void run() {
        hh0 hh0Var = this.f42247a;
        if (hh0Var.f37624b == null) {
            return;
        }
        for (int i10 = 0; i10 < hh0Var.f37624b.getChildCount(); i10++) {
            View childAt = hh0Var.f37624b.getChildAt(i10);
            if (childAt instanceof eh0) {
                eh0 eh0Var = (eh0) childAt;
                if (eh0Var.I) {
                    eh0Var.b(eh0Var.f36666n, eh0Var.f36667r);
                }
            }
        }
        AndroidUtilities.runOnUIThread(this, 500L);
    }
}
