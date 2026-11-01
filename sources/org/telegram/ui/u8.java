package org.telegram.ui;

import android.view.View;
import java.io.Serializable;
public final class u8 implements org.telegram.messenger.p20, org.telegram.messenger.q20, r0.m {
    public final j9 f41874a;

    @Override
    public r0.j1 R0(View view, r0.j1 j1Var) {
        return this.f41874a.onInsetsInternal(view, j1Var);
    }

    @Override
    public Boolean a(org.telegram.ui.Components.b51 b51Var, View view, Integer num, Float f7, Float f10) {
        boolean z10;
        Object obj = b51Var.G;
        if (obj instanceof g9) {
            this.f41874a.f0(((g9) obj).f37407c, (f9) view);
            z10 = true;
        } else {
            z10 = false;
        }
        return Boolean.valueOf(z10);
    }

    @Override
    public void k(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
        Integer num = (Integer) number;
        Float f7 = (Float) serializable;
        Float f10 = (Float) serializable2;
        j9.a0(this.f41874a, (org.telegram.ui.Components.b51) obj, (View) obj2);
    }
}
