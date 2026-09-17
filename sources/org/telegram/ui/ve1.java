package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class ve1 implements Runnable {
    public final int f41527a;
    public final af1 f41528b;

    public ve1(af1 af1Var, int i10) {
        this.f41527a = i10;
        this.f41528b = af1Var;
    }

    @Override
    public final void run() {
        switch (this.f41527a) {
            case 0:
                af1 af1Var = this.f41528b;
                af1Var.getClass();
                new sg.a1((org.telegram.ui.ActionBar.n2) af1Var, 11, false).show();
                return;
            default:
                af1 af1Var2 = this.f41528b;
                af1Var2.f34414e.requestFocus();
                AndroidUtilities.showKeyboard(af1Var2.f34414e);
                return;
        }
    }
}
