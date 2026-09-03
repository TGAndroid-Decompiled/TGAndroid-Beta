package org.telegram.ui;

import android.text.Editable;
public final class sp0 implements lq0 {
    public final wp0 f41291a;

    public sp0(wp0 wp0Var) {
        this.f41291a = wp0Var;
    }

    @Override
    public final void a() {
        wp0 wp0Var = this.f41291a;
        if (wp0Var.f42833b.size() == 0) {
            wp0Var.N.setPivotX(0.0f);
            wp0Var.N.setPivotY(0.0f);
            wp0Var.W(false);
            return;
        }
        wp0Var.N.invalidate();
        wp0Var.W(true);
    }

    @Override
    public final void c(Editable editable) {
        wp0 wp0Var = this.f41291a;
        org.telegram.ui.Components.fu fuVar = wp0Var.J;
        wp0Var.f42832a = editable;
        fuVar.setText(editable);
    }

    @Override
    public final boolean e() {
        return true;
    }

    @Override
    public final void f(int i10, boolean z4, boolean z10) {
        wp0 wp0Var = this.f41291a;
        wp0Var.removeSelfFromStack();
        if (!z4) {
            wp0Var.V(wp0Var.f42833b, wp0Var.f42834c, z10, i10);
        }
    }

    @Override
    public final void d() {
    }
}
