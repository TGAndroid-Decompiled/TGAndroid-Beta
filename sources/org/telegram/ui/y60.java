package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class y60 implements org.telegram.ui.Components.p20, org.telegram.ui.ActionBar.z1, r0.o {
    public final int f42050a;
    public final j70 f42051b;

    public y60(j70 j70Var, int i10) {
        this.f42050a = i10;
        this.f42051b = j70Var;
    }

    @Override
    public r0.l1 Q0(View view, r0.l1 l1Var) {
        int i10 = AndroidUtilities.getDefaultWindowInsets(l1Var, false).d;
        j70 j70Var = this.f42051b;
        j70Var.m0 = i10;
        bi.i7 i7Var = j70Var.F;
        if (i7Var != null) {
            i7Var.setPadding(0, 0, 0, i10);
        }
        j70Var.j0();
        j70Var.h0();
        return r0.l1.f43740b;
    }

    @Override
    public void a(int i10) {
        j70 j70Var = this.f42051b;
        j70Var.f37271b.a(Math.min(i10, j70Var.f37274c0));
    }

    @Override
    public void g(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        switch (this.f42050a) {
            case 1:
                this.f42051b.o0();
                return;
            default:
                this.f42051b.finishFragment();
                return;
        }
    }
}
