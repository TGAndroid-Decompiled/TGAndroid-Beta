package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class xf0 implements Runnable {
    public final int f39974a;
    public final y3 f39975b;

    public xf0(y3 y3Var, int i10) {
        this.f39974a = i10;
        this.f39975b = y3Var;
    }

    @Override
    public final void run() {
        switch (this.f39974a) {
            case 0:
                this.f39975b.run("CANCELLED");
                return;
            default:
                AndroidUtilities.runOnUIThread(new xf0(this.f39975b, 0));
                return;
        }
    }
}
