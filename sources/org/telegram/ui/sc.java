package org.telegram.ui;
public final class sc implements Runnable {
    public final int f49734a;
    public final bd f49735b;

    public sc(bd bdVar, int i7) {
        this.f49734a = i7;
        this.f49735b = bdVar;
    }

    @Override
    public final void run() {
        switch (this.f49734a) {
            case 0:
                this.f49735b.m0(true);
                return;
            case 1:
                bd bdVar = this.f49735b;
                bdVar.f44265k0 = true;
                bdVar.n0();
                return;
            case 2:
                bd bdVar2 = this.f49735b;
                bdVar2.D = null;
                bdVar2.E = null;
                bdVar2.m0 = null;
                bdVar2.f44268n0 = null;
                bdVar2.f44270p0 = null;
                bdVar2.f44269o0 = null;
                bdVar2.f44271q0 = 0.0d;
                bdVar2.k0(false, true);
                bdVar2.f44259f.j(null, null, bdVar2.f44279w, null);
                bdVar2.f44267n.setAnimation(bdVar2.K);
                bdVar2.K.M(0);
                return;
            default:
                bd bdVar3 = this.f49735b;
                bdVar3.f44265k0 = true;
                if (bdVar3.f44283y.length() > 0) {
                    bdVar3.j0(bdVar3.f44283y.getText().toString());
                }
                bdVar3.n0();
                return;
        }
    }
}
