package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class s31 implements Runnable {
    public final int f37290a;
    public final u31 f37291b;

    public s31(u31 u31Var, int i10) {
        this.f37290a = i10;
        this.f37291b = u31Var;
    }

    @Override
    public final void run() {
        switch (this.f37290a) {
            case 0:
                u31 u31Var = this.f37291b;
                v31 v31Var = u31Var.v;
                if (u31Var.f38112a == 0) {
                    v31Var.dismiss();
                    return;
                } else {
                    v31Var.onBackPressed();
                    return;
                }
            default:
                AndroidUtilities.showKeyboard(this.f37291b.f38116n.f20493b);
                return;
        }
    }
}
