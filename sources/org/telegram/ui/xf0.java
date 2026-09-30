package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class xf0 implements Runnable {
    public final int f40013a;
    public final t3 f40014b;

    public xf0(t3 t3Var, int i10) {
        this.f40013a = i10;
        this.f40014b = t3Var;
    }

    @Override
    public final void run() {
        switch (this.f40013a) {
            case 0:
                this.f40014b.run("CANCELLED");
                return;
            default:
                AndroidUtilities.runOnUIThread(new xf0(this.f40014b, 0));
                return;
        }
    }
}
