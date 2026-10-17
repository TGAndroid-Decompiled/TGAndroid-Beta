package org.telegram.ui;

import java.util.TimerTask;
import org.telegram.messenger.AndroidUtilities;
public final class sm0 extends TimerTask {
    public final tm0 f41142a;

    public sm0(tm0 tm0Var) {
        this.f41142a = tm0Var;
    }

    @Override
    public final void run() {
        tm0 tm0Var = this.f41142a;
        if (tm0Var.v == null) {
            return;
        }
        double currentTimeMillis = System.currentTimeMillis();
        tm0Var.f41788y = (int) (tm0Var.f41788y - (currentTimeMillis - tm0Var.F));
        tm0Var.F = currentTimeMillis;
        AndroidUtilities.runOnUIThread(new ek0(this, 7));
    }
}
