package org.telegram.ui;
public final class xa implements Runnable {
    public final int f39946a;
    public final ub f39947b;

    public xa(ub ubVar, int i10) {
        this.f39946a = i10;
        this.f39947b = ubVar;
    }

    @Override
    public final void run() {
        switch (this.f39946a) {
            case 0:
                ub ubVar = this.f39947b;
                ubVar.H0 = Integer.MAX_VALUE;
                ubVar.I0 = -1;
                ubVar.e1();
                ubVar.J0 = null;
                return;
            case 1:
                ub ubVar2 = this.f39947b;
                ubVar2.X0(false);
                ubVar2.F.l();
                return;
            case 2:
                this.f39947b.W0();
                return;
            default:
                this.f39947b.U0(2);
                return;
        }
    }
}
