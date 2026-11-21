package org.telegram.ui;

import android.view.KeyEvent;
import android.view.View;
public final class um0 implements org.telegram.ui.Components.a5, org.telegram.ui.Components.sj0, org.telegram.ui.ActionBar.e1, org.telegram.ui.ActionBar.q1 {
    public final int f52601a;
    public final cn0 f52602b;

    public um0(cn0 cn0Var, int i7) {
        this.f52601a = i7;
        this.f52602b = cn0Var;
    }

    @Override
    public void O(int i7, int i10, boolean z10) {
        switch (this.f52601a) {
            case 0:
                this.f52602b.j0(i7, z10);
                return;
            default:
                this.f52602b.j0(i7, z10);
                return;
        }
    }

    @Override
    public boolean c(int i7, View view) {
        cn0 cn0Var = this.f52602b;
        if (cn0Var.Z) {
            cn0Var.f0(view, cn0Var.K.f27186e.get(i7));
            return true;
        } else if (view instanceof org.telegram.ui.Cells.s5) {
            org.telegram.ui.Components.ik0 ik0Var = cn0Var.W;
            boolean z10 = !((org.telegram.ui.Cells.s5) view).a();
            cn0Var.Y = z10;
            ik0Var.d(i7, view, z10);
            return false;
        } else {
            return false;
        }
    }

    @Override
    public void h(org.telegram.ui.ActionBar.t1 t1Var, int i7) {
        cn0 cn0Var = this.f52602b;
        dn0 dn0Var = cn0Var.f46620u0;
        if (dn0Var != null) {
            switch (dn0Var.f47014a) {
                case 1:
                    fn0 fn0Var = dn0Var.f47015b;
                    fn0Var.f47790a.e0();
                    fn0Var.f47791b.e0();
                    return;
                default:
                    fn0 fn0Var2 = dn0Var.f47015b;
                    fn0Var2.f47790a.e0();
                    fn0Var2.f47791b.e0();
                    return;
            }
        }
        cn0Var.e0();
    }

    @Override
    public void j(KeyEvent keyEvent) {
        org.telegram.ui.ActionBar.g1 g1Var;
        cn0 cn0Var = this.f52602b;
        cn0Var.getClass();
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (g1Var = cn0Var.f46611n0) != null && g1Var.isShowing()) {
            cn0Var.f46611n0.d(true);
        }
    }
}
