package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class vf0 implements Runnable {
    public final int f39160a;
    public final w3 f39161b;

    public vf0(w3 w3Var, int i10) {
        this.f39160a = i10;
        this.f39161b = w3Var;
    }

    @Override
    public final void run() {
        switch (this.f39160a) {
            case 0:
                this.f39161b.run("CANCELLED");
                return;
            default:
                AndroidUtilities.runOnUIThread(new vf0(this.f39161b, 0));
                return;
        }
    }
}
