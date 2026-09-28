package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class xf0 implements Runnable {
    public final int f39916a;
    public final t3 f39917b;

    public xf0(t3 t3Var, int i10) {
        this.f39916a = i10;
        this.f39917b = t3Var;
    }

    @Override
    public final void run() {
        switch (this.f39916a) {
            case 0:
                this.f39917b.run("CANCELLED");
                return;
            default:
                AndroidUtilities.runOnUIThread(new xf0(this.f39917b, 0));
                return;
        }
    }
}
