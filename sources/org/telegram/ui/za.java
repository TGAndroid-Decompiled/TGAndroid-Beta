package org.telegram.ui;
public final class za implements Runnable {
    public final int f40197a;
    public final wb f40198b;

    public za(wb wbVar, int i10) {
        this.f40197a = i10;
        this.f40198b = wbVar;
    }

    @Override
    public final void run() {
        switch (this.f40197a) {
            case 0:
                wb wbVar = this.f40198b;
                wbVar.G0 = Integer.MAX_VALUE;
                wbVar.H0 = -1;
                wbVar.d1();
                wbVar.I0 = null;
                return;
            case 1:
                wb wbVar2 = this.f40198b;
                wbVar2.W0(false);
                wbVar2.E.l();
                return;
            default:
                this.f40198b.V0();
                return;
        }
    }
}
