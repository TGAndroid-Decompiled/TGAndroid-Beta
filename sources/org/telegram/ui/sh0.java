package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class sh0 implements Runnable {
    public final di0 f39823a;

    public sh0(di0 di0Var) {
        this.f39823a = di0Var;
    }

    @Override
    public final void run() {
        di0 di0Var = this.f39823a;
        if (di0Var.f35032b == null) {
            return;
        }
        for (int i10 = 0; i10 < di0Var.f35032b.getChildCount(); i10++) {
            View childAt = di0Var.f35032b.getChildAt(i10);
            if (childAt instanceof ai0) {
                ai0 ai0Var = (ai0) childAt;
                if (ai0Var.I) {
                    ai0Var.b(ai0Var.f33939n, ai0Var.f33940r);
                }
            }
        }
        AndroidUtilities.runOnUIThread(this, 500L);
    }
}
