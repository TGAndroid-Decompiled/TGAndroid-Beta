package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class s51 implements Runnable {
    public final int f43241a;
    public final org.telegram.ui.Cells.g6 f43242b;

    public s51(org.telegram.ui.Cells.g6 g6Var, int i10) {
        this.f43241a = i10;
        this.f43242b = g6Var;
    }

    @Override
    public final void run() {
        switch (this.f43241a) {
            case 0:
                AndroidUtilities.showKeyboard(((w41) this.f43242b.d).h);
                return;
            default:
                this.f43242b.requestFocus();
                return;
        }
    }
}
