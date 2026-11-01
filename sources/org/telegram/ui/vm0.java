package org.telegram.ui;

import android.view.View;
import android.widget.FrameLayout;
public final class vm0 implements r0.m, org.telegram.ui.ActionBar.u1 {
    public final int f42568a;
    public final rn0 f42569b;

    public vm0(rn0 rn0Var, int i10) {
        this.f42568a = i10;
        this.f42569b = rn0Var;
    }

    @Override
    public r0.j1 R0(View view, r0.j1 j1Var) {
        i0.c I0 = org.telegram.messenger.i0.I0(j1Var, false);
        rn0 rn0Var = this.f42569b;
        rn0Var.f41113b0 = I0;
        cn0 cn0Var = rn0Var.h.f39317b;
        int i10 = I0.f7766a;
        int paddingTop = cn0Var.getPaddingTop();
        i0.c cVar = rn0Var.f41113b0;
        cn0Var.setPadding(i10, paddingTop, cVar.f7768c, org.telegram.messenger.i0.L(72.0f) + cVar.d);
        cn0 cn0Var2 = rn0Var.f41118n.f39317b;
        int i11 = rn0Var.f41113b0.f7766a;
        int paddingTop2 = cn0Var2.getPaddingTop();
        i0.c cVar2 = rn0Var.f41113b0;
        cn0Var2.setPadding(i11, paddingTop2, cVar2.f7768c, org.telegram.messenger.i0.L(72.0f) + cVar2.d);
        FrameLayout frameLayout = rn0Var.P;
        i0.c cVar3 = rn0Var.f41113b0;
        frameLayout.setPadding(cVar3.f7766a, 0, cVar3.f7768c, cVar3.d);
        return r0.j1.f46142b;
    }

    @Override
    public void h(org.telegram.ui.ActionBar.x1 x1Var, int i10) {
        switch (this.f42568a) {
            case 1:
                this.f42569b.finishFragment();
                return;
            default:
                this.f42569b.D0();
                return;
        }
    }
}
