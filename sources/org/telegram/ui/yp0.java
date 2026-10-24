package org.telegram.ui;

import android.view.KeyEvent;
import android.view.View;
public final class yp0 implements org.telegram.ui.Components.b5, org.telegram.ui.Components.bm0, org.telegram.ui.ActionBar.k1, org.telegram.ui.ActionBar.z1 {
    public final int f43933a;
    public final lq0 f43934b;

    public yp0(lq0 lq0Var, int i10) {
        this.f43933a = i10;
        this.f43934b = lq0Var;
    }

    @Override
    public void C(int i10, int i11, boolean z10) {
        switch (this.f43933a) {
            case 0:
                this.f43934b.e0(i10, z10);
                return;
            default:
                this.f43934b.e0(i10, z10);
                return;
        }
    }

    @Override
    public boolean d(int i10, View view) {
        lq0 lq0Var = this.f43934b;
        if (lq0Var.Y) {
            lq0Var.a0(view, lq0Var.J.photos.get(i10));
            return true;
        } else if (view instanceof org.telegram.ui.Cells.s5) {
            org.telegram.ui.Components.nm0 nm0Var = lq0Var.V;
            boolean z10 = !((org.telegram.ui.Cells.s5) view).a();
            lq0Var.X = z10;
            nm0Var.d(view, i10, z10);
            return false;
        } else {
            return false;
        }
    }

    @Override
    public void g(org.telegram.ui.ActionBar.c2 c2Var, int i10) {
        lq0 lq0Var = this.f43934b;
        pq0 pq0Var = lq0Var.f39358t0;
        if (pq0Var != null) {
            switch (pq0Var.f40619a) {
                case 0:
                    qq0 qq0Var = pq0Var.f40620b;
                    qq0Var.f40920a.Z();
                    qq0Var.f40921b.Z();
                    return;
                default:
                    qq0 qq0Var2 = pq0Var.f40620b;
                    qq0Var2.f40920a.Z();
                    qq0Var2.f40921b.Z();
                    return;
            }
        }
        lq0Var.Z();
    }

    @Override
    public void j(KeyEvent keyEvent) {
        org.telegram.ui.ActionBar.m1 m1Var;
        lq0 lq0Var = this.f43934b;
        lq0Var.getClass();
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (m1Var = lq0Var.m0) != null && m1Var.isShowing()) {
            lq0Var.m0.d(true);
        }
    }
}
