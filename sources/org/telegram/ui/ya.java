package org.telegram.ui;
public final class ya implements Runnable {
    public final int f43435a;
    public final vb f43436b;

    public ya(vb vbVar, int i10) {
        this.f43435a = i10;
        this.f43436b = vbVar;
    }

    @Override
    public final void run() {
        switch (this.f43435a) {
            case 0:
                vb vbVar = this.f43436b;
                vbVar.G0 = Integer.MAX_VALUE;
                vbVar.H0 = -1;
                vbVar.d1();
                vbVar.I0 = null;
                return;
            case 1:
                vb vbVar2 = this.f43436b;
                vbVar2.W0(false);
                vbVar2.E.l();
                return;
            default:
                this.f43436b.V0();
                return;
        }
    }
}
