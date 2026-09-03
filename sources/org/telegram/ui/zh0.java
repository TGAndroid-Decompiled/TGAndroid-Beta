package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class zh0 implements Runnable {
    public final int f40485a;
    public final ui0 f40486b;

    public zh0(ui0 ui0Var, int i10) {
        this.f40485a = i10;
        this.f40486b = ui0Var;
    }

    @Override
    public final void run() {
        switch (this.f40485a) {
            case 0:
                super/*android.app.Dialog*/.dismiss();
                return;
            case 1:
                ui0 ui0Var = this.f40486b;
                ui0Var.getClass();
                ih.j.f(false);
                ih.j jVar = ui0Var.f38834f0;
                if (jVar != null) {
                    jVar.b(ui0Var.C);
                }
                AndroidUtilities.runOnUIThread(new zh0(ui0Var, 0));
                return;
            case 2:
                ih.j.f(false);
                ui0 ui0Var2 = this.f40486b;
                ih.j jVar2 = ui0Var2.f38834f0;
                if (jVar2 != null) {
                    jVar2.b(ui0Var2.C);
                }
                AndroidUtilities.runOnUIThread(new zh0(ui0Var2, 3));
                return;
            default:
                super/*android.app.Dialog*/.dismiss();
                return;
        }
    }
}
