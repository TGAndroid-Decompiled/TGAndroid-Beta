package org.telegram.ui;

import android.view.KeyEvent;
import android.view.View;
public final class xp0 implements org.telegram.ui.Components.e5, org.telegram.ui.Components.yl0, org.telegram.ui.ActionBar.k1, org.telegram.ui.ActionBar.a2 {
    public final int f43229a;
    public final kq0 f43230b;

    public xp0(kq0 kq0Var, int i10) {
        this.f43229a = i10;
        this.f43230b = kq0Var;
    }

    @Override
    public void C(int i10, int i11, boolean z10) {
        switch (this.f43229a) {
            case 0:
                this.f43230b.e0(i10, z10);
                return;
            default:
                this.f43230b.e0(i10, z10);
                return;
        }
    }

    @Override
    public boolean a(int i10, View view) {
        kq0 kq0Var = this.f43230b;
        if (kq0Var.Y) {
            kq0Var.a0(view, kq0Var.J.photos.get(i10));
            return true;
        } else if (view instanceof org.telegram.ui.Cells.s5) {
            org.telegram.ui.Components.km0 km0Var = kq0Var.V;
            boolean z10 = !((org.telegram.ui.Cells.s5) view).a();
            kq0Var.X = z10;
            km0Var.d(view, i10, z10);
            return false;
        } else {
            return false;
        }
    }

    @Override
    public void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        kq0 kq0Var = this.f43230b;
        oq0 oq0Var = kq0Var.f38662t0;
        if (oq0Var != null) {
            switch (oq0Var.f39868a) {
                case 0:
                    pq0 pq0Var = oq0Var.f39869b;
                    pq0Var.f40219a.Z();
                    pq0Var.f40220b.Z();
                    return;
                default:
                    pq0 pq0Var2 = oq0Var.f39869b;
                    pq0Var2.f40219a.Z();
                    pq0Var2.f40220b.Z();
                    return;
            }
        }
        kq0Var.Z();
    }

    @Override
    public void n(KeyEvent keyEvent) {
        org.telegram.ui.ActionBar.m1 m1Var;
        kq0 kq0Var = this.f43230b;
        kq0Var.getClass();
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (m1Var = kq0Var.m0) != null && m1Var.isShowing()) {
            kq0Var.m0.d(true);
        }
    }
}
