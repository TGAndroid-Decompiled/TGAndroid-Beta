package org.telegram.ui;

import android.view.View;
import java.io.Serializable;
public final class u8 implements org.telegram.messenger.s10, org.telegram.messenger.t10, r0.m {
    public final h9 f50014a;

    @Override
    public r0.k1 R0(View view, r0.k1 k1Var) {
        return this.f50014a.onInsetsInternal(view, k1Var);
    }

    @Override
    public Boolean a(org.telegram.ui.Components.r31 r31Var, View view, Integer num, Float f10, Float f11) {
        boolean z10;
        Object obj = r31Var.G;
        if (obj instanceof e9) {
            this.f50014a.f0(((e9) obj).f44928c, (d9) view);
            z10 = true;
        } else {
            z10 = false;
        }
        return Boolean.valueOf(z10);
    }

    @Override
    public void j(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
        Integer num = (Integer) number;
        Float f10 = (Float) serializable;
        Float f11 = (Float) serializable2;
        h9.a0(this.f50014a, (org.telegram.ui.Components.r31) obj, (View) obj2);
    }
}
