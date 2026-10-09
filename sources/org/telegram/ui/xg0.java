package org.telegram.ui;

import android.view.View;
public final class xg0 implements org.telegram.ui.Components.fm0, org.telegram.ui.ActionBar.a2 {
    public final zg0 f44029a;

    public xg0(zg0 zg0Var) {
        this.f44029a = zg0Var;
    }

    @Override
    public boolean Y0(View view) {
        return false;
    }

    @Override
    public void c(float f7, float f10, int i10, View view) {
        zg0.W(this.f44029a, i10);
    }

    @Override
    public void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        zg0.U(this.f44029a);
    }

    @Override
    public void n0(View view, float f7, float f10) {
    }
}
