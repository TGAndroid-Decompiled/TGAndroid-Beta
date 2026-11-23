package org.telegram.ui;

import android.view.View;
import java.io.Serializable;
public final class u8 implements org.telegram.messenger.w10, org.telegram.messenger.x10, r0.m {
    public final i9 f52466a;

    public u8(i9 i9Var) {
        this.f52466a = i9Var;
    }

    @Override
    public r0.l1 P0(View view, r0.l1 l1Var) {
        return this.f52466a.onInsetsInternal(view, l1Var);
    }

    @Override
    public Boolean a(org.telegram.ui.Components.o41 o41Var, View view, Integer num, Float f10, Float f11) {
        boolean z10;
        Object obj = o41Var.H;
        if (obj instanceof f9) {
            this.f52466a.f0(((f9) obj).f47608c, (e9) view);
            z10 = true;
        } else {
            z10 = false;
        }
        return Boolean.valueOf(z10);
    }

    @Override
    public void l(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
        Integer num = (Integer) number;
        Float f10 = (Float) serializable;
        Float f11 = (Float) serializable2;
        i9.a0(this.f52466a, (org.telegram.ui.Components.o41) obj, (View) obj2);
    }
}
