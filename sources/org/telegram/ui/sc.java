package org.telegram.ui;
public final class sc implements Runnable {
    public final int f49735a;
    public final bd f49736b;

    public sc(bd bdVar, int i7) {
        this.f49735a = i7;
        this.f49736b = bdVar;
    }

    @Override
    public final void run() {
        switch (this.f49735a) {
            case 0:
                this.f49736b.m0(true);
                return;
            case 1:
                bd bdVar = this.f49736b;
                bdVar.f44266k0 = true;
                bdVar.n0();
                return;
            case 2:
                bd bdVar2 = this.f49736b;
                bdVar2.D = null;
                bdVar2.E = null;
                bdVar2.m0 = null;
                bdVar2.f44269n0 = null;
                bdVar2.f44271p0 = null;
                bdVar2.f44270o0 = null;
                bdVar2.f44272q0 = 0.0d;
                bdVar2.k0(false, true);
                bdVar2.f44260f.j(null, null, bdVar2.f44280w, null);
                bdVar2.f44268n.setAnimation(bdVar2.K);
                bdVar2.K.M(0);
                return;
            default:
                bd bdVar3 = this.f49736b;
                bdVar3.f44266k0 = true;
                if (bdVar3.f44284y.length() > 0) {
                    bdVar3.j0(bdVar3.f44284y.getText().toString());
                }
                bdVar3.n0();
                return;
        }
    }
}
