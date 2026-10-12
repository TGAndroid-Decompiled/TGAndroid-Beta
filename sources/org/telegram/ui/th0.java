package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class th0 implements Runnable {
    public final ei0 f40389a;

    public th0(ei0 ei0Var) {
        this.f40389a = ei0Var;
    }

    @Override
    public final void run() {
        ei0 ei0Var = this.f40389a;
        if (ei0Var.f35586b == null) {
            return;
        }
        for (int i10 = 0; i10 < ei0Var.f35586b.getChildCount(); i10++) {
            View childAt = ei0Var.f35586b.getChildAt(i10);
            if (childAt instanceof bi0) {
                bi0 bi0Var = (bi0) childAt;
                if (bi0Var.I) {
                    bi0Var.b(bi0Var.f34578n, bi0Var.f34579r);
                }
            }
        }
        AndroidUtilities.runOnUIThread(this, 500L);
    }
}
