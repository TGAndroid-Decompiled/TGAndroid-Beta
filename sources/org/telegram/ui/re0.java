package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class re0 implements Runnable {
    public final int f41138a;
    public final se0 f41139b;

    public re0(se0 se0Var, int i10) {
        this.f41138a = i10;
        this.f41139b = se0Var;
    }

    @Override
    public final void run() {
        switch (this.f41138a) {
            case 0:
                se0 se0Var = this.f41139b;
                te0 te0Var = se0Var.d;
                if (se0Var.f41364b) {
                    boolean z10 = te0Var.K;
                    org.telegram.ui.Components.xj0 xj0Var = te0Var.J;
                    jd jdVar = te0Var.f42019n;
                    if (z10 && System.currentTimeMillis() - se0Var.f41363a >= 10000) {
                        jdVar.setAnimation(xj0Var);
                        xj0Var.N(0, false, false);
                        xj0Var.f32618t0 = new re0(se0Var, 1);
                        jdVar.d();
                        se0Var.f41363a = System.currentTimeMillis();
                    }
                    jdVar.postDelayed(se0Var.f41365c, 1000L);
                    return;
                }
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new re0(this.f41139b, 2));
                return;
            default:
                te0 te0Var2 = this.f41139b.d;
                org.telegram.ui.Components.xj0 xj0Var2 = te0Var2.I;
                xj0Var2.N(0, false, false);
                te0Var2.f42019n.setAnimation(xj0Var2);
                return;
        }
    }
}
