package org.telegram.ui;
public final class xa implements Runnable {
    public final int f44057a;
    public final ub f44058b;

    public xa(ub ubVar, int i10) {
        this.f44057a = i10;
        this.f44058b = ubVar;
    }

    @Override
    public final void run() {
        switch (this.f44057a) {
            case 0:
                ub ubVar = this.f44058b;
                ubVar.G0 = Integer.MAX_VALUE;
                ubVar.H0 = -1;
                ubVar.d1();
                ubVar.I0 = null;
                return;
            case 1:
                ub ubVar2 = this.f44058b;
                ubVar2.W0(false);
                ubVar2.E.l();
                return;
            default:
                this.f44058b.V0();
                return;
        }
    }
}
