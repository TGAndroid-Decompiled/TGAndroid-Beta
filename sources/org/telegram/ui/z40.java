package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class z40 implements Runnable {
    public final int f45069a;
    public final a50 f45070b;

    public z40(a50 a50Var, int i10) {
        this.f45069a = i10;
        this.f45070b = a50Var;
    }

    @Override
    public final void run() {
        switch (this.f45069a) {
            case 0:
                a50 a50Var = this.f45070b;
                cg.h0 h0Var = a50Var.f36429b;
                if (h0Var != null) {
                    h0Var.setVisibility(0);
                }
                AndroidUtilities.runOnUIThread(new z40(a50Var, 2), 16L);
                return;
            case 1:
                cg.h0 h0Var2 = this.f45070b.f36429b;
                if (h0Var2 != null) {
                    h0Var2.setVisibility(4);
                    return;
                }
                return;
            default:
                super/*android.app.Dialog*/.dismiss();
                return;
        }
    }
}
