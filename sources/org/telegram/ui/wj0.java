package org.telegram.ui;

import java.util.TimerTask;
public final class wj0 extends TimerTask {
    public final xj0 f51457a;

    public wj0(xj0 xj0Var) {
        this.f51457a = xj0Var;
    }

    @Override
    public final void run() {
        xj0 xj0Var = this.f51457a;
        if (xj0Var.f51888w == null) {
            return;
        }
        double currentTimeMillis = System.currentTimeMillis();
        xj0Var.D = (int) (xj0Var.D - (currentTimeMillis - xj0Var.F));
        xj0Var.F = currentTimeMillis;
        org.telegram.messenger.g0.h3(new ef0(this, 9));
    }
}
