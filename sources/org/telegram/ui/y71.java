package org.telegram.ui;

import android.view.View;
public final class y71 implements View.OnClickListener {
    public final h81 f44318a;

    public y71(h81 h81Var) {
        this.f44318a = h81Var;
    }

    @Override
    public final void onClick(View view) {
        org.telegram.ui.Components.gk0 gk0Var = this.f44318a.d;
        if (!gk0Var.b() && gk0Var.getAnimatedDrawable() != null) {
            gk0Var.getAnimatedDrawable().M(40);
            gk0Var.d();
        }
    }
}
