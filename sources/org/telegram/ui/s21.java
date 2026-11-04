package org.telegram.ui;

import android.view.View;
import android.view.ViewGroup;
import java.io.Serializable;
public final class s21 implements org.telegram.messenger.s10, org.telegram.messenger.t10, r0.m {
    public final c31 f49338a;

    public s21(c31 c31Var) {
        this.f49338a = c31Var;
    }

    @Override
    public r0.k1 R0(View view, r0.k1 k1Var) {
        i0.b I0 = org.telegram.messenger.g0.I0(k1Var, false);
        int i3 = I0.d;
        c31 c31Var = this.f49338a;
        c31Var.f44220d0 = i3;
        int i10 = I0.f14496b;
        if (c31Var.Q != null) {
            int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + i10;
            ViewGroup.LayoutParams layoutParams = c31Var.Q.getLayoutParams();
            if (layoutParams.height != currentActionBarHeight) {
                layoutParams.height = currentActionBarHeight;
                c31Var.Q.setLayoutParams(layoutParams);
            }
        }
        pi.a.e(c31Var.f44218c, i10, i3, org.telegram.messenger.g0.L(12.0f), c31Var.f44222e0);
        return r0.k1.f54025b;
    }

    @Override
    public Boolean a(org.telegram.ui.Components.r31 r31Var, View view, Integer num, Float f10, Float f11) {
        return Boolean.valueOf(c31.Z(this.f49338a, r31Var, view));
    }

    @Override
    public void j(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
        View view = (View) obj2;
        Integer num = (Integer) number;
        Float f10 = (Float) serializable;
        Float f11 = (Float) serializable2;
        c31.h0(this.f49338a, (org.telegram.ui.Components.r31) obj);
    }
}
