package org.telegram.ui;

import android.view.View;
public final class tm0 implements org.telegram.ui.ActionBar.n0, org.telegram.ui.Components.xj0 {
    public final ym0 f51612a;

    public tm0(ym0 ym0Var) {
        this.f51612a = ym0Var;
    }

    @Override
    public void a(boolean z10) {
        org.telegram.ui.ActionBar.o4 o4Var;
        ym0 ym0Var = this.f51612a;
        ym0Var.X = z10 ? 1 : 0;
        if (z10) {
            o4Var = ((org.telegram.ui.ActionBar.e2) ym0Var).parentLayout;
            o4Var.getView().requestDisallowInterceptTouchEvent(true);
        }
        ym0Var.L.d1(true);
    }

    @Override
    public boolean b(int i7) {
        if (this.f51612a.M.d(i7) == 0) {
            return true;
        }
        return false;
    }

    @Override
    public void d(View view, boolean z10) {
        if (z10 == this.f51612a.Y && (view instanceof org.telegram.ui.Cells.q5)) {
            org.telegram.ui.Cells.q5 q5Var = (org.telegram.ui.Cells.q5) view;
            q5Var.f31292y.d(q5Var);
        }
    }

    @Override
    public boolean g(int i7) {
        Object obj;
        ym0 ym0Var = this.f51612a;
        org.telegram.messenger.ve veVar = ym0Var.K;
        if (veVar != null) {
            obj = Integer.valueOf(((org.telegram.messenger.ff) veVar.f26971e.get(i7)).C);
        } else {
            obj = ((org.telegram.messenger.jf) ym0Var.f53573f.get(i7)).B;
        }
        return ym0Var.f53566b.containsKey(obj);
    }

    @Override
    public void k() {
        int i7;
        int i10;
        ym0 ym0Var = this.f51612a;
        org.telegram.ui.ActionBar.z0 z0Var = ym0Var.R;
        if (ym0Var.Z) {
            i7 = 2131745346;
        } else {
            i7 = 2131745345;
        }
        z0Var.setText(org.telegram.messenger.hd.M0(i7, null));
        org.telegram.ui.ActionBar.z0 z0Var2 = ym0Var.R;
        if (ym0Var.Z) {
            i10 = 2131232220;
        } else {
            i10 = 2131232209;
        }
        z0Var2.setIcon(i10);
    }

    @Override
    public void i() {
    }
}
