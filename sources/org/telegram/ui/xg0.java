package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class xg0 implements Runnable {
    public final jh0 f43118a;

    public xg0(jh0 jh0Var) {
        this.f43118a = jh0Var;
    }

    @Override
    public final void run() {
        jh0 jh0Var = this.f43118a;
        if (jh0Var.f38144b == null) {
            return;
        }
        for (int i10 = 0; i10 < jh0Var.f38144b.getChildCount(); i10++) {
            View childAt = jh0Var.f38144b.getChildAt(i10);
            if (childAt instanceof gh0) {
                gh0 gh0Var = (gh0) childAt;
                if (gh0Var.I) {
                    gh0Var.b(gh0Var.f37183n, gh0Var.f37184r);
                }
            }
        }
        AndroidUtilities.runOnUIThread(this, 500L);
    }
}
