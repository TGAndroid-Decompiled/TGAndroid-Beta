package org.telegram.ui;

import android.view.View;
public final class zc implements View.OnClickListener {
    public final int f45131a;
    public final hd f45132b;

    public zc(hd hdVar, int i10) {
        this.f45131a = i10;
        this.f45132b = hdVar;
    }

    @Override
    public final void onClick(View view) {
        boolean z10;
        switch (this.f45131a) {
            case 0:
                hd.X(this.f45132b, view);
                return;
            case 1:
                hd hdVar = this.f45132b;
                org.telegram.ui.Components.s40 s40Var = hdVar.v;
                if (hdVar.f38876x != null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                s40Var.o(z10, new yc(hdVar, 1), new s5(hdVar, 2), 0);
                hdVar.F.K(0);
                hdVar.F.N(43);
                hdVar.h.d();
                return;
            case 2:
                hd hdVar2 = this.f45132b;
                if (!hdVar2.f38859f0) {
                    hdVar2.f0();
                    return;
                } else if (hdVar2.W) {
                    hdVar2.W = false;
                    hdVar2.h0();
                    return;
                } else {
                    return;
                }
            default:
                hd hdVar3 = this.f45132b;
                if (!hdVar3.W) {
                    hdVar3.W = true;
                    hdVar3.h0();
                    return;
                }
                return;
        }
    }
}
