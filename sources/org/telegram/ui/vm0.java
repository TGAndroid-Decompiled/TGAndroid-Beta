package org.telegram.ui;

import android.view.View;
public final class vm0 implements org.telegram.ui.ActionBar.o0, org.telegram.ui.Components.sj0 {
    public final an0 f50759a;

    public vm0(an0 an0Var) {
        this.f50759a = an0Var;
    }

    @Override
    public void d(boolean z9) {
        org.telegram.ui.ActionBar.r4 r4Var;
        an0 an0Var = this.f50759a;
        an0Var.W = z9 ? 1 : 0;
        if (z9) {
            r4Var = ((org.telegram.ui.ActionBar.f2) an0Var).parentLayout;
            r4Var.getView().requestDisallowInterceptTouchEvent(true);
        }
        an0Var.K.d1(true);
    }

    @Override
    public boolean e(int i7) {
        if (this.f50759a.L.d(i7) == 0) {
            return true;
        }
        return false;
    }

    @Override
    public void j(View view, boolean z9) {
        if (z9 == this.f50759a.X && (view instanceof org.telegram.ui.Cells.q5)) {
            org.telegram.ui.Cells.q5 q5Var = (org.telegram.ui.Cells.q5) view;
            q5Var.f30158y.d(q5Var);
        }
    }

    @Override
    public boolean k(int i7) {
        Object obj;
        an0 an0Var = this.f50759a;
        org.telegram.messenger.we weVar = an0Var.J;
        if (weVar != null) {
            obj = Integer.valueOf(((org.telegram.messenger.gf) weVar.f26304e.get(i7)).C);
        } else {
            obj = ((org.telegram.messenger.kf) an0Var.f43757f.get(i7)).B;
        }
        return an0Var.f43750b.containsKey(obj);
    }

    @Override
    public void n() {
        int i7;
        int i10;
        an0 an0Var = this.f50759a;
        org.telegram.ui.ActionBar.z0 z0Var = an0Var.Q;
        if (an0Var.Y) {
            i7 = 2131745346;
        } else {
            i7 = 2131745345;
        }
        z0Var.setText(org.telegram.messenger.id.M0(i7, null));
        org.telegram.ui.ActionBar.z0 z0Var2 = an0Var.Q;
        if (an0Var.Y) {
            i10 = 2131232219;
        } else {
            i10 = 2131232208;
        }
        z0Var2.setIcon(i10);
    }

    @Override
    public void i() {
    }
}
