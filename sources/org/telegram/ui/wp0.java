package org.telegram.ui;

import android.text.Editable;
public final class wp0 implements qq0 {
    public final aq0 f45539a;

    public wp0(aq0 aq0Var) {
        this.f45539a = aq0Var;
    }

    @Override
    public final void a() {
        aq0 aq0Var = this.f45539a;
        if (aq0Var.f37876b.size() == 0) {
            aq0Var.Q.setPivotX(0.0f);
            aq0Var.Q.setPivotY(0.0f);
            aq0Var.X(false);
            return;
        }
        aq0Var.Q.invalidate();
        aq0Var.X(true);
    }

    @Override
    public final void b(Editable editable) {
        aq0 aq0Var = this.f45539a;
        org.telegram.ui.Components.ru ruVar = aq0Var.M;
        aq0Var.f37875a = editable;
        ruVar.setText(editable);
    }

    @Override
    public final void d(int i10, boolean z10, boolean z11) {
        aq0 aq0Var = this.f45539a;
        aq0Var.removeSelfFromStack();
        if (!z10) {
            aq0Var.W(aq0Var.f37876b, aq0Var.f37877c, z11, i10);
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
