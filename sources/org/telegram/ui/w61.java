package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class w61 implements Runnable {
    public final int f41806a;
    public final org.telegram.ui.Cells.b6 f41807b;

    public w61(org.telegram.ui.Cells.b6 b6Var, int i10) {
        this.f41806a = i10;
        this.f41807b = b6Var;
    }

    @Override
    public final void run() {
        switch (this.f41806a) {
            case 0:
                AndroidUtilities.showKeyboard(((a61) this.f41807b.d).h);
                return;
            default:
                this.f41807b.requestFocus();
                return;
        }
    }
}
