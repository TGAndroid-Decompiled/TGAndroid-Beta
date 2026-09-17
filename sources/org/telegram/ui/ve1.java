package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class ve1 implements Runnable {
    public final int f41554a;
    public final af1 f41555b;

    public ve1(af1 af1Var, int i10) {
        this.f41554a = i10;
        this.f41555b = af1Var;
    }

    @Override
    public final void run() {
        switch (this.f41554a) {
            case 0:
                af1 af1Var = this.f41555b;
                af1Var.getClass();
                new sg.a1((org.telegram.ui.ActionBar.n2) af1Var, 11, false).show();
                return;
            default:
                af1 af1Var2 = this.f41555b;
                af1Var2.f34441e.requestFocus();
                AndroidUtilities.showKeyboard(af1Var2.f34441e);
                return;
        }
    }
}
