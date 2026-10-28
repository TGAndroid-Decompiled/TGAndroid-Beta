package org.telegram.ui;

import android.text.Editable;
public final class yp0 implements sq0 {
    public final cq0 f46067a;

    public yp0(cq0 cq0Var) {
        this.f46067a = cq0Var;
    }

    @Override
    public final void a() {
        cq0 cq0Var = this.f46067a;
        if (cq0Var.f38433b.size() == 0) {
            cq0Var.Q.setPivotX(0.0f);
            cq0Var.Q.setPivotY(0.0f);
            cq0Var.X(false);
            return;
        }
        cq0Var.Q.invalidate();
        cq0Var.X(true);
    }

    @Override
    public final void b(Editable editable) {
        cq0 cq0Var = this.f46067a;
        org.telegram.ui.Components.ru ruVar = cq0Var.M;
        cq0Var.f38432a = editable;
        ruVar.setText(editable);
    }

    @Override
    public final void d(int i10, boolean z10, boolean z11) {
        cq0 cq0Var = this.f46067a;
        cq0Var.removeSelfFromStack();
        if (!z10) {
            cq0Var.W(cq0Var.f38433b, cq0Var.f38434c, z11, i10);
        }
    }

    @Override
    public final boolean e() {
        return true;
    }

    @Override
    public final void c() {
    }
}
