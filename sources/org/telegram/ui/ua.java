package org.telegram.ui;
public final class ua implements Runnable {
    public final int f42097a;
    public final sb f42098b;

    public ua(sb sbVar, int i10) {
        this.f42097a = i10;
        this.f42098b = sbVar;
    }

    @Override
    public final void run() {
        switch (this.f42097a) {
            case 0:
                sb sbVar = this.f42098b;
                sbVar.G0 = Integer.MAX_VALUE;
                sbVar.H0 = -1;
                sbVar.h1();
                sbVar.I0 = null;
                return;
            case 1:
                sb sbVar2 = this.f42098b;
                sbVar2.a1(false);
                sbVar2.E.f();
                return;
            default:
                this.f42098b.Z0();
                return;
        }
    }
}
