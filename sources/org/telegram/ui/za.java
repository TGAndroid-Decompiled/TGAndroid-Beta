package org.telegram.ui;
public final class za implements Runnable {
    public final int f43739a;
    public final wb f43740b;

    public za(wb wbVar, int i10) {
        this.f43739a = i10;
        this.f43740b = wbVar;
    }

    @Override
    public final void run() {
        switch (this.f43739a) {
            case 0:
                wb wbVar = this.f43740b;
                wbVar.G0 = Integer.MAX_VALUE;
                wbVar.H0 = -1;
                wbVar.d1();
                wbVar.I0 = null;
                return;
            case 1:
                wb wbVar2 = this.f43740b;
                wbVar2.W0(false);
                wbVar2.E.l();
                return;
            default:
                this.f43740b.V0();
                return;
        }
    }
}
