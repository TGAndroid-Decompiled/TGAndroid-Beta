package org.telegram.ui;
public final class ud0 implements Runnable {
    public final int f42119a;
    public final vd0 f42120b;

    public ud0(vd0 vd0Var, int i10) {
        this.f42119a = i10;
        this.f42120b = vd0Var;
    }

    @Override
    public final void run() {
        switch (this.f42119a) {
            case 0:
                vd0 vd0Var = this.f42120b;
                wd0 wd0Var = vd0Var.d;
                if (vd0Var.f42709b) {
                    boolean z10 = wd0Var.K;
                    org.telegram.ui.Components.bi0 bi0Var = wd0Var.J;
                    hd hdVar = wd0Var.f42946n;
                    if (z10 && System.currentTimeMillis() - vd0Var.f42708a >= 10000) {
                        hdVar.setAnimation(bi0Var);
                        bi0Var.N(0, false, false);
                        bi0Var.f24776t0 = new ud0(vd0Var, 1);
                        hdVar.d();
                        vd0Var.f42708a = System.currentTimeMillis();
                    }
                    hdVar.postDelayed(vd0Var.f42710c, 1000L);
                    return;
                }
                return;
            case 1:
                org.telegram.messenger.i0.g3(new ud0(this.f42120b, 2));
                return;
            default:
                wd0 wd0Var2 = this.f42120b.d;
                org.telegram.ui.Components.bi0 bi0Var2 = wd0Var2.I;
                bi0Var2.N(0, false, false);
                wd0Var2.f42946n.setAnimation(bi0Var2);
                return;
        }
    }
}
