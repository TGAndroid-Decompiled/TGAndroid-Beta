package org.telegram.ui;
public final class sc implements Runnable {
    public final int f49718a;
    public final bd f49719b;

    public sc(bd bdVar, int i7) {
        this.f49718a = i7;
        this.f49719b = bdVar;
    }

    @Override
    public final void run() {
        switch (this.f49718a) {
            case 0:
                this.f49719b.m0(true);
                return;
            case 1:
                bd bdVar = this.f49719b;
                bdVar.f44268k0 = true;
                bdVar.n0();
                return;
            case 2:
                bd bdVar2 = this.f49719b;
                bdVar2.D = null;
                bdVar2.E = null;
                bdVar2.m0 = null;
                bdVar2.f44271n0 = null;
                bdVar2.f44273p0 = null;
                bdVar2.f44272o0 = null;
                bdVar2.f44274q0 = 0.0d;
                bdVar2.k0(false, true);
                bdVar2.f44262f.j(null, null, bdVar2.f44282w, null);
                bdVar2.f44270n.setAnimation(bdVar2.K);
                bdVar2.K.M(0);
                return;
            default:
                bd bdVar3 = this.f49719b;
                bdVar3.f44268k0 = true;
                if (bdVar3.f44286y.length() > 0) {
                    bdVar3.j0(bdVar3.f44286y.getText().toString());
                }
                bdVar3.n0();
                return;
        }
    }
}
