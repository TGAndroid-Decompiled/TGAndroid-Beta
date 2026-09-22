package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class u61 implements Runnable {
    public final int f37820a;
    public final org.telegram.ui.Cells.c6 f37821b;

    public u61(org.telegram.ui.Cells.c6 c6Var, int i10) {
        this.f37820a = i10;
        this.f37821b = c6Var;
    }

    @Override
    public final void run() {
        switch (this.f37820a) {
            case 0:
                AndroidUtilities.showKeyboard(((y51) this.f37821b.d).h);
                return;
            default:
                this.f37821b.requestFocus();
                return;
        }
    }
}
