package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class w61 implements Runnable {
    public final int f38702a;
    public final org.telegram.ui.Cells.d6 f38703b;

    public w61(org.telegram.ui.Cells.d6 d6Var, int i10) {
        this.f38702a = i10;
        this.f38703b = d6Var;
    }

    @Override
    public final void run() {
        switch (this.f38702a) {
            case 0:
                AndroidUtilities.showKeyboard(((a61) this.f38703b.d).h);
                return;
            default:
                this.f38703b.requestFocus();
                return;
        }
    }
}
