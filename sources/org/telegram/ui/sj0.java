package org.telegram.ui;
public final class sj0 implements Runnable {
    public final int f43349a;
    public final zj0 f43350b;

    public sj0(zj0 zj0Var, int i10) {
        this.f43349a = i10;
        this.f43350b = zj0Var;
    }

    @Override
    public final void run() {
        rh.e eVar;
        zj0 zj0Var;
        int i10;
        switch (this.f43349a) {
            case 0:
                LaunchActivity launchActivity = LaunchActivity.I1;
                if (launchActivity != null) {
                    eVar = launchActivity.f35562h1;
                } else {
                    eVar = null;
                }
                if ((eVar == null || eVar.f47651c <= 0) && zj0Var.J != (i10 = (zj0Var = this.f43350b).K)) {
                    zj0Var.J = i10;
                    zj0Var.p0(false);
                    return;
                }
                return;
            case 1:
                this.f43350b.f46296y.setVisibility(8);
                return;
            default:
                zj0 zj0Var2 = this.f43350b;
                zj0Var2.O = null;
                zj0Var2.l0(2, true);
                return;
        }
    }
}
