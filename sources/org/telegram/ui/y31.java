package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class y31 implements Runnable {
    public final int f44281a;
    public final a41 f44282b;

    public y31(a41 a41Var, int i10) {
        this.f44281a = i10;
        this.f44282b = a41Var;
    }

    @Override
    public final void run() {
        switch (this.f44281a) {
            case 0:
                a41 a41Var = this.f44282b;
                b41 b41Var = a41Var.v;
                if (a41Var.f35910a == 0) {
                    b41Var.dismiss();
                    return;
                } else {
                    b41Var.onBackPressed();
                    return;
                }
            default:
                AndroidUtilities.showKeyboard(this.f44282b.f35915n.f22325b);
                return;
        }
    }
}
