package org.telegram.ui;
public final class ya implements Runnable {
    public final int f44297a;
    public final vb f44298b;

    public ya(vb vbVar, int i10) {
        this.f44297a = i10;
        this.f44298b = vbVar;
    }

    @Override
    public final void run() {
        switch (this.f44297a) {
            case 0:
                vb vbVar = this.f44298b;
                vbVar.G0 = Integer.MAX_VALUE;
                vbVar.H0 = -1;
                vbVar.d1();
                vbVar.I0 = null;
                return;
            case 1:
                vb vbVar2 = this.f44298b;
                vbVar2.W0(false);
                vbVar2.E.l();
                return;
            default:
                this.f44298b.V0();
                return;
        }
    }
}
