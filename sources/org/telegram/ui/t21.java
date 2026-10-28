package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class t21 implements Runnable {
    public final int f43476a;
    public final w21 f43477b;

    public t21(w21 w21Var, int i10) {
        this.f43476a = i10;
        this.f43477b = w21Var;
    }

    @Override
    public final void run() {
        switch (this.f43476a) {
            case 0:
                w21 w21Var = this.f43477b;
                x21 x21Var = w21Var.v;
                if (w21Var.f44499a == 0) {
                    x21Var.dismiss();
                    return;
                } else {
                    x21Var.onBackPressed();
                    return;
                }
            default:
                AndroidUtilities.showKeyboard(this.f43477b.f44503n.d);
                return;
        }
    }
}
