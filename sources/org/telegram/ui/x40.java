package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class x40 implements Runnable {
    public final int f44363a;
    public final y40 f44364b;

    public x40(y40 y40Var, int i9) {
        this.f44363a = i9;
        this.f44364b = y40Var;
    }

    @Override
    public final void run() {
        switch (this.f44363a) {
            case 0:
                y40 y40Var = this.f44364b;
                fh.l2 l2Var = y40Var.f44718b;
                if (l2Var != null) {
                    l2Var.setVisibility(0);
                }
                AndroidUtilities.runOnUIThread(new x40(y40Var, 2), 16L);
                return;
            case 1:
                fh.l2 l2Var2 = this.f44364b.f44718b;
                if (l2Var2 != null) {
                    l2Var2.setVisibility(4);
                    return;
                }
                return;
            default:
                super/*android.app.Dialog*/.dismiss();
                return;
        }
    }
}
