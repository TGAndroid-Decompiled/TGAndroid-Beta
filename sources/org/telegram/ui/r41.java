package org.telegram.ui;

import android.view.View;
import android.view.ViewGroup;
import java.io.Serializable;
public final class r41 implements org.telegram.messenger.p20, org.telegram.messenger.q20, r0.m {
    public final c51 f40969a;

    public r41(c51 c51Var) {
        this.f40969a = c51Var;
    }

    @Override
    public r0.j1 R0(View view, r0.j1 j1Var) {
        i0.c I0 = org.telegram.messenger.i0.I0(j1Var, false);
        int i10 = I0.d;
        c51 c51Var = this.f40969a;
        c51Var.f36190c0 = i10;
        int i11 = I0.f7767b;
        if (c51Var.P != null) {
            int currentActionBarHeight = org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() + i11;
            ViewGroup.LayoutParams layoutParams = c51Var.P.getLayoutParams();
            if (layoutParams.height != currentActionBarHeight) {
                layoutParams.height = currentActionBarHeight;
                c51Var.P.setLayoutParams(layoutParams);
            }
        }
        ei.b.e(c51Var.f36189c, i11, i10, org.telegram.messenger.i0.L(12.0f), c51Var.f36191d0);
        return r0.j1.f46142b;
    }

    @Override
    public Boolean a(org.telegram.ui.Components.b51 b51Var, View view, Integer num, Float f7, Float f10) {
        return Boolean.valueOf(c51.Z(this.f40969a, b51Var, view));
    }

    @Override
    public void k(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
        View view = (View) obj2;
        Integer num = (Integer) number;
        Float f7 = (Float) serializable;
        Float f10 = (Float) serializable2;
        c51.h0(this.f40969a, (org.telegram.ui.Components.b51) obj);
    }
}
