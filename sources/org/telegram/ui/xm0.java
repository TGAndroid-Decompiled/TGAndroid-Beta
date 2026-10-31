package org.telegram.ui;

import android.view.View;
import android.widget.FrameLayout;
public final class xm0 implements r0.m, org.telegram.ui.ActionBar.u1 {
    public final int f43600a;
    public final tn0 f43601b;

    public xm0(tn0 tn0Var, int i10) {
        this.f43600a = i10;
        this.f43601b = tn0Var;
    }

    @Override
    public r0.j1 R0(View view, r0.j1 j1Var) {
        i0.c I0 = org.telegram.messenger.i0.I0(j1Var, false);
        tn0 tn0Var = this.f43601b;
        tn0Var.f41871b0 = I0;
        en0 en0Var = tn0Var.h.f39984b;
        int i10 = I0.f7765a;
        int paddingTop = en0Var.getPaddingTop();
        i0.c cVar = tn0Var.f41871b0;
        en0Var.setPadding(i10, paddingTop, cVar.f7767c, org.telegram.messenger.i0.L(72.0f) + cVar.d);
        en0 en0Var2 = tn0Var.f41876n.f39984b;
        int i11 = tn0Var.f41871b0.f7765a;
        int paddingTop2 = en0Var2.getPaddingTop();
        i0.c cVar2 = tn0Var.f41871b0;
        en0Var2.setPadding(i11, paddingTop2, cVar2.f7767c, org.telegram.messenger.i0.L(72.0f) + cVar2.d);
        FrameLayout frameLayout = tn0Var.P;
        i0.c cVar3 = tn0Var.f41871b0;
        frameLayout.setPadding(cVar3.f7765a, 0, cVar3.f7767c, cVar3.d);
        return r0.j1.f46131b;
    }

    @Override
    public void h(org.telegram.ui.ActionBar.x1 x1Var, int i10) {
        switch (this.f43600a) {
            case 1:
                this.f43601b.finishFragment();
                return;
            default:
                this.f43601b.C0();
                return;
        }
    }
}
