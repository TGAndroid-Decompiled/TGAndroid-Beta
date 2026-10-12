package org.telegram.ui;

import android.view.View;
public final class yg0 implements org.telegram.ui.Components.lm0, org.telegram.ui.ActionBar.z1 {
    public final ah0 f44478a;

    public yg0(ah0 ah0Var) {
        this.f44478a = ah0Var;
    }

    @Override
    public boolean Y0(View view) {
        return false;
    }

    @Override
    public void c(float f7, float f10, int i10, View view) {
        ah0.W(this.f44478a, i10);
    }

    @Override
    public void f(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        ah0.U(this.f44478a);
    }

    @Override
    public void n0(View view, float f7, float f10) {
    }
}
