package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class w61 implements Runnable {
    public final int f43255a;
    public final org.telegram.ui.Cells.c6 f43256b;

    public w61(org.telegram.ui.Cells.c6 c6Var, int i10) {
        this.f43255a = i10;
        this.f43256b = c6Var;
    }

    @Override
    public final void run() {
        switch (this.f43255a) {
            case 0:
                AndroidUtilities.showKeyboard(((a61) this.f43256b.d).h);
                return;
            default:
                this.f43256b.requestFocus();
                return;
        }
    }
}
