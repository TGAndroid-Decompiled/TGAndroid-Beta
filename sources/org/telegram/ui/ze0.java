package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class ze0 implements Runnable {
    public final int f40453a;
    public final af0 f40454b;

    public ze0(af0 af0Var, int i10) {
        this.f40453a = i10;
        this.f40454b = af0Var;
    }

    @Override
    public final void run() {
        switch (this.f40453a) {
            case 0:
                af0 af0Var = this.f40454b;
                bf0 bf0Var = af0Var.d;
                if (af0Var.f32152b) {
                    boolean z10 = bf0Var.K;
                    org.telegram.ui.Components.ij0 ij0Var = bf0Var.J;
                    id idVar = bf0Var.f32409n;
                    if (z10 && System.currentTimeMillis() - af0Var.f32151a >= 10000) {
                        idVar.setAnimation(ij0Var);
                        ij0Var.N(0, false, false);
                        ij0Var.f25092t0 = new ze0(af0Var, 1);
                        idVar.d();
                        af0Var.f32151a = System.currentTimeMillis();
                    }
                    idVar.postDelayed(af0Var.f32153c, 1000L);
                    return;
                }
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new ze0(this.f40454b, 2));
                return;
            default:
                bf0 bf0Var2 = this.f40454b.d;
                org.telegram.ui.Components.ij0 ij0Var2 = bf0Var2.I;
                ij0Var2.N(0, false, false);
                bf0Var2.f32409n.setAnimation(ij0Var2);
                return;
        }
    }
}
