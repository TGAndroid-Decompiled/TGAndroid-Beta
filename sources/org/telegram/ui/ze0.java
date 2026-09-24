package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class ze0 implements Runnable {
    public final int f40437a;
    public final af0 f40438b;

    public ze0(af0 af0Var, int i10) {
        this.f40437a = i10;
        this.f40438b = af0Var;
    }

    @Override
    public final void run() {
        switch (this.f40437a) {
            case 0:
                af0 af0Var = this.f40438b;
                bf0 bf0Var = af0Var.d;
                if (af0Var.f32138b) {
                    boolean z10 = bf0Var.K;
                    org.telegram.ui.Components.ij0 ij0Var = bf0Var.J;
                    id idVar = bf0Var.f32396n;
                    if (z10 && System.currentTimeMillis() - af0Var.f32137a >= 10000) {
                        idVar.setAnimation(ij0Var);
                        ij0Var.N(0, false, false);
                        ij0Var.f25066t0 = new ze0(af0Var, 1);
                        idVar.d();
                        af0Var.f32137a = System.currentTimeMillis();
                    }
                    idVar.postDelayed(af0Var.f32139c, 1000L);
                    return;
                }
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new ze0(this.f40438b, 2));
                return;
            default:
                bf0 bf0Var2 = this.f40438b.d;
                org.telegram.ui.Components.ij0 ij0Var2 = bf0Var2.I;
                ij0Var2.N(0, false, false);
                bf0Var2.f32396n.setAnimation(ij0Var2);
                return;
        }
    }
}
