package org.telegram.ui;

import android.view.View;
public final class y71 implements View.OnClickListener {
    public final h81 f44272a;

    public y71(h81 h81Var) {
        this.f44272a = h81Var;
    }

    @Override
    public final void onClick(View view) {
        org.telegram.ui.Components.fk0 fk0Var = this.f44272a.d;
        if (!fk0Var.b() && fk0Var.getAnimatedDrawable() != null) {
            fk0Var.getAnimatedDrawable().M(40);
            fk0Var.d();
        }
    }
}
