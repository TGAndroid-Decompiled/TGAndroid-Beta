package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class uh0 implements Runnable {
    public final int f42434a;
    public final pi0 f42435b;

    public uh0(pi0 pi0Var, int i10) {
        this.f42434a = i10;
        this.f42435b = pi0Var;
    }

    @Override
    public final void run() {
        switch (this.f42434a) {
            case 0:
                super/*android.app.Dialog*/.dismiss();
                return;
            case 1:
                pi0 pi0Var = this.f42435b;
                pi0Var.getClass();
                wh.f.f(false);
                wh.f fVar = pi0Var.f40560h0;
                if (fVar != null) {
                    fVar.b(pi0Var.E);
                }
                AndroidUtilities.runOnUIThread(new uh0(pi0Var, 0));
                return;
            case 2:
                wh.f.f(false);
                pi0 pi0Var2 = this.f42435b;
                wh.f fVar2 = pi0Var2.f40560h0;
                if (fVar2 != null) {
                    fVar2.b(pi0Var2.E);
                }
                AndroidUtilities.runOnUIThread(new uh0(pi0Var2, 3));
                return;
            default:
                super/*android.app.Dialog*/.dismiss();
                return;
        }
    }
}
