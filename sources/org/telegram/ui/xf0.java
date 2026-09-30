package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class xf0 implements Runnable {
    public final int f39915a;
    public final t3 f39916b;

    public xf0(t3 t3Var, int i10) {
        this.f39915a = i10;
        this.f39916b = t3Var;
    }

    @Override
    public final void run() {
        switch (this.f39915a) {
            case 0:
                this.f39916b.run("CANCELLED");
                return;
            default:
                AndroidUtilities.runOnUIThread(new xf0(this.f39916b, 0));
                return;
        }
    }
}
