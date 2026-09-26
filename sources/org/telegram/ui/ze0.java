package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class ze0 implements Runnable {
    public final int f40452a;
    public final af0 f40453b;

    public ze0(af0 af0Var, int i10) {
        this.f40452a = i10;
        this.f40453b = af0Var;
    }

    @Override
    public final void run() {
        switch (this.f40452a) {
            case 0:
                af0 af0Var = this.f40453b;
                bf0 bf0Var = af0Var.d;
                if (af0Var.f32151b) {
                    boolean z10 = bf0Var.K;
                    org.telegram.ui.Components.jj0 jj0Var = bf0Var.J;
                    id idVar = bf0Var.f32408n;
                    if (z10 && System.currentTimeMillis() - af0Var.f32150a >= 10000) {
                        idVar.setAnimation(jj0Var);
                        jj0Var.N(0, false, false);
                        jj0Var.f25446t0 = new ze0(af0Var, 1);
                        idVar.d();
                        af0Var.f32150a = System.currentTimeMillis();
                    }
                    idVar.postDelayed(af0Var.f32152c, 1000L);
                    return;
                }
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new ze0(this.f40453b, 2));
                return;
            default:
                bf0 bf0Var2 = this.f40453b.d;
                org.telegram.ui.Components.jj0 jj0Var2 = bf0Var2.I;
                jj0Var2.N(0, false, false);
                bf0Var2.f32408n.setAnimation(jj0Var2);
                return;
        }
    }
}
