package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class s50 implements Runnable {
    public final int f37389a;
    public final t50 f37390b;

    public s50(t50 t50Var, int i10) {
        this.f37389a = i10;
        this.f37390b = t50Var;
    }

    @Override
    public final void run() {
        switch (this.f37389a) {
            case 0:
                t50 t50Var = this.f37390b;
                u50 u50Var = t50Var.f37660b;
                if (u50Var != null) {
                    u50Var.setVisibility(0);
                }
                AndroidUtilities.runOnUIThread(new s50(t50Var, 2), 16L);
                return;
            case 1:
                u50 u50Var2 = this.f37390b.f37660b;
                if (u50Var2 != null) {
                    u50Var2.setVisibility(4);
                    return;
                }
                return;
            default:
                super/*android.app.Dialog*/.dismiss();
                return;
        }
    }
}
