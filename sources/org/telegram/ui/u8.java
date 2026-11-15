package org.telegram.ui;

import android.view.View;
import java.io.Serializable;
public final class u8 implements org.telegram.messenger.x10, org.telegram.messenger.y10, r0.m {
    public final i9 f51825a;

    public u8(i9 i9Var) {
        this.f51825a = i9Var;
    }

    @Override
    public r0.k1 M0(View view, r0.k1 k1Var) {
        return this.f51825a.onInsetsInternal(view, k1Var);
    }

    @Override
    public Boolean a(org.telegram.ui.Components.b41 b41Var, View view, Integer num, Float f10, Float f11) {
        boolean z10;
        Object obj = b41Var.G;
        if (obj instanceof f9) {
            this.f51825a.f0(((f9) obj).f47091c, (e9) view);
            z10 = true;
        } else {
            z10 = false;
        }
        return Boolean.valueOf(z10);
    }

    @Override
    public void m(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
        Integer num = (Integer) number;
        Float f10 = (Float) serializable;
        Float f11 = (Float) serializable2;
        i9.a0(this.f51825a, (org.telegram.ui.Components.b41) obj, (View) obj2);
    }
}
