package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class r31 implements Runnable {
    public final int f36679a;
    public final t31 f36680b;

    public r31(t31 t31Var, int i10) {
        this.f36679a = i10;
        this.f36680b = t31Var;
    }

    @Override
    public final void run() {
        switch (this.f36679a) {
            case 0:
                t31 t31Var = this.f36680b;
                u31 u31Var = t31Var.v;
                if (t31Var.f37512a == 0) {
                    u31Var.dismiss();
                    return;
                } else {
                    u31Var.onBackPressed();
                    return;
                }
            default:
                AndroidUtilities.showKeyboard(this.f36680b.f37516n.f20177b);
                return;
        }
    }
}
