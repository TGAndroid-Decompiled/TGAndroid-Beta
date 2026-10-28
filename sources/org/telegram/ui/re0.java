package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class re0 implements Runnable {
    public final int f42976a;
    public final se0 f42977b;

    public re0(se0 se0Var, int i10) {
        this.f42976a = i10;
        this.f42977b = se0Var;
    }

    @Override
    public final void run() {
        switch (this.f42976a) {
            case 0:
                se0 se0Var = this.f42977b;
                te0 te0Var = se0Var.d;
                if (se0Var.f43308b) {
                    boolean z10 = te0Var.K;
                    org.telegram.ui.Components.yj0 yj0Var = te0Var.J;
                    kd kdVar = te0Var.f43614n;
                    if (z10 && System.currentTimeMillis() - se0Var.f43307a >= 10000) {
                        kdVar.setAnimation(yj0Var);
                        yj0Var.N(0, false, false);
                        yj0Var.f35091t0 = new re0(se0Var, 1);
                        kdVar.d();
                        se0Var.f43307a = System.currentTimeMillis();
                    }
                    kdVar.postDelayed(se0Var.f43309c, 1000L);
                    return;
                }
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new re0(this.f42977b, 2));
                return;
            default:
                te0 te0Var2 = this.f42977b.d;
                org.telegram.ui.Components.yj0 yj0Var2 = te0Var2.I;
                yj0Var2.N(0, false, false);
                te0Var2.f43614n.setAnimation(yj0Var2);
                return;
        }
    }
}
