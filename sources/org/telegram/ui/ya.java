package org.telegram.ui;
public final class ya implements Runnable {
    public final int f44341a;
    public final vb f44342b;

    public ya(vb vbVar, int i10) {
        this.f44341a = i10;
        this.f44342b = vbVar;
    }

    @Override
    public final void run() {
        switch (this.f44341a) {
            case 0:
                vb vbVar = this.f44342b;
                vbVar.G0 = Integer.MAX_VALUE;
                vbVar.H0 = -1;
                vbVar.d1();
                vbVar.I0 = null;
                return;
            case 1:
                vb vbVar2 = this.f44342b;
                vbVar2.W0(false);
                vbVar2.E.l();
                return;
            default:
                this.f44342b.V0();
                return;
        }
    }
}
