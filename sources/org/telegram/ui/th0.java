package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class th0 implements Runnable {
    public final int f41753a;
    public final oi0 f41754b;

    public th0(oi0 oi0Var, int i10) {
        this.f41753a = i10;
        this.f41754b = oi0Var;
    }

    @Override
    public final void run() {
        switch (this.f41753a) {
            case 0:
                super/*android.app.Dialog*/.dismiss();
                return;
            case 1:
                oi0 oi0Var = this.f41754b;
                oi0Var.getClass();
                wh.f.f(false);
                wh.f fVar = oi0Var.f39799i0;
                if (fVar != null) {
                    fVar.b(oi0Var.F);
                }
                AndroidUtilities.runOnUIThread(new th0(oi0Var, 0));
                return;
            case 2:
                wh.f.f(false);
                oi0 oi0Var2 = this.f41754b;
                wh.f fVar2 = oi0Var2.f39799i0;
                if (fVar2 != null) {
                    fVar2.b(oi0Var2.F);
                }
                AndroidUtilities.runOnUIThread(new th0(oi0Var2, 3));
                return;
            default:
                super/*android.app.Dialog*/.dismiss();
                return;
        }
    }
}
