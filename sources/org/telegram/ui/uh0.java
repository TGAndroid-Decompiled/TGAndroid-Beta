package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class uh0 implements Runnable {
    public final int f44028a;
    public final pi0 f44029b;

    public uh0(pi0 pi0Var, int i10) {
        this.f44028a = i10;
        this.f44029b = pi0Var;
    }

    @Override
    public final void run() {
        switch (this.f44028a) {
            case 0:
                super/*android.app.Dialog*/.dismiss();
                return;
            case 1:
                pi0 pi0Var = this.f44029b;
                pi0Var.getClass();
                xh.f.f(false);
                xh.f fVar = pi0Var.f42418h0;
                if (fVar != null) {
                    fVar.b(pi0Var.E);
                }
                AndroidUtilities.runOnUIThread(new uh0(pi0Var, 0));
                return;
            case 2:
                xh.f.f(false);
                pi0 pi0Var2 = this.f44029b;
                xh.f fVar2 = pi0Var2.f42418h0;
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
