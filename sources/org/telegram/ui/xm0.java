package org.telegram.ui;

import android.view.View;
public final class xm0 implements org.telegram.ui.ActionBar.o0, org.telegram.ui.Components.fk0 {
    public final cn0 f53851a;

    public xm0(cn0 cn0Var) {
        this.f53851a = cn0Var;
    }

    @Override
    public void e(boolean z10) {
        org.telegram.ui.ActionBar.s4 s4Var;
        cn0 cn0Var = this.f53851a;
        cn0Var.X = z10 ? 1 : 0;
        if (z10) {
            s4Var = ((org.telegram.ui.ActionBar.h2) cn0Var).parentLayout;
            s4Var.getView().requestDisallowInterceptTouchEvent(true);
        }
        cn0Var.L.d1(true);
    }

    @Override
    public boolean f(int i7) {
        if (this.f53851a.M.d(i7) == 0) {
            return true;
        }
        return false;
    }

    @Override
    public void k() {
        int i7;
        int i10;
        cn0 cn0Var = this.f53851a;
        org.telegram.ui.ActionBar.z0 z0Var = cn0Var.R;
        if (cn0Var.Z) {
            i7 = 2131745151;
        } else {
            i7 = 2131745150;
        }
        z0Var.setText(org.telegram.messenger.gd.M0(i7, null));
        org.telegram.ui.ActionBar.z0 z0Var2 = cn0Var.R;
        if (cn0Var.Z) {
            i10 = 2131232221;
        } else {
            i10 = 2131232210;
        }
        z0Var2.setIcon(i10);
    }

    @Override
    public void l(View view, boolean z10) {
        if (z10 == this.f53851a.Y && (view instanceof org.telegram.ui.Cells.s5)) {
            org.telegram.ui.Cells.s5 s5Var = (org.telegram.ui.Cells.s5) view;
            s5Var.f31765y.e(s5Var);
        }
    }

    @Override
    public boolean m(int i7) {
        Object obj;
        cn0 cn0Var = this.f53851a;
        org.telegram.messenger.ue ueVar = cn0Var.K;
        if (ueVar != null) {
            obj = Integer.valueOf(((org.telegram.messenger.ef) ueVar.f27158e.get(i7)).C);
        } else {
            obj = ((org.telegram.messenger.hf) cn0Var.f46546f.get(i7)).B;
        }
        return cn0Var.f46539b.containsKey(obj);
    }

    @Override
    public void j() {
    }
}
