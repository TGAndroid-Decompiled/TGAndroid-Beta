package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class ye0 implements Runnable {
    public final int f43614a;
    public final ze0 f43615b;

    public ye0(ze0 ze0Var, int i10) {
        this.f43614a = i10;
        this.f43615b = ze0Var;
    }

    @Override
    public final void run() {
        switch (this.f43614a) {
            case 0:
                ze0 ze0Var = this.f43615b;
                af0 af0Var = ze0Var.d;
                if (ze0Var.f43924b) {
                    boolean z4 = af0Var.H;
                    org.telegram.ui.Components.ij0 ij0Var = af0Var.G;
                    kd kdVar = af0Var.f35155n;
                    if (z4 && System.currentTimeMillis() - ze0Var.f43923a >= 10000) {
                        kdVar.setAnimation(ij0Var);
                        ij0Var.L(0, false, false);
                        ij0Var.f27833r0 = new ye0(ze0Var, 1);
                        kdVar.d();
                        ze0Var.f43923a = System.currentTimeMillis();
                    }
                    kdVar.postDelayed(ze0Var.f43925c, 1000L);
                    return;
                }
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new ye0(this.f43615b, 2));
                return;
            default:
                af0 af0Var2 = this.f43615b.d;
                org.telegram.ui.Components.ij0 ij0Var2 = af0Var2.F;
                ij0Var2.L(0, false, false);
                af0Var2.f35155n.setAnimation(ij0Var2);
                return;
        }
    }
}
