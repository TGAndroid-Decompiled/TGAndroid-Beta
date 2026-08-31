package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class yh0 implements Runnable {
    public final int f43635a;
    public final ti0 f43636b;

    public yh0(ti0 ti0Var, int i10) {
        this.f43635a = i10;
        this.f43636b = ti0Var;
    }

    @Override
    public final void run() {
        switch (this.f43635a) {
            case 0:
                super/*android.app.Dialog*/.dismiss();
                return;
            case 1:
                ti0 ti0Var = this.f43636b;
                ti0Var.getClass();
                jh.j.f(false);
                jh.j jVar = ti0Var.f41634f0;
                if (jVar != null) {
                    jVar.b(ti0Var.C);
                }
                AndroidUtilities.runOnUIThread(new yh0(ti0Var, 0));
                return;
            case 2:
                jh.j.f(false);
                ti0 ti0Var2 = this.f43636b;
                jh.j jVar2 = ti0Var2.f41634f0;
                if (jVar2 != null) {
                    jVar2.b(ti0Var2.C);
                }
                AndroidUtilities.runOnUIThread(new yh0(ti0Var2, 3));
                return;
            default:
                super/*android.app.Dialog*/.dismiss();
                return;
        }
    }
}
