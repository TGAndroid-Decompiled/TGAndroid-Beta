package org.telegram.ui;

import android.text.Editable;
public final class yp0 implements sq0 {
    public final cq0 f40220a;

    public yp0(cq0 cq0Var) {
        this.f40220a = cq0Var;
    }

    @Override
    public final void a() {
        cq0 cq0Var = this.f40220a;
        if (cq0Var.f32773b.size() == 0) {
            cq0Var.Q.setPivotX(0.0f);
            cq0Var.Q.setPivotY(0.0f);
            cq0Var.W(false);
            return;
        }
        cq0Var.Q.invalidate();
        cq0Var.W(true);
    }

    @Override
    public final void b(Editable editable) {
        cq0 cq0Var = this.f40220a;
        org.telegram.ui.Components.ku kuVar = cq0Var.M;
        cq0Var.f32772a = editable;
        kuVar.setText(editable);
    }

    @Override
    public final boolean e() {
        return true;
    }

    @Override
    public final void i(int i10, boolean z10, boolean z11) {
        cq0 cq0Var = this.f40220a;
        cq0Var.removeSelfFromStack();
        if (!z10) {
            cq0Var.V(cq0Var.f32773b, cq0Var.f32774c, z11, i10);
        }
    }

    @Override
    public final void g() {
    }
}
