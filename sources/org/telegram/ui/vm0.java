package org.telegram.ui;

import java.util.TimerTask;
import org.telegram.messenger.AndroidUtilities;
public final class vm0 extends TimerTask {
    public final wm0 f42791a;

    public vm0(wm0 wm0Var) {
        this.f42791a = wm0Var;
    }

    @Override
    public final void run() {
        wm0 wm0Var = this.f42791a;
        if (wm0Var.v == null) {
            return;
        }
        double currentTimeMillis = System.currentTimeMillis();
        wm0Var.f43403y = (int) (wm0Var.f43403y - (currentTimeMillis - wm0Var.F));
        wm0Var.F = currentTimeMillis;
        AndroidUtilities.runOnUIThread(new oj0(this, 8));
    }
}
