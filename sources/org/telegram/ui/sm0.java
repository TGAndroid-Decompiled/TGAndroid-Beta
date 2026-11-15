package org.telegram.ui;

import android.view.KeyEvent;
import android.view.View;
public final class sm0 implements org.telegram.ui.Components.r4, org.telegram.ui.Components.ij0, org.telegram.ui.ActionBar.e1, org.telegram.ui.ActionBar.q1 {
    public final int f51245a;
    public final zm0 f51246b;

    public sm0(zm0 zm0Var, int i7) {
        this.f51245a = i7;
        this.f51246b = zm0Var;
    }

    @Override
    public void L(int i7, int i10, boolean z10) {
        switch (this.f51245a) {
            case 0:
                this.f51246b.j0(i7, z10);
                return;
            default:
                this.f51246b.j0(i7, z10);
                return;
        }
    }

    @Override
    public boolean b(int i7, View view) {
        zm0 zm0Var = this.f51246b;
        if (zm0Var.Z) {
            zm0Var.f0(view, zm0Var.K.f26972e.get(i7));
            return true;
        } else if (view instanceof org.telegram.ui.Cells.q5) {
            org.telegram.ui.Components.yj0 yj0Var = zm0Var.W;
            boolean z10 = !((org.telegram.ui.Cells.q5) view).a();
            zm0Var.Y = z10;
            yj0Var.d(i7, view, z10);
            return false;
        } else {
            return false;
        }
    }

    @Override
    public void h(org.telegram.ui.ActionBar.t1 t1Var, int i7) {
        zm0 zm0Var = this.f51246b;
        an0 an0Var = zm0Var.f53982u0;
        if (an0Var != null) {
            switch (an0Var.f45454a) {
                case 1:
                    cn0 cn0Var = an0Var.f45455b;
                    cn0Var.f46183a.e0();
                    cn0Var.f46184b.e0();
                    return;
                default:
                    cn0 cn0Var2 = an0Var.f45455b;
                    cn0Var2.f46183a.e0();
                    cn0Var2.f46184b.e0();
                    return;
            }
        }
        zm0Var.e0();
    }

    @Override
    public void j(KeyEvent keyEvent) {
        org.telegram.ui.ActionBar.g1 g1Var;
        zm0 zm0Var = this.f51246b;
        zm0Var.getClass();
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (g1Var = zm0Var.f53973n0) != null && g1Var.isShowing()) {
            zm0Var.f53973n0.d(true);
        }
    }
}
