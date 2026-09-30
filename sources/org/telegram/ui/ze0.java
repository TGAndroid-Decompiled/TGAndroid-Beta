package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class ze0 implements Runnable {
    public final int f40563a;
    public final af0 f40564b;

    public ze0(af0 af0Var, int i10) {
        this.f40563a = i10;
        this.f40564b = af0Var;
    }

    @Override
    public final void run() {
        switch (this.f40563a) {
            case 0:
                af0 af0Var = this.f40564b;
                bf0 bf0Var = af0Var.d;
                if (af0Var.f32226b) {
                    boolean z10 = bf0Var.K;
                    org.telegram.ui.Components.lj0 lj0Var = bf0Var.J;
                    id idVar = bf0Var.f32484n;
                    if (z10 && System.currentTimeMillis() - af0Var.f32225a >= 10000) {
                        idVar.setAnimation(lj0Var);
                        lj0Var.N(0, false, false);
                        lj0Var.f26032t0 = new ze0(af0Var, 1);
                        idVar.d();
                        af0Var.f32225a = System.currentTimeMillis();
                    }
                    idVar.postDelayed(af0Var.f32227c, 1000L);
                    return;
                }
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new ze0(this.f40564b, 2));
                return;
            default:
                bf0 bf0Var2 = this.f40564b.d;
                org.telegram.ui.Components.lj0 lj0Var2 = bf0Var2.I;
                lj0Var2.N(0, false, false);
                bf0Var2.f32484n.setAnimation(lj0Var2);
                return;
        }
    }
}
