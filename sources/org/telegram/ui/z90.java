package org.telegram.ui;
public final class z90 implements Runnable {
    public final int f54554a;
    public final pa0 f54555b;

    public z90(pa0 pa0Var, int i7) {
        this.f54554a = i7;
        this.f54555b = pa0Var;
    }

    @Override
    public final void run() {
        switch (this.f54554a) {
            case 0:
                pa0.b0(this.f54555b);
                return;
            case 1:
                pa0 pa0Var = this.f54555b;
                org.telegram.messenger.sa saVar = pa0Var.G;
                if (saVar != null) {
                    pa0Var.F.h(saVar);
                    pa0Var.G = null;
                    return;
                }
                return;
            case 2:
                pa0.a0(this.f54555b);
                return;
            case 3:
                pa0 pa0Var2 = this.f54555b;
                pa0Var2.getLocationController().o(0, pa0Var2.m0, true);
                pa0Var2.f50951y = false;
                return;
            case 4:
                pa0 pa0Var3 = this.f54555b;
                org.telegram.messenger.da daVar = pa0Var3.F;
                if (daVar != null) {
                    daVar.n(org.telegram.messenger.g0.L(70.0f), 0, org.telegram.messenger.g0.L(70.0f), pa0Var3.t0());
                }
                if (!pa0Var3.O.getRadiusSet()) {
                    double d = pa0Var3.M;
                    if (d > 0.0d) {
                        pa0Var3.L.Z0(d);
                    } else {
                        jb.m mVar = pa0Var3.L;
                        if (mVar != null) {
                            mVar.V0();
                            pa0Var3.L = null;
                        }
                    }
                }
                pa0Var3.O = null;
                return;
            case 5:
                this.f54555b.D0();
                return;
            case 6:
                this.f54555b.D0();
                return;
            default:
                org.telegram.messenger.g0.g3(new z90(this.f54555b, 1));
                return;
        }
    }
}
