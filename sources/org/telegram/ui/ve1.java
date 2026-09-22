package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class ve1 implements Runnable {
    public final int f38521a;
    public final af1 f38522b;

    public ve1(af1 af1Var, int i10) {
        this.f38521a = i10;
        this.f38522b = af1Var;
    }

    @Override
    public final void run() {
        switch (this.f38521a) {
            case 0:
                af1 af1Var = this.f38522b;
                af1Var.getClass();
                new rg.x0((org.telegram.ui.ActionBar.n2) af1Var, 11, false).show();
                return;
            default:
                af1 af1Var2 = this.f38522b;
                af1Var2.e.requestFocus();
                AndroidUtilities.showKeyboard(af1Var2.e);
                return;
        }
    }
}
