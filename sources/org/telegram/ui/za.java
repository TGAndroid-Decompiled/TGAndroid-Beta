package org.telegram.ui;
public final class za implements Runnable {
    public final int f43731a;
    public final wb f43732b;

    public za(wb wbVar, int i10) {
        this.f43731a = i10;
        this.f43732b = wbVar;
    }

    @Override
    public final void run() {
        switch (this.f43731a) {
            case 0:
                wb wbVar = this.f43732b;
                wbVar.G0 = Integer.MAX_VALUE;
                wbVar.H0 = -1;
                wbVar.d1();
                wbVar.I0 = null;
                return;
            case 1:
                wb wbVar2 = this.f43732b;
                wbVar2.W0(false);
                wbVar2.E.l();
                return;
            default:
                this.f43732b.V0();
                return;
        }
    }
}
