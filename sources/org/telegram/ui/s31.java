package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class s31 implements Runnable {
    public final int f40344a;
    public final u31 f40345b;

    public s31(u31 u31Var, int i10) {
        this.f40344a = i10;
        this.f40345b = u31Var;
    }

    @Override
    public final void run() {
        switch (this.f40344a) {
            case 0:
                u31 u31Var = this.f40345b;
                v31 v31Var = u31Var.v;
                if (u31Var.f41036a == 0) {
                    v31Var.dismiss();
                    return;
                } else {
                    v31Var.onBackPressed();
                    return;
                }
            default:
                AndroidUtilities.showKeyboard(this.f40345b.f41041n.f22306b);
                return;
        }
    }
}
