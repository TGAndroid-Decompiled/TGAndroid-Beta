package org.telegram.ui;

import android.view.KeyEvent;
import android.view.View;
public final class tm0 implements org.telegram.ui.Components.s4, org.telegram.ui.Components.dj0, org.telegram.ui.ActionBar.e1, org.telegram.ui.ActionBar.r1 {
    public final int f50305a;
    public final an0 f50306b;

    public tm0(an0 an0Var, int i7) {
        this.f50305a = i7;
        this.f50306b = an0Var;
    }

    @Override
    public void L(int i7, int i10, boolean z9) {
        switch (this.f50305a) {
            case 0:
                this.f50306b.j0(i7, z9);
                return;
            default:
                this.f50306b.j0(i7, z9);
                return;
        }
    }

    @Override
    public boolean c(int i7, View view) {
        an0 an0Var = this.f50306b;
        if (an0Var.Y) {
            an0Var.f0(view, an0Var.J.f26304e.get(i7));
            return true;
        } else if (view instanceof org.telegram.ui.Cells.q5) {
            org.telegram.ui.Components.tj0 tj0Var = an0Var.V;
            boolean z9 = !((org.telegram.ui.Cells.q5) view).a();
            an0Var.X = z9;
            tj0Var.d(i7, view, z9);
            return false;
        } else {
            return false;
        }
    }

    @Override
    public void g(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        an0 an0Var = this.f50306b;
        bn0 bn0Var = an0Var.f43774t0;
        if (bn0Var != null) {
            switch (bn0Var.f44089a) {
                case 1:
                    dn0 dn0Var = bn0Var.f44090b;
                    dn0Var.f45014a.e0();
                    dn0Var.f45015b.e0();
                    return;
                default:
                    dn0 dn0Var2 = bn0Var.f44090b;
                    dn0Var2.f45014a.e0();
                    dn0Var2.f45015b.e0();
                    return;
            }
        }
        an0Var.e0();
    }

    @Override
    public void j(KeyEvent keyEvent) {
        org.telegram.ui.ActionBar.g1 g1Var;
        an0 an0Var = this.f50306b;
        an0Var.getClass();
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (g1Var = an0Var.m0) != null && g1Var.isShowing()) {
            an0Var.m0.d(true);
        }
    }
}
