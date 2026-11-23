package org.telegram.ui;
public final class rc implements Runnable {
    public final int f51689a;
    public final ad f51690b;

    public rc(ad adVar, int i7) {
        this.f51689a = i7;
        this.f51690b = adVar;
    }

    @Override
    public final void run() {
        switch (this.f51689a) {
            case 0:
                this.f51690b.m0(true);
                return;
            case 1:
                ad adVar = this.f51690b;
                adVar.f45674l0 = true;
                adVar.n0();
                return;
            case 2:
                ad adVar2 = this.f51690b;
                adVar2.E = null;
                adVar2.F = null;
                adVar2.f45676n0 = null;
                adVar2.f45677o0 = null;
                adVar2.f45679q0 = null;
                adVar2.f45678p0 = null;
                adVar2.f45681r0 = 0.0d;
                adVar2.k0(false, true);
                adVar2.f45667f.j(null, null, adVar2.f45687w, null);
                adVar2.f45675n.setAnimation(adVar2.L);
                adVar2.L.M(0);
                return;
            default:
                ad adVar3 = this.f51690b;
                adVar3.f45674l0 = true;
                if (adVar3.f45691y.length() > 0) {
                    adVar3.j0(adVar3.f45691y.getText().toString());
                }
                adVar3.n0();
                return;
        }
    }
}
