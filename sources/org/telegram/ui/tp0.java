package org.telegram.ui;

import android.view.KeyEvent;
import android.view.View;
public final class tp0 implements org.telegram.ui.Components.y4, org.telegram.ui.Components.kl0, org.telegram.ui.ActionBar.n1, org.telegram.ui.ActionBar.c2 {
    public final int f38711a;
    public final fq0 f38712b;

    public tp0(fq0 fq0Var, int i10) {
        this.f38711a = i10;
        this.f38712b = fq0Var;
    }

    @Override
    public void J(int i10, int i11, boolean z4) {
        switch (this.f38711a) {
            case 0:
                this.f38712b.e0(i10, z4);
                return;
            default:
                this.f38712b.e0(i10, z4);
                return;
        }
    }

    @Override
    public boolean f(int i10, View view) {
        fq0 fq0Var = this.f38712b;
        if (fq0Var.V) {
            fq0Var.a0(view, fq0Var.G.photos.get(i10));
            return true;
        } else if (view instanceof org.telegram.ui.Cells.t5) {
            org.telegram.ui.Components.vl0 vl0Var = fq0Var.S;
            boolean z4 = !((org.telegram.ui.Cells.t5) view).a();
            fq0Var.U = z4;
            vl0Var.d(view, i10, z4);
            return false;
        } else {
            return false;
        }
    }

    @Override
    public void i(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        fq0 fq0Var = this.f38712b;
        jq0 jq0Var = fq0Var.f34333q0;
        if (jq0Var != null) {
            switch (jq0Var.f35465a) {
                case 0:
                    kq0 kq0Var = jq0Var.f35466b;
                    kq0Var.f35788a.Z();
                    kq0Var.f35789b.Z();
                    return;
                default:
                    kq0 kq0Var2 = jq0Var.f35466b;
                    kq0Var2.f35788a.Z();
                    kq0Var2.f35789b.Z();
                    return;
            }
        }
        fq0Var.Z();
    }

    @Override
    public void n(KeyEvent keyEvent) {
        org.telegram.ui.ActionBar.p1 p1Var;
        fq0 fq0Var = this.f38712b;
        fq0Var.getClass();
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (p1Var = fq0Var.f34326j0) != null && p1Var.isShowing()) {
            fq0Var.f34326j0.d(true);
        }
    }
}
