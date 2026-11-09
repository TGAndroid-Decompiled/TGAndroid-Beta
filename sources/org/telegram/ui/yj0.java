package org.telegram.ui;

import java.util.TimerTask;
public final class yj0 extends TimerTask {
    public final zj0 f52133a;

    public yj0(zj0 zj0Var) {
        this.f52133a = zj0Var;
    }

    @Override
    public final void run() {
        zj0 zj0Var = this.f52133a;
        if (zj0Var.f52583w == null) {
            return;
        }
        double currentTimeMillis = System.currentTimeMillis();
        zj0Var.D = (int) (zj0Var.D - (currentTimeMillis - zj0Var.F));
        zj0Var.F = currentTimeMillis;
        org.telegram.messenger.g0.h3(new gf0(this, 9));
    }
}
