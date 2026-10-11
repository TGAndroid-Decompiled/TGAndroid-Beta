package org.telegram.ui;

import android.view.View;
public final class x71 implements View.OnClickListener {
    public final g81 f44034a;

    public x71(g81 g81Var) {
        this.f44034a = g81Var;
    }

    @Override
    public final void onClick(View view) {
        org.telegram.ui.Components.gk0 gk0Var = this.f44034a.d;
        if (!gk0Var.b() && gk0Var.getAnimatedDrawable() != null) {
            gk0Var.getAnimatedDrawable().M(40);
            gk0Var.d();
        }
    }
}
