package org.telegram.ui;
public final class rc implements Runnable {
    public final int f51564a;
    public final ad f51565b;

    public rc(ad adVar, int i7) {
        this.f51564a = i7;
        this.f51565b = adVar;
    }

    @Override
    public final void run() {
        switch (this.f51564a) {
            case 0:
                this.f51565b.m0(true);
                return;
            case 1:
                ad adVar = this.f51565b;
                adVar.f45554l0 = true;
                adVar.n0();
                return;
            case 2:
                ad adVar2 = this.f51565b;
                adVar2.E = null;
                adVar2.F = null;
                adVar2.f45556n0 = null;
                adVar2.f45557o0 = null;
                adVar2.f45559q0 = null;
                adVar2.f45558p0 = null;
                adVar2.f45561r0 = 0.0d;
                adVar2.k0(false, true);
                adVar2.f45547f.j(null, null, adVar2.f45567w, null);
                adVar2.f45555n.setAnimation(adVar2.L);
                adVar2.L.M(0);
                return;
            default:
                ad adVar3 = this.f51565b;
                adVar3.f45554l0 = true;
                if (adVar3.f45571y.length() > 0) {
                    adVar3.j0(adVar3.f45571y.getText().toString());
                }
                adVar3.n0();
                return;
        }
    }
}
