package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class vh0 implements Runnable {
    public final int f42774a;
    public final qi0 f42775b;

    public vh0(qi0 qi0Var, int i10) {
        this.f42774a = i10;
        this.f42775b = qi0Var;
    }

    @Override
    public final void run() {
        switch (this.f42774a) {
            case 0:
                super/*android.app.Dialog*/.dismiss();
                return;
            case 1:
                qi0 qi0Var = this.f42775b;
                qi0Var.getClass();
                wh.f.f(false);
                wh.f fVar = qi0Var.f40829h0;
                if (fVar != null) {
                    fVar.b(qi0Var.E);
                }
                AndroidUtilities.runOnUIThread(new vh0(qi0Var, 0));
                return;
            case 2:
                wh.f.f(false);
                qi0 qi0Var2 = this.f42775b;
                wh.f fVar2 = qi0Var2.f40829h0;
                if (fVar2 != null) {
                    fVar2.b(qi0Var2.E);
                }
                AndroidUtilities.runOnUIThread(new vh0(qi0Var2, 3));
                return;
            default:
                super/*android.app.Dialog*/.dismiss();
                return;
        }
    }
}
