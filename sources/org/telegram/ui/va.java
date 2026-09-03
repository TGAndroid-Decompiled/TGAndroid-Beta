package org.telegram.ui;
public final class va implements Runnable {
    public final int f42074a;
    public final sb f42075b;

    public va(sb sbVar, int i10) {
        this.f42074a = i10;
        this.f42075b = sbVar;
    }

    @Override
    public final void run() {
        switch (this.f42074a) {
            case 0:
                sb sbVar = this.f42075b;
                sbVar.H0 = Integer.MAX_VALUE;
                sbVar.I0 = -1;
                sbVar.e1();
                sbVar.J0 = null;
                return;
            case 1:
                sb sbVar2 = this.f42075b;
                sbVar2.X0(false);
                sbVar2.F.l();
                return;
            case 2:
                this.f42075b.W0();
                return;
            default:
                this.f42075b.U0(2);
                return;
        }
    }
}
