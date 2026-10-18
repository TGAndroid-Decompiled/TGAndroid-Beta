package org.telegram.ui;

import java.util.TimerTask;
import org.telegram.messenger.AndroidUtilities;
public final class sm0 extends TimerTask {
    public final tm0 f41128a;

    public sm0(tm0 tm0Var) {
        this.f41128a = tm0Var;
    }

    @Override
    public final void run() {
        tm0 tm0Var = this.f41128a;
        if (tm0Var.v == null) {
            return;
        }
        double currentTimeMillis = System.currentTimeMillis();
        tm0Var.f41773y = (int) (tm0Var.f41773y - (currentTimeMillis - tm0Var.F));
        tm0Var.F = currentTimeMillis;
        AndroidUtilities.runOnUIThread(new ek0(this, 7));
    }
}
