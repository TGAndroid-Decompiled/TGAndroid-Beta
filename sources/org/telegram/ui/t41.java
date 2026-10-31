package org.telegram.ui;

import android.view.View;
import android.view.ViewGroup;
import java.io.Serializable;
public final class t41 implements org.telegram.messenger.o20, org.telegram.messenger.p20, r0.m {
    public final e51 f41715a;

    public t41(e51 e51Var) {
        this.f41715a = e51Var;
    }

    @Override
    public r0.j1 R0(View view, r0.j1 j1Var) {
        i0.c I0 = org.telegram.messenger.i0.I0(j1Var, false);
        int i10 = I0.d;
        e51 e51Var = this.f41715a;
        e51Var.f36936c0 = i10;
        int i11 = I0.f7766b;
        if (e51Var.P != null) {
            int currentActionBarHeight = org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() + i11;
            ViewGroup.LayoutParams layoutParams = e51Var.P.getLayoutParams();
            if (layoutParams.height != currentActionBarHeight) {
                layoutParams.height = currentActionBarHeight;
                e51Var.P.setLayoutParams(layoutParams);
            }
        }
        ei.b.e(e51Var.f36935c, i11, i10, org.telegram.messenger.i0.L(12.0f), e51Var.f36937d0);
        return r0.j1.f46131b;
    }

    @Override
    public Boolean a(org.telegram.ui.Components.a51 a51Var, View view, Integer num, Float f7, Float f10) {
        return Boolean.valueOf(e51.Y(this.f41715a, a51Var, view));
    }

    @Override
    public void k(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
        View view = (View) obj2;
        Integer num = (Integer) number;
        Float f7 = (Float) serializable;
        Float f10 = (Float) serializable2;
        e51.g0(this.f41715a, (org.telegram.ui.Components.a51) obj);
    }
}
