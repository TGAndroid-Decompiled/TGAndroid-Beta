package org.telegram.ui;

import android.view.KeyEvent;
import android.view.View;
public final class sq0 implements org.telegram.ui.Components.f5, org.telegram.ui.Components.cm0, org.telegram.ui.ActionBar.k1, org.telegram.ui.ActionBar.z1 {
    public final int f39924a;
    public final fr0 f39925b;

    public sq0(fr0 fr0Var, int i10) {
        this.f39924a = i10;
        this.f39925b = fr0Var;
    }

    @Override
    public void J(int i10, int i11, boolean z10) {
        switch (this.f39924a) {
            case 0:
                this.f39925b.e0(i10, z10);
                return;
            default:
                this.f39925b.e0(i10, z10);
                return;
        }
    }

    @Override
    public boolean a(int i10, View view) {
        fr0 fr0Var = this.f39925b;
        if (fr0Var.Y) {
            fr0Var.a0(view, fr0Var.J.photos.get(i10));
            return true;
        } else if (view instanceof org.telegram.ui.Cells.t5) {
            org.telegram.ui.Components.om0 om0Var = fr0Var.V;
            boolean z10 = !((org.telegram.ui.Cells.t5) view).a();
            fr0Var.X = z10;
            om0Var.d(view, i10, z10);
            return false;
        } else {
            return false;
        }
    }

    @Override
    public void g(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        fr0 fr0Var = this.f39925b;
        jr0 jr0Var = fr0Var.f35936t0;
        if (jr0Var != null) {
            switch (jr0Var.f37124a) {
                case 0:
                    kr0 kr0Var = jr0Var.f37125b;
                    kr0Var.f37491a.Z();
                    kr0Var.f37492b.Z();
                    return;
                default:
                    kr0 kr0Var2 = jr0Var.f37125b;
                    kr0Var2.f37491a.Z();
                    kr0Var2.f37492b.Z();
                    return;
            }
        }
        fr0Var.Z();
    }

    @Override
    public void n(KeyEvent keyEvent) {
        org.telegram.ui.ActionBar.m1 m1Var;
        fr0 fr0Var = this.f39925b;
        fr0Var.getClass();
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (m1Var = fr0Var.m0) != null && m1Var.isShowing()) {
            fr0Var.m0.d(true);
        }
    }
}
