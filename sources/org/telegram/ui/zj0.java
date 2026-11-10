package org.telegram.ui;

import java.util.TimerTask;
public final class zj0 extends TimerTask {
    public final ak0 f52477a;

    public zj0(ak0 ak0Var) {
        this.f52477a = ak0Var;
    }

    @Override
    public final void run() {
        ak0 ak0Var = this.f52477a;
        if (ak0Var.f43711w == null) {
            return;
        }
        double currentTimeMillis = System.currentTimeMillis();
        ak0Var.D = (int) (ak0Var.D - (currentTimeMillis - ak0Var.F));
        ak0Var.F = currentTimeMillis;
        org.telegram.messenger.g0.h3(new hf0(this, 9));
    }
}
