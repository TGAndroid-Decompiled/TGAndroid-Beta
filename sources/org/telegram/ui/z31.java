package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class z31 implements Runnable {
    public final int f40087a;
    public final b41 f40088b;

    public z31(b41 b41Var, int i10) {
        this.f40087a = i10;
        this.f40088b = b41Var;
    }

    @Override
    public final void run() {
        switch (this.f40087a) {
            case 0:
                b41 b41Var = this.f40088b;
                c41 c41Var = b41Var.v;
                if (b41Var.f32251a == 0) {
                    c41Var.dismiss();
                    return;
                } else {
                    c41Var.onBackPressed();
                    return;
                }
            default:
                AndroidUtilities.showKeyboard(this.f40088b.f32255n.f20527b);
                return;
        }
    }
}
