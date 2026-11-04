package org.telegram.ui;
public final class u90 implements Runnable {
    public final int f50019a;
    public final la0 f50020b;

    public u90(la0 la0Var, int i3) {
        this.f50019a = i3;
        this.f50020b = la0Var;
    }

    @Override
    public final void run() {
        switch (this.f50019a) {
            case 0:
                la0.c0(this.f50020b);
                return;
            case 1:
                la0 la0Var = this.f50020b;
                org.telegram.messenger.na naVar = la0Var.G;
                if (naVar != null) {
                    la0Var.F.h(naVar);
                    la0Var.G = null;
                    return;
                }
                return;
            case 2:
                la0.a0(this.f50020b);
                return;
            case 3:
                la0 la0Var2 = this.f50020b;
                la0Var2.getLocationController().o(0, la0Var2.m0, true);
                la0Var2.f47272y = false;
                return;
            case 4:
                la0 la0Var3 = this.f50020b;
                org.telegram.messenger.z9 z9Var = la0Var3.F;
                if (z9Var != null) {
                    z9Var.o(org.telegram.messenger.g0.L(70.0f), 0, org.telegram.messenger.g0.L(70.0f), la0Var3.t0());
                }
                if (!la0Var3.O.getRadiusSet()) {
                    double d = la0Var3.M;
                    if (d > 0.0d) {
                        la0Var3.L.e1(d);
                    } else {
                        m2.t tVar = la0Var3.L;
                        if (tVar != null) {
                            tVar.U0();
                            la0Var3.L = null;
                        }
                    }
                }
                la0Var3.O = null;
                return;
            case 5:
                this.f50020b.D0();
                return;
            case 6:
                this.f50020b.D0();
                return;
            default:
                org.telegram.messenger.g0.h3(new u90(this.f50020b, 1));
                return;
        }
    }
}
