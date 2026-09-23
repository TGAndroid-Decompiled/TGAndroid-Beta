package org.telegram.ui;

import android.text.Editable;
public final class zp0 implements tq0 {
    public final dq0 f40220a;

    public zp0(dq0 dq0Var) {
        this.f40220a = dq0Var;
    }

    @Override
    public final void a() {
        dq0 dq0Var = this.f40220a;
        if (dq0Var.f32696b.size() == 0) {
            dq0Var.Q.setPivotX(0.0f);
            dq0Var.Q.setPivotY(0.0f);
            dq0Var.W(false);
            return;
        }
        dq0Var.Q.invalidate();
        dq0Var.W(true);
    }

    @Override
    public final void b(Editable editable) {
        dq0 dq0Var = this.f40220a;
        org.telegram.ui.Components.ku kuVar = dq0Var.M;
        dq0Var.f32695a = editable;
        kuVar.setText(editable);
    }

    @Override
    public final boolean e() {
        return true;
    }

    @Override
    public final void i(int i10, boolean z10, boolean z11) {
        dq0 dq0Var = this.f40220a;
        dq0Var.removeSelfFromStack();
        if (!z10) {
            dq0Var.V(dq0Var.f32696b, dq0Var.f32697c, z11, i10);
        }
    }

    @Override
    public final void g() {
    }
}
