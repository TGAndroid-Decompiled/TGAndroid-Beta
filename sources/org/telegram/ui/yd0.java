package org.telegram.ui;

import android.view.View;
public final class yd0 implements org.telegram.ui.Components.gj0, org.telegram.ui.ActionBar.p1 {
    public final zd0 f52260a;

    public yd0(zd0 zd0Var) {
        this.f52260a = zd0Var;
    }

    @Override
    public void b(float f10, float f11, int i3, View view) {
        zd0.b0(this.f52260a, i3);
    }

    @Override
    public boolean b1(View view) {
        return false;
    }

    @Override
    public void g(org.telegram.ui.ActionBar.s1 s1Var, int i3) {
        zd0.a0(this.f52260a);
    }

    @Override
    public void r0(View view, float f10, float f11) {
    }
}
