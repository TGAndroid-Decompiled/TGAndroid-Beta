package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class x61 implements Runnable {
    public final int f43881a;
    public final org.telegram.ui.Cells.c6 f43882b;

    public x61(org.telegram.ui.Cells.c6 c6Var, int i10) {
        this.f43881a = i10;
        this.f43882b = c6Var;
    }

    @Override
    public final void run() {
        switch (this.f43881a) {
            case 0:
                AndroidUtilities.showKeyboard(((b61) this.f43882b.d).h);
                return;
            default:
                this.f43882b.requestFocus();
                return;
        }
    }
}
