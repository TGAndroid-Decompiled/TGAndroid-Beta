package org.telegram.ui;
public final class sc implements Runnable {
    public final int f49861a;
    public final bd f49862b;

    public sc(bd bdVar, int i7) {
        this.f49861a = i7;
        this.f49862b = bdVar;
    }

    @Override
    public final void run() {
        switch (this.f49861a) {
            case 0:
                this.f49862b.m0(true);
                return;
            case 1:
                bd bdVar = this.f49862b;
                bdVar.f43994k0 = true;
                bdVar.n0();
                return;
            case 2:
                bd bdVar2 = this.f49862b;
                bdVar2.D = null;
                bdVar2.E = null;
                bdVar2.m0 = null;
                bdVar2.f43997n0 = null;
                bdVar2.f43999p0 = null;
                bdVar2.f43998o0 = null;
                bdVar2.f44000q0 = 0.0d;
                bdVar2.k0(false, true);
                bdVar2.f43988f.j(null, null, bdVar2.f44008w, null);
                bdVar2.f43996n.setAnimation(bdVar2.K);
                bdVar2.K.M(0);
                return;
            default:
                bd bdVar3 = this.f49862b;
                bdVar3.f43994k0 = true;
                if (bdVar3.f44012y.length() > 0) {
                    bdVar3.j0(bdVar3.f44012y.getText().toString());
                }
                bdVar3.n0();
                return;
        }
    }
}
