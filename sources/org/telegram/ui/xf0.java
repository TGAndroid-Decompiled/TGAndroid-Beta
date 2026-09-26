package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class xf0 implements Runnable {
    public final int f39914a;
    public final t3 f39915b;

    public xf0(t3 t3Var, int i10) {
        this.f39914a = i10;
        this.f39915b = t3Var;
    }

    @Override
    public final void run() {
        switch (this.f39914a) {
            case 0:
                this.f39915b.run("CANCELLED");
                return;
            default:
                AndroidUtilities.runOnUIThread(new xf0(this.f39915b, 0));
                return;
        }
    }
}
