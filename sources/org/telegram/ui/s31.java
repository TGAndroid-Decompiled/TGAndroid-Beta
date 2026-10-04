package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class s31 implements Runnable {
    public final int f40350a;
    public final u31 f40351b;

    public s31(u31 u31Var, int i10) {
        this.f40350a = i10;
        this.f40351b = u31Var;
    }

    @Override
    public final void run() {
        switch (this.f40350a) {
            case 0:
                u31 u31Var = this.f40351b;
                v31 v31Var = u31Var.v;
                if (u31Var.f41043a == 0) {
                    v31Var.dismiss();
                    return;
                } else {
                    v31Var.onBackPressed();
                    return;
                }
            default:
                AndroidUtilities.showKeyboard(this.f40351b.f41048n.f22311b);
                return;
        }
    }
}
