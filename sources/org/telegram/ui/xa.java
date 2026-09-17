package org.telegram.ui;
public final class xa implements Runnable {
    public final int f42653a;
    public final ub f42654b;

    public xa(ub ubVar, int i10) {
        this.f42653a = i10;
        this.f42654b = ubVar;
    }

    @Override
    public final void run() {
        switch (this.f42653a) {
            case 0:
                ub ubVar = this.f42654b;
                ubVar.K0 = Integer.MAX_VALUE;
                ubVar.L0 = -1;
                ubVar.e1();
                ubVar.M0 = null;
                return;
            case 1:
                ub ubVar2 = this.f42654b;
                ubVar2.X0(false);
                ubVar2.I.l();
                return;
            case 2:
                this.f42654b.W0();
                return;
            default:
                this.f42654b.U0(2);
                return;
        }
    }
}
