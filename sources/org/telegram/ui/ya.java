package org.telegram.ui;
public final class ya implements Runnable {
    public final int f44295a;
    public final vb f44296b;

    public ya(vb vbVar, int i10) {
        this.f44295a = i10;
        this.f44296b = vbVar;
    }

    @Override
    public final void run() {
        switch (this.f44295a) {
            case 0:
                vb vbVar = this.f44296b;
                vbVar.G0 = Integer.MAX_VALUE;
                vbVar.H0 = -1;
                vbVar.d1();
                vbVar.I0 = null;
                return;
            case 1:
                vb vbVar2 = this.f44296b;
                vbVar2.W0(false);
                vbVar2.E.l();
                return;
            default:
                this.f44296b.V0();
                return;
        }
    }
}
