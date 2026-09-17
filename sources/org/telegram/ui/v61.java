package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class v61 implements Runnable {
    public final int f38306a;
    public final org.telegram.ui.Cells.b6 f38307b;

    public v61(org.telegram.ui.Cells.b6 b6Var, int i10) {
        this.f38306a = i10;
        this.f38307b = b6Var;
    }

    @Override
    public final void run() {
        switch (this.f38306a) {
            case 0:
                AndroidUtilities.showKeyboard(((z51) this.f38307b.d).h);
                return;
            default:
                this.f38307b.requestFocus();
                return;
        }
    }
}
