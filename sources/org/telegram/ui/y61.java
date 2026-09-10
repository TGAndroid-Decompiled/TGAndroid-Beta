package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class y61 implements Runnable {
    public final int f38927a;
    public final org.telegram.ui.Cells.d6 f38928b;

    public y61(org.telegram.ui.Cells.d6 d6Var, int i10) {
        this.f38927a = i10;
        this.f38928b = d6Var;
    }

    @Override
    public final void run() {
        switch (this.f38927a) {
            case 0:
                AndroidUtilities.showKeyboard(((c61) this.f38928b.d).h);
                return;
            default:
                this.f38928b.requestFocus();
                return;
        }
    }
}
