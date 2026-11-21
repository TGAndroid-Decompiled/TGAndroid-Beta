package org.telegram.ui;

import android.content.Context;
public final class sg0 extends ah.o {
    public final int L;
    public boolean M;
    public final org.telegram.ui.Components.sa N;

    public sg0(org.telegram.ui.Components.sa saVar, Context context, org.telegram.ui.ActionBar.h6 h6Var, int i7) {
        super(context, h6Var);
        this.L = i7;
        this.N = saVar;
    }

    @Override
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        switch (this.L) {
            case 0:
                super.onLayout(z10, i7, i10, i11, i12);
                vg0 vg0Var = (vg0) this.N;
                vg0Var.f52819h2 = org.telegram.messenger.g0.L(64.0f) + getMeasuredHeight();
                vg0Var.f52818g2.G();
                boolean z11 = this.M;
                boolean z12 = vg0Var.d;
                if (z11 != z12) {
                    this.M = z12;
                    if (z12) {
                        org.telegram.ui.Components.ek0 ek0Var = vg0Var.f39539o1;
                        pi.l lVar = new pi.l(vg0Var.getContext(), 2, 0.6f);
                        lVar.f59105a = 1;
                        lVar.f55740p = org.telegram.messenger.g0.L(36.0f);
                        ek0Var.getLayoutManager().w0(lVar);
                        return;
                    }
                    return;
                }
                return;
            default:
                super.onLayout(z10, i7, i10, i11, i12);
                wg.e1 e1Var = (wg.e1) this.N;
                e1Var.f59794l2 = org.telegram.messenger.g0.L(64.0f) + getMeasuredHeight();
                e1Var.f59793k2.G();
                boolean z13 = this.M;
                boolean z14 = e1Var.d;
                if (z13 != z14) {
                    this.M = z14;
                    if (z14) {
                        org.telegram.ui.Components.ek0 ek0Var2 = e1Var.f39539o1;
                        pi.l lVar2 = new pi.l(e1Var.getContext(), 2, 0.6f);
                        lVar2.f59105a = 1;
                        lVar2.f55740p = org.telegram.messenger.g0.L(36.0f);
                        ek0Var2.getLayoutManager().w0(lVar2);
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
