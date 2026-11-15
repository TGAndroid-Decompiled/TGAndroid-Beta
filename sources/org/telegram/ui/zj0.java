package org.telegram.ui;

import java.util.TimerTask;
public final class zj0 extends TimerTask {
    public final ak0 f53982a;

    public zj0(ak0 ak0Var) {
        this.f53982a = ak0Var;
    }

    @Override
    public final void run() {
        ak0 ak0Var = this.f53982a;
        if (ak0Var.f45095w == null) {
            return;
        }
        double currentTimeMillis = System.currentTimeMillis();
        ak0Var.E = (int) (ak0Var.E - (currentTimeMillis - ak0Var.G));
        ak0Var.G = currentTimeMillis;
        org.telegram.messenger.g0.h3(new ef0(this, 9));
    }
}
