package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class ye0 implements Runnable {
    public final int f43606a;
    public final ze0 f43607b;

    public ye0(ze0 ze0Var, int i10) {
        this.f43606a = i10;
        this.f43607b = ze0Var;
    }

    @Override
    public final void run() {
        switch (this.f43606a) {
            case 0:
                ze0 ze0Var = this.f43607b;
                af0 af0Var = ze0Var.d;
                if (ze0Var.f43940b) {
                    boolean z4 = af0Var.H;
                    org.telegram.ui.Components.hj0 hj0Var = af0Var.G;
                    kd kdVar = af0Var.f35162n;
                    if (z4 && System.currentTimeMillis() - ze0Var.f43939a >= 10000) {
                        kdVar.setAnimation(hj0Var);
                        hj0Var.L(0, false, false);
                        hj0Var.f27540r0 = new ye0(ze0Var, 1);
                        kdVar.d();
                        ze0Var.f43939a = System.currentTimeMillis();
                    }
                    kdVar.postDelayed(ze0Var.f43941c, 1000L);
                    return;
                }
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new ye0(this.f43607b, 2));
                return;
            default:
                af0 af0Var2 = this.f43607b.d;
                org.telegram.ui.Components.hj0 hj0Var2 = af0Var2.F;
                hj0Var2.L(0, false, false);
                af0Var2.f35162n.setAnimation(hj0Var2);
                return;
        }
    }
}
