package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class y31 implements Runnable {
    public final int f39748a;
    public final a41 f39749b;

    public y31(a41 a41Var, int i10) {
        this.f39748a = i10;
        this.f39749b = a41Var;
    }

    @Override
    public final void run() {
        switch (this.f39748a) {
            case 0:
                a41 a41Var = this.f39749b;
                b41 b41Var = a41Var.v;
                if (a41Var.f31689a == 0) {
                    b41Var.dismiss();
                    return;
                } else {
                    b41Var.onBackPressed();
                    return;
                }
            default:
                AndroidUtilities.showKeyboard(this.f39749b.f31693n.f20229b);
                return;
        }
    }
}
