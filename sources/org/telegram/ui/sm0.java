package org.telegram.ui;

import java.util.TimerTask;
import org.telegram.messenger.AndroidUtilities;

public final class sm0 extends TimerTask {

    public final tm0 f42670a;

    public sm0(tm0 tm0Var) {
        this.f42670a = tm0Var;
    }

    @Override
    public final void run() {
        tm0 tm0Var = this.f42670a;
        if (tm0Var.v == null) {
            return;
        }
        double dCurrentTimeMillis = System.currentTimeMillis();
        tm0Var.f42976y = (int) (((double) tm0Var.f42976y) - (dCurrentTimeMillis - tm0Var.B));
        tm0Var.B = dCurrentTimeMillis;
        AndroidUtilities.runOnUIThread(new zk0(this, 6));
    }
}
