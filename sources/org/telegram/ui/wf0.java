package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class wf0 implements Runnable {
    public final int f42762a;
    public final w3 f42763b;

    public wf0(w3 w3Var, int i10) {
        this.f42762a = i10;
        this.f42763b = w3Var;
    }

    @Override
    public final void run() {
        switch (this.f42762a) {
            case 0:
                this.f42763b.run("CANCELLED");
                return;
            default:
                AndroidUtilities.runOnUIThread(new wf0(this.f42763b, 0));
                return;
        }
    }
}
