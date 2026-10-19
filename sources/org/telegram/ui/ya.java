package org.telegram.ui;
public final class ya implements Runnable {
    public final int f43422a;
    public final vb f43423b;

    public ya(vb vbVar, int i10) {
        this.f43422a = i10;
        this.f43423b = vbVar;
    }

    @Override
    public final void run() {
        switch (this.f43422a) {
            case 0:
                vb vbVar = this.f43423b;
                vbVar.G0 = Integer.MAX_VALUE;
                vbVar.H0 = -1;
                vbVar.d1();
                vbVar.I0 = null;
                return;
            case 1:
                vb vbVar2 = this.f43423b;
                vbVar2.W0(false);
                vbVar2.E.l();
                return;
            default:
                this.f43423b.V0();
                return;
        }
    }
}
