package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class w61 implements Runnable {
    public final int f38681a;
    public final org.telegram.ui.Cells.d6 f38682b;

    public w61(org.telegram.ui.Cells.d6 d6Var, int i10) {
        this.f38681a = i10;
        this.f38682b = d6Var;
    }

    @Override
    public final void run() {
        switch (this.f38681a) {
            case 0:
                AndroidUtilities.showKeyboard(((a61) this.f38682b.d).h);
                return;
            default:
                this.f38682b.requestFocus();
                return;
        }
    }
}
