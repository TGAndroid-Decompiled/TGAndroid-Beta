package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class z31 implements Runnable {
    public final int f40040a;
    public final b41 f40041b;

    public z31(b41 b41Var, int i10) {
        this.f40040a = i10;
        this.f40041b = b41Var;
    }

    @Override
    public final void run() {
        switch (this.f40040a) {
            case 0:
                b41 b41Var = this.f40041b;
                c41 c41Var = b41Var.v;
                if (b41Var.f32030a == 0) {
                    c41Var.dismiss();
                    return;
                } else {
                    c41Var.onBackPressed();
                    return;
                }
            default:
                AndroidUtilities.showKeyboard(this.f40041b.f32034n.f20190b);
                return;
        }
    }
}
