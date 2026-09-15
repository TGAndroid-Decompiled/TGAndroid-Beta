package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class t61 implements Runnable {
    public final int f37567a;
    public final org.telegram.ui.Cells.b6 f37568b;

    public t61(org.telegram.ui.Cells.b6 b6Var, int i10) {
        this.f37567a = i10;
        this.f37568b = b6Var;
    }

    @Override
    public final void run() {
        switch (this.f37567a) {
            case 0:
                AndroidUtilities.showKeyboard(((x51) this.f37568b.d).h);
                return;
            default:
                this.f37568b.requestFocus();
                return;
        }
    }
}
