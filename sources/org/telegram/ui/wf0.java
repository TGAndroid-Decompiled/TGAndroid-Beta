package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class wf0 implements Runnable {
    public final int f42798a;
    public final w3 f42799b;

    public wf0(w3 w3Var, int i10) {
        this.f42798a = i10;
        this.f42799b = w3Var;
    }

    @Override
    public final void run() {
        switch (this.f42798a) {
            case 0:
                this.f42799b.run("CANCELLED");
                return;
            default:
                AndroidUtilities.runOnUIThread(new wf0(this.f42799b, 0));
                return;
        }
    }
}
