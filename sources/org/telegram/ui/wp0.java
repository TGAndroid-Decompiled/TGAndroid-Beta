package org.telegram.ui;

import android.view.KeyEvent;
import android.view.View;
public final class wp0 implements org.telegram.ui.Components.e5, org.telegram.ui.Components.yl0, org.telegram.ui.ActionBar.k1, org.telegram.ui.ActionBar.a2 {
    public final int f42934a;
    public final jq0 f42935b;

    public wp0(jq0 jq0Var, int i10) {
        this.f42934a = i10;
        this.f42935b = jq0Var;
    }

    @Override
    public void C(int i10, int i11, boolean z10) {
        switch (this.f42934a) {
            case 0:
                this.f42935b.e0(i10, z10);
                return;
            default:
                this.f42935b.e0(i10, z10);
                return;
        }
    }

    @Override
    public boolean a(int i10, View view) {
        jq0 jq0Var = this.f42935b;
        if (jq0Var.Y) {
            jq0Var.a0(view, jq0Var.J.photos.get(i10));
            return true;
        } else if (view instanceof org.telegram.ui.Cells.s5) {
            org.telegram.ui.Components.km0 km0Var = jq0Var.V;
            boolean z10 = !((org.telegram.ui.Cells.s5) view).a();
            jq0Var.X = z10;
            km0Var.d(view, i10, z10);
            return false;
        } else {
            return false;
        }
    }

    @Override
    public void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        jq0 jq0Var = this.f42935b;
        nq0 nq0Var = jq0Var.f38318t0;
        if (nq0Var != null) {
            switch (nq0Var.f39669a) {
                case 0:
                    oq0 oq0Var = nq0Var.f39670b;
                    oq0Var.f39963a.Z();
                    oq0Var.f39964b.Z();
                    return;
                default:
                    oq0 oq0Var2 = nq0Var.f39670b;
                    oq0Var2.f39963a.Z();
                    oq0Var2.f39964b.Z();
                    return;
            }
        }
        jq0Var.Z();
    }

    @Override
    public void n(KeyEvent keyEvent) {
        org.telegram.ui.ActionBar.m1 m1Var;
        jq0 jq0Var = this.f42935b;
        jq0Var.getClass();
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (m1Var = jq0Var.m0) != null && m1Var.isShowing()) {
            jq0Var.m0.d(true);
        }
    }
}
