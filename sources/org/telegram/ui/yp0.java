package org.telegram.ui;

import android.view.KeyEvent;
import android.view.View;
public final class yp0 implements org.telegram.ui.Components.e5, org.telegram.ui.Components.yl0, org.telegram.ui.ActionBar.k1, org.telegram.ui.ActionBar.a2 {
    public final int f43491a;
    public final lq0 f43492b;

    public yp0(lq0 lq0Var, int i10) {
        this.f43491a = i10;
        this.f43492b = lq0Var;
    }

    @Override
    public void C(int i10, int i11, boolean z10) {
        switch (this.f43491a) {
            case 0:
                this.f43492b.e0(i10, z10);
                return;
            default:
                this.f43492b.e0(i10, z10);
                return;
        }
    }

    @Override
    public boolean a(int i10, View view) {
        lq0 lq0Var = this.f43492b;
        if (lq0Var.Y) {
            lq0Var.a0(view, lq0Var.J.photos.get(i10));
            return true;
        } else if (view instanceof org.telegram.ui.Cells.s5) {
            org.telegram.ui.Components.km0 km0Var = lq0Var.V;
            boolean z10 = !((org.telegram.ui.Cells.s5) view).a();
            lq0Var.X = z10;
            km0Var.d(view, i10, z10);
            return false;
        } else {
            return false;
        }
    }

    @Override
    public void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        lq0 lq0Var = this.f43492b;
        pq0 pq0Var = lq0Var.f38936t0;
        if (pq0Var != null) {
            switch (pq0Var.f40232a) {
                case 0:
                    qq0 qq0Var = pq0Var.f40233b;
                    qq0Var.f40505a.Z();
                    qq0Var.f40506b.Z();
                    return;
                default:
                    qq0 qq0Var2 = pq0Var.f40233b;
                    qq0Var2.f40505a.Z();
                    qq0Var2.f40506b.Z();
                    return;
            }
        }
        lq0Var.Z();
    }

    @Override
    public void n(KeyEvent keyEvent) {
        org.telegram.ui.ActionBar.m1 m1Var;
        lq0 lq0Var = this.f43492b;
        lq0Var.getClass();
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (m1Var = lq0Var.m0) != null && m1Var.isShowing()) {
            lq0Var.m0.d(true);
        }
    }
}
