package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class z40 implements Runnable {
    public final int f43629a;
    public final a50 f43630b;

    public z40(a50 a50Var, int i10) {
        this.f43629a = i10;
        this.f43630b = a50Var;
    }

    @Override
    public final void run() {
        switch (this.f43629a) {
            case 0:
                a50 a50Var = this.f43630b;
                v10 v10Var = a50Var.f35278b;
                if (v10Var != null) {
                    v10Var.setVisibility(0);
                }
                AndroidUtilities.runOnUIThread(new z40(a50Var, 2), 16L);
                return;
            case 1:
                v10 v10Var2 = this.f43630b.f35278b;
                if (v10Var2 != null) {
                    v10Var2.setVisibility(4);
                    return;
                }
                return;
            default:
                super/*android.app.Dialog*/.dismiss();
                return;
        }
    }
}
