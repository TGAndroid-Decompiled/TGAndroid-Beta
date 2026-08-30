package org.telegram.ui;
public final class va implements Runnable {
    public final int f39128a;
    public final sb f39129b;

    public va(sb sbVar, int i10) {
        this.f39128a = i10;
        this.f39129b = sbVar;
    }

    @Override
    public final void run() {
        switch (this.f39128a) {
            case 0:
                sb sbVar = this.f39129b;
                sbVar.H0 = Integer.MAX_VALUE;
                sbVar.I0 = -1;
                sbVar.e1();
                sbVar.J0 = null;
                return;
            case 1:
                sb sbVar2 = this.f39129b;
                sbVar2.X0(false);
                sbVar2.F.l();
                return;
            case 2:
                this.f39129b.W0();
                return;
            default:
                this.f39129b.U0(2);
                return;
        }
    }
}
