package org.telegram.ui;

import android.view.KeyEvent;
import android.view.View;
public final class qm0 implements org.telegram.ui.Components.t4, org.telegram.ui.Components.dj0, org.telegram.ui.ActionBar.e1, org.telegram.ui.ActionBar.r1 {
    public final int f49276a;
    public final xm0 f49277b;

    public qm0(xm0 xm0Var, int i7) {
        this.f49276a = i7;
        this.f49277b = xm0Var;
    }

    @Override
    public void L(int i7, int i10, boolean z9) {
        switch (this.f49276a) {
            case 0:
                this.f49277b.j0(i7, z9);
                return;
            default:
                this.f49277b.j0(i7, z9);
                return;
        }
    }

    @Override
    public boolean c(int i7, View view) {
        xm0 xm0Var = this.f49277b;
        if (xm0Var.Y) {
            xm0Var.f0(view, xm0Var.J.f26289e.get(i7));
            return true;
        } else if (view instanceof org.telegram.ui.Cells.q5) {
            org.telegram.ui.Components.tj0 tj0Var = xm0Var.V;
            boolean z9 = !((org.telegram.ui.Cells.q5) view).a();
            xm0Var.X = z9;
            tj0Var.d(i7, view, z9);
            return false;
        } else {
            return false;
        }
    }

    @Override
    public void g(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        xm0 xm0Var = this.f49277b;
        ym0 ym0Var = xm0Var.f51938t0;
        if (ym0Var != null) {
            switch (ym0Var.f52291a) {
                case 1:
                    an0 an0Var = ym0Var.f52292b;
                    an0Var.f44050a.e0();
                    an0Var.f44051b.e0();
                    return;
                default:
                    an0 an0Var2 = ym0Var.f52292b;
                    an0Var2.f44050a.e0();
                    an0Var2.f44051b.e0();
                    return;
            }
        }
        xm0Var.e0();
    }

    @Override
    public void j(KeyEvent keyEvent) {
        org.telegram.ui.ActionBar.g1 g1Var;
        xm0 xm0Var = this.f49277b;
        xm0Var.getClass();
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (g1Var = xm0Var.m0) != null && g1Var.isShowing()) {
            xm0Var.m0.d(true);
        }
    }
}
