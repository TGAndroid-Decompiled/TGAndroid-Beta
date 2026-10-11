package org.telegram.ui;

import android.view.View;
public final class x71 implements View.OnClickListener {
    public final g81 f44000a;

    public x71(g81 g81Var) {
        this.f44000a = g81Var;
    }

    @Override
    public final void onClick(View view) {
        org.telegram.ui.Components.hk0 hk0Var = this.f44000a.d;
        if (!hk0Var.b() && hk0Var.getAnimatedDrawable() != null) {
            hk0Var.getAnimatedDrawable().M(40);
            hk0Var.d();
        }
    }
}
