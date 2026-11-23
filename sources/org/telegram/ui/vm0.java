package org.telegram.ui;

import android.view.View;
public final class vm0 implements org.telegram.ui.ActionBar.n0, org.telegram.ui.Components.hk0 {
    public final an0 f52986a;

    public vm0(an0 an0Var) {
        this.f52986a = an0Var;
    }

    @Override
    public void d() {
        int i7;
        int i10;
        an0 an0Var = this.f52986a;
        org.telegram.ui.ActionBar.y0 y0Var = an0Var.R;
        if (an0Var.Z) {
            i7 = 2131745150;
        } else {
            i7 = 2131745149;
        }
        y0Var.setText(org.telegram.messenger.gd.N0(i7, null));
        org.telegram.ui.ActionBar.y0 y0Var2 = an0Var.R;
        if (an0Var.Z) {
            i10 = 2131232224;
        } else {
            i10 = 2131232213;
        }
        y0Var2.setIcon(i10);
    }

    @Override
    public void f(boolean z10) {
        org.telegram.ui.ActionBar.r4 r4Var;
        an0 an0Var = this.f52986a;
        an0Var.X = z10 ? 1 : 0;
        if (z10) {
            r4Var = ((org.telegram.ui.ActionBar.g2) an0Var).parentLayout;
            r4Var.getView().requestDisallowInterceptTouchEvent(true);
        }
        an0Var.L.d1(true);
    }

    @Override
    public boolean g(int i7) {
        if (this.f52986a.M.d(i7) == 0) {
            return true;
        }
        return false;
    }

    @Override
    public void n(View view, boolean z10) {
        if (z10 == this.f52986a.Y && (view instanceof org.telegram.ui.Cells.r5)) {
            org.telegram.ui.Cells.r5 r5Var = (org.telegram.ui.Cells.r5) view;
            r5Var.f31795y.d(r5Var);
        }
    }

    @Override
    public boolean o(int i7) {
        Object obj;
        an0 an0Var = this.f52986a;
        org.telegram.messenger.ue ueVar = an0Var.K;
        if (ueVar != null) {
            obj = Integer.valueOf(((org.telegram.messenger.ef) ueVar.f27262e.get(i7)).C);
        } else {
            obj = ((org.telegram.messenger.hf) an0Var.f45752f.get(i7)).B;
        }
        return an0Var.f45745b.containsKey(obj);
    }

    @Override
    public void a() {
    }
}
