package org.telegram.ui;

import android.view.KeyEvent;
import android.view.View;
public final class sm0 implements org.telegram.ui.Components.t4, org.telegram.ui.Components.ej0, org.telegram.ui.ActionBar.e1, org.telegram.ui.ActionBar.r1 {
    public final int f49956a;
    public final zm0 f49957b;

    public sm0(zm0 zm0Var, int i7) {
        this.f49956a = i7;
        this.f49957b = zm0Var;
    }

    @Override
    public void L(int i7, int i10, boolean z9) {
        switch (this.f49956a) {
            case 0:
                this.f49957b.j0(i7, z9);
                return;
            default:
                this.f49957b.j0(i7, z9);
                return;
        }
    }

    @Override
    public boolean c(int i7, View view) {
        zm0 zm0Var = this.f49957b;
        if (zm0Var.Y) {
            zm0Var.f0(view, zm0Var.J.f26300e.get(i7));
            return true;
        } else if (view instanceof org.telegram.ui.Cells.q5) {
            org.telegram.ui.Components.uj0 uj0Var = zm0Var.V;
            boolean z9 = !((org.telegram.ui.Cells.q5) view).a();
            zm0Var.X = z9;
            uj0Var.d(i7, view, z9);
            return false;
        } else {
            return false;
        }
    }

    @Override
    public void g(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        zm0 zm0Var = this.f49957b;
        an0 an0Var = zm0Var.f52624t0;
        if (an0Var != null) {
            switch (an0Var.f43748a) {
                case 1:
                    cn0 cn0Var = an0Var.f43749b;
                    cn0Var.f44712a.e0();
                    cn0Var.f44713b.e0();
                    return;
                default:
                    cn0 cn0Var2 = an0Var.f43749b;
                    cn0Var2.f44712a.e0();
                    cn0Var2.f44713b.e0();
                    return;
            }
        }
        zm0Var.e0();
    }

    @Override
    public void j(KeyEvent keyEvent) {
        org.telegram.ui.ActionBar.g1 g1Var;
        zm0 zm0Var = this.f49957b;
        zm0Var.getClass();
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (g1Var = zm0Var.m0) != null && g1Var.isShowing()) {
            zm0Var.m0.d(true);
        }
    }
}
