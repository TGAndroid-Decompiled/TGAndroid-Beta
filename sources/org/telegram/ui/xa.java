package org.telegram.ui;
public final class xa implements Runnable {
    public final int f39877a;
    public final ub f39878b;

    public xa(ub ubVar, int i10) {
        this.f39877a = i10;
        this.f39878b = ubVar;
    }

    @Override
    public final void run() {
        switch (this.f39877a) {
            case 0:
                ub ubVar = this.f39878b;
                ubVar.G0 = Integer.MAX_VALUE;
                ubVar.H0 = -1;
                ubVar.d1();
                ubVar.I0 = null;
                return;
            case 1:
                ub ubVar2 = this.f39878b;
                ubVar2.W0(false);
                ubVar2.E.l();
                return;
            default:
                this.f39878b.V0();
                return;
        }
    }
}
