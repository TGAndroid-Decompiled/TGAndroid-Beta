package org.telegram.ui;

import android.view.KeyEvent;
import android.view.View;
public final class qq0 implements org.telegram.ui.Components.f5, org.telegram.ui.Components.mm0, org.telegram.ui.ActionBar.k1, org.telegram.ui.ActionBar.z1 {
    public final int f41426a;
    public final dr0 f41427b;

    public qq0(dr0 dr0Var, int i10) {
        this.f41426a = i10;
        this.f41427b = dr0Var;
    }

    @Override
    public void J(int i10, int i11, boolean z10) {
        switch (this.f41426a) {
            case 0:
                this.f41427b.e0(i10, z10);
                return;
            default:
                this.f41427b.e0(i10, z10);
                return;
        }
    }

    @Override
    public boolean d(int i10, View view) {
        dr0 dr0Var = this.f41427b;
        if (dr0Var.Y) {
            dr0Var.a0(view, dr0Var.J.photos.get(i10));
            return true;
        } else if (view instanceof org.telegram.ui.Cells.t5) {
            org.telegram.ui.Components.ym0 ym0Var = dr0Var.V;
            boolean z10 = !((org.telegram.ui.Cells.t5) view).a();
            dr0Var.X = z10;
            ym0Var.d(view, i10, z10);
            return false;
        } else {
            return false;
        }
    }

    @Override
    public void f(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        dr0 dr0Var = this.f41427b;
        hr0 hr0Var = dr0Var.f36895t0;
        if (hr0Var != null) {
            switch (hr0Var.f38500a) {
                case 0:
                    ir0 ir0Var = hr0Var.f38501b;
                    ir0Var.f38976a.Z();
                    ir0Var.f38977b.Z();
                    return;
                default:
                    ir0 ir0Var2 = hr0Var.f38501b;
                    ir0Var2.f38976a.Z();
                    ir0Var2.f38977b.Z();
                    return;
            }
        }
        dr0Var.Z();
    }

    @Override
    public void o(KeyEvent keyEvent) {
        org.telegram.ui.ActionBar.m1 m1Var;
        dr0 dr0Var = this.f41427b;
        dr0Var.getClass();
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (m1Var = dr0Var.m0) != null && m1Var.isShowing()) {
            dr0Var.m0.d(true);
        }
    }
}
