package org.telegram.ui;

import android.view.View;
public final class uc implements View.OnClickListener {
    public final int f50363a;
    public final bd f50364b;

    public uc(bd bdVar, int i7) {
        this.f50363a = i7;
        this.f50364b = bdVar;
    }

    @Override
    public final void onClick(View view) {
        boolean z9;
        switch (this.f50363a) {
            case 0:
                bd.c0(this.f50364b, view);
                return;
            case 1:
                bd bdVar = this.f50364b;
                org.telegram.ui.Components.k30 k30Var = bdVar.f44010x;
                if (bdVar.D != null) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                k30Var.n(z9, new sc(bdVar, 2), new q5(bdVar, 2), 0);
                bdVar.K.M(0);
                bdVar.K.P(43);
                bdVar.f43996n.d();
                return;
            case 2:
                bd bdVar2 = this.f50364b;
                if (!bdVar2.f43994k0) {
                    bdVar2.l0();
                    return;
                } else if (bdVar2.f43982b0) {
                    bdVar2.f43982b0 = false;
                    bdVar2.n0();
                    return;
                } else {
                    return;
                }
            default:
                bd bdVar3 = this.f50364b;
                if (!bdVar3.f43982b0) {
                    bdVar3.f43982b0 = true;
                    bdVar3.n0();
                    return;
                }
                return;
        }
    }
}
