package org.telegram.ui;
public final class y90 implements Runnable {
    public final int f53477a;
    public final pa0 f53478b;

    public y90(pa0 pa0Var, int i7) {
        this.f53477a = i7;
        this.f53478b = pa0Var;
    }

    @Override
    public final void run() {
        switch (this.f53477a) {
            case 0:
                pa0.c0(this.f53478b);
                return;
            case 1:
                pa0 pa0Var = this.f53478b;
                org.telegram.messenger.ta taVar = pa0Var.G;
                if (taVar != null) {
                    pa0Var.F.h(taVar);
                    pa0Var.G = null;
                    return;
                }
                return;
            case 2:
                pa0.a0(this.f53478b);
                return;
            case 3:
                pa0 pa0Var2 = this.f53478b;
                pa0Var2.getLocationController().o(0, pa0Var2.m0, true);
                pa0Var2.f50225y = false;
                return;
            case 4:
                pa0 pa0Var3 = this.f53478b;
                org.telegram.messenger.ea eaVar = pa0Var3.F;
                if (eaVar != null) {
                    eaVar.o(org.telegram.messenger.g0.L(70.0f), 0, org.telegram.messenger.g0.L(70.0f), pa0Var3.t0());
                }
                if (!pa0Var3.O.getRadiusSet()) {
                    double d = pa0Var3.M;
                    if (d > 0.0d) {
                        pa0Var3.L.g1(d);
                    } else {
                        k8.a aVar = pa0Var3.L;
                        if (aVar != null) {
                            aVar.c1();
                            pa0Var3.L = null;
                        }
                    }
                }
                pa0Var3.O = null;
                return;
            case 5:
                this.f53478b.D0();
                return;
            case 6:
                this.f53478b.D0();
                return;
            default:
                org.telegram.messenger.g0.h3(new y90(this.f53478b, 1));
                return;
        }
    }
}
