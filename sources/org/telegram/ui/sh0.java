package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;

public final class sh0 implements Runnable {

    public final int f42650a;

    public final ni0 f42651b;

    public sh0(ni0 ni0Var, int i10) {
        this.f42650a = i10;
        this.f42651b = ni0Var;
    }

    @Override
    public final void run() {
        switch (this.f42650a) {
            case 0:
                super/*android.app.Dialog*/.dismiss();
                break;
            case 1:
                ni0 ni0Var = this.f42651b;
                ni0Var.getClass();
                eh.j.f(false);
                eh.j jVar = ni0Var.f40848e0;
                if (jVar != null) {
                    jVar.b(ni0Var.B);
                }
                AndroidUtilities.runOnUIThread(new sh0(ni0Var, 0));
                break;
            case 2:
                eh.j.f(false);
                ni0 ni0Var2 = this.f42651b;
                eh.j jVar2 = ni0Var2.f40848e0;
                if (jVar2 != null) {
                    jVar2.b(ni0Var2.B);
                }
                AndroidUtilities.runOnUIThread(new sh0(ni0Var2, 3));
                break;
            default:
                super/*android.app.Dialog*/.dismiss();
                break;
        }
    }
}
