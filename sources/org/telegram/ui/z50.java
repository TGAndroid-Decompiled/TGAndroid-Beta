package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class z50 implements org.telegram.ui.Components.n10, org.telegram.ui.ActionBar.b2, r0.o {
    public final int f45037a;
    public final k60 f45038b;

    public z50(k60 k60Var, int i9) {
        this.f45037a = i9;
        this.f45038b = k60Var;
    }

    @Override
    public r0.m1 L0(View view, r0.m1 m1Var) {
        int i9 = AndroidUtilities.getDefaultWindowInsets(m1Var, false).d;
        k60 k60Var = this.f45038b;
        k60Var.f39738i0 = i9;
        gh.h1 h1Var = k60Var.B;
        if (h1Var != null) {
            h1Var.setPadding(0, 0, 0, i9);
        }
        k60Var.i0();
        k60Var.g0();
        return r0.m1.f46928b;
    }

    @Override
    public void a(int i9) {
        k60 k60Var = this.f45038b;
        k60Var.f39727b.a(Math.min(i9, k60Var.Y));
    }

    @Override
    public void f(org.telegram.ui.ActionBar.c2 c2Var, int i9) {
        switch (this.f45037a) {
            case 1:
                this.f45038b.n0();
                return;
            default:
                this.f45038b.finishFragment();
                return;
        }
    }
}
