package org.telegram.ui;
public final class va implements Runnable {
    public final int f42188a;
    public final sb f42189b;

    public va(sb sbVar, int i10) {
        this.f42188a = i10;
        this.f42189b = sbVar;
    }

    @Override
    public final void run() {
        switch (this.f42188a) {
            case 0:
                sb sbVar = this.f42189b;
                sbVar.H0 = Integer.MAX_VALUE;
                sbVar.I0 = -1;
                sbVar.e1();
                sbVar.J0 = null;
                return;
            case 1:
                sb sbVar2 = this.f42189b;
                sbVar2.X0(false);
                sbVar2.F.l();
                return;
            case 2:
                this.f42189b.W0();
                return;
            default:
                this.f42189b.U0(2);
                return;
        }
    }
}
