package org.telegram.ui;

import java.util.TimerTask;
import org.telegram.messenger.AndroidUtilities;
public final class sm0 extends TimerTask {
    public final tm0 f41163a;

    public sm0(tm0 tm0Var) {
        this.f41163a = tm0Var;
    }

    @Override
    public final void run() {
        tm0 tm0Var = this.f41163a;
        if (tm0Var.v == null) {
            return;
        }
        double currentTimeMillis = System.currentTimeMillis();
        tm0Var.f41814y = (int) (tm0Var.f41814y - (currentTimeMillis - tm0Var.F));
        tm0Var.F = currentTimeMillis;
        AndroidUtilities.runOnUIThread(new ek0(this, 7));
    }
}
