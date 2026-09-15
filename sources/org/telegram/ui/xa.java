package org.telegram.ui;
public final class xa implements Runnable {
    public final int f39560a;
    public final ub f39561b;

    public xa(ub ubVar, int i10) {
        this.f39560a = i10;
        this.f39561b = ubVar;
    }

    @Override
    public final void run() {
        switch (this.f39560a) {
            case 0:
                ub ubVar = this.f39561b;
                ubVar.G0 = Integer.MAX_VALUE;
                ubVar.H0 = -1;
                ubVar.d1();
                ubVar.I0 = null;
                return;
            case 1:
                ub ubVar2 = this.f39561b;
                ubVar2.W0(false);
                ubVar2.E.l();
                return;
            default:
                this.f39561b.V0();
                return;
        }
    }
}
