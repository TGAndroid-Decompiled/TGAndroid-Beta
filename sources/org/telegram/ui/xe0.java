package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class xe0 implements Runnable {
    public final int f39905a;
    public final ye0 f39906b;

    public xe0(ye0 ye0Var, int i10) {
        this.f39905a = i10;
        this.f39906b = ye0Var;
    }

    @Override
    public final void run() {
        switch (this.f39905a) {
            case 0:
                ye0 ye0Var = this.f39906b;
                ze0 ze0Var = ye0Var.d;
                if (ye0Var.f40506b) {
                    boolean z4 = ze0Var.H;
                    org.telegram.ui.Components.gj0 gj0Var = ze0Var.G;
                    kd kdVar = ze0Var.f40782n;
                    if (z4 && System.currentTimeMillis() - ye0Var.f40505a >= 10000) {
                        kdVar.setAnimation(gj0Var);
                        gj0Var.L(0, false, false);
                        gj0Var.f25168r0 = new xe0(ye0Var, 1);
                        kdVar.d();
                        ye0Var.f40505a = System.currentTimeMillis();
                    }
                    kdVar.postDelayed(ye0Var.f40507c, 1000L);
                    return;
                }
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new xe0(this.f39906b, 2));
                return;
            default:
                ze0 ze0Var2 = this.f39906b.d;
                org.telegram.ui.Components.gj0 gj0Var2 = ze0Var2.F;
                gj0Var2.L(0, false, false);
                ze0Var2.f40782n.setAnimation(gj0Var2);
                return;
        }
    }
}
