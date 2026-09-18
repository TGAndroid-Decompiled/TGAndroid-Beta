package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class y31 implements Runnable {
    public final int f39696a;
    public final a41 f39697b;

    public y31(a41 a41Var, int i10) {
        this.f39696a = i10;
        this.f39697b = a41Var;
    }

    @Override
    public final void run() {
        switch (this.f39696a) {
            case 0:
                a41 a41Var = this.f39697b;
                b41 b41Var = a41Var.v;
                if (a41Var.f31945a == 0) {
                    b41Var.dismiss();
                    return;
                } else {
                    b41Var.onBackPressed();
                    return;
                }
            default:
                AndroidUtilities.showKeyboard(this.f39697b.f31949n.f20455b);
                return;
        }
    }
}
