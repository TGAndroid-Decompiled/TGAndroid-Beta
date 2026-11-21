package org.telegram.ui;
public final class rc implements Runnable {
    public final int f51538a;
    public final ad f51539b;

    public rc(ad adVar, int i7) {
        this.f51538a = i7;
        this.f51539b = adVar;
    }

    @Override
    public final void run() {
        switch (this.f51538a) {
            case 0:
                this.f51539b.m0(true);
                return;
            case 1:
                ad adVar = this.f51539b;
                adVar.f45587l0 = true;
                adVar.n0();
                return;
            case 2:
                ad adVar2 = this.f51539b;
                adVar2.E = null;
                adVar2.F = null;
                adVar2.f45589n0 = null;
                adVar2.f45590o0 = null;
                adVar2.f45592q0 = null;
                adVar2.f45591p0 = null;
                adVar2.f45594r0 = 0.0d;
                adVar2.k0(false, true);
                adVar2.f45580f.j(null, null, adVar2.f45600w, null);
                adVar2.f45588n.setAnimation(adVar2.L);
                adVar2.L.M(0);
                return;
            default:
                ad adVar3 = this.f51539b;
                adVar3.f45587l0 = true;
                if (adVar3.f45604y.length() > 0) {
                    adVar3.j0(adVar3.f45604y.getText().toString());
                }
                adVar3.n0();
                return;
        }
    }
}
