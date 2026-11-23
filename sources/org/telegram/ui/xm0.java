package org.telegram.ui;

import android.view.View;
public final class xm0 implements org.telegram.ui.ActionBar.n0, org.telegram.ui.Components.hk0 {
    public final cn0 f53826a;

    public xm0(cn0 cn0Var) {
        this.f53826a = cn0Var;
    }

    @Override
    public void e(boolean z10) {
        org.telegram.ui.ActionBar.r4 r4Var;
        cn0 cn0Var = this.f53826a;
        cn0Var.X = z10 ? 1 : 0;
        if (z10) {
            r4Var = ((org.telegram.ui.ActionBar.g2) cn0Var).parentLayout;
            r4Var.getView().requestDisallowInterceptTouchEvent(true);
        }
        cn0Var.L.d1(true);
    }

    @Override
    public boolean f(int i7) {
        if (this.f53826a.M.d(i7) == 0) {
            return true;
        }
        return false;
    }

    @Override
    public void k() {
        int i7;
        int i10;
        cn0 cn0Var = this.f53826a;
        org.telegram.ui.ActionBar.y0 y0Var = cn0Var.R;
        if (cn0Var.Z) {
            i7 = 2131745150;
        } else {
            i7 = 2131745149;
        }
        y0Var.setText(org.telegram.messenger.hd.N0(i7, null));
        org.telegram.ui.ActionBar.y0 y0Var2 = cn0Var.R;
        if (cn0Var.Z) {
            i10 = 2131232221;
        } else {
            i10 = 2131232210;
        }
        y0Var2.setIcon(i10);
    }

    @Override
    public void l(View view, boolean z10) {
        if (z10 == this.f53826a.Y && (view instanceof org.telegram.ui.Cells.s5)) {
            org.telegram.ui.Cells.s5 s5Var = (org.telegram.ui.Cells.s5) view;
            s5Var.f31762y.e(s5Var);
        }
    }

    @Override
    public boolean m(int i7) {
        Object obj;
        cn0 cn0Var = this.f53826a;
        org.telegram.messenger.ve veVar = cn0Var.K;
        if (veVar != null) {
            obj = Integer.valueOf(((org.telegram.messenger.ff) veVar.f27321e.get(i7)).C);
        } else {
            obj = ((org.telegram.messenger.jf) cn0Var.f46588f.get(i7)).B;
        }
        return cn0Var.f46581b.containsKey(obj);
    }

    @Override
    public void j() {
    }
}
