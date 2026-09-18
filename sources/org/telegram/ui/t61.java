package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class t61 implements Runnable {
    public final int f37584a;
    public final org.telegram.ui.Cells.c6 f37585b;

    public t61(org.telegram.ui.Cells.c6 c6Var, int i10) {
        this.f37584a = i10;
        this.f37585b = c6Var;
    }

    @Override
    public final void run() {
        switch (this.f37584a) {
            case 0:
                AndroidUtilities.showKeyboard(((x51) this.f37585b.d).h);
                return;
            default:
                this.f37585b.requestFocus();
                return;
        }
    }
}
