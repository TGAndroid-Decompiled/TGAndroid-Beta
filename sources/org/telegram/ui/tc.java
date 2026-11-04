package org.telegram.ui;

import android.view.View;
public final class tc implements View.OnClickListener {
    public final int f49769a;
    public final ad f49770b;

    public tc(ad adVar, int i3) {
        this.f49769a = i3;
        this.f49770b = adVar;
    }

    @Override
    public final void onClick(View view) {
        boolean z10;
        switch (this.f49769a) {
            case 0:
                ad.c0(this.f49770b, view);
                return;
            case 1:
                ad adVar = this.f49770b;
                org.telegram.ui.Components.f30 f30Var = adVar.f43756x;
                if (adVar.E != null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                f30Var.n(z10, new qc(adVar, 2), new s5(adVar, 2), 0);
                adVar.L.M(0);
                adVar.L.P(43);
                adVar.f43742n.d();
                return;
            case 2:
                ad adVar2 = this.f49770b;
                if (!adVar2.f43741l0) {
                    adVar2.l0();
                    return;
                } else if (adVar2.f43730c0) {
                    adVar2.f43730c0 = false;
                    adVar2.n0();
                    return;
                } else {
                    return;
                }
            default:
                ad adVar3 = this.f49770b;
                if (!adVar3.f43730c0) {
                    adVar3.f43730c0 = true;
                    adVar3.n0();
                    return;
                }
                return;
        }
    }
}
