package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class z31 implements Runnable {
    public final int f44518a;
    public final b41 f44519b;

    public z31(b41 b41Var, int i10) {
        this.f44518a = i10;
        this.f44519b = b41Var;
    }

    @Override
    public final void run() {
        switch (this.f44518a) {
            case 0:
                b41 b41Var = this.f44519b;
                c41 c41Var = b41Var.v;
                if (b41Var.f36175a == 0) {
                    c41Var.dismiss();
                    return;
                } else {
                    c41Var.onBackPressed();
                    return;
                }
            default:
                AndroidUtilities.showKeyboard(this.f44519b.f36180n.f22301b);
                return;
        }
    }
}
