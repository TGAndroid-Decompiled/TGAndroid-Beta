package org.telegram.ui;

import android.text.Editable;
public final class qp0 implements lq0 {
    public final vp0 f40903a;

    public qp0(vp0 vp0Var) {
        this.f40903a = vp0Var;
    }

    @Override
    public final void a() {
        vp0 vp0Var = this.f40903a;
        if (vp0Var.f42805b.size() == 0) {
            vp0Var.Q.setPivotX(0.0f);
            vp0Var.Q.setPivotY(0.0f);
            vp0Var.W(false);
            return;
        }
        vp0Var.Q.invalidate();
        vp0Var.W(true);
    }

    @Override
    public final void b(Editable editable) {
        vp0 vp0Var = this.f40903a;
        org.telegram.ui.Components.qu quVar = vp0Var.M;
        vp0Var.f42804a = editable;
        quVar.setText(editable);
    }

    @Override
    public final boolean e() {
        return true;
    }

    @Override
    public final void h(int i10, boolean z10, boolean z11) {
        vp0 vp0Var = this.f40903a;
        vp0Var.removeSelfFromStack();
        if (!z10) {
            vp0Var.V(vp0Var.f42805b, vp0Var.f42806c, z11, i10);
        }
    }

    @Override
    public final void g() {
    }
}
