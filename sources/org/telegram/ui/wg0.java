package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class wg0 implements Runnable {
    public final hh0 f44306a;

    public wg0(hh0 hh0Var) {
        this.f44306a = hh0Var;
    }

    @Override
    public final void run() {
        hh0 hh0Var = this.f44306a;
        if (hh0Var.f38914b == null) {
            return;
        }
        for (int i10 = 0; i10 < hh0Var.f38914b.getChildCount(); i10++) {
            View childAt = hh0Var.f38914b.getChildAt(i10);
            if (childAt instanceof eh0) {
                eh0 eh0Var = (eh0) childAt;
                if (eh0Var.E) {
                    eh0Var.b(eh0Var.f37832n, eh0Var.f37833r);
                }
            }
        }
        AndroidUtilities.runOnUIThread(this, 500L);
    }
}
