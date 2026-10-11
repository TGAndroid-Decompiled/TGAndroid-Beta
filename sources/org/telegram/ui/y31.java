package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class y31 implements Runnable {
    public final int f44247a;
    public final a41 f44248b;

    public y31(a41 a41Var, int i10) {
        this.f44247a = i10;
        this.f44248b = a41Var;
    }

    @Override
    public final void run() {
        switch (this.f44247a) {
            case 0:
                a41 a41Var = this.f44248b;
                b41 b41Var = a41Var.v;
                if (a41Var.f35876a == 0) {
                    b41Var.dismiss();
                    return;
                } else {
                    b41Var.onBackPressed();
                    return;
                }
            default:
                AndroidUtilities.showKeyboard(this.f44248b.f35881n.f22289b);
                return;
        }
    }
}
