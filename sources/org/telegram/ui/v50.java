package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class v50 implements Runnable {
    public final int f40588a;
    public final w50 f40589b;

    public v50(w50 w50Var, int i10) {
        this.f40588a = i10;
        this.f40589b = w50Var;
    }

    @Override
    public final void run() {
        switch (this.f40588a) {
            case 0:
                w50 w50Var = this.f40589b;
                x50 x50Var = w50Var.f40862b;
                if (x50Var != null) {
                    x50Var.setVisibility(0);
                }
                AndroidUtilities.runOnUIThread(new v50(w50Var, 2), 16L);
                return;
            case 1:
                x50 x50Var2 = this.f40589b.f40862b;
                if (x50Var2 != null) {
                    x50Var2.setVisibility(4);
                    return;
                }
                return;
            default:
                super/*android.app.Dialog*/.dismiss();
                return;
        }
    }
}
