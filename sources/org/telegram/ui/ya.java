package org.telegram.ui;
public final class ya implements Runnable {
    public final int f39764a;
    public final vb f39765b;

    public ya(vb vbVar, int i10) {
        this.f39764a = i10;
        this.f39765b = vbVar;
    }

    @Override
    public final void run() {
        switch (this.f39764a) {
            case 0:
                vb vbVar = this.f39765b;
                vbVar.G0 = Integer.MAX_VALUE;
                vbVar.H0 = -1;
                vbVar.d1();
                vbVar.I0 = null;
                return;
            case 1:
                vb vbVar2 = this.f39765b;
                vbVar2.W0(false);
                vbVar2.E.l();
                return;
            default:
                this.f39765b.V0();
                return;
        }
    }
}
