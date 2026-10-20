package org.telegram.ui;
public final class ya implements Runnable {
    public final int f43432a;
    public final vb f43433b;

    public ya(vb vbVar, int i10) {
        this.f43432a = i10;
        this.f43433b = vbVar;
    }

    @Override
    public final void run() {
        switch (this.f43432a) {
            case 0:
                vb vbVar = this.f43433b;
                vbVar.G0 = Integer.MAX_VALUE;
                vbVar.H0 = -1;
                vbVar.d1();
                vbVar.I0 = null;
                return;
            case 1:
                vb vbVar2 = this.f43433b;
                vbVar2.W0(false);
                vbVar2.E.l();
                return;
            default:
                this.f43433b.V0();
                return;
        }
    }
}
