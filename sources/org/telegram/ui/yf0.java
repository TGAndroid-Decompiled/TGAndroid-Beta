package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class yf0 implements Runnable {
    public final int f39811a;
    public final t3 f39812b;

    public yf0(t3 t3Var, int i10) {
        this.f39811a = i10;
        this.f39812b = t3Var;
    }

    @Override
    public final void run() {
        switch (this.f39811a) {
            case 0:
                this.f39812b.run("CANCELLED");
                return;
            default:
                AndroidUtilities.runOnUIThread(new yf0(this.f39812b, 0));
                return;
        }
    }
}
