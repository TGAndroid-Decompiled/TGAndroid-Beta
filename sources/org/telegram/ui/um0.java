package org.telegram.ui;

import android.view.KeyEvent;
import android.view.View;
public final class um0 implements org.telegram.ui.Components.z4, org.telegram.ui.Components.qj0, org.telegram.ui.ActionBar.f1, org.telegram.ui.ActionBar.r1 {
    public final int f52599a;
    public final cn0 f52600b;

    public um0(cn0 cn0Var, int i7) {
        this.f52599a = i7;
        this.f52600b = cn0Var;
    }

    @Override
    public void O(int i7, int i10, boolean z10) {
        switch (this.f52599a) {
            case 0:
                this.f52600b.j0(i7, z10);
                return;
            default:
                this.f52600b.j0(i7, z10);
                return;
        }
    }

    @Override
    public boolean c(int i7, View view) {
        cn0 cn0Var = this.f52600b;
        if (cn0Var.Z) {
            cn0Var.f0(view, cn0Var.K.f27160e.get(i7));
            return true;
        } else if (view instanceof org.telegram.ui.Cells.r5) {
            org.telegram.ui.Components.gk0 gk0Var = cn0Var.W;
            boolean z10 = !((org.telegram.ui.Cells.r5) view).a();
            cn0Var.Y = z10;
            gk0Var.d(i7, view, z10);
            return false;
        } else {
            return false;
        }
    }

    @Override
    public void h(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        cn0 cn0Var = this.f52600b;
        dn0 dn0Var = cn0Var.f46584u0;
        if (dn0Var != null) {
            switch (dn0Var.f47025a) {
                case 1:
                    fn0 fn0Var = dn0Var.f47026b;
                    fn0Var.f47759a.e0();
                    fn0Var.f47760b.e0();
                    return;
                default:
                    fn0 fn0Var2 = dn0Var.f47026b;
                    fn0Var2.f47759a.e0();
                    fn0Var2.f47760b.e0();
                    return;
            }
        }
        cn0Var.e0();
    }

    @Override
    public void j(KeyEvent keyEvent) {
        org.telegram.ui.ActionBar.h1 h1Var;
        cn0 cn0Var = this.f52600b;
        cn0Var.getClass();
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (h1Var = cn0Var.f46575n0) != null && h1Var.isShowing()) {
            cn0Var.f46575n0.d(true);
        }
    }
}
