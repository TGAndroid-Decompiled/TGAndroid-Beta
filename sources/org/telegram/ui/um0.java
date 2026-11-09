package org.telegram.ui;

import android.view.View;
public final class um0 implements org.telegram.ui.ActionBar.o0, org.telegram.ui.Components.tj0 {
    public final zm0 f50426a;

    public um0(zm0 zm0Var) {
        this.f50426a = zm0Var;
    }

    @Override
    public void d(boolean z9) {
        org.telegram.ui.ActionBar.q4 q4Var;
        zm0 zm0Var = this.f50426a;
        zm0Var.W = z9 ? 1 : 0;
        if (z9) {
            q4Var = ((org.telegram.ui.ActionBar.f2) zm0Var).parentLayout;
            q4Var.getView().requestDisallowInterceptTouchEvent(true);
        }
        zm0Var.K.d1(true);
    }

    @Override
    public boolean e(int i7) {
        if (this.f50426a.L.d(i7) == 0) {
            return true;
        }
        return false;
    }

    @Override
    public void j(View view, boolean z9) {
        if (z9 == this.f50426a.X && (view instanceof org.telegram.ui.Cells.q5)) {
            org.telegram.ui.Cells.q5 q5Var = (org.telegram.ui.Cells.q5) view;
            q5Var.f30147y.d(q5Var);
        }
    }

    @Override
    public boolean k(int i7) {
        Object obj;
        zm0 zm0Var = this.f50426a;
        org.telegram.messenger.we weVar = zm0Var.J;
        if (weVar != null) {
            obj = Integer.valueOf(((org.telegram.messenger.gf) weVar.f26300e.get(i7)).C);
        } else {
            obj = ((org.telegram.messenger.kf) zm0Var.f52607f.get(i7)).B;
        }
        return zm0Var.f52600b.containsKey(obj);
    }

    @Override
    public void n() {
        int i7;
        int i10;
        zm0 zm0Var = this.f50426a;
        org.telegram.ui.ActionBar.z0 z0Var = zm0Var.Q;
        if (zm0Var.Y) {
            i7 = 2131745346;
        } else {
            i7 = 2131745345;
        }
        z0Var.setText(org.telegram.messenger.id.M0(i7, null));
        org.telegram.ui.ActionBar.z0 z0Var2 = zm0Var.Q;
        if (zm0Var.Y) {
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
