package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class rh0 implements Runnable {
    public final int f41226a;
    public final mi0 f41227b;

    public rh0(mi0 mi0Var, int i10) {
        this.f41226a = i10;
        this.f41227b = mi0Var;
    }

    @Override
    public final void run() {
        switch (this.f41226a) {
            case 0:
                super/*android.app.Dialog*/.dismiss();
                return;
            case 1:
                mi0 mi0Var = this.f41227b;
                mi0Var.getClass();
                wh.f.f(false);
                wh.f fVar = mi0Var.f39270h0;
                if (fVar != null) {
                    fVar.b(mi0Var.E);
                }
                AndroidUtilities.runOnUIThread(new rh0(mi0Var, 0));
                return;
            case 2:
                wh.f.f(false);
                mi0 mi0Var2 = this.f41227b;
                wh.f fVar2 = mi0Var2.f39270h0;
                if (fVar2 != null) {
                    fVar2.b(mi0Var2.E);
                }
                AndroidUtilities.runOnUIThread(new rh0(mi0Var2, 3));
                return;
            default:
                super/*android.app.Dialog*/.dismiss();
                return;
        }
    }
}
