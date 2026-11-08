package org.telegram.ui;

import android.view.View;
public final class sm0 implements org.telegram.ui.ActionBar.o0, org.telegram.ui.Components.sj0 {
    public final xm0 f49782a;

    public sm0(xm0 xm0Var) {
        this.f49782a = xm0Var;
    }

    @Override
    public void d(boolean z9) {
        org.telegram.ui.ActionBar.q4 q4Var;
        xm0 xm0Var = this.f49782a;
        xm0Var.W = z9 ? 1 : 0;
        if (z9) {
            q4Var = ((org.telegram.ui.ActionBar.f2) xm0Var).parentLayout;
            q4Var.getView().requestDisallowInterceptTouchEvent(true);
        }
        xm0Var.K.d1(true);
    }

    @Override
    public boolean e(int i7) {
        if (this.f49782a.L.d(i7) == 0) {
            return true;
        }
        return false;
    }

    @Override
    public void j(View view, boolean z9) {
        if (z9 == this.f49782a.X && (view instanceof org.telegram.ui.Cells.q5)) {
            org.telegram.ui.Cells.q5 q5Var = (org.telegram.ui.Cells.q5) view;
            q5Var.f30143y.d(q5Var);
        }
    }

    @Override
    public boolean k(int i7) {
        Object obj;
        xm0 xm0Var = this.f49782a;
        org.telegram.messenger.we weVar = xm0Var.J;
        if (weVar != null) {
            obj = Integer.valueOf(((org.telegram.messenger.gf) weVar.f26300e.get(i7)).C);
        } else {
            obj = ((org.telegram.messenger.kf) xm0Var.f51912f.get(i7)).B;
        }
        return xm0Var.f51905b.containsKey(obj);
    }

    @Override
    public void n() {
        int i7;
        int i10;
        xm0 xm0Var = this.f49782a;
        org.telegram.ui.ActionBar.z0 z0Var = xm0Var.Q;
        if (xm0Var.Y) {
            i7 = 2131745349;
        } else {
            i7 = 2131745348;
        }
        z0Var.setText(org.telegram.messenger.id.M0(i7, null));
        org.telegram.ui.ActionBar.z0 z0Var2 = xm0Var.Q;
        if (xm0Var.Y) {
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
