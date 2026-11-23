package org.telegram.ui;

import android.view.View;
public final class tc implements View.OnClickListener {
    public final int f52246a;
    public final ad f52247b;

    public tc(ad adVar, int i7) {
        this.f52246a = i7;
        this.f52247b = adVar;
    }

    @Override
    public final void onClick(View view) {
        boolean z10;
        switch (this.f52246a) {
            case 0:
                ad.c0(this.f52247b, view);
                return;
            case 1:
                ad adVar = this.f52247b;
                org.telegram.ui.Components.x30 x30Var = adVar.f45573x;
                if (adVar.E != null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                x30Var.n(z10, new rc(adVar, 2), new q5(adVar, 2), 0);
                adVar.L.M(0);
                adVar.L.P(43);
                adVar.f45559n.d();
                return;
            case 2:
                ad adVar2 = this.f52247b;
                if (!adVar2.f45558l0) {
                    adVar2.l0();
                    return;
                } else if (adVar2.f45547c0) {
                    adVar2.f45547c0 = false;
                    adVar2.n0();
                    return;
                } else {
                    return;
                }
            default:
                ad adVar3 = this.f52247b;
                if (!adVar3.f45547c0) {
                    adVar3.f45547c0 = true;
                    adVar3.n0();
                    return;
                }
                return;
        }
    }
}
