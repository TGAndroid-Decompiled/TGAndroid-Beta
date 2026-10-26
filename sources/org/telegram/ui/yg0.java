package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class yg0 implements Runnable {
    public final jh0 f46066a;

    public yg0(jh0 jh0Var) {
        this.f46066a = jh0Var;
    }

    @Override
    public final void run() {
        jh0 jh0Var = this.f46066a;
        if (jh0Var.f40647b == null) {
            return;
        }
        for (int i10 = 0; i10 < jh0Var.f40647b.getChildCount(); i10++) {
            View childAt = jh0Var.f40647b.getChildAt(i10);
            if (childAt instanceof gh0) {
                gh0 gh0Var = (gh0) childAt;
                if (gh0Var.I) {
                    gh0Var.b(gh0Var.f39692n, gh0Var.f39693r);
                }
            }
        }
        AndroidUtilities.runOnUIThread(this, 500L);
    }
}
