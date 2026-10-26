package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class sh0 implements Runnable {
    public final int f43513a;
    public final ni0 f43514b;

    public sh0(ni0 ni0Var, int i10) {
        this.f43513a = i10;
        this.f43514b = ni0Var;
    }

    @Override
    public final void run() {
        switch (this.f43513a) {
            case 0:
                super/*android.app.Dialog*/.dismiss();
                return;
            case 1:
                ni0 ni0Var = this.f43514b;
                ni0Var.getClass();
                xh.f.f(false);
                xh.f fVar = ni0Var.f41915h0;
                if (fVar != null) {
                    fVar.b(ni0Var.E);
                }
                AndroidUtilities.runOnUIThread(new sh0(ni0Var, 0));
                return;
            case 2:
                xh.f.f(false);
                ni0 ni0Var2 = this.f43514b;
                xh.f fVar2 = ni0Var2.f41915h0;
                if (fVar2 != null) {
                    fVar2.b(ni0Var2.E);
                }
                AndroidUtilities.runOnUIThread(new sh0(ni0Var2, 3));
                return;
            default:
                super/*android.app.Dialog*/.dismiss();
                return;
        }
    }
}
