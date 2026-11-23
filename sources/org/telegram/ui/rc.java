package org.telegram.ui;
public final class rc implements Runnable {
    public final int f51542a;
    public final ad f51543b;

    public rc(ad adVar, int i7) {
        this.f51542a = i7;
        this.f51543b = adVar;
    }

    @Override
    public final void run() {
        switch (this.f51542a) {
            case 0:
                this.f51543b.m0(true);
                return;
            case 1:
                ad adVar = this.f51543b;
                adVar.f45591l0 = true;
                adVar.n0();
                return;
            case 2:
                ad adVar2 = this.f51543b;
                adVar2.E = null;
                adVar2.F = null;
                adVar2.f45593n0 = null;
                adVar2.f45594o0 = null;
                adVar2.f45596q0 = null;
                adVar2.f45595p0 = null;
                adVar2.f45598r0 = 0.0d;
                adVar2.k0(false, true);
                adVar2.f45584f.j(null, null, adVar2.f45604w, null);
                adVar2.f45592n.setAnimation(adVar2.L);
                adVar2.L.M(0);
                return;
            default:
                ad adVar3 = this.f51543b;
                adVar3.f45591l0 = true;
                if (adVar3.f45608y.length() > 0) {
                    adVar3.j0(adVar3.f45608y.getText().toString());
                }
                adVar3.n0();
                return;
        }
    }
}
