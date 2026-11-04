package org.telegram.ui;

import java.util.TimerTask;
public final class tj0 extends TimerTask {
    public final uj0 f49818a;

    public tj0(uj0 uj0Var) {
        this.f49818a = uj0Var;
    }

    @Override
    public final void run() {
        uj0 uj0Var = this.f49818a;
        if (uj0Var.f50108w == null) {
            return;
        }
        double currentTimeMillis = System.currentTimeMillis();
        uj0Var.E = (int) (uj0Var.E - (currentTimeMillis - uj0Var.G));
        uj0Var.G = currentTimeMillis;
        org.telegram.messenger.g0.h3(new sg0(this, 8));
    }
}
