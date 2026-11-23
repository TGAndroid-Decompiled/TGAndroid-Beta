package org.telegram.ui;
public final class rc implements Runnable {
    public final int f51573a;
    public final ad f51574b;

    public rc(ad adVar, int i7) {
        this.f51573a = i7;
        this.f51574b = adVar;
    }

    @Override
    public final void run() {
        switch (this.f51573a) {
            case 0:
                this.f51574b.m0(true);
                return;
            case 1:
                ad adVar = this.f51574b;
                adVar.f45558l0 = true;
                adVar.n0();
                return;
            case 2:
                ad adVar2 = this.f51574b;
                adVar2.E = null;
                adVar2.F = null;
                adVar2.f45560n0 = null;
                adVar2.f45561o0 = null;
                adVar2.f45563q0 = null;
                adVar2.f45562p0 = null;
                adVar2.f45565r0 = 0.0d;
                adVar2.k0(false, true);
                adVar2.f45551f.j(null, null, adVar2.f45571w, null);
                adVar2.f45559n.setAnimation(adVar2.L);
                adVar2.L.M(0);
                return;
            default:
                ad adVar3 = this.f51574b;
                adVar3.f45558l0 = true;
                if (adVar3.f45575y.length() > 0) {
                    adVar3.j0(adVar3.f45575y.getText().toString());
                }
                adVar3.n0();
                return;
        }
    }
}
