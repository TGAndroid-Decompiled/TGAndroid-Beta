package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class z31 implements Runnable {
    public final int f40109a;
    public final b41 f40110b;

    public z31(b41 b41Var, int i10) {
        this.f40109a = i10;
        this.f40110b = b41Var;
    }

    @Override
    public final void run() {
        switch (this.f40109a) {
            case 0:
                b41 b41Var = this.f40110b;
                c41 c41Var = b41Var.v;
                if (b41Var.f32269a == 0) {
                    c41Var.dismiss();
                    return;
                } else {
                    c41Var.onBackPressed();
                    return;
                }
            default:
                AndroidUtilities.showKeyboard(this.f40110b.f32273n.f20542b);
                return;
        }
    }
}
