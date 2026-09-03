package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class ze0 implements Runnable {
    public final int f40459a;
    public final af0 f40460b;

    public ze0(af0 af0Var, int i10) {
        this.f40459a = i10;
        this.f40460b = af0Var;
    }

    @Override
    public final void run() {
        switch (this.f40459a) {
            case 0:
                af0 af0Var = this.f40460b;
                bf0 bf0Var = af0Var.d;
                if (af0Var.f32576b) {
                    boolean z4 = bf0Var.H;
                    org.telegram.ui.Components.gj0 gj0Var = bf0Var.G;
                    md mdVar = bf0Var.f32867n;
                    if (z4 && System.currentTimeMillis() - af0Var.f32575a >= 10000) {
                        mdVar.setAnimation(gj0Var);
                        gj0Var.L(0, false, false);
                        gj0Var.f25174r0 = new ze0(af0Var, 1);
                        mdVar.d();
                        af0Var.f32575a = System.currentTimeMillis();
                    }
                    mdVar.postDelayed(af0Var.f32577c, 1000L);
                    return;
                }
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new ze0(this.f40460b, 2));
                return;
            default:
                bf0 bf0Var2 = this.f40460b.d;
                org.telegram.ui.Components.gj0 gj0Var2 = bf0Var2.F;
                gj0Var2.L(0, false, false);
                bf0Var2.f32867n.setAnimation(gj0Var2);
                return;
        }
    }
}
