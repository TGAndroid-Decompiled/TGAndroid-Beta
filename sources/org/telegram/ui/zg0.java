package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class zg0 implements Runnable {
    public final lh0 f44100a;

    public zg0(lh0 lh0Var) {
        this.f44100a = lh0Var;
    }

    @Override
    public final void run() {
        lh0 lh0Var = this.f44100a;
        if (lh0Var.f39273b == null) {
            return;
        }
        for (int i10 = 0; i10 < lh0Var.f39273b.getChildCount(); i10++) {
            View childAt = lh0Var.f39273b.getChildAt(i10);
            if (childAt instanceof ih0) {
                ih0 ih0Var = (ih0) childAt;
                if (ih0Var.I) {
                    ih0Var.b(ih0Var.f38302n, ih0Var.f38303r);
                }
            }
        }
        AndroidUtilities.runOnUIThread(this, 500L);
    }
}
