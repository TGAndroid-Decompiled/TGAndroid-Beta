package org.telegram.ui;
public final class ya implements Runnable {
    public final int f39890a;
    public final vb f39891b;

    public ya(vb vbVar, int i10) {
        this.f39890a = i10;
        this.f39891b = vbVar;
    }

    @Override
    public final void run() {
        switch (this.f39890a) {
            case 0:
                vb vbVar = this.f39891b;
                vbVar.G0 = Integer.MAX_VALUE;
                vbVar.H0 = -1;
                vbVar.d1();
                vbVar.I0 = null;
                return;
            case 1:
                vb vbVar2 = this.f39891b;
                vbVar2.W0(false);
                vbVar2.E.l();
                return;
            default:
                this.f39891b.V0();
                return;
        }
    }
}
