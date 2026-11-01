package org.telegram.ui;
public final class ua implements Runnable {
    public final int f41897a;
    public final sb f41898b;

    public ua(sb sbVar, int i10) {
        this.f41897a = i10;
        this.f41898b = sbVar;
    }

    @Override
    public final void run() {
        switch (this.f41897a) {
            case 0:
                sb sbVar = this.f41898b;
                sbVar.G0 = Integer.MAX_VALUE;
                sbVar.H0 = -1;
                sbVar.i1();
                sbVar.I0 = null;
                return;
            case 1:
                sb sbVar2 = this.f41898b;
                sbVar2.b1(false);
                sbVar2.E.f();
                return;
            default:
                this.f41898b.a1();
                return;
        }
    }
}
