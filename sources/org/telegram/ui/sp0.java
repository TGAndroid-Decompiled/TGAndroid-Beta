package org.telegram.ui;

import android.text.Editable;
public final class sp0 implements lq0 {
    public final wp0 f38291a;

    public sp0(wp0 wp0Var) {
        this.f38291a = wp0Var;
    }

    @Override
    public final void a() {
        wp0 wp0Var = this.f38291a;
        if (wp0Var.f39748b.size() == 0) {
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
        wp0 wp0Var = this.f38291a;
        org.telegram.ui.Components.cu cuVar = wp0Var.J;
        wp0Var.f39747a = editable;
        cuVar.setText(editable);
    }

    @Override
    public final boolean e() {
        return true;
    }

    @Override
    public final void f(int i10, boolean z4, boolean z10) {
        wp0 wp0Var = this.f38291a;
        wp0Var.removeSelfFromStack();
        if (!z4) {
            wp0Var.V(wp0Var.f39748b, wp0Var.f39749c, z10, i10);
        }
    }

    @Override
    public final void d() {
    }
}
