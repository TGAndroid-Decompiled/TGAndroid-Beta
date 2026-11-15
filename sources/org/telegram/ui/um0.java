package org.telegram.ui;

import android.view.View;
public final class um0 implements org.telegram.ui.ActionBar.n0, org.telegram.ui.Components.xj0 {
    public final zm0 f51971a;

    public um0(zm0 zm0Var) {
        this.f51971a = zm0Var;
    }

    @Override
    public void a(boolean z10) {
        org.telegram.ui.ActionBar.o4 o4Var;
        zm0 zm0Var = this.f51971a;
        zm0Var.X = z10 ? 1 : 0;
        if (z10) {
            o4Var = ((org.telegram.ui.ActionBar.e2) zm0Var).parentLayout;
            o4Var.getView().requestDisallowInterceptTouchEvent(true);
        }
        zm0Var.L.d1(true);
    }

    @Override
    public boolean b(int i7) {
        if (this.f51971a.M.d(i7) == 0) {
            return true;
        }
        return false;
    }

    @Override
    public void d(View view, boolean z10) {
        if (z10 == this.f51971a.Y && (view instanceof org.telegram.ui.Cells.q5)) {
            org.telegram.ui.Cells.q5 q5Var = (org.telegram.ui.Cells.q5) view;
            q5Var.f31292y.d(q5Var);
        }
    }

    @Override
    public boolean g(int i7) {
        Object obj;
        zm0 zm0Var = this.f51971a;
        org.telegram.messenger.ve veVar = zm0Var.K;
        if (veVar != null) {
            obj = Integer.valueOf(((org.telegram.messenger.ff) veVar.f26972e.get(i7)).C);
        } else {
            obj = ((org.telegram.messenger.jf) zm0Var.f53964f.get(i7)).B;
        }
        return zm0Var.f53957b.containsKey(obj);
    }

    @Override
    public void k() {
        int i7;
        int i10;
        zm0 zm0Var = this.f51971a;
        org.telegram.ui.ActionBar.z0 z0Var = zm0Var.R;
        if (zm0Var.Z) {
            i7 = 2131745346;
        } else {
            i7 = 2131745345;
        }
        z0Var.setText(org.telegram.messenger.hd.M0(i7, null));
        org.telegram.ui.ActionBar.z0 z0Var2 = zm0Var.R;
        if (zm0Var.Z) {
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
