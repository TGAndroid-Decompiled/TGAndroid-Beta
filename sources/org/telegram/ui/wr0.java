package org.telegram.ui;

import android.view.View;
import java.io.Serializable;
public final class wr0 implements org.telegram.ui.ActionBar.p1, org.telegram.messenger.s10 {
    public final int f51594a;
    public final xr0 f51595b;

    public wr0(xr0 xr0Var, int i3) {
        this.f51594a = i3;
        this.f51595b = xr0Var;
    }

    @Override
    public void g(org.telegram.ui.ActionBar.s1 s1Var, int i3) {
        switch (this.f51594a) {
            case 0:
                this.f51595b.d0();
                return;
            default:
                this.f51595b.finishFragment();
                return;
        }
    }

    @Override
    public void j(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
        View view = (View) obj2;
        Integer num = (Integer) number;
        Float f10 = (Float) serializable;
        Float f11 = (Float) serializable2;
        if (((org.telegram.ui.Components.r31) obj).d == 1) {
            org.telegram.ui.Cells.q8 q8Var = (org.telegram.ui.Cells.q8) view;
            boolean z10 = !q8Var.f30234e.h;
            xr0 xr0Var = this.f51595b;
            xr0Var.f52087n = z10;
            q8Var.setChecked(z10);
            xr0Var.d.f35594g3.O(true);
            xr0Var.a0(true);
        }
    }
}
