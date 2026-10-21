package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class rh0 implements Runnable {
    public final int f41222a;
    public final mi0 f41223b;

    public rh0(mi0 mi0Var, int i10) {
        this.f41222a = i10;
        this.f41223b = mi0Var;
    }

    @Override
    public final void run() {
        switch (this.f41222a) {
            case 0:
                super/*android.app.Dialog*/.dismiss();
                return;
            case 1:
                mi0 mi0Var = this.f41223b;
                mi0Var.getClass();
                wh.f.f(false);
                wh.f fVar = mi0Var.f39266h0;
                if (fVar != null) {
                    fVar.b(mi0Var.E);
                }
                AndroidUtilities.runOnUIThread(new rh0(mi0Var, 0));
                return;
            case 2:
                wh.f.f(false);
                mi0 mi0Var2 = this.f41223b;
                wh.f fVar2 = mi0Var2.f39266h0;
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
