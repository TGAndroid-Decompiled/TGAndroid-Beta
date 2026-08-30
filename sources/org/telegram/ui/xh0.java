package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class xh0 implements Runnable {
    public final int f39923a;
    public final si0 f39924b;

    public xh0(si0 si0Var, int i10) {
        this.f39923a = i10;
        this.f39924b = si0Var;
    }

    @Override
    public final void run() {
        switch (this.f39923a) {
            case 0:
                super/*android.app.Dialog*/.dismiss();
                return;
            case 1:
                si0 si0Var = this.f39924b;
                si0Var.getClass();
                ih.j.f(false);
                ih.j jVar = si0Var.f38359f0;
                if (jVar != null) {
                    jVar.b(si0Var.C);
                }
                AndroidUtilities.runOnUIThread(new xh0(si0Var, 0));
                return;
            case 2:
                ih.j.f(false);
                si0 si0Var2 = this.f39924b;
                ih.j jVar2 = si0Var2.f38359f0;
                if (jVar2 != null) {
                    jVar2.b(si0Var2.C);
                }
                AndroidUtilities.runOnUIThread(new xh0(si0Var2, 3));
                return;
            default:
                super/*android.app.Dialog*/.dismiss();
                return;
        }
    }
}
