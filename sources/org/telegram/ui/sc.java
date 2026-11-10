package org.telegram.ui;
public final class sc implements Runnable {
    public final int f49817a;
    public final bd f49818b;

    public sc(bd bdVar, int i7) {
        this.f49817a = i7;
        this.f49818b = bdVar;
    }

    @Override
    public final void run() {
        switch (this.f49817a) {
            case 0:
                this.f49818b.m0(true);
                return;
            case 1:
                bd bdVar = this.f49818b;
                bdVar.f44023k0 = true;
                bdVar.n0();
                return;
            case 2:
                bd bdVar2 = this.f49818b;
                bdVar2.D = null;
                bdVar2.E = null;
                bdVar2.m0 = null;
                bdVar2.f44026n0 = null;
                bdVar2.f44028p0 = null;
                bdVar2.f44027o0 = null;
                bdVar2.f44029q0 = 0.0d;
                bdVar2.k0(false, true);
                bdVar2.f44017f.j(null, null, bdVar2.f44037w, null);
                bdVar2.f44025n.setAnimation(bdVar2.K);
                bdVar2.K.M(0);
                return;
            default:
                bd bdVar3 = this.f49818b;
                bdVar3.f44023k0 = true;
                if (bdVar3.f44041y.length() > 0) {
                    bdVar3.j0(bdVar3.f44041y.getText().toString());
                }
                bdVar3.n0();
                return;
        }
    }
}
