package org.telegram.ui;

import android.view.View;
public final class tc implements View.OnClickListener {
    public final int f51546a;
    public final ad f51547b;

    public tc(ad adVar, int i7) {
        this.f51546a = i7;
        this.f51547b = adVar;
    }

    @Override
    public final void onClick(View view) {
        boolean z10;
        switch (this.f51546a) {
            case 0:
                ad.c0(this.f51547b, view);
                return;
            case 1:
                ad adVar = this.f51547b;
                org.telegram.ui.Components.m30 m30Var = adVar.f45026x;
                if (adVar.E != null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                m30Var.n(z10, new rc(adVar, 2), new q5(adVar, 2), 0);
                adVar.L.M(0);
                adVar.L.P(43);
                adVar.f45012n.d();
                return;
            case 2:
                ad adVar2 = this.f51547b;
                if (!adVar2.f45011l0) {
                    adVar2.l0();
                    return;
                } else if (adVar2.f45000c0) {
                    adVar2.f45000c0 = false;
                    adVar2.n0();
                    return;
                } else {
                    return;
                }
            default:
                ad adVar3 = this.f51547b;
                if (!adVar3.f45000c0) {
                    adVar3.f45000c0 = true;
                    adVar3.n0();
                    return;
                }
                return;
        }
    }
}
