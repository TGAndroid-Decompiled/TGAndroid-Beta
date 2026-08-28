package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class wg0 implements Runnable {
    public final hh0 f44131a;

    public wg0(hh0 hh0Var) {
        this.f44131a = hh0Var;
    }

    @Override
    public final void run() {
        hh0 hh0Var = this.f44131a;
        if (hh0Var.f38793b == null) {
            return;
        }
        for (int i9 = 0; i9 < hh0Var.f38793b.getChildCount(); i9++) {
            View childAt = hh0Var.f38793b.getChildAt(i9);
            if (childAt instanceof eh0) {
                eh0 eh0Var = (eh0) childAt;
                if (eh0Var.E) {
                    eh0Var.b(eh0Var.f37953n, eh0Var.f37954r);
                }
            }
        }
        AndroidUtilities.runOnUIThread(this, 500L);
    }
}
