package org.telegram.ui;

import android.view.View;
import java.io.Serializable;
public final class qt0 implements org.telegram.ui.ActionBar.u1, org.telegram.messenger.o20 {
    public final int f41065a;
    public final rt0 f41066b;

    public qt0(rt0 rt0Var, int i10) {
        this.f41065a = i10;
        this.f41066b = rt0Var;
    }

    @Override
    public void h(org.telegram.ui.ActionBar.x1 x1Var, int i10) {
        switch (this.f41065a) {
            case 0:
                this.f41066b.c0();
                return;
            default:
                this.f41066b.finishFragment();
                return;
        }
    }

    @Override
    public void k(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
        View view = (View) obj2;
        Integer num = (Integer) number;
        Float f7 = (Float) serializable;
        Float f10 = (Float) serializable2;
        if (((org.telegram.ui.Components.a51) obj).d == 1) {
            org.telegram.ui.Cells.t8 t8Var = (org.telegram.ui.Cells.t8) view;
            boolean z10 = !t8Var.e.h;
            rt0 rt0Var = this.f41066b;
            rt0Var.f41291n = z10;
            t8Var.setChecked(z10);
            rt0Var.d.f30819f3.O(true);
            rt0Var.Z(true);
        }
    }
}
