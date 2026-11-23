package org.telegram.ui;

import android.view.KeyEvent;
import android.view.View;
public final class sm0 implements org.telegram.ui.Components.z4, org.telegram.ui.Components.sj0, org.telegram.ui.ActionBar.e1, org.telegram.ui.ActionBar.q1 {
    public final int f52112a;
    public final an0 f52113b;

    public sm0(an0 an0Var, int i7) {
        this.f52112a = i7;
        this.f52113b = an0Var;
    }

    @Override
    public void I(int i7, int i10, boolean z10) {
        switch (this.f52112a) {
            case 0:
                this.f52113b.j0(i7, z10);
                return;
            default:
                this.f52113b.j0(i7, z10);
                return;
        }
    }

    @Override
    public boolean b(int i7, View view) {
        an0 an0Var = this.f52113b;
        if (an0Var.Z) {
            an0Var.f0(view, an0Var.K.f27262e.get(i7));
            return true;
        } else if (view instanceof org.telegram.ui.Cells.r5) {
            org.telegram.ui.Components.ik0 ik0Var = an0Var.W;
            boolean z10 = !((org.telegram.ui.Cells.r5) view).a();
            an0Var.Y = z10;
            ik0Var.d(i7, view, z10);
            return false;
        } else {
            return false;
        }
    }

    @Override
    public void i(org.telegram.ui.ActionBar.t1 t1Var, int i7) {
        an0 an0Var = this.f52113b;
        bn0 bn0Var = an0Var.f45770u0;
        if (bn0Var != null) {
            switch (bn0Var.f46456a) {
                case 1:
                    dn0 dn0Var = bn0Var.f46457b;
                    dn0Var.f47195a.e0();
                    dn0Var.f47196b.e0();
                    return;
                default:
                    dn0 dn0Var2 = bn0Var.f46457b;
                    dn0Var2.f47195a.e0();
                    dn0Var2.f47196b.e0();
                    return;
            }
        }
        an0Var.e0();
    }

    @Override
    public void m(KeyEvent keyEvent) {
        org.telegram.ui.ActionBar.g1 g1Var;
        an0 an0Var = this.f52113b;
        an0Var.getClass();
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (g1Var = an0Var.f45761n0) != null && g1Var.isShowing()) {
            an0Var.f45761n0.d(true);
        }
    }
}
