package org.telegram.ui;
public final class za implements Runnable {
    public final int f40451a;
    public final wb f40452b;

    public za(wb wbVar, int i10) {
        this.f40451a = i10;
        this.f40452b = wbVar;
    }

    @Override
    public final void run() {
        switch (this.f40451a) {
            case 0:
                wb wbVar = this.f40452b;
                wbVar.G0 = Integer.MAX_VALUE;
                wbVar.H0 = -1;
                wbVar.d1();
                wbVar.I0 = null;
                return;
            case 1:
                wb wbVar2 = this.f40452b;
                wbVar2.W0(false);
                wbVar2.E.l();
                return;
            default:
                this.f40452b.V0();
                return;
        }
    }
}
