package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class u21 implements Runnable {
    public final int f43118a;
    public final x21 f43119b;

    public u21(x21 x21Var, int i9) {
        this.f43118a = i9;
        this.f43119b = x21Var;
    }

    @Override
    public final void run() {
        switch (this.f43118a) {
            case 0:
                x21 x21Var = this.f43119b;
                y21 y21Var = x21Var.v;
                if (x21Var.f44336a == 0) {
                    y21Var.dismiss();
                    return;
                } else {
                    y21Var.onBackPressed();
                    return;
                }
            default:
                AndroidUtilities.showKeyboard(this.f43119b.f44341n.f24544b);
                return;
        }
    }
}
