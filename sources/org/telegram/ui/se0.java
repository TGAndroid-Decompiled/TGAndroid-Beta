package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class se0 implements Runnable {
    public final int f41394a;
    public final te0 f41395b;

    public se0(te0 te0Var, int i10) {
        this.f41394a = i10;
        this.f41395b = te0Var;
    }

    @Override
    public final void run() {
        switch (this.f41394a) {
            case 0:
                te0 te0Var = this.f41395b;
                ue0 ue0Var = te0Var.d;
                if (te0Var.f41972b) {
                    boolean z10 = ue0Var.K;
                    org.telegram.ui.Components.yj0 yj0Var = ue0Var.J;
                    jd jdVar = ue0Var.f42397n;
                    if (z10 && System.currentTimeMillis() - te0Var.f41971a >= 10000) {
                        jdVar.setAnimation(yj0Var);
                        yj0Var.N(0, false, false);
                        yj0Var.f32957t0 = new se0(te0Var, 1);
                        jdVar.d();
                        te0Var.f41971a = System.currentTimeMillis();
                    }
                    jdVar.postDelayed(te0Var.f41973c, 1000L);
                    return;
                }
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new se0(this.f41395b, 2));
                return;
            default:
                ue0 ue0Var2 = this.f41395b.d;
                org.telegram.ui.Components.yj0 yj0Var2 = ue0Var2.I;
                yj0Var2.N(0, false, false);
                ue0Var2.f42397n.setAnimation(yj0Var2);
                return;
        }
    }
}
