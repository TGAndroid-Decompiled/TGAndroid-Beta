package org.telegram.ui;

import android.view.KeyEvent;
import android.view.View;
public final class rm0 implements org.telegram.ui.Components.r4, org.telegram.ui.Components.ij0, org.telegram.ui.ActionBar.e1, org.telegram.ui.ActionBar.q1 {
    public final int f50978a;
    public final ym0 f50979b;

    public rm0(ym0 ym0Var, int i7) {
        this.f50978a = i7;
        this.f50979b = ym0Var;
    }

    @Override
    public void L(int i7, int i10, boolean z10) {
        switch (this.f50978a) {
            case 0:
                this.f50979b.j0(i7, z10);
                return;
            default:
                this.f50979b.j0(i7, z10);
                return;
        }
    }

    @Override
    public boolean b(int i7, View view) {
        ym0 ym0Var = this.f50979b;
        if (ym0Var.Z) {
            ym0Var.f0(view, ym0Var.K.f26971e.get(i7));
            return true;
        } else if (view instanceof org.telegram.ui.Cells.q5) {
            org.telegram.ui.Components.yj0 yj0Var = ym0Var.W;
            boolean z10 = !((org.telegram.ui.Cells.q5) view).a();
            ym0Var.Y = z10;
            yj0Var.d(i7, view, z10);
            return false;
        } else {
            return false;
        }
    }

    @Override
    public void h(org.telegram.ui.ActionBar.t1 t1Var, int i7) {
        ym0 ym0Var = this.f50979b;
        zm0 zm0Var = ym0Var.f53591u0;
        if (zm0Var != null) {
            switch (zm0Var.f53988a) {
                case 1:
                    bn0 bn0Var = zm0Var.f53989b;
                    bn0Var.f45790a.e0();
                    bn0Var.f45791b.e0();
                    return;
                default:
                    bn0 bn0Var2 = zm0Var.f53989b;
                    bn0Var2.f45790a.e0();
                    bn0Var2.f45791b.e0();
                    return;
            }
        }
        ym0Var.e0();
    }

    @Override
    public void j(KeyEvent keyEvent) {
        org.telegram.ui.ActionBar.g1 g1Var;
        ym0 ym0Var = this.f50979b;
        ym0Var.getClass();
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (g1Var = ym0Var.f53582n0) != null && g1Var.isShowing()) {
            ym0Var.f53582n0.d(true);
        }
    }
}
