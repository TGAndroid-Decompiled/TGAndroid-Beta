package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class ze0 implements Runnable {
    public final int f40454a;
    public final af0 f40455b;

    public ze0(af0 af0Var, int i10) {
        this.f40454a = i10;
        this.f40455b = af0Var;
    }

    @Override
    public final void run() {
        switch (this.f40454a) {
            case 0:
                af0 af0Var = this.f40455b;
                bf0 bf0Var = af0Var.d;
                if (af0Var.f32153b) {
                    boolean z10 = bf0Var.K;
                    org.telegram.ui.Components.ij0 ij0Var = bf0Var.J;
                    id idVar = bf0Var.f32410n;
                    if (z10 && System.currentTimeMillis() - af0Var.f32152a >= 10000) {
                        idVar.setAnimation(ij0Var);
                        ij0Var.N(0, false, false);
                        ij0Var.f25093t0 = new ze0(af0Var, 1);
                        idVar.d();
                        af0Var.f32152a = System.currentTimeMillis();
                    }
                    idVar.postDelayed(af0Var.f32154c, 1000L);
                    return;
                }
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new ze0(this.f40455b, 2));
                return;
            default:
                bf0 bf0Var2 = this.f40455b.d;
                org.telegram.ui.Components.ij0 ij0Var2 = bf0Var2.I;
                ij0Var2.N(0, false, false);
                bf0Var2.f32410n.setAnimation(ij0Var2);
                return;
        }
    }
}
