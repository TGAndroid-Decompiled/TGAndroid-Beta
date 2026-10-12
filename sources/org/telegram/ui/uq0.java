package org.telegram.ui;

import android.view.KeyEvent;
import android.view.View;
public final class uq0 implements org.telegram.ui.Components.f5, org.telegram.ui.Components.cm0, org.telegram.ui.ActionBar.k1, org.telegram.ui.ActionBar.z1 {
    public final int f40787a;
    public final hr0 f40788b;

    public uq0(hr0 hr0Var, int i10) {
        this.f40787a = i10;
        this.f40788b = hr0Var;
    }

    @Override
    public void J(int i10, int i11, boolean z10) {
        switch (this.f40787a) {
            case 0:
                this.f40788b.e0(i10, z10);
                return;
            default:
                this.f40788b.e0(i10, z10);
                return;
        }
    }

    @Override
    public boolean a(int i10, View view) {
        hr0 hr0Var = this.f40788b;
        if (hr0Var.Y) {
            hr0Var.a0(view, hr0Var.J.photos.get(i10));
            return true;
        } else if (view instanceof org.telegram.ui.Cells.t5) {
            org.telegram.ui.Components.om0 om0Var = hr0Var.V;
            boolean z10 = !((org.telegram.ui.Cells.t5) view).a();
            hr0Var.X = z10;
            om0Var.d(view, i10, z10);
            return false;
        } else {
            return false;
        }
    }

    @Override
    public void g(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        hr0 hr0Var = this.f40788b;
        lr0 lr0Var = hr0Var.f36938t0;
        if (lr0Var != null) {
            switch (lr0Var.f38075a) {
                case 0:
                    mr0 mr0Var = lr0Var.f38076b;
                    mr0Var.f38318a.Z();
                    mr0Var.f38319b.Z();
                    return;
                default:
                    mr0 mr0Var2 = lr0Var.f38076b;
                    mr0Var2.f38318a.Z();
                    mr0Var2.f38319b.Z();
                    return;
            }
        }
        hr0Var.Z();
    }

    @Override
    public void n(KeyEvent keyEvent) {
        org.telegram.ui.ActionBar.m1 m1Var;
        hr0 hr0Var = this.f40788b;
        hr0Var.getClass();
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (m1Var = hr0Var.m0) != null && m1Var.isShowing()) {
            hr0Var.m0.d(true);
        }
    }
}
