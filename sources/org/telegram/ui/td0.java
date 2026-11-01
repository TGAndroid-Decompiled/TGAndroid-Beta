package org.telegram.ui;
public final class td0 implements Runnable {
    public final int f41622a;
    public final ud0 f41623b;

    public td0(ud0 ud0Var, int i10) {
        this.f41622a = i10;
        this.f41623b = ud0Var;
    }

    @Override
    public final void run() {
        switch (this.f41622a) {
            case 0:
                ud0 ud0Var = this.f41623b;
                vd0 vd0Var = ud0Var.d;
                if (ud0Var.f41915b) {
                    boolean z10 = vd0Var.K;
                    org.telegram.ui.Components.ci0 ci0Var = vd0Var.J;
                    hd hdVar = vd0Var.f42497n;
                    if (z10 && System.currentTimeMillis() - ud0Var.f41914a >= 10000) {
                        hdVar.setAnimation(ci0Var);
                        ci0Var.N(0, false, false);
                        ci0Var.f25155t0 = new td0(ud0Var, 1);
                        hdVar.d();
                        ud0Var.f41914a = System.currentTimeMillis();
                    }
                    hdVar.postDelayed(ud0Var.f41916c, 1000L);
                    return;
                }
                return;
            case 1:
                org.telegram.messenger.i0.g3(new td0(this.f41623b, 2));
                return;
            default:
                vd0 vd0Var2 = this.f41623b.d;
                org.telegram.ui.Components.ci0 ci0Var2 = vd0Var2.I;
                ci0Var2.N(0, false, false);
                vd0Var2.f42497n.setAnimation(ci0Var2);
                return;
        }
    }
}
