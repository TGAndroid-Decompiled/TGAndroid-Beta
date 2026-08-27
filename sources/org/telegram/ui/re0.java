package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;

public final class re0 implements Runnable {

    public final int f41911a;

    public final se0 f41912b;

    public re0(se0 se0Var, int i10) {
        this.f41911a = i10;
        this.f41912b = se0Var;
    }

    @Override
    public final void run() {
        switch (this.f41911a) {
            case 0:
                se0 se0Var = this.f41912b;
                te0 te0Var = se0Var.d;
                if (se0Var.f42605b) {
                    boolean z10 = te0Var.G;
                    org.telegram.ui.Components.oi0 oi0Var = te0Var.F;
                    fd fdVar = te0Var.f42920n;
                    if (z10 && System.currentTimeMillis() - se0Var.f42604a >= 10000) {
                        fdVar.setAnimation(oi0Var);
                        oi0Var.L(0, false, false);
                        oi0Var.f31326q0 = new re0(se0Var, 1);
                        fdVar.d();
                        se0Var.f42604a = System.currentTimeMillis();
                    }
                    fdVar.postDelayed(se0Var.f42606c, 1000L);
                }
                break;
            case 1:
                AndroidUtilities.runOnUIThread(new re0(this.f41912b, 2));
                break;
            default:
                te0 te0Var2 = this.f41912b.d;
                org.telegram.ui.Components.oi0 oi0Var2 = te0Var2.E;
                oi0Var2.L(0, false, false);
                te0Var2.f42920n.setAnimation(oi0Var2);
                break;
        }
    }
}
