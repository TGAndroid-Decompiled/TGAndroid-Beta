package org.telegram.ui;

import android.view.View;
public final class uc implements View.OnClickListener {
    public final int f50389a;
    public final bd f50390b;

    public uc(bd bdVar, int i7) {
        this.f50389a = i7;
        this.f50390b = bdVar;
    }

    @Override
    public final void onClick(View view) {
        boolean z9;
        switch (this.f50389a) {
            case 0:
                bd.c0(this.f50390b, view);
                return;
            case 1:
                bd bdVar = this.f50390b;
                org.telegram.ui.Components.j30 j30Var = bdVar.f44281x;
                if (bdVar.D != null) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                j30Var.n(z9, new sc(bdVar, 2), new q5(bdVar, 2), 0);
                bdVar.K.M(0);
                bdVar.K.P(43);
                bdVar.f44267n.d();
                return;
            case 2:
                bd bdVar2 = this.f50390b;
                if (!bdVar2.f44265k0) {
                    bdVar2.l0();
                    return;
                } else if (bdVar2.f44253b0) {
                    bdVar2.f44253b0 = false;
                    bdVar2.n0();
                    return;
                } else {
                    return;
                }
            default:
                bd bdVar3 = this.f50390b;
                if (!bdVar3.f44253b0) {
                    bdVar3.f44253b0 = true;
                    bdVar3.n0();
                    return;
                }
                return;
        }
    }
}
