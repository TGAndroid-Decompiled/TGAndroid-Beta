package org.telegram.ui;
public final class sc implements Runnable {
    public final int f49714a;
    public final bd f49715b;

    public sc(bd bdVar, int i7) {
        this.f49714a = i7;
        this.f49715b = bdVar;
    }

    @Override
    public final void run() {
        switch (this.f49714a) {
            case 0:
                this.f49715b.m0(true);
                return;
            case 1:
                bd bdVar = this.f49715b;
                bdVar.f44250k0 = true;
                bdVar.n0();
                return;
            case 2:
                bd bdVar2 = this.f49715b;
                bdVar2.D = null;
                bdVar2.E = null;
                bdVar2.m0 = null;
                bdVar2.f44253n0 = null;
                bdVar2.f44255p0 = null;
                bdVar2.f44254o0 = null;
                bdVar2.f44256q0 = 0.0d;
                bdVar2.k0(false, true);
                bdVar2.f44244f.j(null, null, bdVar2.f44264w, null);
                bdVar2.f44252n.setAnimation(bdVar2.K);
                bdVar2.K.M(0);
                return;
            default:
                bd bdVar3 = this.f49715b;
                bdVar3.f44250k0 = true;
                if (bdVar3.f44268y.length() > 0) {
                    bdVar3.j0(bdVar3.f44268y.getText().toString());
                }
                bdVar3.n0();
                return;
        }
    }
}
