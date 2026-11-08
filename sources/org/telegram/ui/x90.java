package org.telegram.ui;
public final class x90 implements Runnable {
    public final int f51800a;
    public final pa0 f51801b;

    public x90(pa0 pa0Var, int i7) {
        this.f51800a = i7;
        this.f51801b = pa0Var;
    }

    @Override
    public final void run() {
        switch (this.f51800a) {
            case 0:
                pa0.c0(this.f51801b);
                return;
            case 1:
                pa0 pa0Var = this.f51801b;
                org.telegram.messenger.ua uaVar = pa0Var.F;
                if (uaVar != null) {
                    pa0Var.E.h(uaVar);
                    pa0Var.F = null;
                    return;
                }
                return;
            case 2:
                pa0.a0(this.f51801b);
                return;
            case 3:
                pa0 pa0Var2 = this.f51801b;
                pa0Var2.getLocationController().o(0, pa0Var2.f48739l0, true);
                pa0Var2.f48756y = false;
                return;
            case 4:
                pa0 pa0Var3 = this.f51801b;
                org.telegram.messenger.fa faVar = pa0Var3.E;
                if (faVar != null) {
                    faVar.o(org.telegram.messenger.g0.L(70.0f), 0, org.telegram.messenger.g0.L(70.0f), pa0Var3.t0());
                }
                if (!pa0Var3.N.getRadiusSet()) {
                    double d = pa0Var3.L;
                    if (d > 0.0d) {
                        pa0Var3.K.V0(d);
                    } else {
                        m4.d0 d0Var = pa0Var3.K;
                        if (d0Var != null) {
                            d0Var.R0();
                            pa0Var3.K = null;
                        }
                    }
                }
                pa0Var3.N = null;
                return;
            case 5:
                this.f51801b.D0();
                return;
            case 6:
                this.f51801b.D0();
                return;
            default:
                org.telegram.messenger.g0.h3(new x90(this.f51801b, 1));
                return;
        }
    }
}
