package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class z31 implements Runnable {
    public final int f44472a;
    public final b41 f44473b;

    public z31(b41 b41Var, int i10) {
        this.f44472a = i10;
        this.f44473b = b41Var;
    }

    @Override
    public final void run() {
        switch (this.f44472a) {
            case 0:
                b41 b41Var = this.f44473b;
                c41 c41Var = b41Var.v;
                if (b41Var.f36129a == 0) {
                    c41Var.dismiss();
                    return;
                } else {
                    c41Var.onBackPressed();
                    return;
                }
            default:
                AndroidUtilities.showKeyboard(this.f44473b.f36134n.f22297b);
                return;
        }
    }
}
