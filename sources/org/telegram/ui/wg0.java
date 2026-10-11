package org.telegram.ui;

import android.view.View;
public final class wg0 implements org.telegram.ui.Components.gm0, org.telegram.ui.ActionBar.z1 {
    public final yg0 f43805a;

    public wg0(yg0 yg0Var) {
        this.f43805a = yg0Var;
    }

    @Override
    public boolean Y0(View view) {
        return false;
    }

    @Override
    public void c(float f7, float f10, int i10, View view) {
        yg0.W(this.f43805a, i10);
    }

    @Override
    public void f(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        yg0.U(this.f43805a);
    }

    @Override
    public void n0(View view, float f7, float f10) {
    }
}
