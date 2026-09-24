package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class xf0 implements Runnable {
    public final int f39899a;
    public final t3 f39900b;

    public xf0(t3 t3Var, int i10) {
        this.f39899a = i10;
        this.f39900b = t3Var;
    }

    @Override
    public final void run() {
        switch (this.f39899a) {
            case 0:
                this.f39900b.run("CANCELLED");
                return;
            default:
                AndroidUtilities.runOnUIThread(new xf0(this.f39900b, 0));
                return;
        }
    }
}
