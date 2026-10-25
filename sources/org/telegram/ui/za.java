package org.telegram.ui;
public final class za implements Runnable {
    public final int f46236a;
    public final wb f46237b;

    public za(wb wbVar, int i10) {
        this.f46236a = i10;
        this.f46237b = wbVar;
    }

    @Override
    public final void run() {
        switch (this.f46236a) {
            case 0:
                wb wbVar = this.f46237b;
                wbVar.G0 = Integer.MAX_VALUE;
                wbVar.H0 = -1;
                wbVar.e1();
                wbVar.I0 = null;
                return;
            case 1:
                wb wbVar2 = this.f46237b;
                wbVar2.X0(false);
                wbVar2.E.l();
                return;
            default:
                this.f46237b.W0();
                return;
        }
    }
}
