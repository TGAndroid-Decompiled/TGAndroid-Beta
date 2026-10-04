package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class s31 implements Runnable {
    public final int f40345a;
    public final u31 f40346b;

    public s31(u31 u31Var, int i10) {
        this.f40345a = i10;
        this.f40346b = u31Var;
    }

    @Override
    public final void run() {
        switch (this.f40345a) {
            case 0:
                u31 u31Var = this.f40346b;
                v31 v31Var = u31Var.v;
                if (u31Var.f41037a == 0) {
                    v31Var.dismiss();
                    return;
                } else {
                    v31Var.onBackPressed();
                    return;
                }
            default:
                AndroidUtilities.showKeyboard(this.f40346b.f41042n.f22307b);
                return;
        }
    }
}
