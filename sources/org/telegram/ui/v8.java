package org.telegram.ui;

import android.view.View;
import java.io.Serializable;
public final class v8 implements org.telegram.messenger.u10, org.telegram.messenger.v10, r0.m {
    public final j9 f52916a;

    public v8(j9 j9Var) {
        this.f52916a = j9Var;
    }

    @Override
    public Boolean a(org.telegram.ui.Components.n41 n41Var, View view, Integer num, Float f10, Float f11) {
        boolean z10;
        Object obj = n41Var.H;
        if (obj instanceof g9) {
            this.f52916a.f0(((g9) obj).f48189c, (f9) view);
            z10 = true;
        } else {
            z10 = false;
        }
        return Boolean.valueOf(z10);
    }

    @Override
    public void k(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
        Integer num = (Integer) number;
        Float f10 = (Float) serializable;
        Float f11 = (Float) serializable2;
        j9.a0(this.f52916a, (org.telegram.ui.Components.n41) obj, (View) obj2);
    }

    @Override
    public r0.l1 l1(View view, r0.l1 l1Var) {
        return this.f52916a.onInsetsInternal(view, l1Var);
    }
}
