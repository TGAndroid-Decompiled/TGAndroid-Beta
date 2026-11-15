package org.telegram.ui;
public final class rc implements Runnable {
    public final int f50905a;
    public final ad f50906b;

    public rc(ad adVar, int i7) {
        this.f50905a = i7;
        this.f50906b = adVar;
    }

    @Override
    public final void run() {
        switch (this.f50905a) {
            case 0:
                this.f50906b.m0(true);
                return;
            case 1:
                ad adVar = this.f50906b;
                adVar.f45011l0 = true;
                adVar.n0();
                return;
            case 2:
                ad adVar2 = this.f50906b;
                adVar2.E = null;
                adVar2.F = null;
                adVar2.f45013n0 = null;
                adVar2.f45014o0 = null;
                adVar2.f45016q0 = null;
                adVar2.f45015p0 = null;
                adVar2.f45018r0 = 0.0d;
                adVar2.k0(false, true);
                adVar2.f45004f.j(null, null, adVar2.f45024w, null);
                adVar2.f45012n.setAnimation(adVar2.L);
                adVar2.L.M(0);
                return;
            default:
                ad adVar3 = this.f50906b;
                adVar3.f45011l0 = true;
                if (adVar3.f45028y.length() > 0) {
                    adVar3.j0(adVar3.f45028y.getText().toString());
                }
                adVar3.n0();
                return;
        }
    }
}
