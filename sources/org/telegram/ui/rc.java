package org.telegram.ui;
public final class rc implements Runnable {
    public final int f51549a;
    public final ad f51550b;

    public rc(ad adVar, int i7) {
        this.f51549a = i7;
        this.f51550b = adVar;
    }

    @Override
    public final void run() {
        switch (this.f51549a) {
            case 0:
                this.f51550b.m0(true);
                return;
            case 1:
                ad adVar = this.f51550b;
                adVar.f45548l0 = true;
                adVar.n0();
                return;
            case 2:
                ad adVar2 = this.f51550b;
                adVar2.E = null;
                adVar2.F = null;
                adVar2.f45550n0 = null;
                adVar2.f45551o0 = null;
                adVar2.f45553q0 = null;
                adVar2.f45552p0 = null;
                adVar2.f45555r0 = 0.0d;
                adVar2.k0(false, true);
                adVar2.f45541f.j(null, null, adVar2.f45561w, null);
                adVar2.f45549n.setAnimation(adVar2.L);
                adVar2.L.M(0);
                return;
            default:
                ad adVar3 = this.f51550b;
                adVar3.f45548l0 = true;
                if (adVar3.f45565y.length() > 0) {
                    adVar3.j0(adVar3.f45565y.getText().toString());
                }
                adVar3.n0();
                return;
        }
    }
}
