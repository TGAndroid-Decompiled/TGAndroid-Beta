package org.telegram.ui;

import android.view.View;
import java.io.Serializable;
public final class u8 implements org.telegram.messenger.a20, org.telegram.messenger.b20, r0.m {
    public final i9 f50335a;

    public u8(i9 i9Var) {
        this.f50335a = i9Var;
    }

    @Override
    public r0.k1 S0(View view, r0.k1 k1Var) {
        return this.f50335a.onInsetsInternal(view, k1Var);
    }

    @Override
    public Boolean a(org.telegram.ui.Components.x31 x31Var, View view, Integer num, Float f10, Float f11) {
        boolean z9;
        Object obj = x31Var.G;
        if (obj instanceof f9) {
            this.f50335a.f0(((f9) obj).f45573c, (e9) view);
            z9 = true;
        } else {
            z9 = false;
        }
        return Boolean.valueOf(z9);
    }

    @Override
    public void i(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
        Integer num = (Integer) number;
        Float f10 = (Float) serializable;
        Float f11 = (Float) serializable2;
        i9.a0(this.f50335a, (org.telegram.ui.Components.x31) obj, (View) obj2);
    }
}
