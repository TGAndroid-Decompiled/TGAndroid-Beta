package org.telegram.ui;
public final class z90 implements Runnable {
    public final int f52476a;
    public final ra0 f52477b;

    public z90(ra0 ra0Var, int i7) {
        this.f52476a = i7;
        this.f52477b = ra0Var;
    }

    @Override
    public final void run() {
        switch (this.f52476a) {
            case 0:
                ra0.c0(this.f52477b);
                return;
            case 1:
                ra0 ra0Var = this.f52477b;
                org.telegram.messenger.ua uaVar = ra0Var.F;
                if (uaVar != null) {
                    ra0Var.E.h(uaVar);
                    ra0Var.F = null;
                    return;
                }
                return;
            case 2:
                ra0.a0(this.f52477b);
                return;
            case 3:
                ra0 ra0Var2 = this.f52477b;
                ra0Var2.getLocationController().o(0, ra0Var2.f49374l0, true);
                ra0Var2.f49391y = false;
                return;
            case 4:
                ra0 ra0Var3 = this.f52477b;
                org.telegram.messenger.fa faVar = ra0Var3.E;
                if (faVar != null) {
                    faVar.o(org.telegram.messenger.g0.L(70.0f), 0, org.telegram.messenger.g0.L(70.0f), ra0Var3.t0());
                }
                if (!ra0Var3.N.getRadiusSet()) {
                    double d = ra0Var3.L;
                    if (d > 0.0d) {
                        ra0Var3.K.V0(d);
                    } else {
                        m4.d0 d0Var = ra0Var3.K;
                        if (d0Var != null) {
                            d0Var.R0();
                            ra0Var3.K = null;
                        }
                    }
                }
                ra0Var3.N = null;
                return;
            case 5:
                this.f52477b.D0();
                return;
            case 6:
                this.f52477b.D0();
                return;
            default:
                org.telegram.messenger.g0.h3(new z90(this.f52477b, 1));
                return;
        }
    }
}
